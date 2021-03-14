package creational.abstractFactory;

public class Fries {

    Fries(FactoryType factoryType) {
        this.factoryType = factoryType;
    }

    private FactoryType factoryType;

    @Override
    public String toString() {
        return "This is " + factoryType + "的薯條";
    }
}
