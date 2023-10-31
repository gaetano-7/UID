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

public class ControllerRisultatiWimbledon {

    @FXML
    private AnchorPane APane;

    private BorderPane BPane;

    public void setBPane(BorderPane bPane) {
        this.BPane = bPane;
    }

    public void SetPane(Image F1, Image F2, String s) throws IOException, SQLException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Wimbledon_match.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerWimbledonMatch Wimi = loader.getController();
        Wimi.ReadDB(s);
        Wimi.SetImg1(F1);
        Wimi.SetImg2(F2);
        Wimi.setBPaneWimbledon(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    private AnchorPane APane1;

    @FXML
    private AnchorPane APane2;

    @FXML
    private HBox Djo_Kyr;

    @FXML
    private HBox Djo_Nor;

    @FXML
    private HBox Djo_Sin;

    @FXML
    private HBox Fri_Nad;

    @FXML
    private HBox Gar_Kyr;

    @FXML
    private HBox Gof_Nor;

    @FXML
    private HBox Kyr_Nad;

    @FXML
    private ScrollPane ScrollPaneW;

    @FXML
    void Djo_Kyr_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        SetPane(i,i2,"Djok_Kyrg");
    }

    @FXML
    void Djo_Nor_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Norrie.png");
        SetPane(i,i2,"Djok_Norr");
    }

    @FXML
    void Djo_Sin_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Sinner.png");
        SetPane(i,i2,"Djok_Sinn");
    }

    @FXML
    void Gar_Kyr_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Garin.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        SetPane(i,i2,"Gari_Kyrg");
    }

    @FXML
    void Gof_Nor_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Goffin.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Norrie.png");
        SetPane(i,i2,"Goff_Norr");
    }

    @FXML
    void Kyr_Nad_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Kyrg_Nada");
    }

    @FXML
    void Fri_Nad_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Fritz.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Fritz_Nada");
    }


    public void initialize() {
        addMouseHoverEffect(Djo_Kyr);
        addMouseHoverEffect(Djo_Nor);
        addMouseHoverEffect(Djo_Sin);
        addMouseHoverEffect(Fri_Nad);
        addMouseHoverEffect(Gar_Kyr);
        addMouseHoverEffect(Gof_Nor);
        addMouseHoverEffect(Kyr_Nad);
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