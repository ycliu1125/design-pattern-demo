package structural.proxy;

/*
    代理模式 (Proxy Pattern)

    定義： 為其他物件提供一種"代理"以控制對這個物件的存取。
    或是說一個類別(代理者)可以作為其它東西的介面

    通常的使用的時機是在
    1. 存取權利需要控制時。
    2. 在存取時需要提供其他的功能時。

 */
public class ProxyMain {

    public static void main(String[] args) {

        RealServer realServer = new RealServer("127.0.0.real");
        ProxyServer proxyServer = new ProxyServer("192.168.1.proxy", realServer);

        System.out.println("代理者執行");
        proxyServer.connect();

        System.out.println("沒有代理者執行");
        realServer.connect();
    }
}

/*
    那麼 問題來了：
    為什麼需要代理者??
    為什麼有些事情只能代理者做?

    如果... 下面是泛型?...代理者先做一些事前準備?

 */
