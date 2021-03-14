package structural.adapter;

public class MediaAdapter implements MediaPlayer {

    VideoPlayer videoPlayer;

    public MediaAdapter(MediaType mediaType) {
        switch (mediaType) {
            case wmv:
                videoPlayer = new WmvPlayer();
                break;
            case mp4:
                videoPlayer = new Mp4Player();
                break;
            default:
                break;
        }
    }

    @Override
    public void play(MediaType mediaType, String fileName) {
        switch (mediaType) {
            case wmv:
                videoPlayer.playWmv(fileName);
                break;
            case mp4:
                videoPlayer.playMp4(fileName);
                break;
            default:
                break;
        }
    }
}
