package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.io.IOException;

public class ControllerCalcio {

    private BorderPane BPaneCalcio;

    public void setBPane(BorderPane BPane) { this.BPaneCalcio = BPane; }

    @FXML
    private ImageView logoChampions;

    @FXML
    private ImageView logoSerieA;

    @FXML
    void clickChampions(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Champions.fxml"));
        BorderPane nuovoBorderPane = loader.load();
        BPaneCalcio.setCenter(nuovoBorderPane);
    }

    @FXML
    void clickSerieA(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/SerieA.fxml"));
        BorderPane nuovoBorderPane = loader.load();
        BPaneCalcio.setCenter(nuovoBorderPane);
    }

    public void initialize() {
        addMouseHoverEffect(logoChampions);
        addMouseHoverEffect(logoSerieA);
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
}
