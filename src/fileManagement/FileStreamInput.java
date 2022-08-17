package fileManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileStreamInput {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\amnaa\\OneDrive\\Desktop\\javaFiles\\your.txt");
        InputStream is = new FileInputStream(file);

        System.out.println(new String(is.readAllBytes()));
    }
}
