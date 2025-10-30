package lambda_Expression;

import java.util.Scanner;

@FunctionalInterface
interface Light_behaviour{
	void activate();
}

public class Lighting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Light_behaviour motion = () -> System.out.println("Motion Detector Activated.");
		Light_behaviour time_of_day = () -> System.out.println("Light Adjusted.");
		Light_behaviour voice = () -> System.out.println("Voice Detacted.");
		int a = sc.nextInt();
		switch(a) {
		case 1:
        motion.activate();
        break;
		case 2:
		time_of_day.activate();	
        break;
		case 3:
		voice.activate();	
		break;
		default:
		System.out.print("Invalid input");
		}
		sc.close();
	}
}