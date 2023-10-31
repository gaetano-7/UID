package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.sql.SQLException;

public class ControllerUFC {

    private BorderPane BpaneUfc;
    @FXML
    private ImageView ImgF1;

    @FXML
    private ImageView ImgF10;

    @FXML
    private ImageView ImgF11;

    @FXML
    private ImageView ImgF12;

    @FXML
    private ImageView ImgF2;

    @FXML
    private ImageView ImgF3;

    @FXML
    private ImageView ImgF4;

    @FXML
    private ImageView ImgF5;

    @FXML
    private ImageView ImgF6;

    @FXML
    private ImageView ImgF7;

    @FXML
    private ImageView ImgF8;

    @FXML
    private ImageView ImgF9;

    public void setBpaneUfc(BorderPane bpane)
    {
        BpaneUfc = bpane;
    }

    public void SetPane(String s,String ID1, String ID2) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Incontro.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerIncontro Ci = loader.getController();
        Ci.ReadDB(s);
        Ci.getID(ID1);
        Ci.getID2(ID2);
        Ci.getIDM(s);
        Ci.setBpaneInc(BpaneUfc);
        BpaneUfc.setCenter(nuovoAnchorPane);
    }

    @FXML
    void adesanya_click(MouseEvent event) throws IOException, SQLException {
        SetPane("AdesanyaPereira","adesanya","pereira");
    }

    @FXML
    void aldo_click(MouseEvent event) throws IOException, SQLException {
        SetPane("AldoMcgregor","aldo","mcgregor");
    }

    @FXML
    void chimaev_click(MouseEvent event) throws IOException, SQLException {
        SetPane("ChimaevHolland","chimaev","holland");
    }

    @FXML
    void diaz_click(MouseEvent event) throws IOException, SQLException {
        SetPane("DiazFerguson","diaz","ferguson");
    }

    @FXML
    void holloway_click(MouseEvent event) throws IOException, SQLException {
        SetPane("HollawayAllen","holloway","allen");
    }

    @FXML
    void khabib_click(MouseEvent event) throws IOException, SQLException {
        SetPane("KhabibMcgregor","khabib","mcgregor");
    }

    @FXML
    void lones_click(MouseEvent event) throws IOException, SQLException {
        SetPane("JonesGane","jones","gane");
    }

    @FXML
    void makhachev_click(MouseEvent event) throws IOException, SQLException {
        SetPane("MakhachevVolkanovski","makhachev","volkanovski");
    }

    @FXML
    void miocic_click(MouseEvent event) throws IOException, SQLException {
        SetPane("MiocicNgannou","miocic","ngannou");
    }

    @FXML
    void oliveira_click(MouseEvent event) throws IOException, SQLException {
        SetPane("OliveiraMakhachev","oliveira","makhachev");
    }

    @FXML
    void poirier_click(MouseEvent event) throws IOException, SQLException {
        SetPane("PoirierMcgregor","poirier","mcgregor");
    }

    @FXML
    void silva_click(MouseEvent event) throws IOException, SQLException {
        SetPane("HallSilva","hall","silva");
    }

    @FXML
    public void initialize() {
        addMouseHoverEffect(ImgF1);
        addMouseHoverEffect(ImgF2);
        addMouseHoverEffect(ImgF3);
        addMouseHoverEffect(ImgF4);
        addMouseHoverEffect(ImgF5);
        addMouseHoverEffect(ImgF6);
        addMouseHoverEffect(ImgF7);
        addMouseHoverEffect(ImgF8);
        addMouseHoverEffect(ImgF9);
        addMouseHoverEffect(ImgF10);
        addMouseHoverEffect(ImgF11);
        addMouseHoverEffect(ImgF12);
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

}