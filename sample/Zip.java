package sample;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.zip.*;


public class Zip {

    public static void zipFile(String newName) {
        try {
            //Initialising the file chooser
            JFileChooser chooser = new JFileChooser();
            //Making the file chooser dialog open
            int returnVal = chooser.showOpenDialog(null);
            //Assigning the file chosen in the file chooser to be a variable with class File
            File file = new File(chooser.getSelectedFile().getAbsolutePath());
            //Renaming of the zip file to the name typed in the Text Field
            String zipFileName = newName.concat(".zip");
            //Creates a new file output stream with the file selected
            FileOutputStream fileOS = new FileOutputStream(zipFileName);
            //Create a new zip output stream with the file selected
            ZipOutputStream zipOS = new ZipOutputStream(fileOS);
            //Begins to write the new ZIP file
            zipOS.putNextEntry(new ZipEntry(file.getName()));
            //Prints out file name in the console
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("File you want to compress: " +
                        chooser.getSelectedFile().getName());
            }
            //Reads the bytes inside of the file
            byte[] bytes = Files.readAllBytes(Paths.get(chooser.getSelectedFile().getAbsolutePath()));
            //Actual writing of the data to the zip file
            zipOS.write(bytes, 0, bytes.length);
            //Closes the ZIP entry and the ZIP output stream
            zipOS.closeEntry();
            zipOS.close();

        }
        //For error catching, also can't make the program work without this idk why
        catch (FileNotFoundException ex) {
            System.err.println("The file you selected does not exist");
        }
        catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        }
    }

}