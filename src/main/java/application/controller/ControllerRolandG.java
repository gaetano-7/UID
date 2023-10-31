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

public class ControllerRolandG {

    @FXML
    private AnchorPane APane;

    @FXML
    private BorderPane BPane;

    @FXML
    private ImageView Logo_RolandG;

    @FXML
    private JFXButton Risultati;

    @FXML
    private JFXButton Tabellone;

    @FXML
    private Label scritta_RolandG;

    @FXML
    void risultati_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/RisultatiRoland.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerRisultatiRoland risultatiController = loader.getController();
        risultatiController.setBPane(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void tabellone_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Tab_RolandG.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerTabRoland tabRol = loader.getController();
        tabRol.setBPane(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Tab_RolandG.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerTabRoland tabRol = loader.getController();
        tabRol.setBPane(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

}
