package structural.adapter;

public class WmvPlayer implements VideoPlayer {
    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

    @Override
    public void playWmv(String fileName) {
        System.out.println("Play wmv file... name: " + fileName);
    }
}
