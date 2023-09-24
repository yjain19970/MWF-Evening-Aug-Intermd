package solidPrinciples.LSP;

import java.util.List;
import java.util.Stack;

/**
 * here VideoMediaPlayer supports both audio and video
 *      AudioMediaPlayer supports only audio
 */
public class Client {
    public static void main(String[] args) {
        AudioMediaPlayer audio = new WinampMediaPlayer();
        audio.playAudio();

        VideoMediaPlayer video = new VLCMediaPlayer();
        VideoMediaPlayer video2 = new WindowsMediaPlayer();
        video.playVideo();
        video.playAudio();
    }
}

/*
 * Liskov Principle says the subclass can't change the properties of parent class.
 * States that we should be able to substitute any child variable/object with parent class reference type.
 *
 * This relates with ISP.
 * Solution is use interfaces and only implements whenever required.
 *
 * for example:
 *      Crow and peacock have eat(), fly(), sleep(), sound() methods
 *      Penguin have eat(), sound(), sleep() methods.
 *
 *      Penguin doesn't have fly() methods and if we kept all the above three methods in abstract class we must implement all.
 *      For this solution separate into interfaces.
 *              Bird Interface : eat(), sound(), sleep()
 *              IFlyable Interface : fly()
 *      For other than penguin class for all birds we can implement flyable interface.
 */
