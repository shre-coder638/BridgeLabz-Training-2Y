import java.util.Random;

public class StudentScorecard {

    // a. Generate random 2-digit scores (10–99)
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; // 3 subjects: PCM
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90); // 10–99
            }
        }
        return scores;
    }

    // b. Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // total, avg, percentage
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0; // round 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // c. Calculate grade
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // d. Display Scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-10s %-10s%n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-10.2f %-10s%n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2],
                    grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int students = 5; // Example with 5 students
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}
