package creational.abstractFactory;

public class Cola {

    Cola(FactoryType factoryType) {
        this.factoryType = factoryType;
    }

    private FactoryType factoryType;

    @Override
    public String toString() {
        return "This is " + factoryType + "的可樂";
    }
}
