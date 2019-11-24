import java.util.Scanner;

public class spaceToProceed {
    public static void actionRequired(){
        System.out.println("~~~~Press any key to proceed~~~~");
        Scanner Input = new Scanner(System.in);
        String UserResponse = Input.nextLine();
        System.out.println();
    }
}
