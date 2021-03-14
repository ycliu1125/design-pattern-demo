package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class District {

    private String name;

    private List<District> children = new ArrayList<>();

    public District(String name) {
        this.name = name;
    }

    public void add(District district) {
        children.add(district);
    }

    public void remove(District district) {
        children.remove(district);
    }

    public void command(String command) {
        System.out.println(name + " " + command);
        for (District d : children) {
            d.command(command);
        }
    }

}
