package hospitalpatientmanagement;

class OutPatient extends Patient {
    private int numberOfVisits;
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, int numberOfVisits, double consultationFee) {
        super(patientId, name, age);
        this.numberOfVisits = numberOfVisits;
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return numberOfVisits * consultationFee;
    }
    }