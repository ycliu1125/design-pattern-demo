package structural.bridge;

public class VeryBadBuilder extends Builder {

    public VeryBadBuilder(Building building) {
        this.building = building;
    }

    @Override
    public void buildSomething() {
        System.out.print("VeryBadBuilder can only describe...");
        building.describe();
    }
}
