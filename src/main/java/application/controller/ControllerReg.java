package application.controller;

import application.model.ModelReg;
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
import javafx.stage.Stage;

import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.io.IOException;
import java.sql.SQLException;

public class ControllerReg {

    private Scene scene;
    private Stage stage;

    private boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9]{3,}$");
    }

    private boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{6,}$");
    }

    private String hashP(String pass) {
        return BCrypt.hashpw(pass, BCrypt.gensalt(12));
    }

    @FXML
    private JFXButton backButton;

    @FXML
    private Label lblErrorP;

    @FXML
    private Label lblErrorU;

    @FXML
    private Label lblPass;

    @FXML
    private Label lblUser;

    @FXML
    private Label lblExist;

    @FXML
    private JFXPasswordField passID;

    @FXML
    private JFXButton regButton;

    @FXML
    private ImageView seeOff;

    @FXML
    private ImageView seeOn;

    @FXML
    private JFXTextField textID;

    @FXML
    private JFXTextField userID;

    @FXML
    void regAccount(ActionEvent event) throws IOException, SQLException {
        ModelReg MR = new ModelReg();
        try {
            boolean isUserValid = isValidUsername(userID.getText());
            boolean isPassValid = isValidPassword(passID.getText());

            if (!isUserValid || !isPassValid) {
                if (!isPassValid && !isUserValid) {
                    lblErrorU.setVisible(true);
                    lblErrorP.setVisible(true);
                    lblUser.setVisible(true);
                    lblPass.setVisible(true);

                    FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(10), lblErrorU);
                    fadeTransition1.setFromValue(1.0);
                    fadeTransition1.setToValue(0.0);
                    fadeTransition1.play();
                    fadeTransition1.setOnFinished(e -> lblErrorU.setVisible(false));

                    FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(10), lblErrorP);
                    fadeTransition2.setFromValue(1.0);
                    fadeTransition2.setToValue(0.0);
                    fadeTransition2.play();
                    fadeTransition2.setOnFinished(e -> lblErrorP.setVisible(false));

                    FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(10), lblUser);
                    fadeTransition3.setFromValue(1.0);
                    fadeTransition3.setToValue(0.0);
                    fadeTransition3.play();
                    fadeTransition3.setOnFinished(e -> lblUser.setVisible(false));

                    FadeTransition fadeTransition4 = new FadeTransition(Duration.seconds(10), lblPass);
                    fadeTransition4.setFromValue(1.0);
                    fadeTransition4.setToValue(0.0);
                    fadeTransition4.play();
                    fadeTransition4.setOnFinished(e -> lblPass.setVisible(false));

                } else if (!isUserValid) {
                    lblErrorU.setVisible(true);
                    lblUser.setVisible(true);

                    FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(10), lblErrorU);
                    fadeTransition1.setFromValue(1.0);
                    fadeTransition1.setToValue(0.0);
                    fadeTransition1.play();
                    fadeTransition1.setOnFinished(e -> lblErrorU.setVisible(false));

                    FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(10), lblUser);
                    fadeTransition2.setFromValue(1.0);
                    fadeTransition2.setToValue(0.0);
                    fadeTransition2.play();
                    fadeTransition2.setOnFinished(e -> lblUser.setVisible(false));

                } else {
                    lblErrorP.setVisible(true);
                    lblPass.setVisible(true);

                    FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(10), lblErrorP);
                    fadeTransition1.setFromValue(1.0);
                    fadeTransition1.setToValue(0.0);
                    fadeTransition1.play();
                    fadeTransition1.setOnFinished(e -> lblErrorP.setVisible(false));

                    FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(10), lblPass);
                    fadeTransition2.setFromValue(1.0);
                    fadeTransition2.setToValue(0.0);
                    fadeTransition2.play();
                    fadeTransition2.setOnFinished(e -> lblPass.setVisible(false));

                }
                return;
            }

            if (MR.ExistAccount(userID.getText())) {
                lblExist.setVisible(true);

                FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(10), lblExist);
                fadeTransition1.setFromValue(1.0);
                fadeTransition1.setToValue(0.0);
                fadeTransition1.play();
                fadeTransition1.setOnFinished(e -> lblExist.setVisible(false));
            }
            else {
                MR.AddAccount(userID.getText(), passID.getText());
                Parent pt = FXMLLoader.load(getClass().getResource("/application/progettoswansport/Login.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(pt);
                stage.setScene(scene);
                stage.show();
            }

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
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
    void goBackLog(ActionEvent event) throws IOException {
        Parent pt = FXMLLoader.load(getClass().getResource("/application/progettoswansport/Login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

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
    void passToLogButton(KeyEvent event) {
        if (event.getCode() == KeyCode.UP || event.getCode() == KeyCode.DOWN) {
            userID.requestFocus();
        }
        if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.LEFT) {
            backButton.requestFocus();
        }
        if (event.getCode() == KeyCode.ENTER) {
            regButton.fire();
        }
    }

    @FXML
    void passToPassField(KeyEvent event) {
        if (event.getCode() == KeyCode.UP || event.getCode() == KeyCode.DOWN) {
            regButton.requestFocus();
        }
        if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.LEFT) {
            passID.requestFocus();
        }
        if (event.getCode() == KeyCode.ENTER) {
            regButton.fire();
        }
    }

    @FXML
    void passToRegButton(KeyEvent event) {
        if (event.getCode() == KeyCode.UP || event.getCode() == KeyCode.DOWN) {
            passID.requestFocus();
        }
        if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.LEFT) {
            regButton.requestFocus();
        }
        if (event.getCode() == KeyCode.ENTER) {
            backButton.fire();
        }
    }

    @FXML
    void passToUserField(KeyEvent event) {
        if (event.getCode() == KeyCode.UP || event.getCode() == KeyCode.DOWN) {
            backButton.requestFocus();
        }
        if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.LEFT) {
            userID.requestFocus();
        }
        if (event.getCode() == KeyCode.ENTER) {
            regButton.fire();
        }
    }

}
