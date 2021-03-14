package structural.proxy;

public class RealServer implements Server {

    private String ip;

    public RealServer(String ip) {
        this.ip = ip;
    }

    @Override
    public void connect() {
        System.out.println("connect to " + ip + "... RealServer");
    }


}
