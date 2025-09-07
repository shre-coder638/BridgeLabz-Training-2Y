import java.util.Scanner;

public class BMIProgram {

    // a. Take user input for weight (kg) and height (cm)
    public static double[][] getInputData(int persons) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[persons][2]; // [][0] = weight, [][1] = height(cm)

        for (int i = 0; i < persons; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    // b. Compute BMI and status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert to meters
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    // c. Process all persons and return 2D String array
    public static String[][] processData(double[][] data) {
        String[][] results = new String[data.length][4]; // weight, height, BMI, status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiResult = computeBMI(weight, height);

            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", height);
            results[i][2] = bmiResult[0];
            results[i][3] = bmiResult[1];
        }
        return results;
    }

    // d. Display results in table format
    public static void displayTable(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    // e. Main method
    public static void main(String[] args) {
        int persons = 10; // team size
        double[][] data = getInputData(persons); // input weight & height
        String[][] results = processData(data);  // compute BMI & status
        displayTable(results);                   // display results
    }
}
