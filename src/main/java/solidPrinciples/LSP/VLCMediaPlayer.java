package solidPrinciples.LSP;

/**
 * both video and audio supports
 */
public class VLCMediaPlayer extends VideoMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("VLC Media player audio");
    }

    @Override
    public void playVideo() {
        System.out.println("VLC Media player video");
    }
}
