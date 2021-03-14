package structural.bridge;

public abstract class Builder {

    protected Building building;

    public void setBuilding(Building building) {
        this.building = building;
    }

    public abstract void buildSomething();

}
