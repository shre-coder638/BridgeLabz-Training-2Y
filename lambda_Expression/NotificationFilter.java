package lambda_Expression;

import java.util.*;

@FunctionalInterface
interface Filter {
    void notification();
}

public class NotificationFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter alert color: ");
        String n = input.next().toLowerCase(); 
        
        Filter R = () -> System.out.print("Red alert: Emergency! Reach hospital immediately!!");
        Filter Y = () -> System.out.print("Yellow alert: See your Doctor.");
        Filter G = () -> System.out.print("Green: Not in danger");

        switch (n) {
            case "red":
                R.notification();
                break;
            case "yellow":
                Y.notification();
                break;
            case "green":
                G.notification();
                break;
            default:
                System.out.print("Invalid alert.");
                break;
        }

        input.close();
    }
}
