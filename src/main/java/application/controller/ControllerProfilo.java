package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.*;

public class ControllerProfilo {

    @FXML
    private ImageView imgFighter;

    @FXML
    private Label lblAltezza;

    @FXML
    private Label lblCat;

    @FXML
    private Label lblNaz;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblPeso;

    @FXML
    private Label lblRecord;

    @FXML
    private Label lblWinKO;

    private BorderPane BpaneProf;

    public void setBpaneProf(BorderPane bpane) {
        BpaneProf = bpane;
    }

    public void GetImage(Image i) {
        imgFighter.setImage(i);
    }

    private String id;

    public void Getmatch(String s)
    {
        id = s;
    }

    public void GetData(String s) throws SQLException {
        String url = "jdbc:sqlite:Database2.db";
        Connection con = DriverManager.getConnection(url);
        try {
            String query = "select win,lose,odd,peso,altezza,naz,categoria,winKO,nick from ProfiliMMA where ID = ?;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,s);

            ResultSet RS = stmt.executeQuery();

            if(RS.next()) {
                lblNome.setText(RS.getString(9));
                String RW = String.valueOf(RS.getInt(1));
                String RL =  String.valueOf(RS.getInt(2));
                String RO =  String.valueOf(RS.getInt(3));
                String Record = RW + "-" + RL + "-" + RO;
                lblRecord.setText(Record);
                lblWinKO.setText(String.valueOf(RS.getInt(8)));
                lblCat.setText(RS.getString(7));
                lblNaz.setText(RS.getString(6));
                lblAltezza.setText( String.valueOf(RS.getInt(5)) + " Cm");
                lblPeso.setText(String.valueOf(RS.getInt(4)) +" Kg");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void backFight(MouseEvent event) throws IOException, SQLException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/UFC.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerUFC CUf = loader.getController();
        CUf.setBpaneUfc(BpaneProf);
        BpaneProf.setCenter(nuovoAnchorPane);
    }
}
