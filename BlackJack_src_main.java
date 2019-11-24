import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int totalPlayers = numberOfPlayers.introToBJ();
        System.out.println("It is now time to deal cards.");
        spaceToProceed.actionRequired();
        int[] firstCards = dealTheCards.createArrayForCards(totalPlayers);
        int[] dealtFirstHand = dealTheCards.generateFirstCard(firstCards);
        System.out.println();
        System.out.println("The dealer will now get her first card");
        spaceToProceed.actionRequired();
        int dealerHand = dealerCards.firstDealerCard();
        System.out.println();
        System.out.println("Now it is time for your second card");
        spaceToProceed.actionRequired();
        int dealerHand2 = dealerCards.secondDealerCard();
        int[] dealtSecondHand = dealTheCards.generateSecondCard(dealtFirstHand);
        spaceToProceed.actionRequired();
        for (int i = 0; i < dealtSecondHand.length; i++){
            String dealerFirstCard = generateCards.getFaceValueWithInt(dealerHand);
            System.out.println("Remember, the dealers first card is a " + dealerFirstCard);
            int playerNumberTurn = i + 1;
            int newScore = 0;
            System.out.println("\nPlayer " + playerNumberTurn + ": ");
            if (dealtSecondHand[i] > 50)
            {
                newScore = (aceInTheHole.ifPlayerHasAce(dealtSecondHand[i])-49);
            }
            else {
                newScore = hitOrStand.playBJ(dealtSecondHand[i]);
            }
            dealtSecondHand[i] = newScore;
            System.out.println(dealtSecondHand[i]);
        }
        spaceToProceed.actionRequired();
        System.out.println("The Dealers second card is a " + dealerHand2);
        spaceToProceed.actionRequired();
        int dealerScore = dealerHand + dealerHand2;
        int dealthDealerHand = dealerCards.dealerHitsCard(dealerScore);
        whoWon.theWinnerIs(dealtSecondHand, dealthDealerHand);
    }

}
