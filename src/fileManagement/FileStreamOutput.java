package fileManagement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileStreamOutput {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\amnaa\\OneDrive\\Desktop\\javaFiles\\your.txt");
        OutputStream os = new FileOutputStream(file);

        String name = "Amna";
        os.write(name.getBytes());
        System.out.println("File written");
    }
}
