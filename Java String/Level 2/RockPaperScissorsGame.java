import java.util.Scanner;

public class RockPaperScissorsGame {
    private static final String[] CHOICES = {"Rock", "Paper", "Scissors"};

    // Method to get computer choice
    public static String getComputerChoice() {
        int index = (int) (Math.random() * 3);
        return CHOICES[index];
    }

    // Method to determine winner
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate stats and return String[][]
    public static String[][] getStats(int userWins, int computerWins, int draws, int totalGames) {
        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;
        double drawPercent = (draws * 100.0) / totalGames;
        String[][] stats = {
            {"Player", String.valueOf(userWins), String.format("%.2f", userPercent) + "%"},
            {"Computer", String.valueOf(computerWins), String.format("%.2f", computerPercent) + "%"},
            {"Draws", String.valueOf(draws), String.format("%.2f", drawPercent) + "%"}
        };
        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-8s %-12s %-12s %-10s\n", "Game", "Player", "Computer", "Winner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-8d %-12s %-12s %-10s\n", i + 1, gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }
        System.out.println("\nStatistics:");
        System.out.printf("%-10s %-10s %-15s\n", "Name", "Wins", "Win %");
        for (String[] stat : stats) {
            System.out.printf("%-10s %-10s %-15s\n", stat[0], stat[1], stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] gameResults = new String[n][3];
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine().trim();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }
        String[][] stats = getStats(userWins, computerWins, draws, n);
        displayResults(gameResults, stats);
        sc.close();
    }
}
