package functional_interface;

interface DataExporter {
 void exportToCSV();
 void exportToPDF();

 default void exportToJSON() {
     System.out.println("JSON export not supported by this exporter.");
 }
}

class CSVExporter implements DataExporter {
 public void exportToCSV() {
     System.out.println("Data exported to CSV format.");
 }
 public void exportToPDF() {
     System.out.println("PDF export not available in CSVExporter.");
 }
}

class PDFExporter implements DataExporter {
 public void exportToCSV() {
     System.out.println("CSV export not available in PDFExporter.");
 }
 public void exportToPDF() {
     System.out.println("Data exported to PDF format.");
 }
}

class JSONExporter implements DataExporter {
 public void exportToCSV() {
     System.out.println("CSV export not available in JSONExporter.");
 }
 public void exportToPDF() {
     System.out.println("PDF export not available in JSONExporter.");
 }


 public void exportToJSON() {
     System.out.println("Data exported to JSON format.");
 }
}


public class Dataexport {
 public static void main(String[] args) {
     DataExporter csv = new CSVExporter();
     DataExporter pdf = new PDFExporter();
     DataExporter json = new JSONExporter();

     System.out.println("\n=== DATA EXPORT TEST ===");
     csv.exportToCSV();
     pdf.exportToPDF();
     json.exportToJSON();

     System.out.println("\n=== TESTING DEFAULT METHOD ===");
     pdf.exportToJSON();
 }
}
