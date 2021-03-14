package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DroneFactory {

    private static Map<DroneType, Drone> droneMap = new HashMap<>();

    public Drone getDroneByType(DroneType type) {

        if (droneMap.containsKey(type)) {
            return droneMap.get(type);
        }
        System.out.println("共享池中，未找到指定特徵(" + type.toString() + ")物件，因此建立一例並放入共享池");
        Drone drone = new Drone();
        drone.setType(type);
        droneMap.put(type, drone);

        return drone;
    }

}
