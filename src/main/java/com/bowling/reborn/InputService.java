import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputService {
//    private static final Logger log = LoggerFactory.getLogger(InputService.class);
    private static Scanner scan = new Scanner(System.in);

    public static String insertUserName(int playerNum) {
        System.out.print("write player " + playerNum + "'s name : ");
        return scan.next();
    }

    public static int insertPlayerCount() {
        System.out.print("how many player : ");
        try {
            return scan.nextInt();
        }catch (InputMismatchException e) {
            log.debug("정수만 입력 가능 합니다.");
        }
        return 0;
    }
}
