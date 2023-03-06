package pl.dudios.szkolafx3.lab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class lab1Contoller {
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private Label sum;

    @FXML
     void addToNumbers() {
        try{
            sum.setText(String.valueOf(Integer.parseInt(a.getText()) + Integer.parseInt(b.getText())));
        } catch (NumberFormatException e) {
            sum.setText("Error");
        }

    }
}