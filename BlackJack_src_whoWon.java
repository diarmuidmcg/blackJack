public class whoWon {
    public static void theWinnerIs(int[][] dealtHands, int dealerHand) {

        for (int i = 0; i < dealtHands.length; i++){
            String finalComparison = "";
            int playerNumber = i + 1;
            if (dealtHands[i][0] > 21){
                System.out.print("Player #" + playerNumber + " lost ");
                finalComparison = "the player burst with a score of " + dealtHands[i][0];
            }
            else if (dealerHand > 21 && dealtHands[i][0] <= 21) {
                System.out.print("Player #" + playerNumber + " wins ");
                finalComparison = "the dealer burst!";
            }
            else if (dealtHands[i][0] > dealerHand && dealtHands[i][0] <= 21){
                System.out.print("Player #" + playerNumber + " beat the dealer ");
                finalComparison = "" + dealtHands[i][0] + " is greater than " + dealerHand;
            }
            else if (dealtHands[i][0] < dealerHand && dealerHand <= 21) {
                System.out.print("Player #" + playerNumber + " lost ");
                finalComparison = "" + dealtHands[i][0] + " is less than " + dealerHand;
            }
            else if (dealtHands[i][0] == dealerHand){
                System.out.print("Player #" + playerNumber + " pushed ");
                finalComparison = "" + dealtHands[i][0] + " equals " + dealerHand;
            }
            else {
                System.out.print("Player #" + playerNumber + " lost ");
                finalComparison = "the player burst with a score of " + dealtHands[i][0];
            }
            System.out.println("because "  + finalComparison);
        }
    }
}
