package creational.abstractFactory;

public class KfcFactory extends AbstractFastFoodFactory {

    @Override
    public Burger getBurger() {
        return new Burger(FactoryType.啃的雞);
    }

    @Override
    public Cola getCola() {
        return new Cola(FactoryType.啃的雞);
    }

    @Override
    public Fries getFries() {
        return new Fries(FactoryType.啃的雞);
    }
}
