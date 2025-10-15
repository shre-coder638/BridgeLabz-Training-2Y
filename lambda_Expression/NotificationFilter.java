package lambda_Expression;

import java.util.*;

@FunctionalInterface
interface Filter{
    void notification();
}

public class NotificationFilter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String n = input.next();
        Filter R = () -> System.out.print("Red alert: Emergency!" + "Reach hospital immediately!!");
        Filter Y = () -> System.out.print("Yellow alert: " + "See your Doctor.");
        Filter G = () -> System.out.print("Green: " + "Not in danger");
        if(n.equals("red")){
            R.notification();
        }
        else if (n.equals("yellow")) {
            Y.notification();
        }
        else if (n.equals("green")) {
            G.notification();
        }
        input.close();
    }
}
