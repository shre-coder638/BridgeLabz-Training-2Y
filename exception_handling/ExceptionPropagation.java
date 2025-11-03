package exception_handling;

import java.util.*;

class FileMissingException extends Exception {
 public FileMissingException(String message) {
     super(message);
 }
}

class FileHandler {
  static ArrayList<String> files = new ArrayList<>();

static {
     files.add("data.txt");
     files.add("report.pdf");
     files.add("notes.docx");
 }

public FileHandler(String fileName) throws FileMissingException {
     System.out.println("Attempting to open file: " + fileName);

     if (!files.contains(fileName)) {
         throw new FileMissingException("File not found: " + fileName);
     }

     System.out.println("File '" + fileName + "' opened successfully!");
 }
}

public class ExceptionPropagation {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter file name to open: ");
         String fileName = sc.nextLine();

         FileHandler fh = new FileHandler(fileName);
     } 
     catch (FileMissingException e) {
         System.out.println("Error: " + e.getMessage());
     } 
     finally {
         System.out.println("File operation complete.");
         sc.close();
     }
 }
}
