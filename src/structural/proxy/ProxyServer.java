package structural.proxy;

public class ProxyServer implements Server {

    private RealServer realServer;
    private String ip;

    public ProxyServer(String ip, RealServer realServer) {
        this.ip = ip;
        this.realServer = realServer;
    }

    @Override
    public void connect() {
        // 先做某些代理者要做的事
        getAuthentication();
        realServer.connect();
    }

    private void getAuthentication() {
        System.out.println("代理者伺服器 ip:" + ip + "取得授權");
    }
}
