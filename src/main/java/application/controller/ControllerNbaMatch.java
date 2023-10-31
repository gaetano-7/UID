package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.sql.*;

public class ControllerNbaMatch {

    @FXML
    private ImageView Franchigia1;

    public void SetImg1(Image i) {
        Franchigia1.setImage(i);
    }

    @FXML
    private ImageView Franchigia2;

    public void SetImg2(Image i) {
        Franchigia2.setImage(i);
    }

    @FXML
    private Label cr_1;

    @FXML
    private Label cr_2;

    @FXML
    private Label due_punti;

    @FXML
    private Label punti_1;

    @FXML
    private Label punti_2;

    @FXML
    private Label ra_1;

    @FXML
    private Label ra_2;

    @FXML
    private Label rd_1;

    @FXML
    private Label rd_2;

    @FXML
    private Label s_1;

    @FXML
    private Label s_2;

    @FXML
    private Label t2_1;

    @FXML
    private Label t2_2;

    @FXML
    private Label t3_1;

    @FXML
    private Label t3_2;

    @FXML
    private Label tl_1;

    @FXML
    private Label tl_2;

    public void ReadDB(String s) throws SQLException {
        String url = "jdbc:sqlite:Database2.db";
        Connection con = DriverManager.getConnection(url);
        try{
            String query = "select pnt1,pnt2,c1,c2,t2_1,t2_2,t3_1,t3_2,ra1,ra2,rd1,rd2,s1,s2,tl1,tl2 from nba where ID = ?;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,s);
            ResultSet RS = stmt.executeQuery();

            if(RS.next()){
                punti_1.setText(String.valueOf(RS.getInt(1)));
                punti_2.setText(String.valueOf(RS.getInt(2)));
                cr_1.setText(String.valueOf(RS.getInt(3)));
                cr_2.setText(String.valueOf(RS.getInt(4)));
                t2_1.setText(String.valueOf(RS.getInt(5)));
                t2_2.setText(String.valueOf(RS.getInt(6)));
                t3_1.setText(String.valueOf(RS.getInt(7)));
                t3_2.setText(String.valueOf(RS.getInt(8)));
                ra_1.setText(String.valueOf(RS.getInt(9)));
                ra_2.setText(String.valueOf(RS.getInt(10)));
                rd_1.setText(String.valueOf(RS.getInt(11)));
                rd_2.setText(String.valueOf(RS.getInt(12)));
                s_1.setText(String.valueOf(RS.getInt(13)));
                s_2.setText(String.valueOf(RS.getInt(14)));
                tl_1.setText(String.valueOf(RS.getInt(15)));
                tl_2.setText(String.valueOf(RS.getInt(16)));
            }
            con.close();
            stmt.close();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void setBPaneNba(BorderPane bPaneNba) {
    }
}
