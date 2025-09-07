import java.util.Scanner;

public class DeckOfCards {

    // Suits and Ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("Cannot distribute " + n + " cards equally among " + x + " players.");
            return null;
        }
        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Print players and their cards
    public static void printPlayers(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize and shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Input number of cards to distribute and number of players
        System.out.print("Enter number of cards to distribute (max " + deck.length + "): ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        if (n > deck.length || n <= 0 || x <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        // Distribute and print
        String[][] players = distributeCards(deck, n, x);
        printPlayers(players);
    }
}