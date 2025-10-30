package hospitalpatientmanagement;

import java.util.ArrayList;

class InPatientRecord implements MedicalRecord {
 private ArrayList<String> records = new ArrayList<>();

 @Override
 public void addRecord(String record) {
     records.add(record);
     System.out.println("In-Patient Record Added: " + record);
 }

 @Override
 public void viewRecords() {
     System.out.println("In-Patient Medical Records:");
     for (String r : records) {
         System.out.println("- " + r);
     }
 }
}

class OutPatientRecord implements MedicalRecord {
 private ArrayList<String> records = new ArrayList<>();

 @Override
 public void addRecord(String record) {
     records.add(record);
     System.out.println("Out-Patient Record Added: " + record);
 }

 @Override
 public void viewRecords() {
     System.out.println("Out-Patient Medical Records:");
     for (String r : records) {
         System.out.println("- " + r);
     }
 }
}
