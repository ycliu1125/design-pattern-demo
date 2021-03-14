package creational.prototype;

public abstract class DronePrototype implements Cloneable {

    // 覆寫Clone 方法，限定只回傳無人機原型型態
    @Override
    protected DronePrototype clone() throws CloneNotSupportedException {
        return (DronePrototype) super.clone();
    }
}
