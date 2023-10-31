package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControllerSettings {


    @FXML
    private ImageView ImgLog;


    private ImageView ImgHome;

    @FXML
    private BorderPane Bpane;

    public BorderPane BpaneSet;
    public void SetBpaneSet(BorderPane B){BpaneSet = B;}

    String us;
    public void SetUs(String s){us = s;}

    public void SetImgHome(ImageView i)
    {
        ImgHome = i;
    }

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Info.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        Bpane.setCenter(nuovoAnchorPane);

        String url = "/application/progettoswansport/css/BaseTheme.css";
        Bpane.getStylesheets().add(url);

    }

    @FXML
    void CambiaClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/CambioPassw.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerCambioPassw CP = loader.getController();
        CP.setUser(us);
        Bpane.setCenter(nuovoAnchorPane);


    }

    @FXML
    void LogoClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/SceltaLogo.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerLogo CL = loader.getController();
        CL.setimg(ImgLog);
        CL.setimgHome(ImgHome);
        Bpane.setCenter(nuovoAnchorPane);


    }

    @FXML
    void TemaClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Tema.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerTema CT = loader.getController();
        CT.setBPaneTema(BpaneSet);
        CT.setBpane(Bpane);
        Bpane.setCenter(nuovoAnchorPane);
    }

    @FXML
    void infoClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Info.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        Bpane.setCenter(nuovoAnchorPane);

    }

    @FXML
    void enteredInfo(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void enteredLogo(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void enteredPass(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void enteredTema(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-effect: dropshadow(gaussian, white, 10, 0, 0, 0);");
        label.setScaleX(1.2);
        label.setScaleY(1.2);
    }

    @FXML
    void exitedInfo(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    void exitedLogo(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    void exitedPass(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    void exitedTema(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setStyle("-fx-background-color: transparent;");
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

}
