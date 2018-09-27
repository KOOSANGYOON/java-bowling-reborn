import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("write player name : ");
        String playerName = scan.next();
        PrintScoreBoard.printScoreBoardTitle();
    }
}
