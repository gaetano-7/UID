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

public class ControllerChampions {

    @FXML
    private AnchorPane APane;

    @FXML
    private BorderPane BPane;

    @FXML
    private ImageView Logo_Champions;

    @FXML
    private JFXButton Marcatori;

    @FXML
    private JFXButton Tabellone;

    @FXML
    private Label scritta_Champions;

    @FXML
    void marcatori_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/MarcatoriChampions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void tabellone_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/TableChampions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerTabelloneChampions tabellone = loader.getController();
        tabellone.setBPane(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/TableChampions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerTabelloneChampions tabellone = loader.getController();
        tabellone.setBPane(BPane);
        BPane.setBottom(nuovoAnchorPane);
        Marcatori.getStyleClass().add("bold-button");
        Tabellone.getStyleClass().add("bold-button");
    }

}
