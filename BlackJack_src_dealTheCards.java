import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dealTheCards {

// this creates an array with a length of how many players are playing
    public static int[] createArrayForCards(int totalPlayers) {
        int[] cardValues = new int[totalPlayers];
        // this makes the default value zero. redunant yes, but wanted to populate it first
        for (int i = 0; i < cardValues.length; i++) {
            cardValues[i] = 0;
        }
        return cardValues;
    }
// this prints out the players cards and then adds the value to the array
    public static int[] generateFirstCard(int[] cardValues) {
        for (int i = 1; i < cardValues.length + 1; i++) {
            String newCard = generateCards.returnCards();
            System.out.println("Player #" + i + "'s first card is a " + newCard);
            int cardToNumber = dealOneCard(newCard);
            cardValues[i - 1] = cardToNumber;
        }
        System.out.println(Arrays.toString(cardValues));
        return cardValues;
    }
    public static int[] generateSecondCard(int[] cardValues) {
        for (int i = 1; i < cardValues.length + 1; i++) {
            String newCard = generateCards.returnCards();
            System.out.println("Player #" + i + "'s second card is a " + newCard);
            int cardToNumber = dealOneCard(newCard);
            int previousValue = cardValues[i - 1];
            cardValues[i - 1] = cardToNumber + previousValue;
            int newCardValue = cardValues[i - 1];
            if (newCardValue > 49){
                if ((cardValues[i-1] - 38) == 21)
                {
                    System.out.println("Blackjack!");
                }
                else {

                    System.out.println("Their total total score is " + (cardValues[i - 1] - 48)
                            + " or " + (cardValues[i - 1] - 38) + "\n");
                }
            } else {
                System.out.println("Their total total score is " + cardValues[i - 1] + "\n");
            }
        }
        System.out.println(Arrays.toString(cardValues));
        return cardValues;
    }
    // simple function to deal cards
    public static int dealOneCard(String newCard){
        int cardToNumber;
        if (newCard.equals("Jack")) {
            cardToNumber = 10;
        } else if (newCard.equals("Queen")) {
            cardToNumber = 10;
        }
        else if (newCard.equals("King")) {
            cardToNumber = 10;
        }
        else if (newCard.equals("Ace")) {
            // create something that makes it a 50 50. perhaps make it equal to 50
            cardToNumber = 49;
            // cardToNumber = 50;
        } else {
            cardToNumber = Integer.parseInt(newCard);
        }
        return cardToNumber;
    }
}

