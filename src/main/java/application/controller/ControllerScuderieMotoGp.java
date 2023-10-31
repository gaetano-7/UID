package application.controller;

import application.model.ScuderieMotoGp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class ControllerScuderieMotoGp {

    @FXML
    private TableView<ScuderieMotoGp> tabCostruttoriMotoGp;

    @FXML
    private TableColumn<ScuderieMotoGp, String> colonnaT;

    @FXML
    private TableColumn<ScuderieMotoGp, Integer> colonnaN;

    @FXML
    private TableColumn<ScuderieMotoGp, Integer> colonnaP;

    @FXML
    private TableColumn<ScuderieMotoGp, Integer> colonnaV;

    @FXML
    public void initialize() {
        try {
            colonnaT.setCellValueFactory(cellData -> cellData.getValue().teamProperty());
            colonnaN.setCellValueFactory(cellData -> cellData.getValue().nProperty().asObject());
            colonnaP.setCellValueFactory(cellData -> cellData.getValue().podiProperty().asObject());
            colonnaV.setCellValueFactory(cellData -> cellData.getValue().vProperty().asObject());

            riempiTabellaScuderieMotoGp();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void riempiTabellaScuderieMotoGp() throws SQLException {
        String url = "jdbc:sqlite:Database3.db";
        Connection connect = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 7; i++) {
                String query = "select ID, NOME, NUMEROP, PODI, V from ScuderieMotoGp where ID = ?;";
                PreparedStatement stmt = connect.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String nome = rs.getString("NOME");
                    int n = rs.getInt("NUMEROP");
                    int p = rs.getInt("PODI");
                    int v = rs.getInt("V");

                   ScuderieMotoGp s = new ScuderieMotoGp(nome, n , p, v);
                   tabCostruttoriMotoGp.getItems().add(s);
                }

                stmt.close();
                rs.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}