public class whoWon {
    public static void theWinnerIs(int[] dealtHands, int dealerHand) {
            for (int i = 0; i < dealtHands.length; i++){
                int playerNumber = i + 1;
                if (dealtHands[i] > 21){
                    System.out.println("Player #" + playerNumber + " lost.");
                }
                else if (dealerHand > 21 && dealtHands[i] <= 21) {
                    System.out.println("Player #" + playerNumber + " wins!");
                }
                else if (dealtHands[i] > dealerHand && dealtHands[i] <= 21){
                    System.out.println("Player #" + playerNumber + " beat the dealer.");
                } else if (dealtHands[i] == dealerHand){
                    System.out.println("Player #" + playerNumber + " pushed.");
                } else {
                    System.out.println("Player #" + playerNumber + " lost.");
                }
            }
    }
}
