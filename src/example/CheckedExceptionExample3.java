package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample3 {

    public static void main(String[] args) {
        readingFromAFile();
    }

    private static void readingFromAFile() {
        try {
            System.out.println("Starts to execute the method code");
            FileReader file = new FileReader("C:\\test\\a.txt");

            // Creating object as one of ways of taking input
            BufferedReader fileInput = new BufferedReader(file);

            // Printing first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            // Closing file connections
            // using close() method
            fileInput.close();
            System.out.println("Successfully executed the code");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}