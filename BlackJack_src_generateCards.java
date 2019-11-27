import java.util.Random;

public class generateCards {
    public static String returnCards(){
        //int firstCard = getNumberOnCard();
        String firstCard = getFaceValue();
        return firstCard;
    }
    // this generates a random number between 1 and 13 and returns it
    public static int getNumberOnCard(){
        Random rand = new Random();
        int firstCard = rand.nextInt(13);
        firstCard += 1;
        return firstCard;
    }
    // this converts the number into a string that will be the face value of the card
    // used for first cards
    public static String getFaceValue(){
        int NumberOnCard = getNumberOnCard();
        String faceValue = "";
        if (NumberOnCard == 1)          faceValue = "Ace";
        else if (NumberOnCard >= 2 && NumberOnCard <= 10) {
                                        faceValue = Integer.toString(NumberOnCard);
        }
        else if (NumberOnCard == 11)    faceValue = "Jack";
        else if (NumberOnCard == 12)    faceValue = "Queen";
        else if (NumberOnCard == 13)    faceValue = "King";
        else                            faceValue = "your numbers are wrong";
        return faceValue;
    }

    // polymorphism
    public static String getFaceValue(int NumberOnCard){
        String faceValue = "";
        if (NumberOnCard == 1)          faceValue = "Ace";
        else if (NumberOnCard >= 2 && NumberOnCard <= 10) {
                                        faceValue = Integer.toString(NumberOnCard);
        }
        else if (NumberOnCard == 11)    faceValue = "Jack";
        else if (NumberOnCard == 12)    faceValue = "Queen";
        else if (NumberOnCard == 13)    faceValue = "King";
        else                            faceValue = "your numbers are wrong";
        return faceValue;
    }
}



