package lambda_Expression;

import java.util.ArrayList;
import java.util.Scanner;

@FunctionalInterface
interface Printer{
    void print(ArrayList<String> patients);
}

public class PatientID {
	public static void main(String[] args) {
		Printer a = (list) -> { System.out.println("Patient Data:");
        list.forEach(System.out::println);};
	    Scanner input = new Scanner(System.in);
	    String n = input.nextLine();
	    ArrayList<String> patients = new ArrayList<>();
	    patients.add("P001");
	    patients.add("P002");
	    patients.add("P003");
	    patients.add("P004");
	    if (n.equals("Give Data")) {
            a.print(patients);
        } else {
            System.out.println("Invalid input!");
        }

	    input.close();
	}
}
    