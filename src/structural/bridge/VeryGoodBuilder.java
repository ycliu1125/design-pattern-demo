package structural.bridge;

public class VeryGoodBuilder extends Builder {

    public VeryGoodBuilder(Building building) {
        this.building = building;
    }

    @Override
    public void buildSomething() {
        System.out.print("VeryGoodBuilder: ");
        building.build();
    }

}
