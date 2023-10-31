package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerTabelloneChampions {

    private BorderPane BPane;

    public void setBPane(BorderPane BPane) {
        this.BPane = BPane;
    }

    @FXML
    private AnchorPane anchor_background;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane10;

    @FXML
    private Pane pane11;

    @FXML
    private Pane pane12;

    @FXML
    private Pane pane13;

    @FXML
    private Pane pane14;

    @FXML
    private Pane pane15;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;

    @FXML
    private Pane pane6;

    @FXML
    private Pane pane7;

    @FXML
    private Pane pane8;

    @FXML
    private Pane pane9;

    @FXML
    void match1_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match1_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match2_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match2_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match3_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match3_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match4_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match4_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match5_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match5_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match6_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match6_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match7_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match7_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match8_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match8_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match9_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match9_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match10_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match10_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match11_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match11_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match12_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match12_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match13_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match13_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match14_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match14_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void match15_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match15_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    void initialize() {
        addMouseOverEffect(pane1);
        addMouseOverEffect(pane2);
        addMouseOverEffect(pane3);
        addMouseOverEffect(pane4);
        addMouseOverEffect(pane5);
        addMouseOverEffect(pane6);
        addMouseOverEffect(pane7);
        addMouseOverEffect(pane8);
        addMouseOverEffect(pane9);
        addMouseOverEffect(pane10);
        addMouseOverEffect(pane11);
        addMouseOverEffect(pane12);
        addMouseOverEffect(pane13);
        addMouseOverEffect(pane14);
        addMouseOverEffect(pane15);

    }

    private void addMouseOverEffect(Pane pane) {
        pane.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> {
            pane.setStyle("-fx-border-color: white; -fx-border-width: 2px; -fx-border-radius: 30px; -fx-background-color: #072f6e; -fx-background-radius: 30px;");
        });

        pane.addEventHandler(MouseEvent.MOUSE_EXITED, event -> {
            pane.setStyle("-fx-border-color: transparent; -fx-background-color: #166587; -fx-background-radius: 30px;");
        });
    }

}
