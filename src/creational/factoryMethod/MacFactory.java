package creational.factoryMethod;

public class MacFactory implements Factory {

    @Override
    public Product getProduct() {
        return new MacProduct();
    }
}
