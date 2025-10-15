package lambda_Expression;
import java.util.*;

@FunctionalInterface
interface InvoiceGenerator {
    String create(String id);
}

public class Invoice_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Transaction ID:");
        String n = sc.nextLine();
    	InvoiceGenerator a = (String id) -> "Invoice created for "+n;
        System.out.println(a.create(n));
    	sc.close();
    }
}
