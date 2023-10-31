package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.sql.*;

public class ControllerWimbledonMatch {

    @FXML
    private ImageView wtennista1;

    public void SetImg1(Image i) {
        wtennista1.setImage(i);
    }

    @FXML
    private ImageView wtennista2;

    public void SetImg2(Image i) {
        wtennista2.setImage(i);
    }

    @FXML
    private Label set_1;

    @FXML
    private Label set_2;

    @FXML
    private Label wace1;

    @FXML
    private Label wace2;

    @FXML
    private Label wcp1;

    @FXML
    private Label wcp2;

    @FXML
    private Label wdp1;

    @FXML
    private Label wdp2;

    @FXML
    private Label wpm1;

    @FXML
    private Label wpm2;

    @FXML
    private Label wpr1;

    @FXML
    private Label wpr2;

    @FXML
    private Label wpvs2;

    @FXML
    private Label wpvr1;

    @FXML
    private Label wpvr2;

    @FXML
    private Label wpvs1;

    public void ReadDB(String s) throws SQLException {
        String url = "jdbc:sqlite:Database2.db";
        Connection con = DriverManager.getConnection(url);
        try {
            String query = "select set1,set2,ace1,ace2,dp1,dp2,cp1,cp2,pm1,pm2,pr1,pr2,pvs1,pvs2,pvr1,pvr2 from Wimbledon where ID = ?;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,s);
            ResultSet RS = stmt.executeQuery();

            if(RS.next()) {
                set_1.setText(String.valueOf(RS.getInt(1)));
                set_2.setText(String.valueOf(RS.getInt(2)));
                wace1.setText(String.valueOf(RS.getInt(3)));
                wace2.setText(String.valueOf(RS.getInt(4)));
                wdp1.setText(String.valueOf(RS.getInt(5)));
                wdp2.setText(String.valueOf(RS.getInt(6)));
                wcp1.setText(String.valueOf(RS.getInt(7)));
                wcp2.setText(String.valueOf(RS.getInt(8)));
                wpm1.setText(String.valueOf(RS.getInt(9)));
                wpm2.setText(String.valueOf(RS.getInt(10)));
                wpr1.setText(String.valueOf(RS.getString(11)));
                wpr2.setText(String.valueOf(RS.getString(12)));
                wpvs1.setText(String.valueOf(RS.getString(13)));
                wpvs2.setText(String.valueOf(RS.getString(14)));
                wpvr1.setText(String.valueOf(RS.getString(15)));
                wpvr2.setText(String.valueOf(RS.getString(16)));
            }
            con.close();
            stmt.close();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void setBPaneWimbledon(BorderPane bPane) {
    }
}
