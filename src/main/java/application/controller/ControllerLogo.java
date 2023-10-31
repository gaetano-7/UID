package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControllerLogo {

    private ImageView ImgLog,ImgHome;

    public void setimg(ImageView i)
    {
        ImgLog = i;
    }

    public void setimgHome(ImageView i)
    {
        ImgHome = i;
    }


    @FXML
    void LogoB(ActionEvent event) throws IOException {
        Image i = new Image("/application/progettoswansport/images/icone/logo_total_white.png");
        ImgLog.setImage(i);
        ImgHome.setImage(i);

    }

    @FXML
    void LogoScrittaBianca(ActionEvent event) throws IOException {
        Image i = new Image("/application/progettoswansport/images/icone/logo_bianco.png");
        ImgLog.setImage(i);
        ImgHome.setImage(i);
    }

    @FXML
    void LogoScrittaNera(ActionEvent event) throws IOException {
        Image i = new Image("/application/progettoswansport/images/icone/logo_nero.png");
        ImgLog.setImage(i);
        ImgHome.setImage(i);
    }

}
