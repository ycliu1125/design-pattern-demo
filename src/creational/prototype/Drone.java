package creational.prototype;

import java.io.*;

/*
    無人機實體
 */
public class Drone extends DronePrototype implements Serializable {

    private static final long serialVersionUID = 1L;

    private String no;
    private DroneType type;
    private String version;
    private Owner owner;
    private String data;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public DroneType getType() {
        return type;
    }

    public void setType(DroneType type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Drone deepClone() throws IOException, ClassNotFoundException {
        // 醃漬
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Drone) ois.readObject();
    }
}
