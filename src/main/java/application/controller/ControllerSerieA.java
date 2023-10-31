package application.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControllerSerieA {

    @FXML
    private AnchorPane APane;

    @FXML
    private BorderPane BPane;

    @FXML
    private JFXButton classifica;

    @FXML
    private ImageView logoSerieA;

    @FXML
    private JFXButton marcatori;

    @FXML
    private JFXButton risultati;

    @FXML
    void clickClassifica(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ClassificaSerieA.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void clickMarcatori(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/MarcatoriSerieA.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void clickRisultati(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/RisultatiSerieA.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerRisultatiSerieA risultati = loader.getController();
        risultati.setBPane(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/ClassificaSerieA.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
        marcatori.getStyleClass().add("bold-button");
        classifica.getStyleClass().add("bold-button");
        risultati.getStyleClass().add("bold-button");
    }

}