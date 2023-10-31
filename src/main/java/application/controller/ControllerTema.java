package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class ControllerTema {

    @FXML
    private ColorPicker ColorPicker;


    private BorderPane BPaneTema;
    private BorderPane BpaneSet;

    private Color c;

    public void setBPaneTema(BorderPane BPane) { this.BPaneTema = BPane; }

    public void setBpane(BorderPane b){this.BpaneSet = b;}


    @FXML
    void Base(ActionEvent event) {
        BpaneSet.getStylesheets().clear();
        BPaneTema.getStylesheets().clear();
        BPaneTema.setStyle(null);
        BpaneSet.setStyle(null);

        String url = "/application/progettoswansport/css/BaseTheme.css";
        BPaneTema.getStylesheets().add(url);
        BpaneSet.getStylesheets().add(url);

    }

    @FXML
    void Paradiso(ActionEvent event) {
        BpaneSet.getStylesheets().clear();
        BPaneTema.getStylesheets().clear();


        c = ColorPicker.getValue();

        BPaneTema.setStyle("-fx-background-color: " + toHex(c)+ ";" );
        BpaneSet.setStyle("-fx-background-color: " + toHex(c)+ ";" );


    }

    @FXML
    void Scuro(ActionEvent event) {
        BpaneSet.getStylesheets().clear();
        BPaneTema.getStylesheets().clear();

        BPaneTema.setStyle(null);
        BpaneSet.setStyle(null);

        String url = "/application/progettoswansport/css/DarkTheme.css";
        BPaneTema.getStylesheets().add(url);
        BpaneSet.getStylesheets().add(url);

    }

    private String toHex(Color c)
    {
        return String.format("#%02X%02X%02X",(int) (c.getRed() * 255),(int) (c.getGreen() * 255),(int) (c.getBlue() * 255) );
    }



}
