package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.io.IOException;

public class ControllerTennis {

    private BorderPane BPaneTennis;

    public void setBPane(BorderPane BPane){
        this.BPaneTennis = BPane;
    }

    @FXML
    private ImageView logoWimbledon;

    @FXML
    private ImageView logoRoland;

    @FXML
    void clickWimbledon(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/Wimbledon.fxml"));
        BorderPane nuovoBorderPane = loader.load();
        BPaneTennis.setCenter(nuovoBorderPane);
    }

    @FXML
    void clickRoland(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/RolandG.fxml"));
        BorderPane nuovoBorderPane = loader.load();
        BPaneTennis.setCenter(nuovoBorderPane);
    }

    public void initialize() {
        addMouseHoverEffect(logoWimbledon);
        addMouseHoverEffect(logoRoland);
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
