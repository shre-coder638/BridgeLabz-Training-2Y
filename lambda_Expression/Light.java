package lambda_Expression;

import java.util.*;

@FunctionalInterface
interface Light_Automation{
    void light();
}

public class Light {
    public static void main(String[] args){
        Light_Automation motion = () -> System.out.println("Light On");
        Light_Automation Day = () -> System.out.println("Morning, Ambient Light");
        Light_Automation Afternoon = () -> System.out.println("Afternoon, Dim Light");
        Light_Automation Night = () -> System.out.println("Night, Bright Light");
        Light_Automation voice = () -> System.out.print("voice activation");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if (n.equals("motion")){
            motion.light();
        }
        else if (n.equals("Afternoon")) {
            Afternoon.light();
        }
        else if (n.equals("Day")) {
        	Day.light();
        }
        else if (n.equals("Night")) {
        	Night.light();
        }
        else if (n.equals("Voice")) {
            voice.light();
        }
        input.close();
    }
}