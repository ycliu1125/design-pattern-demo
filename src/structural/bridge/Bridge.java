package structural.bridge;

public class Bridge implements Building {

    @Override
    public void build() {
        System.out.println("橋造好啦!!!");
    }

    @Override
    public void describe() {
        System.out.println("這是一座橋");
    }
}
