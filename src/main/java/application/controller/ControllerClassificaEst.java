package application.controller;

import application.model.ModelClassificaNbaEst;
import application.model.SquadraNbaEst;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;
import java.util.List;

public class ControllerClassificaEst {

    @FXML
    private TableView<SquadraNbaEst> classificaNbaEst;

    @FXML
    private TableColumn<SquadraNbaEst, Integer> colonnaP;

    @FXML
    private TableColumn<SquadraNbaEst, Integer> colonnaPG;

    @FXML
    private TableColumn<SquadraNbaEst, Integer> colonnaPNTF;

    @FXML
    private TableColumn<SquadraNbaEst, Integer> colonnaPNTS;

    @FXML
    private TableColumn<SquadraNbaEst, Integer> colonnaPos;

    @FXML
    private TableColumn<SquadraNbaEst, String> colonnaSquadra;

    @FXML
    private TableColumn<SquadraNbaEst, Integer> colonnaV;

    public void initialize(){
        try {
            ModelClassificaNbaEst cne = new ModelClassificaNbaEst();
            List<SquadraNbaEst> listE = cne.riempiClassNbaEst();
            colonnaSquadra.setCellValueFactory(cellData -> cellData.getValue().nomeSquadraProperty());
            colonnaPos.setCellValueFactory(cellData -> cellData.getValue().PosizioneProperty().asObject());
            colonnaPG.setCellValueFactory(cellData -> cellData.getValue().partiteGiocateProperty().asObject());
            colonnaV.setCellValueFactory(cellData -> cellData.getValue().partiteVinteProperty().asObject());
            colonnaP.setCellValueFactory(cellData -> cellData.getValue().partitePerseProperty().asObject());
            colonnaPNTF.setCellValueFactory(cellData -> cellData.getValue().puntifattiProperty().asObject());
            colonnaPNTS.setCellValueFactory(cellData -> cellData.getValue().puntisubitiProperty().asObject());

            for(int i = 0; i < 15; i++){
                classificaNbaEst.getItems().add(listE.get(i));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
