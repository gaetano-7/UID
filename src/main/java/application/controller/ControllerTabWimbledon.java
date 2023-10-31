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

public class ControllerTabWimbledon {

    private BorderPane BPane;

    public void setBPane(BorderPane BPane) {
        this.BPane = BPane;
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
    private Label djoko_f;

    @FXML
    private Label djoko_q;

    @FXML
    private Label djoko_s;

    @FXML
    private Label fritz_q;

    @FXML
    private Label garin_q;

    @FXML
    private Label goffin_q;

    @FXML
    private Label kyrg_f;

    @FXML
    private Label kyrg_q;

    @FXML
    private Label kyrg_s;

    @FXML
    private Label nadal_q;

    @FXML
    private Label nadal_s;

    @FXML
    private Label norrie_q;

    @FXML
    private Label norrie_s;

    @FXML
    private Label sinner_q;

    @FXML
    private AnchorPane tabWimbPane;

    @FXML
    void press_djoko_f(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        SetPane(i,i2,"Djok_Kyrg");
    }

    @FXML
    void press_djoko_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Sinner.png");
        SetPane(i,i2,"Djok_Sinn");
    }

    @FXML
    void press_djoko_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Norrie.png");
        SetPane(i,i2,"Djok_Norr");
    }

    @FXML
    void press_fritz_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Fritz.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Fritz_Nada");
    }

    @FXML
    void press_garin_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Garin.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        SetPane(i,i2,"Gari_Kyrg");
    }

    @FXML
    void press_goffin_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Goffin.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Norrie.png");
        SetPane(i,i2,"Goff_Norr");
    }

    @FXML
    void press_kyrg_f(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        SetPane(i,i2,"Djok_Kyrg");
    }

    @FXML
    void press_kyrg_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Garin.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        SetPane(i,i2,"Gari_Kyrg");
    }

    @FXML
    void press_kyrg_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Kyrg_Nada");
    }

    @FXML
    void press_nadal_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Fritz.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Fritz_Nada");
    }

    @FXML
    void press_nadal_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Kyrgios.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Nadal.png");
        SetPane(i,i2,"Kyrg_Nada");
    }

    @FXML
    void press_norrie_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Goffin.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Norrie.png");
        SetPane(i,i2,"Goff_Norr");
    }

    @FXML
    void press_norrie_s(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Norrie.png");
        SetPane(i,i2,"Djok_Norr");
    }

    @FXML
    void press_sinner_q(MouseEvent event) throws SQLException, IOException {
        Image i = new Image("/application/progettoswansport/images/tennis/Tennisti/Djokovic.png");
        Image i2 = new Image("/application/progettoswansport/images/tennis/Tennisti/Sinner.png");
        SetPane(i,i2,"Djok_Sinn");
    }

    @FXML
    void initialize() {
        addMouseOverEffect(djoko_f);
        addMouseOverEffect(djoko_q);
        addMouseOverEffect(djoko_s);
        addMouseOverEffect(fritz_q);
        addMouseOverEffect(garin_q);
        addMouseOverEffect(goffin_q);
        addMouseOverEffect(kyrg_f);
        addMouseOverEffect(kyrg_q);
        addMouseOverEffect(kyrg_s);
        addMouseOverEffect(nadal_q);
        addMouseOverEffect(nadal_s);
        addMouseOverEffect(norrie_q);
        addMouseOverEffect(norrie_s);
        addMouseOverEffect(sinner_q);
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
