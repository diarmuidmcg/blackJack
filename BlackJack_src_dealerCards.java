public class dealerCards {
    public static int firstDealerCard(){
        String newCard = generateCards.returnCards();
        System.out.println("The Dealers first card is a " + newCard);
        int cardToNumber = dealTheCards.dealOneCard(newCard);
        return cardToNumber;
    }
    public static int secondDealerCard(){
        String newCard = generateCards.returnCards();
        //System.out.println("The Dealers second card is a " + newCard);
        int cardToNumber = dealTheCards.dealOneCard(newCard);
        return cardToNumber;
    }
    public static int dealerHitsCard(int dealersDealtHand){
        while (dealersDealtHand < 17
                || dealersDealtHand < 57 && dealersDealtHand > 50
                || dealersDealtHand < 67 && dealersDealtHand > 62) {
            String newCard = generateCards.returnCards();
            System.out.println("The dealer drew a " + newCard);
            int cardToNumber = dealTheCards.dealOneCard(newCard);
            dealersDealtHand += cardToNumber;
            System.out.println("The dealer's score is a " + dealersDealtHand);
        }
        if (dealersDealtHand > 50) {
            System.out.println("The dealer's final score is a " + (dealersDealtHand - 49));
        }
        else {
            System.out.println("The dealer's final score is a " + dealersDealtHand);
        }
        return dealersDealtHand;
    }

}
