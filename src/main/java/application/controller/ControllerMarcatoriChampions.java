package application.controller;

import application.model.Marcatore;
import application.model.ModelMarcChamp;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;
import java.util.List;

public class ControllerMarcatoriChampions {
    @FXML
    private TableView<Marcatore> marcatori;

    @FXML
    private TableColumn<Marcatore, Integer> colonnaPos;

    @FXML
    private TableColumn<Marcatore, Integer> colonnaAssists;

    @FXML
    private TableColumn<Marcatore, String> colonnaGiocatore;

    @FXML
    private TableColumn<Marcatore, Integer> colonnaGoals;

    @FXML
    private TableColumn<Marcatore, String> colonnaSquadra;

    @FXML
    public void initialize()  {
        try {
            ModelMarcChamp mc = new ModelMarcChamp();
            List<Marcatore> listM = mc.riempiMarcatori();
            colonnaPos.setCellValueFactory(cellData -> cellData.getValue().posizioneProperty().asObject());
            colonnaGiocatore.setCellValueFactory(cellData -> cellData.getValue().nomeGiocatoreProperty());
            colonnaSquadra.setCellValueFactory(cellData -> cellData.getValue().nomeSquadraProperty());
            colonnaGoals.setCellValueFactory(cellData -> cellData.getValue().goalsFattiProperty().asObject());
            colonnaAssists.setCellValueFactory(cellData -> cellData.getValue().assistsFattiProperty().asObject());

            for (int i = 0; i < 10; i++) {
                marcatori.getItems().add(listM.get(i));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
