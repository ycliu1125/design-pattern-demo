package structural.decorator;

public abstract class AbsLedDecorator implements LedToy {

    protected LedToy decoratedToy;

    public AbsLedDecorator(LedToy decoratedToy) {
        this.decoratedToy = decoratedToy;
    }

    /*
        這裡使用抽象類可以不實作 LedToy 的Play方法
        交由下面更具體的裝飾者來實作
     */
}
