package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import java.io.IOException;

public class ControllerMMA {

    private BorderPane BPaneMMA;

    public void setBPane(BorderPane BPane){
        BPaneMMA = BPane;
    }

    @FXML
    private ImageView logoUfc;

    @FXML
    private HBox imageBox;

    @FXML
    void clickUfc(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/progettoswansport/UFC.fxml"));
        AnchorPane nuovoAnchorPane = loader.load();
        ControllerUFC cUfc= loader.getController();
        cUfc.setBpaneUfc(BPaneMMA);
        BPaneMMA.setCenter(nuovoAnchorPane);
    }

    public void initialize() {
        addMouseHoverEffect(logoUfc);
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
