package fileManagement;

import java.io.File;

public class FileWriter {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\amnaa\\OneDrive\\Desktop\\javaFiles\\my.txt");

        try {
            java.io.FileWriter fw = new java.io.FileWriter(file);
            fw.write("Amna Malik");
            fw.close();
            System.out.println("File has been updated.");
        }catch (Exception e){
            System.err.println(e);
        }



    }
}
