package structural.flyweight;

import java.util.Random;

/*
    享元模式 (Flyweight Pattern)
    定義：運用共有技術有效的支援大量細粒度的物件。

    在"大量物件需要創建"時，藉由"分享"的方式避免重複創建
    (將已創建的物件記錄起來、並在要使用的時候取出)，
    減少創建不必要的物件，達到所謂輕量化的結果。

    有分為可以共享的資料和不能共享的資料，
    可以共享的資料稱為內部狀態，不能共享的資料稱為外部狀態。

    ＊ 可以與 Prototype 做個比較
 */
public class FlyweightMain {

    public static void main(String[] args) {

        DroneFactory droneFactory = new DroneFactory();
        DroneType[] droneTypes = DroneType.values();

        for (int i = 0; i < 20; i++) {
            Drone drone = droneFactory.getDroneByType(droneTypes[new Random().nextInt(4)]);
            drone.setNo(String.format("Flyweight-%03d", i));
            drone.setVersion("0.0." + new Random().nextInt(10));
            System.out.println(drone.toString());
        }
        

    }

}
