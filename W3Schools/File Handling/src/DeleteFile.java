import java.io.File; // Import the File class

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("file.txt");
        if(myFile.delete()){
            System.out.println("File deleted successfully: " + myFile.getName());
        } else {
            System.out.println("Failed to delete file: " + myFile.getName());
        }
    }
}
