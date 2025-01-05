/*
Read a File
In the following example, we use the Scanner class to read the contents of the text file we created
 */

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("file.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);
            }
            myReader.close();
        } catch (FileNotFoundException err) {
            System.out.println("File not found");
            err.printStackTrace();
        }

        /*
        Get File Information
        To get more information about a file, use any of the File methods
         */
        File myFile = new File("file.txt");
        if (myFile.exists()) {
            System.out.println("File Name: " + myFile.getName());
            System.out.println("File Path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        } else {
            System.out.println("File not found");
        }

    }
}