package creational.prototype;

import java.io.Serializable;

public class Owner implements Serializable {

    public static final long serialVersionUID = 1L;

    private String no;
    private String name;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
