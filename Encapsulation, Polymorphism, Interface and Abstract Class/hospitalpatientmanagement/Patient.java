package hospitalpatientmanagement;


abstract class Patient {
 
 private int patientId;
 private String name;
 private int age;
 private String diagnosis;        
 private String medicalHistory;   

 public Patient(int patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
 }

 public int getPatientId() { return patientId; }
 public String getName() { return name; }
 public int getAge() { return age; }

 protected void setDiagnosis(String diagnosis) {
     this.diagnosis = diagnosis;
 }

 protected void setMedicalHistory(String medicalHistory) {
     this.medicalHistory = medicalHistory;
 }

 protected String getDiagnosis() {
     return diagnosis;
 }

 protected String getMedicalHistory() {
     return medicalHistory;
 }

public abstract double calculateBill();


 public void getPatientDetails() {
     System.out.println("Patient ID: " + patientId);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}
