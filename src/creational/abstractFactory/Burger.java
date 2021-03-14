package creational.abstractFactory;

public class Burger {

    Burger(FactoryType factoryType) {
        this.factoryType = factoryType;
    }

    private FactoryType factoryType;

    @Override
    public String toString() {
        return "This is " + factoryType + "的漢堡";
    }
}
