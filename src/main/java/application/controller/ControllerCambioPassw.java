package application.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.*;

public class ControllerCambioPassw {


    private String User;

    public void setUser(String us){User = us;}

    @FXML
    private ImageView occhio_aperto_att;

    @FXML
    private ImageView occhio_aperto_new;

    @FXML
    private Label PassErr;

    @FXML
    private ImageView occhio_chiuso_att;

    @FXML
    private ImageView occhio_chiuso_new;

    @FXML
    private JFXPasswordField passw_att;

    @FXML
    private JFXPasswordField passw_new;

    @FXML
    private JFXTextField text_att;

    @FXML
    private JFXTextField text_new;



    @FXML
    void RilasciaNew(MouseEvent event) {
        passw_new.setText(text_new.getText());
        text_new.setVisible(false);
        passw_new.setVisible(true);
        occhio_aperto_new.setVisible(false);
        occhio_chiuso_new.setVisible(true);
    }

    @FXML
    void ShowPassNew(MouseEvent event) {
        text_new.setText(passw_new.getText());
        text_new.setVisible(true);
        passw_new.setVisible(false);
        occhio_aperto_new.setVisible(true);
        occhio_chiuso_new.setVisible(false);
    }

    @FXML
    void rilasciaAtt(MouseEvent event) {
        passw_att.setText(text_att.getText());
        text_att.setVisible(false);
        passw_att.setVisible(true);
        occhio_aperto_att.setVisible(false);
        occhio_chiuso_att.setVisible(true);
    }

    @FXML
    void showPassAtt(MouseEvent event) {
        text_att.setText(passw_att.getText());
        text_att.setVisible(true);
        passw_att.setVisible(false);
        occhio_aperto_att.setVisible(true);
        occhio_chiuso_att.setVisible(false);
    }


    @FXML
    void CambioClick(ActionEvent event) throws SQLException {

        String newPass = BCrypt.hashpw(passw_new.getText(),BCrypt.gensalt(12));
        String oldPass = passw_att.getText();


        String url= "jdbc:sqlite:Database1.db";
        Connection connect = DriverManager.getConnection(url);

        String query1 = "Select Password FROM LoginData WHERE User = ?";

        PreparedStatement stmt = connect.prepareStatement(query1);
        stmt.setString(1,User);
        ResultSet rs = stmt.executeQuery();

        if(rs.next())
        {
            String ps = rs.getString(1);
            if(BCrypt.checkpw(oldPass,ps))
            {
                String query = "UPDATE LoginData SET Password = ? WHERE User =?";
                PreparedStatement stmt2 = connect.prepareStatement(query);
                stmt2.setString(1, newPass);
                stmt2.setString(2,User);
                stmt2.executeUpdate();

                PassErr.setVisible(true);
                PassErr.setText("Password aggiornata");
                PassErr.setStyle("-fx-text-fill: #00FF00;");

                FadeTransition fadeTransition = new FadeTransition(Duration.seconds(10), PassErr);
                fadeTransition.setFromValue(1.0);
                fadeTransition.setToValue(0.0);
                fadeTransition.play();
                fadeTransition.setOnFinished(e -> PassErr.setVisible(false));
            }
            else
            {
                PassErr.setVisible(true);
                PassErr.setText("Password attuale incorretta");
                PassErr.setStyle("-fx-text-fill: #FF0000;");

                FadeTransition fadeTransition = new FadeTransition(Duration.seconds(10), PassErr);
                fadeTransition.setFromValue(1.0);
                fadeTransition.setToValue(0.0);
                fadeTransition.play();
                fadeTransition.setOnFinished(e -> PassErr.setVisible(false));
            }
        }

        connect.close();
        stmt.close();
    }




}
