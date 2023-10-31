package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.sql.*;

public class ControllerIncontro {

    @FXML
    private ImageView imgFighter1;

    public void SetImg1(Image i)
    {
        imgFighter1.setImage(i);
    }

    @FXML
    private ImageView imgFighter2;

    public void SetImg2(Image i)
    {
        imgFighter2.setImage(i);
    }

    @FXML
    private Label lblColpiSF1;

    @FXML
    private ImageView imgBack;

    @FXML
    private Label lblColpiSF2;

    @FXML
    private Label lblColpiTF1;

    @FXML
    private Label lblColpiTF2;

    @FXML
    private Label lblCorpoF1;

    @FXML
    private Label lblCorpoF2;

    @FXML
    private Label lblGambeF1;

    @FXML
    private Label lblGambeF2;

    @FXML
    private Label lblRisultato;

    @FXML
    private Label lblTakeF1;

    @FXML
    private Label lblTakeF2;

    @FXML
    private Label lblTestaF1;

    @FXML
    private Label lblTestaF2;

    @FXML
    private Label lblWinF1;

    @FXML
    private Label lblWinF2;

    private BorderPane BpaneInc;

    public void setBpaneInc(BorderPane bpane) {
        BpaneInc = bpane;
    }

    @FXML
    void back_click(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/UFC.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerUFC Cu = loader.getController();
        Cu.setBpaneUfc(BpaneInc);
        BpaneInc.setCenter(nuovoAnchorPane);
    }

    public void ReadDB(String m) throws SQLException {
        String url = "jdbc:sqlite:Database2.db";
        Connection con = DriverManager.getConnection(url);
        try {
            String query = "select TipoVittoria,ColpiTF1,ColpiTF2,ColpiSF1,ColpiSF2,TestaF1,TestaF2,CorpoF1,CorpoF2,GambeF1,GambeF2,TakeF1,TakeF2,Vincitore,Img1,Img2 from Mma where ID = ?;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,m);

            ResultSet RS = stmt.executeQuery();

            if(RS.next()) {
                lblRisultato.setText(RS.getString(1));
                lblColpiTF1.setText(String.valueOf(RS.getInt(2)));
                lblColpiTF2.setText(String.valueOf(RS.getInt(3)));
                lblColpiSF1.setText(String.valueOf(RS.getInt(4)));
                lblColpiSF2.setText(String.valueOf(RS.getInt(5)));
                lblTestaF1.setText(String.valueOf(RS.getInt(6)));
                lblTestaF2.setText(String.valueOf(RS.getInt(7)));
                lblCorpoF1.setText(String.valueOf(RS.getInt(8)));
                lblCorpoF2.setText(String.valueOf(RS.getInt(9)));
                lblGambeF1.setText(String.valueOf(RS.getInt(10)));
                lblGambeF2.setText(String.valueOf(RS.getInt(11)));
                lblTakeF1.setText(String.valueOf(RS.getInt(12)));
                lblTakeF2.setText(String.valueOf(RS.getInt(13)));
                Image i1 = new Image(RS.getString("Img1"));
                imgFighter1.setImage(i1);
                Image i2 = new Image(RS.getString("Img2"));
                imgFighter2.setImage(i2);

                int vin = RS.getInt(14);

                if (vin == 1) {
                    lblWinF1.setVisible(true);
                    lblWinF2.setVisible(false);
                }
                else {
                    lblWinF1.setVisible(false);
                    lblWinF2.setVisible(true);
                }
            }
            con.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String ID;
    private String ID2;
    public  String IDM;

    public void getID(String s)
    {
        ID = s;
    }
    public void getID2(String s)
    {
        ID2 = s;
    }
    public void getIDM(String s)
    {
        IDM = s;
    }

    @FXML
    void ImgF1(MouseEvent event) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Profilo.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerProfilo CP = loader.getController();
        CP.GetData(ID);
        CP.Getmatch(IDM);
        CP.GetImage(imgFighter1.getImage());
        CP.setBpaneProf(BpaneInc);
        BpaneInc.setCenter(nuovoAnchorPane);
    }

    @FXML
    void imgF2(MouseEvent event) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Profilo.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerProfilo CP = loader.getController();
        CP.GetData(ID2);
        CP.Getmatch(IDM);
        CP.GetImage(imgFighter2.getImage());
        CP.setBpaneProf(BpaneInc);
        BpaneInc.setCenter(nuovoAnchorPane);
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

    @FXML
    public void initialize() {
        addMouseHoverEffect(imgFighter1);
        addMouseHoverEffect(imgFighter2);
        addMouseHoverEffect(imgBack);
    }




}
