package creational.singleton;

public class EagerSingleObject {

    private EagerSingleObject() {
    }

    //宣告的同時直接賦予實例後物件
    private static final EagerSingleObject INSTANCE = new EagerSingleObject();

    public static EagerSingleObject getInstance() {
        return INSTANCE;
//        return EagerObjectHolder.INSTANCE;
    }

    private static class EagerObjectHolder {
        private static EagerSingleObject INSTANCE = new EagerSingleObject();
    }
}

/*
    文章中有提到 使用靜態內部類實現
    可以確保線程安全，保證物件唯一性，並且延遲實例化
    不懂為何靜態內部類別為何可以延遲
 */
