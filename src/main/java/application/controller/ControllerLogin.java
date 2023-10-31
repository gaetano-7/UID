package application.controller;

import application.model.ModelLogin;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.io.IOException;
import java.sql.SQLException;

public class ControllerLogin {

    private Stage stage;
    private Scene scene;

    @FXML
    private Label lblError;

    @FXML
    private JFXButton logButton;

    @FXML
    private JFXPasswordField passID;

    @FXML
    private Label regButton;

    @FXML
    private ImageView seeOff;

    @FXML
    private ImageView seeOn;

    @FXML
    private JFXTextField userID;

    @FXML
    private JFXTextField textID;

    @FXML
    void logAccount(ActionEvent event) {
        ModelLogin M = new ModelLogin();
        try {
            if (M.testConnection(userID.getText(), passID.getText()) && !userID.getText().isEmpty() && !passID.getText().isEmpty()) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Home.fxml"));
                Parent pt = loader.load();
                ControllerHome CH = loader.getController();
                CH.SetUs(userID.getText());
                stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(pt);
                stage.setScene(scene);
                stage.centerOnScreen();
                stage.setResizable(true);
                stage.show();


            }
            else {
                lblError.setVisible(true);

                FadeTransition fadeTransition = new FadeTransition(Duration.seconds(10), lblError);
                fadeTransition.setFromValue(1.0);
                fadeTransition.setToValue(0.0);
                fadeTransition.play();
                fadeTransition.setOnFinished(e -> lblError.setVisible(false));
            }

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void regAccount(MouseEvent event) throws IOException {
        Parent pt = FXMLLoader.load(getClass().getResource("/application/progettoswansport/Registrazione.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        FadeTransition fadeOutTransition = new FadeTransition(Duration.millis(500), ((Node) event.getSource()).getScene().getRoot());
        fadeOutTransition.setFromValue(1);
        fadeOutTransition.setToValue(0);

        TranslateTransition translateOutTransition = new TranslateTransition(Duration.millis(500), ((Node) event.getSource()).getScene().getRoot());
        translateOutTransition.setFromX(0);
        translateOutTransition.setToX(stage.getWidth());

        ParallelTransition parallelTransition = new ParallelTransition(fadeOutTransition, translateOutTransition);

        parallelTransition.setOnFinished(e -> {
            scene = new Scene(pt);
            stage.setScene(scene);
            stage.centerOnScreen();

            pt.setOpacity(0);
            pt.setTranslateX(-stage.getWidth());

            FadeTransition fadeInTransition = new FadeTransition(Duration.millis(500), pt);
            fadeInTransition.setFromValue(0);
            fadeInTransition.setToValue(1);

            TranslateTransition translateInTransition = new TranslateTransition(Duration.millis(500), pt);
            translateInTransition.setFromX(-stage.getWidth());
            translateInTransition.setToX(0);

            ParallelTransition newParallelTransition = new ParallelTransition(fadeInTransition, translateInTransition);
            newParallelTransition.play();

        });

        parallelTransition.play();
    }

    @FXML
    void showPass(MouseEvent event) {
        textID.setText(passID.getText());
        textID.setVisible(true);
        passID.setVisible(false);
        seeOff.setVisible(true);
        seeOn.setVisible(false);
    }

    @FXML
    void hidePass(MouseEvent event) {
        passID.setText(textID.getText());
        textID.setVisible(false);
        passID.setVisible(true);
        seeOn.setVisible(true);
        seeOff.setVisible(false);
    }

    @FXML
    void passToPassField(KeyEvent event) {
        if (event.getCode() == KeyCode.DOWN) {
            passID.requestFocus();
        }
        if (event.getCode() == KeyCode.UP) {
            logButton.requestFocus();
        }
        if (event.getCode() == KeyCode.ENTER) {
            logButton.fire();
        }
    }

    @FXML
    void passToUserField(KeyEvent event) {
        if (event.getCode() == KeyCode.UP) {
            userID.requestFocus();
        }
        if (event.getCode() == KeyCode.DOWN) {
            logButton.requestFocus();
        }
        if (event.getCode() == KeyCode.ENTER) {
            logButton.fire();
        }
    }

    @FXML
    void passToOtherField(KeyEvent event) {
        if (event.getCode() == KeyCode.UP) {
            passID.requestFocus();
        }
        if (event.getCode() == KeyCode.DOWN) {
            userID.requestFocus();
        }
        if (event.getCode() == KeyCode.ENTER) {
            logButton.fire();
        }
    }

}
