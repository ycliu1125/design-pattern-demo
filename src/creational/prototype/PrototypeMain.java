package creational.prototype;

import java.io.IOException;

/*
    原型模式：
    定義：通過「複製」一個已經存在的實例來返回新的實例,而不是新建實例。
    被複製的實例我們稱之為「原型」。

    使用時機：
    類別初始化需要消耗非常多的資源時（資料、硬體資源）。
    創造"複雜"的物件或是類別初始化需要很"繁瑣"的準備或存取權限。
    當一個物件需要提供"許多"其他物件存取，而且其他物件會需要修改到前者裡面的數值時。

    Prototype是一個介面，包含一個clone的function，可由此函數式從一個物件建立另一個物件。
    各類別在需要時都可以視狀況實作Prototype 介面。
    很多語言都已經內建了prototype pattern的這一個介面(Java是Cloneable、C#叫做Prototype)，
    很多時候基礎的物件Object裡，也已經寫好了clone的方法，所以只要引用後實踐即可。

    在這裡你還需要了解 Java 中的 深複製/淺複製

 */
public class PrototypeMain {

    public static void main(String[] args) {

        Drone[] drones = new Drone[5000];
        drones[0] = new Drone();
        drones[0].setNo("C0001");
        drones[0].setType(DroneType.寒霜無人機);
        drones[0].setVersion("v0.87");
        Owner owner = new Owner();
        owner.setNo("B101");
        owner.setName("失智博士");
        drones[0].setOwner(owner);
        drones[0].setData("Freeze!!");

        for (int i = 1; i < 5000; i++) {
            try {
                drones[i] = (Drone) drones[0].clone();
                // 只改編號 其餘設定皆一模一樣
                drones[i].setNo(String.format("C%04d", i + 1));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(drones[i].getNo() + drones[i].getType());
        }

        try {
            // 淺複製 (shallow clone)
            Drone drone1 = drones[0];
            Drone drone2 = (Drone) drones[0].clone();
            System.out.println("一號物件位址是否等於原型：" + (drone1 == drones[0]));
            System.out.println("一號是否equals原型：" + (drone1.equals(drones[0])));
            System.out.println("二號物件位址是否等於原型：" + (drone2 == drones[0]));
            System.out.println("二號是否equals原型：" + (drone2.equals(drones[0])));
            System.out.println("二號的擁有者是否等於原型的擁有者：" +
                (drone2.getOwner() == drones[0].getOwner()));
            System.out.println("由此可知 clone() 方法並沒有把物件的 Owner 物件一起複製出來，而是指向同一個Owner物件");

            // 深複製 (deep clone)
            Drone drone3 = drones[0].deepClone();
            System.out.println("三號物件位址是否等於原型：" + (drone3 == drones[0]));
            System.out.println("三號是否equals原型：" + (drone3.equals(drones[0])));
            System.out.println("三號的擁有者是否等於原型的擁有者：" +
                (drone3.getOwner() == drones[0].getOwner()));
            System.out.println("可以看到三號的擁有者也一起被複製了，與原型機指向不同的博士");

        } catch (CloneNotSupportedException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
    淺複製：物件的複製僅是物件本身，物件引用的其它物件會指向同一個物件，而不會複製一份。
    而在Cloneable 介面中提供的clone() 方法就是屬於淺複製

    深複製：物件的複製會 連同 物件屬性的物件也會複製一份出來。
    深複製需要採用序列化與反序列的方式去獲取
    也有種說法稱之為"醃菜"，用流(stream)的方式醃製進去又取出來，實現深度複製。

    這裡就不贅述 序列/反序列化了 有興趣的同學 需要自己去研究

 */

/*
    例外提及一下生成物件的五種辦法：

    1.new
    2.Class類的newInstance
    3.Constructor類newInstance
    4.Clone方式
    5.反序列化的方式

 */