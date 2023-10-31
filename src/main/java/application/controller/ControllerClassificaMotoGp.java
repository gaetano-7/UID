package application.controller;

import application.model.MotoGp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class ControllerClassificaMotoGp {

    @FXML
    private TableView<MotoGp> tabMotoGp;

    @FXML
    private TableColumn<MotoGp, Integer> colonnaPos;

    @FXML
    private TableColumn<MotoGp, String> colonnaPilota;

    @FXML
    private TableColumn<MotoGp, String> colonnaT;

    @FXML
    private TableColumn<MotoGp, Integer> colonnaPodi;

    @FXML
    private TableColumn<MotoGp, Integer> colonnaPunti;

    @FXML
    public void initialize() {
        try {
            colonnaPos.setCellValueFactory(cellData -> cellData.getValue().posProperty().asObject());
            colonnaPilota.setCellValueFactory(cellData -> cellData.getValue().pilotaProperty());
            colonnaT.setCellValueFactory(cellData -> cellData.getValue().teamProperty());
            colonnaPodi.setCellValueFactory(cellData -> cellData.getValue().podiProperty().asObject());
            colonnaPunti.setCellValueFactory(cellData -> cellData.getValue().puntiProperty().asObject());

            riempiTabellaClassificaMotoGp();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void riempiTabellaClassificaMotoGp() throws SQLException {
        String url = "jdbc:sqlite:Database3.db";
        Connection con = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 33; i++) {
                String query = "select POS, NOME, TEAM, PODI, PUNTI from ClassificaMotoGp where POS = ?;";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    int pos = rs.getInt("POS");
                    String nome = rs.getString("NOME");
                    String team = rs.getString("TEAM");
                    int podi = rs.getInt("PODI");
                    int punti = rs.getInt("PUNTI");

                    MotoGp m = new MotoGp(pos, nome, team, podi, punti);
                    tabMotoGp.getItems().add(m);
                }

                stmt.close();
                rs.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }





}
