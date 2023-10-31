package application.controller;

import application.model.ScuderieF1;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class ControllerScuderieF1 {

    @FXML
    private TableView<ScuderieF1> tabellaScuderie;

    @FXML
    private TableColumn<ScuderieF1, String> colonnaS;

    @FXML
    private TableColumn<ScuderieF1, String> colonnaT;

    @FXML
    private TableColumn<ScuderieF1, String> colonnaM;

    @FXML
    private TableColumn<ScuderieF1, String> colonnaP1;

    @FXML
    private TableColumn<ScuderieF1, String> colonnaP2;

    @FXML
    private TableColumn<ScuderieF1, String> colonnaP3;

    @FXML
    public void initialize() {
        try {
            colonnaS.setCellValueFactory(cellData -> cellData.getValue().scuderiaProperty());
            colonnaT.setCellValueFactory(cellData -> cellData.getValue().principalProperty());
            colonnaM.setCellValueFactory(cellData -> cellData.getValue().monopostoProperty());
            colonnaP1.setCellValueFactory(cellData -> cellData.getValue().p1Property());
            colonnaP2.setCellValueFactory(cellData -> cellData.getValue().p2Property());
            colonnaP3.setCellValueFactory(cellData -> cellData.getValue().riservaProperty());

            riempiTabellaScuderieF1();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void riempiTabellaScuderieF1() throws SQLException {
        String url = "jdbc:sqlite:Database3.db";
        Connection connect = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 11; i++) {
                String query = "select ID, NOME, TEAM, MONOPOSTO, P1, P2, RISERVA from ScuderieF1 where ID = ?;";
                PreparedStatement stmt = connect.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String scuderia = rs.getString("NOME");
                    String principal = rs.getString("TEAM");
                    String mono = rs.getString("MONOPOSTO");
                    String pilota1 = rs.getString("P1");
                    String pilota2 = rs.getString("P2");
                    String riserva = rs.getString("RISERVA");

                    ScuderieF1 sF1 = new ScuderieF1(scuderia, principal, mono, pilota1, pilota2, riserva);
                    tabellaScuderie.getItems().add(sF1);
                }

                stmt.close();
                rs.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
