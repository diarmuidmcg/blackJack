import java.util.Scanner;


// consider making numbers a string value and use equalsTO

public class numberOfPlayers {

    // return number of players to main
    public static int introToBJ() {
        System.out.println("Welcome to BlackJack");
        int totalPlayers = identifyNumberOfPlayers();
        System.out.println("There are " + totalPlayers + " players playing.");
        System.out.println();
        return totalPlayers;
    }

    // makes sure that number of players is between 1 and 5
    public static int identifyNumberOfPlayers() {
        System.out.println("How many players are playing? Five is the max.");
        int players = getNumberOfPlayers();
        while (players > 5 || players <= 0) {
            System.out.println("The answer " + players + " is not accepted. Answers must be between 1 & 5");
            players = getNumberOfPlayers();
        }
        return players;
    }

    // takes user input for number of players
    public static int getNumberOfPlayers() {
        Scanner Input = new Scanner(System.in);
        String UserResponsePlayers = Input.next();
        while (!isNumeric(UserResponsePlayers)) {
            System.out.println("Answers must be a numeric value between 1 & 5");
            UserResponsePlayers = Input.next();
        }
        int players = Integer.parseInt(UserResponsePlayers);
        return players;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
