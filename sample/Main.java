package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Loads the UI and the positions of the widgets
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Sets title of the program
        primaryStage.setTitle("File Zipper");
        //Sets the resolution of the application windows
        primaryStage.setScene(new Scene(root, 300, 275));
        //Shows the application window
        primaryStage.show();
    }
}

