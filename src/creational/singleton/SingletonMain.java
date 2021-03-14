package creational.singleton;

/*
    單例模式：
    定義：單例的對象必須保證只有一個實例存在，自行實例化(建構)並向整個系統提供這個實例。
    例如：伺服器的配置信息存放在一個文件中，這些配置數據由一個單例對象統一讀取，
    其他服務再通過這個單例對象獲取這些配置信息。

    在這裡，你需要記住的是：如何製作 Singleton 的類別
    並且試著建立SingleFactory (單例工廠)
    步驟：
    1. 建構子私有化 (private constructor)
    2. 建立 getInstance() 方法

    單例又分兩種情況(Lazy & Eager)
    Lazy : 需使用時才建立
    Eager : 系統啟用時就建立

 */
public class SingletonMain {

    public static void main(String[] args) {

        System.out.println(McdFactory.getBurgerFactory().getProduct().toString());
        System.out.println(McdFactory.getColaFactory().getProduct().toString());
    }
}

/*

 */
