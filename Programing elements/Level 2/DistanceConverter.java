import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInFeet / 5280.0;
        double distanceInCm = distanceInFeet * 30.48;
        double distanceInInches = distanceInFeet * 12;

        System.out.printf("Distance in yards: %.2f\n", distanceInYards);
        System.out.printf("Distance in miles: %.5f\n", distanceInMiles);
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", distanceInCm, distanceInFeet, distanceInInches);
    }
}