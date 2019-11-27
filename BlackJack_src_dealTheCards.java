import java.util.Arrays;

public class dealTheCards {

// this creates an array with a length of how many players are playing
    public static int[][] createArrayForCards(int totalPlayers) {
        int[][] cardValues = new int[totalPlayers][2];
        // this makes the default value zero. redunant yes, but wanted to populate it first
        for (int i = 0; i < cardValues.length; i++) {
            for (int j = 0; j < 2 ; j++) {
                cardValues[i][j] = 0;
            }
        }
        return cardValues;
    }
// this prints out the players cards and then adds the value to the array

    public static void generateFirstCard(int[][] cardValues) {
        for (int i = 1; i < cardValues.length + 1; i++) {
            String newCard = generateCards.returnCards();
            System.out.println("Player #" + i + "'s first card is a " + newCard);

            // exception case for ace
            if (newCard.equalsIgnoreCase("ace")){
                cardValues[i - 1][0] = 11;
                cardValues[i - 1][1] = 1;
            }
            else {
                int cardToNumber = dealOneCard(newCard);
                cardValues[i - 1][0] = cardToNumber;
            }
        }
        System.out.println(Arrays.deepToString(cardValues));
    }
    public static void generateSecondCard(int[][] cardValues) {
        for (int i = 1; i < cardValues.length + 1; i++) {
            String newCard = generateCards.returnCards();
            System.out.println("Player #" + i + "'s second card is a " + newCard);
            int previousValue = cardValues[i - 1][0];

            // ace exception if 2nd card is ace
            if (newCard.equalsIgnoreCase("ace")) {
                cardValues[i - 1][0] = 11 + previousValue;
                cardValues[i - 1][1] = 1 + previousValue;
            }
            // ace exception if 1st card is ace
            else if (cardValues[i - 1][1] > 0) {
                int cardToNumber = dealOneCard(newCard);
                cardValues[i - 1][0] = cardToNumber + previousValue;
                cardValues[i - 1][1] = cardToNumber + previousValue - 10;
            }
            else {
                int cardToNumber = dealOneCard(newCard);
                cardValues[i - 1][0] = cardToNumber + previousValue;
            }
            // regular output
            if (cardValues[i - 1][1] == 0) {
                System.out.println("Their total total score is " + cardValues[i - 1][0] + "\n");
            }
            // ace exception output
            else {
                System.out.println("Their total total score is " + cardValues[i - 1][0]
                        + " or " + cardValues[i - 1][1] + "\n");
            }
        }
        System.out.println(Arrays.deepToString(cardValues));
    }

    // simple function to deal cards
    public static int dealOneCard(String newCard){
        int cardToNumber;
        if (newCard.equals("Jack"))         cardToNumber = 10;
        else if (newCard.equals("Queen"))   cardToNumber = 10;
        else if (newCard.equals("King"))    cardToNumber = 10;
        else if (newCard.equals("Ace"))     cardToNumber = 1;
        else                                cardToNumber = Integer.parseInt(newCard);
        return cardToNumber;
    }
}

