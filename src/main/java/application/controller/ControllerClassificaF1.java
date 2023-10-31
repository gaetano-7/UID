package application.controller;

import application.model.Formula1;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class ControllerClassificaF1 {

    @FXML
    private TableView<Formula1> classF1;

    @FXML
    private TableColumn<Formula1, String> colNaz;

    @FXML
    private TableColumn<Formula1, String> colPilota;

    @FXML
    private TableColumn<Formula1, Integer> colPodi;

    @FXML
    private TableColumn<Formula1, Integer> colPos;

    @FXML
    private TableColumn<Formula1, Integer> colPunti;

    @FXML
    private TableColumn<Formula1, String> colScuderia;

    @FXML
    public void initialize() {
        try {
            colNaz.setCellValueFactory(cellData -> cellData.getValue().nazProperty());
            colPilota.setCellValueFactory(cellData -> cellData.getValue().pilotaProperty());
            colScuderia.setCellValueFactory(cellData -> cellData.getValue().scuderiaProperty());
            colPodi.setCellValueFactory(cellData -> cellData.getValue().scuderiaProperty().length().asObject());
            colPos.setCellValueFactory(cellData -> cellData.getValue().posProperty().asObject());
            colPunti.setCellValueFactory(cellData -> cellData.getValue().puntiProperty().asObject());

            riempiClassificaF1();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void riempiClassificaF1() throws SQLException {
        String url = "jdbc:sqlite:Database3.db";
        Connection con = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 23; i++) {
                String query = "SELECT ID, NAZIONE, SCUDERIA, PILOTA, PODI, PUNTI FROM ClassificaF1 WHERE ID = ?;";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    int id = rs.getInt("ID");
                    String nazione = rs.getString("NAZIONE");
                    String scuderia = rs.getString("SCUDERIA");
                    String pilota = rs.getString("PILOTA");
                    int podi = rs.getInt("PODI");
                    int punti = rs.getInt("PUNTI");

                    Formula1 sc = new Formula1(id,nazione,scuderia,pilota,podi,punti);
                    classF1.getItems().add(sc);
                }

                stmt.close();
                rs.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

