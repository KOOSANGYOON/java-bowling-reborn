
public class Main {
    public static void main(String[] args) {
        int playerCount = InputService.insertPlayerCount();

        for(int i = 1; i <= playerCount; i++) {
            Frames frames = new Frames();
            User user = new User(InputService.insertUserName(i), frames);
//            String playerName = InputService.insertUserName(i);

        }
        PrintScoreBoard.printScoreBoardTitle();
    }
}
