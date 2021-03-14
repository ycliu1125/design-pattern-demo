package structural.decorator;

public class LedStick implements LedToy {

    @Override
    public void play() {
        System.out.println("LED 棍  亮起來!!");
    }
}
