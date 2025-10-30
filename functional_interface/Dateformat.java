package functional_interface;
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

interface DateFormatUtility {

    static String formatAsDMY(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }

    static String formatAsYMD(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return date.format(formatter);
    }


    static String formatAsLong(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return date.format(formatter);
    }
}

public class Dateformat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
	    int choice;

	    do {
	        System.out.println("\n=== DATE FORMAT UTILITY ===");
	        System.out.println("Today's date: " + today);
	        System.out.println("1. Format as DD-MM-YYYY");
	        System.out.println("2. Format as YYYY/MM/DD");
	        System.out.println("3. Format as Month Day, Year");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();
	        
	        switch (choice) {
	        case 1:
	            System.out.println("Formatted Date: " + DateFormatUtility.formatAsDMY(today));
	            break;
	        case 2:
	            System.out.println("Formatted Date: " + DateFormatUtility.formatAsYMD(today));
	            break;
	        case 3:
	            System.out.println("Formatted Date: " + DateFormatUtility.formatAsLong(today));
	            break;
	        case 4:
	            System.out.println("Exiting Date Format Utility. Goodbye!");
	            break;
	        default:
	            System.out.println("Invalid choice! Please try again.");
	    }
	} while (choice != 4);

	sc.close();

	}


}
