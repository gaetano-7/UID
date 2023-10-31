package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.sql.*;

public class ControllerRolandMatch {

    @FXML
    private ImageView tennista1;

    public void SetImg1(Image i) {
        tennista1.setImage(i);
    }

    @FXML
    private ImageView tennista2;

    public void SetImg2(Image i2) {
        tennista2.setImage(i2);
    }

    @FXML
    private Label ace1;

    @FXML
    private Label ace2;

    @FXML
    private Label cv1;

    @FXML
    private Label cv2;

    @FXML
    private Label df1;

    @FXML
    private Label df2;

    @FXML
    private Label par1;

    @FXML
    private Label par2;

    @FXML
    private Label pm1;

    @FXML
    private Label pm2;

    @FXML
    private Label pvr1;

    @FXML
    private Label pvr2;

    @FXML
    private Label pvs1;

    @FXML
    private Label pvs2;

    @FXML
    private Label set1;

    @FXML
    private Label set2;

    public void ReadDB(String s) throws SQLException {
        String url = "jdbc:sqlite:Database2.db";
        Connection con = DriverManager.getConnection(url);
        try {
            String query = "select set1,set2,ace1,ace2,dp1,dp2,cp1,cp2,pm1,pm2,pr1,pr2,pvs1,pvs2,pvr1,pvr2 from Roland where ID = ?;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,s);
            ResultSet RS = stmt.executeQuery();

            if(RS.next()) {
                set1.setText(String.valueOf(RS.getInt(1)));
                set2.setText(String.valueOf(RS.getInt(2)));
                ace1.setText(String.valueOf(RS.getInt(3)));
                ace2.setText(String.valueOf(RS.getInt(4)));
                df1.setText(String.valueOf(RS.getInt(5)));
                df2.setText(String.valueOf(RS.getInt(6)));
                cv1.setText(String.valueOf(RS.getInt(7)));
                cv2.setText(String.valueOf(RS.getInt(8)));
                pm1.setText(String.valueOf(RS.getInt(9)));
                pm2.setText(String.valueOf(RS.getInt(10)));
                par1.setText(String.valueOf(RS.getString(11)));
                par2.setText(String.valueOf(RS.getString(12)));
                pvs1.setText(String.valueOf(RS.getString(13)));
                pvs2.setText(String.valueOf(RS.getString(14)));
                pvr1.setText(String.valueOf(RS.getString(15)));
                pvr2.setText(String.valueOf(RS.getString(16)));
            }
            con.close();
            stmt.close();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void setBPaneRoland(BorderPane bPane) {
    }
}
