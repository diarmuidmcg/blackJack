import java.util.Scanner;

public class hitOrStand {
    public static int playBJ(int score){
        System.out.println("Your score is " + score + ". Would you like to\n(H)it or\n(S)tand?");
        Scanner Input = new Scanner(System.in);
        String UserResponseHit = Input.next();
        int newScore = 0;

        // if player hits
        if (UserResponseHit.equalsIgnoreCase("Hit") || UserResponseHit.equalsIgnoreCase("H")) {
            newScore = hitCards(score);
            if (newScore > 21) {
                System.out.println("You lose! " + newScore + " is greater than 21");
                return newScore;
             }
            else if (newScore == 21) {
               System.out.println("BlackJack!");
               return newScore;
           } if (newScore < 21) {
                int tryThisScore = newScore;
                newScore = playBJ(tryThisScore);
          }
        }

        // if player stands
        else if (UserResponseHit.equalsIgnoreCase("Stand") || UserResponseHit.equalsIgnoreCase("S")) {
            newScore = score;
        }

        // if wrong input
        else {
            System.out.println("try again");
            newScore = score;
            playBJ(newScore);
        }
        return newScore;
    }

    // simple function to get new card and add to existing score
    public static int hitCards(int score){
        String DealCard = generateCards.returnCards();
        System.out.println("You were dealt a: " + DealCard);
        int cardToNumber = dealTheCards.dealOneCard(DealCard);
        int newScore = score + cardToNumber;
        return newScore;
    }
//    public static String ensureUserResponseString() {
//        Scanner Input = new Scanner(System.in);
//        String UserResponseHit = Input.next();
//    }
}

