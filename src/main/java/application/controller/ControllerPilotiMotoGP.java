package application.controller;

import application.model.PilotiMotoGp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class ControllerPilotiMotoGP {

    @FXML
    private TableView<PilotiMotoGp> tabPilotiMotoGp;

    @FXML
    private TableColumn<PilotiMotoGp, String> colonnaPilota;

    @FXML
    private TableColumn<PilotiMotoGp, String> colonnaE;

    @FXML
    private TableColumn<PilotiMotoGp, String> colonnaN;

    @FXML
    private TableColumn<PilotiMotoGp, String> colonnaT;

    @FXML
    private TableColumn<PilotiMotoGp, Integer> colonnaG;

    @FXML
    public void initialize() {
        try {
            colonnaPilota.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
            colonnaE.setCellValueFactory(cellData -> cellData.getValue().etaProperty());
            colonnaN.setCellValueFactory(cellData -> cellData.getValue().nazProperty());
            colonnaT.setCellValueFactory(cellData -> cellData.getValue().teamProperty());
            colonnaG.setCellValueFactory(cellData -> cellData.getValue().vProperty().asObject());

            riempiTabellaPilotiMotoGp();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void riempiTabellaPilotiMotoGp() throws SQLException {
        String url = "jdbc:sqlite:Database3.db";
        Connection con = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 33; i++) {
                String query = "select NOME, ETA, NAZ, SCUDERIA, VITT, ID from PilotiMotoGp where ID = ?;";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String nome = rs.getString("NOME");
                    String eta = rs.getString("ETA");
                    String nazione = rs.getString("NAZ");
                    String team = rs.getString("SCUDERIA");
                    int vittorie = rs.getInt("VITT");

                    PilotiMotoGp p = new PilotiMotoGp(nome, eta, nazione, team, vittorie);
                    tabPilotiMotoGp.getItems().add(p);
                }

                stmt.close();
                rs.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
