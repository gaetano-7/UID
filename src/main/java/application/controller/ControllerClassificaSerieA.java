package application.controller;

import application.model.ModelClassSerieA;
import application.model.Squadra;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;
import java.util.List;

public class ControllerClassificaSerieA {

    @FXML
    private TableView<Squadra> classifica;

    @FXML
    private TableColumn<Squadra, String> colonnaSquadra;

    @FXML
    private TableColumn<Squadra, Integer> colonnaN;

    @FXML
    private TableColumn<Squadra, Integer> colonnaP;

    @FXML
    private TableColumn<Squadra, Integer> colonnaPG;

    @FXML
    private TableColumn<Squadra, Integer> colonnaPNT;

    @FXML
    private TableColumn<Squadra, Integer> colonnaV;

    @FXML
    private TableColumn<Squadra, Integer> colonnaPos;

    @FXML
    public void initialize()  {
            try {
                ModelClassSerieA ma = new ModelClassSerieA();
                List<Squadra> listC = ma.riempiClassifica();
                colonnaSquadra.setCellValueFactory(cellData -> cellData.getValue().nomeSquadraProperty());
                colonnaN.setCellValueFactory(cellData -> cellData.getValue().partitePareggiateProperty().asObject());
                colonnaP.setCellValueFactory(cellData -> cellData.getValue().partitePerseProperty().asObject());
                colonnaPG.setCellValueFactory(cellData -> cellData.getValue().partiteGiocateProperty().asObject());
                colonnaPNT.setCellValueFactory(cellData -> cellData.getValue().puntiProperty().asObject());
                colonnaV.setCellValueFactory(cellData -> cellData.getValue().partiteVinteProperty().asObject());
                colonnaPos.setCellValueFactory(cellData -> cellData.getValue().posizioneProperty().asObject());

                for (int i = 0; i < 20; i++) {
                    classifica.getItems().add(listC.get(i));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
