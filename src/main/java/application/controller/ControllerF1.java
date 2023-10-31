package application.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControllerF1 {

    @FXML
    private BorderPane BPane;

    @FXML
    private AnchorPane DownAPane;

    @FXML
    private JFXButton classificaButton;

    @FXML
    private JFXButton newsButton;

    @FXML
    private JFXButton pilotiButton;

    @FXML
    private JFXButton scuderieButton;

    @FXML
    void clickClassifica(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ClassificaF1.fxml"));
        AnchorPane a = loader.load();
        BPane.setBottom(a);
    }

    @FXML
    void clickPiloti(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/PilotiF1.fxml"));
        AnchorPane a = loader.load();
        BPane.setBottom(a);
    }

    @FXML
    void clickScuderie(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ScuderieF1.fxml"));
        AnchorPane a = loader.load();
        BPane.setBottom(a);
    }

    @FXML
    void clickNews(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/NewsF1.fxml"));
        AnchorPane a = loader.load();
        BPane.setBottom(a);
    }

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ClassificaF1.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
        classificaButton.getStyleClass().add("bold-button");
        scuderieButton.getStyleClass().add("bold-button");
        pilotiButton.getStyleClass().add("bold-button");
        newsButton.getStyleClass().add("bold-button");
    }

}