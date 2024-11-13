

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class checkedExceptionExample {

    public static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  
            }
        } catch (IOException e) {  
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) {
        
        readFile("example.txt");  
        
        readFile("nonexistent.txt"); 
    }
}
