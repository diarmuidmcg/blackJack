import java.util.Arrays;
import java.util.Scanner;

public class aceInTheHole {
    public static int ifPlayerHasAce(int score){
        if (score < 61) {
            System.out.println("Your score is " + (score - 49) + " or it is " + (score - 39));
        }
        else {
            System.out.println("Your score is " + (score - 49));
        }
        System.out.println("Would you like to\n(H)it or\n(S)tand?");
        Scanner Input = new Scanner(System.in);
        String UserResponseHit = Input.next();
        int newScore;
        if (UserResponseHit.equalsIgnoreCase("Hit") || UserResponseHit.equalsIgnoreCase("H")) {
            newScore = hitCards(score);
            if (newScore > 71) {
                System.out.println("You lose! " + (newScore - 49) + " is greater than 21");
                return newScore - 49;
            }
            else if (newScore == 71) {
                System.out.println("BlackJack!");
                return newScore;
            } else if (newScore < 71) {
                int tryThisScore = newScore;
                ifPlayerHasAce(tryThisScore);
            }

        } else if (UserResponseHit.equalsIgnoreCase("Stand") || UserResponseHit.equalsIgnoreCase("S")) {
            newScore = (score - 49);
        }
        else {
            System.out.println("try again");
            newScore = score;
            ifPlayerHasAce(newScore);
        }
        return newScore;
    }
    public static int hitCards(int score){
        String DealCard = generateCards.returnCards();
        System.out.println("You were dealt a: " + DealCard);
        int cardToNumber = dealTheCards.dealOneCard(DealCard);
        int newScore = score + cardToNumber;
        return newScore;
    }

}
