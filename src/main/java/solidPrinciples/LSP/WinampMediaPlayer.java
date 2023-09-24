package solidPrinciples.LSP;

/**
 * Only supports audio player
 */
public class WinampMediaPlayer implements AudioMediaPlayer{
    @Override
    public void playAudio() {
        System.out.println("VLC media player Audio");
    }
}
