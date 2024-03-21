package dodgethemall.main;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {
  public static void playSound(String soundFile, boolean loop) throws MalformedURLException, LineUnavailableException, UnsupportedAudioFileException, IOException {
    File f = new File(soundFile);
    
    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
    Clip clip = AudioSystem.getClip();
    clip.open(audioIn);
    if (loop) {
      clip.loop(-1);
    } else {
      clip.start();
    }
  }
}
