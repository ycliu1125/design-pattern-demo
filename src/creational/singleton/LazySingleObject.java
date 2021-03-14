package creational.singleton;

import java.util.Objects;

public class LazySingleObject {

    private LazySingleObject() {
    }

    // 只宣告並尚未指派實例化物件
    /*
        volatile 關鍵字作用是，使系統中所有執行緒對該關鍵字修飾的變數共享可見，
        可以禁止執行緒的工作記憶體對volatile修飾的變數進行快取。
     */
    private static volatile LazySingleObject instance;

    // 避免多執行續的重複建立
    public static LazySingleObject getInstance() {
        // 第一層減少不必要的同步
        if (Objects.isNull(instance)) {
            synchronized (LazySingleObject.class) {
                // 第二層為了在 null 的情況下建立實例
                if (Objects.isNull(instance)) {
                    instance = new LazySingleObject();
                }
            }
        }
        return instance;
    }
}
