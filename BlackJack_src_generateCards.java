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
    public static String getFaceValue(){
        int NumberOnCard = getNumberOnCard();
        String faceValue = "";
        if (NumberOnCard == 1) {
            faceValue = "Ace";
            return faceValue;
        }
        else if (NumberOnCard >= 2 && NumberOnCard <= 10){
            faceValue = Integer.toString(NumberOnCard);
            return faceValue;
        }
        else if (NumberOnCard == 11){
            faceValue = "Jack";
            return faceValue;
        }
        else if (NumberOnCard == 12){
            faceValue = "Queen";
            return faceValue;
        }
        else if (NumberOnCard == 13){
            faceValue = "King";
            return faceValue;
        }
        else if (NumberOnCard == 50){
            faceValue = "Ace";
            return faceValue;
        }
        else{
            faceValue = "your numbers are wrong";
        }
        //System.out.println(faceValue);
        return faceValue;
    }
    public static String getFaceValueWithInt(int NumberOnCard){
        String faceValue = "";
        if (NumberOnCard == 1) {
            faceValue = "Ace";
            return faceValue;
        }
        if (NumberOnCard >= 2 && NumberOnCard <= 10){
            faceValue = Integer.toString(NumberOnCard);
            return faceValue;
        }
        if (NumberOnCard == 11){
            faceValue = "Jack";
            return faceValue;
        }
        if (NumberOnCard == 12){
            faceValue = "Queen";
            return faceValue;
        }
        if (NumberOnCard == 13){
            faceValue = "King";
            return faceValue;
        }
        else{
            faceValue = "your numbers are wrong";
        }
        //System.out.println(faceValue);
        return faceValue;
    }
}

