package application.controller;

import application.model.PilotiF1;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class ControllerPilotiF1 {

    @FXML
    private TableView<PilotiF1> pilotiFormula1;

    @FXML
    private TableColumn<PilotiF1, String> colonnaN;

    @FXML
    private TableColumn<PilotiF1, String> colonnaP;

    @FXML
    private TableColumn<PilotiF1, Integer> colonnaE;

    @FXML
    private TableColumn<PilotiF1, String> colonnaS;

    @FXML
    private TableColumn<PilotiF1, Integer> colonnaGP;

    @FXML
    public void initialize() {
        try {
            colonnaN.setCellValueFactory(cellData -> cellData.getValue().nazioneProperty());
            colonnaP.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
            colonnaE.setCellValueFactory(cellData -> cellData.getValue().etaProperty().asObject());
            colonnaS.setCellValueFactory(cellData -> cellData.getValue().scuderiaProperty());
            colonnaGP.setCellValueFactory(cellData -> cellData.getValue().gpVintiProperty().asObject());

            riempiTabellaPilotiF1();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void riempiTabellaPilotiF1() throws SQLException {
        String url = "jdbc:sqlite:Database3.db";
        Connection connect = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 23; i++) {
                String query = "select NOME, NAZ, ETA, SCUDERIA, GARE, ID from PilotiF1 where ID = ?;";
                PreparedStatement stmt = connect.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String nome = rs.getString("NOME");
                    String nazione = rs.getString("NAZ");
                    int eta = rs.getInt("ETA");
                    String scuderia = rs.getString("SCUDERIA");
                    int gpVinti = rs.getInt("GARE");

                    PilotiF1 pF1 = new PilotiF1(nome, nazione, eta, scuderia, gpVinti);
                    pilotiFormula1.getItems().add(pF1);
                }

                stmt.close();
                rs.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }




}