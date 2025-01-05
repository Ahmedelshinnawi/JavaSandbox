/*

Create a File
To create a file in Java, you can use the createNewFile() method. This method returns a boolean value:
true if the file was successfully created, and false if the file already exists.
Note that the method is enclosed in a try...catch block. This is necessary because it throws an IOException
if an error occurs (if the file cannot be created for some reason):
 */

import java.io.File; // Import the File class
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("file.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException err) {
            System.out.println("An error occurred");
            err.printStackTrace();
        }

        /*
        Write To a File
        In the following example, we use the FileWriter class together with its write() method to write some text
        to the file we created in the example above. Note that when you are done writing to the file,
        you should close it with the close() method:
         */
        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("Bella geh, bella 7dr, bella gab filewriter w hy3ml elly 3leh");
            myWriter.close();
            System.out.println("File written successfully");
        } catch (IOException err) {
            System.out.println("An error occurred");
            err.printStackTrace();
        }
    }
}