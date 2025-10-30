package hospitalpatientmanagement;

import java.util.ArrayList;

public class Main {

public static void processPatients(ArrayList<Patient> patients) {
     System.out.println("\n=== PATIENT BILLING DETAILS ===");

     for (Patient p : patients) {
         p.getPatientDetails();
         double bill = p.calculateBill();
         System.out.println("Total Bill: " + bill);


         MedicalRecord recordHandler = null;
         if (p instanceof InPatient) {
             recordHandler = new InPatientRecord();
             recordHandler.addRecord("Admitted for surgery - 3 days recovery.");
         } else if (p instanceof OutPatient) {
             recordHandler = new OutPatientRecord();
             recordHandler.addRecord("Visited for general checkup.");
         }

         if (recordHandler != null) {
             recordHandler.viewRecords();
         }

     }
 }

 public static void main(String[] args) {
     ArrayList<Patient> patientList = new ArrayList<>();

     InPatient p1 = new InPatient(101, "Alice Johnson", 45, 4, 2500, 8000);
     OutPatient p2 = new OutPatient(102, "Bob Smith", 32, 2, 500);

     patientList.add(p1);
     patientList.add(p2);

     processPatients(patientList);
 }
}
