package lambda_Expression;
import java.util.*;

@FunctionalInterface
interface Sort{
    void filter();
}

public class commerce_sorting {
    public static void main(String[] args) {
        Sort P = () -> System.out.println("Pricing filter");
        Sort R = () -> System.out.println("Sort by rating");
        Sort D = () -> System.out.println("Maximum discount");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if (n.equals("price")||n.equals("Price")) {
            P.filter();
        } else if (n.equals("rating")||n.equals("Rating")) {
            R.filter();
        } else if (n.equals("discount")||n.equals("Discount")) {
            D.filter();
        }
        input.close();
    }
}
