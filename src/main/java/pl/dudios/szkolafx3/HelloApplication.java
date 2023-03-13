package pl.dudios.szkolafx3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //lab1
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lab1/hello-view.fxml"));
        //lab2
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lab2/hello-view.fxml"));
        //lab3
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lab3/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}