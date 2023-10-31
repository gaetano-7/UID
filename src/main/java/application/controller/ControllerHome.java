package application.controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import jdk.jfr.Event;

import java.io.IOException;

public class ControllerHome {

    public BorderPane getBPane() {
        return BPane;
    }


    @FXML
    private ImageView logoSwan;

    @FXML
    private BorderPane BPane;


    String us;

    boolean giaAperto = false;
    Stage st = new Stage();

    public void SetUs(String s){us = s;}

    @FXML
    void clickSettings(MouseEvent event) throws IOException {

            if (giaAperto) {
                st.show();
                EventHandler<WindowEvent> closeEventHandler = event1 -> {
                    st.hide();
                    event.consume();
                };

                st.setOnCloseRequest(closeEventHandler);
            }
            else
            {
                giaAperto = true;
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Settings.fxml"));
                Parent pt = loader.load();
                ControllerSettings CS = loader.getController();
                CS.SetImgHome(logoSwan);
                CS.SetUs(us);
                CS.SetBpaneSet(BPane);
                st.setTitle("IMPOSTAZIONI");
                st.setResizable(false);
                st.setScene(new Scene(pt));
                st.show();

                EventHandler<WindowEvent> closeEventHandler = event1 -> {
                    st.hide();
                    event.consume();
                };

                st.setOnCloseRequest(closeEventHandler);
            }
    }

    @FXML
    void clickBasket(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Basket.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerBasket controllerBasket = loader.getController();
        controllerBasket.setBPane(BPane);
        BPane.setCenter(nuovoAnchorPane);
    }

    @FXML
    void clickCalcio(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Calcio.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerCalcio controllerCalcio = loader.getController();
        controllerCalcio.setBPane(BPane);
        BPane.setCenter(nuovoAnchorPane);
    }

    @FXML
    void clickMMA(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/MMA.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerMMA controllerMMA = loader.getController();
        controllerMMA.setBPane(BPane);
        BPane.setCenter(nuovoAnchorPane);
    }


    @FXML
    void clickMotori(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Motori.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerMotori controllerMotori = loader.getController();
        controllerMotori.setBPane(BPane);
        BPane.setCenter(nuovoAnchorPane);
    }

    @FXML
    void clickTennis(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Tennis.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerTennis controllerTennis = loader.getController();
        controllerTennis.setBPane(BPane);
        BPane.setCenter(nuovoAnchorPane);
    }

    @FXML
    void clickSwan(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/AnchorHome.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerAnchorHome ch = loader.getController();
        ch.setBPane(BPane);
        BPane.setCenter(nuovoAnchorPane);
    }

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/AnchorHome.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPane.setCenter(nuovoAnchorPane);
        ControllerAnchorHome ch = loader.getController();
        ch.setBPane(BPane);

        String url = "/application/progettoswansport/css/BaseTheme.css";
        BPane.getStylesheets().add(url);
    }

    @FXML
    void enteredSettings(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.05);
        label.setScaleY(1.05);
    }

    @FXML
    void enteredSwan(MouseEvent event) {
        ImageView image = (ImageView) event.getSource();
        image.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        image.setScaleX(1.2);
        image.setScaleY(1.2);
    }

    @FXML
    void enteredBasket(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void enteredCalcio(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void enteredMMA(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void enteredMotori(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void enteredTennis(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void exitedSettings(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    void exitedSwan(MouseEvent event) {
        ImageView image = (ImageView) event.getSource();
        image.setStyle("-fx-background-color: transparent;");
        image.setScaleX(1.0);
        image.setScaleY(1.0);
    }

    @FXML
    void exitedBasket(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    void exitedCalcio(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    void exitedMMA(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);

    }

    @FXML
    void exitedMotori(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    void exitedTennis(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }




}
