package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.sql.SQLException;

public class ControllerRisultatiNba {

    private BorderPane BPane;

    public void setBPane(BorderPane bPane) {
        this.BPane = bPane;
    }

    public void SetPane(Image F1, Image F2, String s) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Nba_match.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerNbaMatch Nbami = loader.getController();
        Nbami.ReadDB(s);
        Nbami.SetImg1(F1);
        Nbami.SetImg2(F2);
        Nbami.setBPaneNba(BPane);
        BPane.setBottom(nuovoAnchorPane);
    }

    @FXML
    private Pane Buck_Pist;

    @FXML
    private Pane Bulls_76ers;

    @FXML
    private Pane Celt_Horn;

    @FXML
    private Pane Mavs_Lake;

    @FXML
    private Pane Nugg_Heat;

    @FXML
    private Pane Peli_Blaze;

    @FXML
    private Pane Rapt_Nets;

    @FXML
    private Pane Rock_Griz;

    @FXML
    private Pane Spurs_Jazz;

    @FXML
    private Pane Warr_Thun;

    @FXML
    private VBox matches;

    @FXML
    void Bos_Cha_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreest/Boston.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreest/Hornets.png");
        SetPane(i,i2,"Celtics");
    }

    @FXML
    void Chi_Phi_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreest/Chicago.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreest/Phila.png");
        SetPane(i,i2,"Bulls");
    }

    @FXML
    void Dal_Lak_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreovest/Dallas.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreovest/Lakers.png");
        SetPane(i,i2,"Mavs");
    }

    @FXML
    void Den_Mia_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreovest/Denver.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreovest/Miami.png");
        SetPane(i,i2,"Nuggets");
    }

    @FXML
    void Hou_Mem_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreovest/Houston.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreovest/Memphis.png");
        SetPane(i,i2,"Rockets");
    }

    @FXML
    void Mil_Det_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreest/Bucks.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreest/Pistons.png");
        SetPane(i,i2,"Bucks");
    }

    @FXML
    void Nop_Bla_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreovest/Pelicans.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreovest/Portland.png");
        SetPane(i,i2,"Pelicans");
    }

    @FXML
    void Spu_Jaz_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreovest/Spurs.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreovest/Utah.png");
        SetPane(i,i2,"Spurs");
    }

    @FXML
    void Tor_Bro_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreest/Raptors.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreest/Nets.png");
        SetPane(i,i2,"Raptors");
    }

    @FXML
    void War_Thu_click(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/nba/Squadreovest/Warriors.png");
        Image i2 = new Image("/application/progettoswansport/images/nba/Squadreovest/Thunder.png");
        SetPane(i,i2,"Warriors");
    }

    @FXML
    void initialize() {
        addMouseOverEffect(Buck_Pist);
        addMouseOverEffect(Bulls_76ers);
        addMouseOverEffect(Celt_Horn);
        addMouseOverEffect(Mavs_Lake);
        addMouseOverEffect(Nugg_Heat);
        addMouseOverEffect(Peli_Blaze);
        addMouseOverEffect(Rapt_Nets);
        addMouseOverEffect(Rock_Griz);
        addMouseOverEffect(Spurs_Jazz);
        addMouseOverEffect(Warr_Thun);
    }

    private void addMouseOverEffect(Pane pane) {
        pane.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> {
            pane.setStyle("-fx-border-color: white; -fx-border-width: 2px; -fx-border-radius: 30px; -fx-background-color: #080a73; -fx-background-radius: 30px;");
        });

        pane.addEventHandler(MouseEvent.MOUSE_EXITED, event -> {
            pane.setStyle("-fx-border-color: transparent; -fx-background-color:  linear-gradient(to right, blue, #ba0707); -fx-background-radius: 30px;");
        });
    }


}
