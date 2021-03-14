package creational.abstractFactory;

public class McdFactory extends AbstractFastFoodFactory {

    @Override
    public Burger getBurger() {
        return new Burger(FactoryType.麥當佬);
    }

    @Override
    public Cola getCola() {
        return new Cola(FactoryType.麥當佬);
    }

    @Override
    public Fries getFries() {
        return new Fries(FactoryType.麥當佬);
    }
}
