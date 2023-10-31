package application.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControllerNba {

    @FXML
    private AnchorPane APane;

    @FXML
    private BorderPane BPane;

    @FXML
    private ImageView Logo_Nba;

    @FXML
    private JFXButton Risultati;

    @FXML
    private JFXButton Risultati1;

    @FXML
    private JFXButton Tabellone;

    @FXML
    private Label scritta_Nba;

    @FXML
    void Classificaest_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Classifica_est.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void Classificaovest_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Classifica_ovest.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void risultati_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/RisultatiNba.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerRisultatiNba risultatiController = loader.getController();
        risultatiController.setBPane(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Classifica_ovest.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

}
