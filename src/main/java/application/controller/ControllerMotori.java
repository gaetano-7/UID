package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.io.IOException;

public class ControllerMotori {

    private BorderPane BPaneMotori;

    public void setBPane(BorderPane BPane) { this.BPaneMotori = BPane; }

    @FXML
    private ImageView logoF1;

    @FXML
    private ImageView logoMotogp;

    @FXML
    void clickF1(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/F1.fxml"));
        BorderPane nuovoBorderPane = loader.load();
        BPaneMotori.setCenter(nuovoBorderPane);
    }

    @FXML
    void clickMotogp(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/MotoGP.fxml"));
        BorderPane nuovoBorderPane = loader.load();
        BPaneMotori.setCenter(nuovoBorderPane);
    }

    public void initialize() {
        addMouseHoverEffect(logoF1);
        addMouseHoverEffect(logoMotogp);
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
