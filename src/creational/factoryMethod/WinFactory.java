package creational.factoryMethod;

public class WinFactory implements Factory {
    @Override
    public Product getProduct() {
        return new WinProduct();
    }
}
