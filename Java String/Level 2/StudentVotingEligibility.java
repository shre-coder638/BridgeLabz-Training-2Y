import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Generates ages between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("Age\tVoting Eligibility");
        System.out.println("--------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = new int[n];

        // Take user input for ages
        System.out.println("Enter the ages of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        ages = generateAges(n);

        String[][] result = checkVotingEligibility(ages);
        displayTable(result);
    }
}