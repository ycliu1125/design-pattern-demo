package behavioral.template;

public class BaseballGame extends Game {
    @Override
    void initialize() {
        System.out.println("棒球遊戲啟動完成~");
    }

    @Override
    void startPlay() {
        System.out.println("棒球開始~");
    }

    @Override
    void endPlay() {
        System.out.println("棒球比賽結束~");
    }
}
