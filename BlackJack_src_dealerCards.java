public class dealerCards {

    // gets the first dealer card
    public static int[] firstDealerCard(){
        String newCard = generateCards.returnCards();
        System.out.println("The Dealers first card is a " + newCard);
        int[] dealerCards = new int[2];
        int cardToNumber = dealTheCards.dealOneCard(newCard);

        // ace exception
        if (cardToNumber == 1) {
            dealerCards[0] = 11;
            dealerCards[1] = 1;
        }
        else dealerCards[0] = cardToNumber;
        return dealerCards;
    }

    // gets second dealer card
    public static String secondDealerCard(int[] dealerCards){
        String newCard = generateCards.returnCards();
        int cardToNumber = dealTheCards.dealOneCard(newCard);

        // ace exception if second card is ace
        if (cardToNumber == 1) {
            dealerCards[0] += 11;
            dealerCards[1] += 1;
        }
        // ace exception if first card is ace
        else if (dealerCards[1] > 0) {
            dealerCards[0] += cardToNumber;
            dealerCards[1] += cardToNumber;
        }
        else dealerCards[0] += cardToNumber;
        return newCard;
    }

    // this loop has dealer hit cards until its above 17. not ready for aces
    public static int dealerHitsCard(int[] dealerCards){
        System.out.println("The dealer's score is a " + dealerCards[0]);
        while (dealerCards[0] < 17) {
            String newCard = generateCards.returnCards();
            System.out.println("The dealer drew a " + newCard);
            int cardToNumber = dealTheCards.dealOneCard(newCard);
            dealerCards[0] += cardToNumber;
            System.out.println("The dealer's score is a " + dealerCards[0]);
        }
        return dealerCards[0];
    }

    // this determines if the dealer needs to hit more cards
    public static int determineDealerFinalHand(int[] dealerCards) {
        int dealerFinalScore = 0;

        // if dealer cards don't need to hit
        if (dealerCards[0] > 17)        dealerFinalScore = dealerCards[0];
        // if dealer cards need to be hit
        else if (dealerCards[1] == 0)   dealerFinalScore = dealerHitsCard(dealerCards);
        // if aces are involved
        else dealerFinalScore = aceInTheHole.ifDealerHasAce(dealerCards);

        System.out.println("The dealer's final score is a " + dealerFinalScore);
        return dealerFinalScore;
    }
}

