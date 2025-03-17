import java.io.*;
public class ioStream{
    public static void main(String[] args) throws Exception{
        
            // Create a file output stream
            FileOutputStream file = new FileOutputStream("output.txt");
            // Create a file input stream
            FileInputStream fileIn = new FileInputStream("output.txt");
            // Write to the file
            for (int i = 0; i < 10; i++) {
                file.write(i);
            }
            // Read from the file
            int i = 0;
            while ((i = fileIn.read()) != -1) {
                System.out.print(i + " ");
            }
            // Close the file
            file.close();
            fileIn.close();
        } 
    }
