package structural.adapter;

public class Mp4Player implements VideoPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file... name: " + fileName);
    }

    @Override
    public void playWmv(String fileName) {
        // do nothing
    }
}
