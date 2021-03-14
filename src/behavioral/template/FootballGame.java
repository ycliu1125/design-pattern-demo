package behavioral.template;

public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("足球遊戲啟動完成~~");
    }

    @Override
    void startPlay() {
        System.out.println("足球 START!!");
    }

    @Override
    void endPlay() {
        System.out.println("足球 GAME OVER!!");
    }
}
