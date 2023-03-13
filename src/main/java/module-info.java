module pl.dudios.szkolafx3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.dudios.szkolafx3 to javafx.fxml;
    exports pl.dudios.szkolafx3;

    exports pl.dudios.szkolafx3.lab2;
    exports pl.dudios.szkolafx3.lab1;
    exports pl.dudios.szkolafx3.lab3;

    opens pl.dudios.szkolafx3.lab1 to javafx.fxml;
    opens pl.dudios.szkolafx3.lab2 to javafx.fxml;
    opens pl.dudios.szkolafx3.lab3 to javafx.fxml;
}