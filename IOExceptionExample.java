import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

//         try {
//             // Try to open and read a file
//             reader = new BufferedReader(new FileReader("myfile.txt"));
//             String line = reader.readLine();
//             System.out.println("File Content: " + line);
//         } catch (IOException e) {
//             System.out.println("Caught IOException: " + e.getMessage());
//         } finally {
//             try {
//                 if (reader != null) {
//                     reader.close(); // Close the file reader
//                 }
//             } catch (IOException e) {
//                 System.out.println("Error closing the file: " + e.getMessage());
//             }

//             System.out.println("Finished file handling.");
//         }
//     }
// }
//