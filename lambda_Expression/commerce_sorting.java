package lambda_Expression;
import java.util.*;

@FunctionalInterface
interface Sort {
    void filter();
}

public class commerce_sorting {
    public static void main(String[] args) {
        Sort P = () -> System.out.println("Pricing filter");
        Sort R = () -> System.out.println("Sort by rating");
        Sort D = () -> System.out.println("Maximum discount");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sorting type: ");
        String n = input.next();
        switch (n.toLowerCase()) {  
            case "price":
                P.filter();
                break;
            case "rating":
                R.filter();
                break;
            case "discount":
                D.filter();
                break;
            default:
                System.out.println("Invalid choice!.");
        }

        input.close();
    }
}
