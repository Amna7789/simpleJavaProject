package fileManagement;

import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\amnaa\\OneDrive\\Desktop\\javaFiles\\my.txt");
        Scanner scanner = new Scanner(file);

        String data = scanner.nextLine();
        System.out.println(data);
    }
}
