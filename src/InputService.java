import java.util.Scanner;

public class InputService {
    private static Scanner scan = new Scanner(System.in);

    public static String insertUserName(int playerNum) {
        System.out.print("write player " + playerNum + "'s name : ");
        return scan.next();
    }

    public static int insertPlayerCount() {
        System.out.print("how many player : ");
        return scan.nextInt();
    }
}
