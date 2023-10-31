package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.SQLException;

public class ControllerTabRoland {

    private BorderPane BPane;

    public void setBPane(BorderPane BPane) {
        this.BPane = BPane;
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
    private Label alcaraz_q;

    @FXML
    private Label cilic_q;

    @FXML
    private Label cilic_s;

    @FXML
    private Label djoko_q;

    @FXML
    private Label nadal_f;

    @FXML
    private Label nadal_q;

    @FXML
    private Label nadal_s;

    @FXML
    private Label rublev_q;

    @FXML
    private Label rune_q;

    @FXML
    private Label ruud_f;

    @FXML
    private Label ruud_q;

    @FXML
    private Label ruud_s;

    @FXML
    private AnchorPane tabRolandPane;

    @FXML
    private Label zverev_q;

    @FXML
    private Label zverev_s;

    @FXML
    void press_alcaraz_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Zverev.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Alcaraz.png");
        SetPane(i,i2,"Zver_Alca");
    }

    @FXML
    void press_cilic_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Rublev.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Cilic.png");
        SetPane(i,i2,"Rubl_Cili");
    }

    @FXML
    void press_cilic_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Cilic.png");
        SetPane(i,i2,"Ruud_Cili");
    }

    @FXML
    void press_djoko_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Djok_Nada");
    }

    @FXML
    void press_nadal_f(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        SetPane(i,i2,"Nada_Ruud");
    }

    @FXML
    void press_nadal_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Djok_Nada");
    }

    @FXML
    void press_nadal_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Zverev.png");
        SetPane(i,i2,"Nada_Zver");
    }

    @FXML
    void press_rublev_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Rublev.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Cilic.png");
        SetPane(i,i2,"Rubl_Cili");
    }

    @FXML
    void press_rune_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Rune.png");
        SetPane(i,i2,"Ruud_Rune");
    }

    @FXML
    void press_ruud_f(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        SetPane(i,i2,"Nada_Ruud");
    }

    @FXML
    void press_ruud_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Rune.png");
        SetPane(i,i2,"Ruud_Rune");
    }

    @FXML
    void press_ruud_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Ruud.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Cilic.png");
        SetPane(i,i2,"Ruud_Cili");
    }

    @FXML
    void press_zverev_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Zverev.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Alcaraz.png");
        SetPane(i,i2,"Zver_Alca");
    }

    @FXML
    void press_zverev_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Zverev.png");
        SetPane(i,i2,"Nada_Zver");
    }

    @FXML
    void initialize() {
        addMouseOverEffect(alcaraz_q);
        addMouseOverEffect(cilic_q);
        addMouseOverEffect(cilic_s);
        addMouseOverEffect(djoko_q);
        addMouseOverEffect(nadal_f);
        addMouseOverEffect(nadal_q);
        addMouseOverEffect(nadal_s);
        addMouseOverEffect(rublev_q);
        addMouseOverEffect(rune_q);
        addMouseOverEffect(ruud_f);
        addMouseOverEffect(ruud_q);
        addMouseOverEffect(ruud_s);
        addMouseOverEffect(zverev_q);
        addMouseOverEffect(zverev_s);
    }

    private void addMouseOverEffect(Label label){
        label.addEventHandler(MouseEvent.MOUSE_ENTERED, event ->{
            label.setStyle("-fx-border-color: white; -fx-border-width: 2px; -fx-border-radius: 30px; -fx-background-color:  #074f2c; -fx-background-radius: 30px;");
        });

        label.addEventHandler(MouseEvent.MOUSE_EXITED, event -> {
            label.setStyle("-fx-border-color: transparent; -fx-background-color: #074f2c; -fx-background-radius: 30px;");
        });
    }

}
