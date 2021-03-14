package structural.adapter;

public class Player implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(MediaType mediaType, String fileName) {

        // 播放器內建 可以播放mp3 檔案
        if (mediaType.equals(MediaType.mp3)) {
            System.out.println("Play mp3 file... name: " + fileName);
        } else if (mediaType.equals(MediaType.wmv) || mediaType.equals(MediaType.mp4)) {
            // 配接器提供 wmv、mp4 及其他格式檔案
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Invalid media. " + mediaType + " format not supported");
        }

    }
}
