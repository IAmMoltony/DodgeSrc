package dodgethemall.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;



public class KeyInput
  extends KeyAdapter
{
  private Handler handler;
  private Spawner spawner;
  private Random r;
  
  public KeyInput(Handler handler, Spawner spawner) {
    this.handler = handler;
    this.r = new Random();
    this.spawner = spawner;
  }

  
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    
    if (ExtraStuff.devMode) {
      // Developer mode keys
      if (key == 49) this.spawner.createEnemy(1); // 1 key: spawn 1 random enemy
      if (key == 50) this.spawner.createBasicEnemy(); // 2 key: spawn a basic enemy
      if (key == 51) this.spawner.createFastEnemy(); // 3 key: spawn a fast enemy
      if (key == 52) this.spawner.createSmartEnemy(); // 4 key: spawn a smart enemy
      if (key == 53) this.spawner.createBossEnemy(); // 5 key: spawn boss enemy
      if (key == 54) this.spawner.createCrazyEnemy(); // 6 key: spawn crazy enemy
      if (key == 27) System.exit(0); // Escape key: quit the game
      if (key == 82) HUD.HP = 100; // R key: refill health to 100
      if (key == 80) System.out.println(this.handler.objects); // P key: dump all objects in the game into the console
      if (key == 75) HUD.level = 8; // O key: set level to 8, which causes the game to...flash the background???
      if (key == 73) HUD.HP = 0; // I key: die instantly
    
    } 
    for (int i = 0; i < this.handler.objects.size(); i++) {
      GameObject tempObj = this.handler.objects.get(i);
      if (tempObj.getID() == ID.Player) {
        
          // Player movement
        if (key == 38 || key == 87) tempObj.setVelY(-this.handler.speed);
        if (key == 40 || key == 83) tempObj.setVelY(this.handler.speed); 
        if (key == 37 || key == 65) tempObj.setVelX(-this.handler.speed); 
        if (key == 39 || key == 68) tempObj.setVelX(this.handler.speed);
      
      } 
    } 
    if (key == 10 && 
      Game.gameState == Game.STATE.Game) {
      if (Game.paused) { Game.paused = false; }
      else { Game.paused = true; }
    
    }
    
    if (key == 32) {
      if (Game.gameState == Game.STATE.Game) {
        Game.gameState = Game.STATE.Shop;
        try {
          AudioPlayer.playSound("shopopen.wav", false);
        } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
          Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
        }
      
      } else if (Game.gameState == Game.STATE.Shop) {
        Game.gameState = Game.STATE.Game;
        try {
          AudioPlayer.playSound("shopclose.wav", false);
        } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
          Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
        } 
      } 
    }
  }

  
  public void keyReleased(KeyEvent e) {
    int key = e.getKeyCode();
    
    for (int i = 0; i < this.handler.objects.size(); i++) {
      GameObject tempObj = this.handler.objects.get(i);
      if (tempObj.getID() == ID.Player) {
        
        if (key == 38 || key == 87) tempObj.setVelY(0); 
        if (key == 40 || key == 83) tempObj.setVelY(0); 
        if (key == 37 || key == 65) tempObj.setVelX(0); 
        if (key == 39 || key == 68) tempObj.setVelX(0); 
      } 
    } 
  }
}
