package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Controller extends Zip {
    //Initialise Button and TextField for the UI
    public Button button = new Button();
    public TextField fileName = new TextField();



    public void buttonClicked(){
        Zip z1 = new Zip();
        z1.zipFile(fileName.getText());
    }

}
