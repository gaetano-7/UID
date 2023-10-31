package application.controller;

import application.model.SquadraNbaOvest;
import application.model.ModelClassificaNbaOvest;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;
import java.util.List;

public class ControllerClassificaOvest {

    @FXML
    private TableView<SquadraNbaOvest> classificaNbaOvest;

    @FXML
    private TableColumn<SquadraNbaOvest, Integer> colonnaPos;

    @FXML
    private TableColumn<SquadraNbaOvest, Integer> colonnaP;

    @FXML
    private TableColumn<SquadraNbaOvest, Integer> colonnaPG;

    @FXML
    private TableColumn<SquadraNbaOvest, Integer> colonnaPNTF;

    @FXML
    private TableColumn<SquadraNbaOvest, Integer> colonnaPNTS;

    @FXML
    private TableColumn<SquadraNbaOvest, String> colonnaSquadra;

    @FXML
    private TableColumn<SquadraNbaOvest, Integer> colonnaV;

    public void initialize(){
        try {
            ModelClassificaNbaOvest cno = new ModelClassificaNbaOvest();
            List<SquadraNbaOvest> listO = cno.riempiClassNbaOvest();
            colonnaSquadra.setCellValueFactory(cellData -> cellData.getValue().nomeSquadraProperty());
            colonnaPos.setCellValueFactory(cellData -> cellData.getValue().PosizioneProperty().asObject());
            colonnaPG.setCellValueFactory(cellData -> cellData.getValue().partiteGiocateProperty().asObject());
            colonnaV.setCellValueFactory(cellData -> cellData.getValue().partiteVinteProperty().asObject());
            colonnaP.setCellValueFactory(cellData -> cellData.getValue().partitePerseProperty().asObject());
            colonnaPNTF.setCellValueFactory(cellData -> cellData.getValue().puntifattiProperty().asObject());
            colonnaPNTS.setCellValueFactory(cellData -> cellData.getValue().puntisubitiProperty().asObject());

            for(int i = 0; i < 15; i++){
                classificaNbaOvest.getItems().add(listO.get(i));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
