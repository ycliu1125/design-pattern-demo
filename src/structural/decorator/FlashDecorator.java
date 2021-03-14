package structural.decorator;


public class FlashDecorator extends AbsLedDecorator {

    public FlashDecorator(LedToy decoratedToy) {
        super(decoratedToy);
    }

    @Override
    public void play() {
        decoratedToy.play();  // 基本的
        addFlash();  // 裝飾上去的
    }

    public void addFlash() {
        System.out.println("增加閃爍功能!!");
    }
}
