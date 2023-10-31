package application.controller;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.SQLException;

public class ControllerAnchorHome {

    private BorderPane BPaneAnchor;

    public void setBPane(BorderPane BPane) { this.BPaneAnchor = BPane;}

    @FXML
    private ImageView ImgChamp;

    @FXML
    private ImageView imgNba;

    @FXML
    private ImageView imgWimble;

    @FXML
    private ImageView matchCalcio;

    @FXML
    private ImageView matchChamp2;

    @FXML
    private ImageView matchF1;

    @FXML
    private ImageView matchMotogp;

    @FXML
    private ImageView matchNba2;

    @FXML
    private ImageView matchTennis;





    @FXML
    void ImgChamp2click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match11_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPaneAnchor.setCenter(nuovoAnchorPane);
    }

    @FXML
    void ImgChampclick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match15_Champions.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPaneAnchor.setCenter(nuovoAnchorPane);
    }

    @FXML
    void ImgGpClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/NewsMotoGP.fxml"));
        AnchorPane a = loader.load();
        BPaneAnchor.setCenter(a);
    }

    @FXML
    void ImgNbaClick(MouseEvent event) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Nba_match.fxml"));
        AnchorPane nAcnhor = loader.load();
        ControllerNbaMatch RC = loader.getController();
        Image i = new Image("/application/progettoswansport/images/nba/Squadreovest/Denver.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreovest/Miami.png");
        RC.SetImg1(i);
        RC.SetImg2(i2);
        RC.ReadDB("Nuggets");
        RC.setBPaneNba(BPaneAnchor);
        BPaneAnchor.setCenter(nAcnhor);
    }

    @FXML
    void ImgRolandClick(MouseEvent event) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Roland_match.fxml"));
        AnchorPane nAcnhor = loader.load();
        ControllerRolandMatch RC = loader.getController();
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        RC.SetImg1(i);
        RC.SetImg2(i2);
        RC.ReadDB("Djok_Nada");
        RC.setBPaneRoland(BPaneAnchor);
        BPaneAnchor.setCenter(nAcnhor);
    }

    @FXML
    void ImgWimbleClick(MouseEvent event) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Wimbledon_match.fxml"));
        AnchorPane nAcnhor = loader.load();
        ControllerWimbledonMatch CW = loader.getController();
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        CW.SetImg1(i);
        CW.SetImg2(i2);
        CW.ReadDB("Djok_Kyrg");
        CW.setBPaneWimbledon(BPaneAnchor);
        BPaneAnchor.setCenter(nAcnhor);
    }

    @FXML
    void imgF1click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/NewsF1.fxml"));
        AnchorPane a = loader.load();
        BPaneAnchor.setCenter(a);
    }

    @FXML
    void imgNba2Click(MouseEvent event) throws SQLException, IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Nba_match.fxml"));
        AnchorPane nAcnhor = loader.load();
        ControllerNbaMatch Nbami = loader.getController();
        Image i = new Image("/application/progettoswansport/images/nba/Squadreest/Chicago.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreest/Phila.png");
        Nbami.SetImg1(i);
        Nbami.SetImg2(i2);
        Nbami.ReadDB("Bulls");
        Nbami.setBPaneNba(BPaneAnchor);
        BPaneAnchor.setCenter(nAcnhor);
    }

    @FXML
    void imgSerieAclick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Match7_SerieA.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        BPaneAnchor.setCenter(nuovoAnchorPane);
    }


    private void addMouseHoverEffect(ImageView imageView) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.WHITE);

        imageView.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> {
            imageView.setEffect(dropShadow);
            imageView.setScaleX(1.2);
            imageView.setScaleY(1.2);
        });

        imageView.addEventHandler(MouseEvent.MOUSE_EXITED, event -> {
            imageView.setScaleX(1.0);
            imageView.setScaleY(1.0);
            imageView.setEffect(null);
        });
    }

    public void initialize() {
        addMouseHoverEffect(imgNba);
        addMouseHoverEffect(matchCalcio);
        addMouseHoverEffect(matchNba2);
        addMouseHoverEffect(ImgChamp);
        addMouseHoverEffect(matchChamp2);
        addMouseHoverEffect(matchTennis);
        addMouseHoverEffect(imgWimble);
        addMouseHoverEffect(matchF1);
        addMouseHoverEffect(matchMotogp);
    }



}
