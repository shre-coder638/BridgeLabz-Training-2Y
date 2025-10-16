package lambda_Expression;

import java.util.ArrayList;


public class PatientID {
	
	public static void Printer(ArrayList<String> a) {
		for(String i : a) {
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		ArrayList<String> patients = new ArrayList<>();
	    patients.add("P001");
	    patients.add("P002");
	    patients.add("P003");
	    patients.add("P004");
	    patients.add("P005");
	    patients.add("P006");
	    patients.add("P007");
	    patients.add("P008");
	    patients.add("P009");
	    patients.add("P010");
	    
	    System.out.println("Patient IDs for Admin Verification:");
	    Printer(patients);        
	}
}
    