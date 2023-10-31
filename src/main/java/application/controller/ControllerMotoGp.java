package application.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControllerMotoGp {

    @FXML
    private ImageView img;

    @FXML
    private AnchorPane APane;

    @FXML
    private BorderPane BPane;

    @FXML
    private JFXButton classificaButton;

    @FXML
    private JFXButton pilotiButton;

    @FXML
    private JFXButton costruttoriButton;

    @FXML
    private JFXButton newsButton;

    @FXML
    void clickClassifica(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ClassificaMotoGP.fxml"));
        AnchorPane ap = loader.load();
        BPane.setBottom(ap);
    }

    @FXML
    void clickPiloti(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/PilotiMotoGP.fxml"));
        AnchorPane ap = loader.load();
        BPane.setBottom(ap);
    }

    @FXML
    void clickCostruttori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ScuderieMotoGP.fxml"));
        AnchorPane ap = loader.load();
        BPane.setBottom(ap);
    }

    @FXML
    void clickNews(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/NewsMotoGP.fxml"));
        AnchorPane ap = loader.load();
        BPane.setBottom(ap);
    }

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ClassificaMotoGp.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
        classificaButton.getStyleClass().add("bold-button");
        pilotiButton.getStyleClass().add("bold-button");
        costruttoriButton.getStyleClass().add("bold-button");
        newsButton.getStyleClass().add("bold-button");
    }

}
