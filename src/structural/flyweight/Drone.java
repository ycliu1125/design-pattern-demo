package structural.flyweight;

public class Drone {

    private String no;
    private DroneType type;
    private String version;

    @Override
    public String toString() {
        return "Drone{" +
            "no='" + no + '\'' +
            ", type=" + type +
            ", version='" + version + '\'' +
            '}';
    }

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
}
