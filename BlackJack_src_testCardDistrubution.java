public class testCardDistrubution {
    public static void runCard(int Amount) {
//        int cardResult;
//        for (int i = 0; i < Amount; i++) {
//            cardResult = generateCards.getNumberOnCard();
//        }
        int result;
        int results[] = new int[14];
        for (int i = 1; i < 14; i++) {
            results[i] = 0;
        }
        for (int i = 0; i < Amount; i++) {
            result = generateCards.getNumberOnCard();
            int n = results[result];
            results[result] = n + 1;
        }
        String output = "";
        for (int i = 1; i < 14; i++) {
            float percentage = ((float) results[i-2] / Amount) * 100;
            output += i + " rolled " + results[i-2] + " times. That land percentage is " + percentage + "%\n";
        }
    }
}
