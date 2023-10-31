package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.sql.SQLException;

public class ControllerRisultatiRoland {

    @FXML
    private AnchorPane APane;

    private BorderPane BPane;

    public void setBPane(BorderPane bPane) {
        this.BPane = bPane;
    }

    public void SetPane(Image F1, Image F2, String s) throws IOException, SQLException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Roland_match.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerRolandMatch Rimi = loader.getController();
        Rimi.ReadDB(s);
        Rimi.SetImg1(F1);
        Rimi.SetImg2(F2);
        Rimi.setBPaneRoland(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    private AnchorPane APane1;

    @FXML
    private AnchorPane APane2;

    @FXML
    private HBox Djo_Nad;

    @FXML
    private HBox Nad_Ruu;

    @FXML
    private HBox Nad_Zve;

    @FXML
    private HBox Rub_Cil;

    @FXML
    private HBox Ruu_Cil;

    @FXML
    private HBox Ruu_Run;

    @FXML
    private ScrollPane ScrollPane;

    @FXML
    private HBox Zve_Alc;

    @FXML
    void Djo_Nad_click(MouseEvent event) throws IOException, SQLException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Djok_Nada");
    }

    @FXML
    void Nad_Ruu_click(MouseEvent event) throws IOException, SQLException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        SetPane(i,i2,"Nada_Ruud");
    }

    @FXML
    void Nad_Zve_click(MouseEvent event) throws IOException, SQLException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Zverev.png");
        SetPane(i,i2,"Nada_Zver");
    }

    @FXML
    void Rub_Cil_click(MouseEvent event) throws IOException, SQLException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Rublev.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Cilic.png");
        SetPane(i,i2,"Rubl_Cili");
    }

    @FXML
    void Ruu_Cil_click(MouseEvent event) throws IOException, SQLException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Cilic.png");
        SetPane(i,i2,"Ruud_Cili");
    }

    @FXML
    void Ruu_Run_click(MouseEvent event) throws IOException, SQLException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Rune.png");
        SetPane(i,i2,"Ruud_Rune");
    }

    @FXML
    void Zve_Alc_click(MouseEvent event) throws IOException, SQLException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Zverev.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Alcaraz.png");
        SetPane(i,i2,"Zver_Alca");
    }

    public void initialize() {
        addMouseHoverEffect(Djo_Nad);
        addMouseHoverEffect(Nad_Ruu);
        addMouseHoverEffect(Nad_Zve);
        addMouseHoverEffect(Rub_Cil);
        addMouseHoverEffect(Ruu_Cil);
        addMouseHoverEffect(Ruu_Run);
        addMouseHoverEffect(Zve_Alc);
    }

    private void addMouseHoverEffect(HBox imageView) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.WHITE);

        imageView.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> {
            imageView.setEffect(dropShadow);
            imageView.setScaleX(1.01);
            imageView.setScaleY(1.01);
        });

        imageView.addEventHandler(MouseEvent.MOUSE_EXITED, event -> {
            imageView.setScaleX(1.0);
            imageView.setScaleY(1.0);
            imageView.setEffect(null);
        });
    }

}
