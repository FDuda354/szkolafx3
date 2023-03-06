package pl.dudios.szkolafx3.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField inputText;
    @FXML
    public Label outputText;
    @FXML
    private Label result;
    boolean canClickANumber = true;
    double a = 0.0;
    double b = 0.0;
    char op = 'r';
    boolean wprowadzonoZnak = false;
    boolean jz = false;
    boolean secondNumber = false;
    boolean firestNumber = false;
    String s = "0";

    @FXML
    void modifyNumber(ActionEvent event) {
        String number = ((Button) event.getSource()).getText();
        if (canClickANumber) {
            if (!jz) {
                s = "";
                jz = true;
            }

            if (s.equals("0"))
                s = "";

            s = s + number;

            if (firestNumber)
                b = Double.parseDouble(s);
            else
                a = Double.parseDouble(s);

            result.setText(s);
        }
    }

    @FXML
    void calculate(ActionEvent event) {
        String buttonText = ((Button) event.getSource()).getText();
        char opp = buttonText.charAt(0);

        if (!firestNumber && !secondNumber && opp != '=') {
            op = opp;
            wprowadzonoZnak = true;
            if (!s.equals(""))
                firestNumber = true;
            canClickANumber = true;
            s = "";
        }
        if (firestNumber) {
            if (!s.equals(""))
                secondNumber = true;
            if (!secondNumber)
                op = opp;
            wprowadzonoZnak = true;
            canClickANumber = true;
            if (opp == '=') {
                canClickANumber = false;
            }
            s = "";
        }
        if (secondNumber) {
            if (op == '+')
                a += b;
            else if (op == '-')
                a -= b;
            else if (op == 'X')
                a *= b;
            else if (op == '/') {
                if (b == 0)
                    a = 0;
                else
                    a /= b;
            }

            if (opp == '=')
                canClickANumber = false;

            op = opp;
            s = String.valueOf(a);
            result.setText(s);
            b = 0;
            s = "";
            secondNumber = false;
            firestNumber = true;
            jz = false;

        }
    }

    @FXML
    void clear() {
        canClickANumber = true;
        a = 0.0;
        b = 0.0;
        op = 'r';
        wprowadzonoZnak = false;
        jz = false;
        secondNumber = false;
        firestNumber = false;
        s = "0";
        result.setText(s);
    }

    @FXML
    void calculateString() {
       String input = inputText.getText();
        int length = input.length();
        int count = input.split(" ").length;
        outputText.setText("długość zdania: "+length+" ilośc wyrazów: "+count);
    }
}