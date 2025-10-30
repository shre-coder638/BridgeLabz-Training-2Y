package hospitalpatientmanagement;

class InPatient extends Patient {
 private int daysAdmitted;
 private double roomChargePerDay;
 private double treatmentCost;

 public InPatient(int patientId, String name, int age, int daysAdmitted, double roomChargePerDay, double treatmentCost) {
     super(patientId, name, age);
     this.daysAdmitted = daysAdmitted;
     this.roomChargePerDay = roomChargePerDay;
     this.treatmentCost = treatmentCost;
 }

 @Override
 public double calculateBill() {
     return (daysAdmitted * roomChargePerDay) + treatmentCost;
 }
}
