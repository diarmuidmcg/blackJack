
public class main {
    public static void main(String[] args){

// welcome to game, gets number of players
        int totalPlayers = numberOfPlayers.introToBJ();
        System.out.println("It is now time to deal cards.");
        spaceToProceed.actionRequired();
        int[][] playerCards = dealTheCards.createArrayForCards(totalPlayers);

// lets get the first batch of cards
        dealTheCards.generateFirstCard(playerCards);
        System.out.println();

// dealer will get her first card
        System.out.println("The dealer will now get her first card");
        spaceToProceed.actionRequired();
        int[] dealerHand = dealerCards.firstDealerCard();
        int dealerFirstCard = 0;
        if (dealerHand[1] > 0) dealerFirstCard = dealerHand[1];
        else dealerFirstCard = dealerHand[0];
        System.out.println();

// lets get the second batch of card
        System.out.println("Now it is time for your second card");
        spaceToProceed.actionRequired();

// dealer will get ger second card
        String dealerSecondCard = dealerCards.secondDealerCard(dealerHand);

// players get second cards
        dealTheCards.generateSecondCard(playerCards);
        spaceToProceed.actionRequired();

// players can hit or stand. don't go over!
        for (int i = 0; i < totalPlayers; i++){
            String stringDealerFirstCard = generateCards.getFaceValue(dealerFirstCard);
            System.out.println("Remember, the dealers first card is a " + stringDealerFirstCard);
            int playerNumberTurn = i + 1;
            int newScore = 0;
            System.out.println("\nPlayer " + playerNumberTurn + ": ");
            if (playerCards[i][0] == 21) {
                System.out.println("BlackJack! You win");
                newScore = 21;
            }
            else if (playerCards[i][1] == 0) {
                newScore = hitOrStand.playBJ(playerCards[i][0]);
            }
            else newScore = aceInTheHole.ifPlayerHasAce(playerCards, i);

            playerCards[i][0] = newScore;
            System.out.println(newScore);
        }
        spaceToProceed.actionRequired();

// reveal dealer second card.
        System.out.println("The Dealers second card is a " + dealerSecondCard);
        spaceToProceed.actionRequired();

// determines if players win or lose
        int dealerScore = dealerCards.determineDealerFinalHand(dealerHand);
        whoWon.theWinnerIs(playerCards, dealerScore);
    }

}

