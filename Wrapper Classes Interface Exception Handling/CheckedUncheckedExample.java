import java.io.IOException;

public class CheckedUncheckedExample {

    // Method that simulates reading a file and throws IOException
    public void readFile(String fileName) throws IOException {
        if ("error.txt".equals(fileName)) {
            throw new IOException("Simulated error reading file.");
        }
        System.out.println("File read successfully.");
    }

    // Method demonstrating unchecked exception
    public void demonstrateUncheckedException() {
        int[] array = new int[3];
        System.out.println(array[5]); // This will throw ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        CheckedUncheckedExample example = new CheckedUncheckedExample();

        // Handling checked exception (IOException)
        try {
            example.readFile("error.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Handling unchecked exception (ArrayIndexOutOfBoundsException)
        try {
            example.demonstrateUncheckedException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
