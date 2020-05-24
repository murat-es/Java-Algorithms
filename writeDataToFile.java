import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Murat Eş
 */

public class finalFile {  // WRITE DATA
    public static void main(String[] args) throws IOException {
       File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // Create a file
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.println("I am trying to write a text.");
        output.print("This is a txt file .");

        // Close the file
        output.close();
    }
}