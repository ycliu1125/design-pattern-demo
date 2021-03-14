package structural.bridge;

public class Church implements Building {
    @Override
    public void build() {
        System.out.println("教堂蓋好啦~~~");
    }

    @Override
    public void describe() {
        System.out.println("剩彼得大叫 糖! 糖! 我要糖!");
    }
}
