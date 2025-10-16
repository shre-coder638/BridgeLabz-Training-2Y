package lambda_Expression;
import java.util.*;

@FunctionalInterface
interface InvoiceGenerator {
    String create(String id);
}

public class Invoice_generator {
	
	public static String generateInvoice(String d) {
    	InvoiceGenerator a = (String id) -> "Invoice created for "+d;
        return a.create(d);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Transaction ID:");
        String n = sc.nextLine();
        System.out.println(generateInvoice(n));
        sc.close();
    }
}
