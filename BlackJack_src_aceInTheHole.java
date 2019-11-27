import java.util.Arrays;
import java.util.Scanner;

public class aceInTheHole {

    public static int ifPlayerHasAce(int[][] playerScores, int count) {
        int finalScore = 0;

        // when player on first option
        if (playerScores[count][0] < 21) {
            finalScore = playerScores[count][0];
            System.out.println("Your score is " + playerScores[count][0] + " or " +
                    playerScores[count][1] + ". Would you like to\n(H)it or\n(S)tand?");
        }
        // when player on second option
        else {
            finalScore = playerScores[count][1];
            System.out.println("Your score is " + playerScores[count][1] +
                    ". Would you like to\n(H)it or\n(S)tand?");
        }
        // get userinput for hit or stand. May make into sep function
        Scanner Input = new Scanner(System.in);
        String UserResponseHit = Input.next();

        // when user hits
        if (UserResponseHit.equalsIgnoreCase("Hit") || UserResponseHit.equalsIgnoreCase("H")) {
            int newScore = hitCardsForAce();
            playerScores[count][0] += newScore;
            playerScores[count][1] += newScore;
            // when both burst
            if (playerScores[count][1] > 21 && playerScores[count][0] > 21) {
                System.out.println("You lose! " + playerScores[count][1] + " is greater than 21");
                return playerScores[count][1];
            }
            // when one of them is BJ
            else if (playerScores[count][1] == 21 || playerScores[count][0] == 21) {
                System.out.println("BlackJack!");
                return 21;
            }
            // rerun function when first option is still less than BJ
            else if (playerScores[count][0] < 21) {
                finalScore = ifPlayerHasAce(playerScores, count);
            }
            // rerun func when second option is still less than BJ. may combine these
            else if (playerScores[count][0] > 21 && playerScores[count][1] < 21) {
                System.out.println();
                finalScore = ifPlayerHasAce(playerScores, count);
            }
            // only would get error
            else System.out.println("you have error, will return 0");
        }
        // when user stands
        else if (UserResponseHit.equalsIgnoreCase("Stand") || UserResponseHit.equalsIgnoreCase("S")) {
            return finalScore;
        }
        // when invalid user unput
        else {
            System.out.println("try again");
            finalScore = ifPlayerHasAce(playerScores, count);
        }
        // reset playerScores[count][0] as final Score for whoWon comparison
        playerScores[count][0] = finalScore;
        return finalScore;
    }

    // same as other hitCards func, but does not take score parameter and add to it
    public static int hitCardsForAce(){
        String DealCard = generateCards.returnCards();
        System.out.println("You were dealt a: " + DealCard);
        int cardToNumber = dealTheCards.dealOneCard(DealCard);
        return cardToNumber;
    }

    public static int ifDealerHasAce(int[] dealerCards){
        // auto make final score be first option incase 17-21
        int dealerFinalScore = dealerCards[0];
        System.out.println("The dealer's score is a " + dealerCards[0] +
                " or " + dealerCards[1]);
        String printDealersScore = "The dealer's score is a ";

        // will continue until first option is in sweet spot or
        // second option is above 17
        while ((dealerCards[0] < 17 && dealerCards[0] > 21)
                || dealerCards[1] < 17)
        {
            String newCard = generateCards.returnCards();
            System.out.println("The dealer drew a " + newCard);
            int cardToNumber = dealTheCards.dealOneCard(newCard);

            // increase both
            dealerCards[0] += cardToNumber;
            dealerCards[1] += cardToNumber;
            // when first option is predominate
            if (dealerCards[0] < 17) {
                printDealersScore += "" + dealerCards[0] + " or " + dealerCards[1];
                // think this is redundant, better safe than sorry
                dealerFinalScore = dealerCards[0];
            }
            // when second option only
            else {
                printDealersScore = "The dealer's score is a " + dealerCards[1];
                dealerFinalScore = dealerCards[1];
            }

            System.out.println(printDealersScore);
        }
        return dealerFinalScore;
    }

}

