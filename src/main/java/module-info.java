module pl.dudios.szkolafx3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.dudios.szkolafx3 to javafx.fxml;
    exports pl.dudios.szkolafx3;
    exports pl.dudios.szkolafx3.lab2;
    opens pl.dudios.szkolafx3.lab2 to javafx.fxml;
}