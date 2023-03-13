package pl.dudios.szkolafx3.lab3;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.Objects;

public class lab3Controller {

    @FXML
    public Label info;
    @FXML
    public ImageView myImage;
    @FXML
    private ToggleGroup ToogleGroup;
    @FXML
    private ToggleGroup ToogleGroup2;
    @FXML
    private ToggleGroup ToogleGroup3;


    @FXML
    public void changeCollor(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) ToogleGroup.getSelectedToggle();
        info.setTextFill(Color.valueOf(selectedRadioButton.getText()));

    }
    @FXML
    public void changeText(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) ToogleGroup2.getSelectedToggle();
        info.setText(selectedRadioButton.getText());

    }
    @FXML
    public void changeImage(ActionEvent actionEvent) {
        RadioButton selectedRadioButton = (RadioButton) ToogleGroup3.getSelectedToggle();
        myImage.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(selectedRadioButton.getText() + ".gif"))));

    }
    @FXML
    public void exit(ActionEvent actionEvent) {
        Platform.exit();

    }
}
