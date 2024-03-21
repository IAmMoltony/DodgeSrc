package dodgethemall.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class BufferedImageLoader {
  BufferedImage image;
  
  public BufferedImage loadImage(String path) {
    try {
      this.image = ImageIO.read(getClass().getResource(path));
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot load image " + path + ". (" + ex + ")", "Dodge them all", 0);
    } 
    return this.image;
  }
}
