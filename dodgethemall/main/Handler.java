package dodgethemall.main;

import java.awt.Graphics;
import java.util.LinkedList;


public class Handler
{
  LinkedList<GameObject> objects = new LinkedList<>();
  
  private Game game;
  public int speed = 5; // Counter-intuitively, this is actually the player's speed, not the speed of the game
  
  public Handler(Game game) {
    this.game = game;
  }

  
  public void tick() {
    for (int i = 0; i < this.objects.size(); i++) {
      GameObject tempObj = this.objects.get(i);
      tempObj.tick();
    } 
  }
  
  public void render(Graphics g) {
    for (int i = 0; i < this.objects.size(); i++) {
      GameObject tempObj = this.objects.get(i);
      tempObj.render(g);
    } 
  }
  
  public void removeEnemies() {
    for (int i = 0; i < this.objects.size(); i++) {
      GameObject tempObj = this.objects.get(i);
      ID tempID = tempObj.getID();
      if (tempID == ID.BasicEnemy || tempID == ID.FastEnemy || tempID == ID.SmartEnemy || tempID == ID.MenuParticle || tempID == ID.BossEnemy || tempID == ID.CrazyEnemy) {
        removeObj(tempObj);
      }
      if (tempID == ID.Player) if (Game.gameState == Game.STATE.EndScreen) {
          removeObj(tempObj);
        } 
      if (tempID == ID.Coin) if (Game.gameState == Game.STATE.EndScreen) {
          removeObj(tempObj);
        } 
    } 
  }
  
  public void removeTrail() {
    for (int i = 0; i < this.objects.size(); i++) {
      GameObject tempObj = this.objects.get(i);
      ID tempID = tempObj.getID();
      if (tempID == ID.Trail) {
        removeObj(tempObj);
      }
    } 
  }
  
  public void removeBoss() {
    for (int i = 0; i < this.objects.size(); i++) {
      if (((GameObject)this.objects.get(i)).getID() == ID.BossEnemy) {
        this.objects.remove(i);
      }
    } 
  }
  
  public void removeCoin() {
    for (int i = 0; i < this.objects.size(); i++) {
      GameObject tempObj = this.objects.get(i);
      ID tempID = tempObj.getID();
      if (tempID == ID.Coin) {
        removeObj(tempObj);
      }
    } 
  }

  public void addObj(GameObject obj) {
    this.objects.add(obj);
  }
  
  public void removeObj(GameObject obj) {
    this.objects.remove(obj);
  }
}
