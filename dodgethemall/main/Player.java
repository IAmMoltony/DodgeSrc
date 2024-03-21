package dodgethemall.main;
 
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;

public class Player
  extends GameObject
{
  Random r = new Random();
  
  Handler handler;
  
  Game game;
  Spritesheet ss;
  private BufferedImage playerImage;
  private int timer = 100;
  
  public Player(int x, int y, ID id, Handler handler, Game game) {
    super(x, y, id);
    this.handler = handler;
    this.game = game;
    
    // Copy the sprite sheet for...no reason!
    this.ss = new Spritesheet(Game.spritesheet);
    
    this.playerImage = this.ss.grabImage(ExtraStuff.skin, 1, 32, 32);
  }

  
  public void tick() {
    this.x += this.velX;
    this.y += this.velY;
    
    // make sure that the player doesn't go off bounds
    if (this.x <= 0.0F) this.x = 1.0F; 
    if (this.x >= 768.0F) this.x = 767.0F; 
    if (this.y <= 0.0F) this.y = 1.0F; 
    if (this.y >= 527.0F) this.y = 526.0F;


    
    if (this.id != ID.Player) {
      System.out.println("Incorrect ID: " + this.id);
      // Interesting
      JOptionPane.showMessageDialog(null, "Incorrect ID: " + this.id + ". If this message is\nshowing after you modded the game, make sure that player's ID (player\ncreating is in Game.java) is set to ID.Player. But if this message is\nshowing if you did not mod the game, contact developer of the game.\nError code: " + Error.IncorrectID, "An error occured :(", 0);
      
      System.exit(1);
    } 
    
    this.timer--;
    if (this.timer <= 0) {
      this.timer = 100;
      try {
          // Every 100 frames, we try to get the player's skin.
          // At least we aren't doing it every frame, but geez! Could just do it once!
        this.playerImage = this.ss.grabImage(ExtraStuff.skin, 1, 32, 32);
      } catch (Exception e) {
        e.printStackTrace();
      } 
    } 
    
    checkForCollision();
  }
  
  private void checkForCollision() {
    for (int i = 0; i < this.handler.objects.size(); i++) {
      GameObject tempObj = this.handler.objects.get(i);
      
      // This exact code is present everywhere where the code checks whether something is an enemy or not...
      if ((tempObj.getID() == ID.BasicEnemy || tempObj.getID() == ID.FastEnemy || tempObj.getID() == ID.SmartEnemy || tempObj.getID() == ID.BossEnemy || tempObj.getID() == ID.CrazyEnemy) && 
        getBounds().intersects(tempObj.getBounds())) {
        
        HUD.HP--;
        try {
          AudioPlayer.playSound("oof.wav", false);
        } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
          Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
        } 
      } 
    } 
  }



  
  public void render(Graphics g) {
    g.drawImage(this.playerImage, (int)this.x, (int)this.y, null);
  }

  
  public Rectangle getBounds() {
    return new Rectangle((int)this.x, (int)this.y, 32, 32);
  }
}
