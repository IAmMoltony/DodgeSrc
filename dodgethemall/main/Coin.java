/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ import java.util.Random;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import javax.sound.sampled.LineUnavailableException;
/*    */ 
/*    */ 
/*    */ public class Coin
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/*    */   private Random r;
/*    */   
/*    */   public Coin(float x, float y, ID id, Handler handler) {
/* 19 */     super(x, y, id);
/* 20 */     this.handler = handler;
/* 21 */     this.r = new Random(); // Why does every single thing need its own random number generator???????
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 26 */     checkForCollision();
/*    */   }
/*    */   
/*    */   private void checkForCollision() {
/* 30 */     for (int i = 0; i < this.handler.objects.size(); i++) {
/* 31 */       GameObject tempObj = this.handler.objects.get(i);
/*    */       
/* 33 */       if (tempObj.getID() == ID.Player && 
/* 34 */         getBounds().intersects(tempObj.getBounds())) {
/*    */         
                 // Basically every time u pick up a coin it adds 100 + 10 * (the level ur currently on - 1)
                 // Which makes coins give you more score the further you progress
/* 36 */         int scoreAdd = 100 + 10 * (HUD.level - 1);
/* 37 */         HUD.score += scoreAdd;
/* 38 */         HUD.coins++; // Also increment coins

                 // Randomize position
/* 39 */         this.x = this.r.nextInt(784);
/* 40 */         this.y = this.r.nextInt(510);
                 // This exact try-catch is present everywhere where sound is played. It could have been part of
                 // AudioPlayer.
                 // Like this!
                 //  AudioPlayer.playSound("coin.wav");
                 // And when there was an error, it'd print it automatically without having to uglify the
                 // code even more.
/*    */         try {
/* 42 */           AudioPlayer.playSound("coin.wav", false);
/* 43 */         } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 44 */           Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 53 */     g.setColor(Color.orange);
/* 54 */     g.fillRect((int)this.x, (int)this.y, 16, 16);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 59 */     return new Rectangle((int)this.x, (int)this.y, 16, 16);
/*    */   }
/*    */ }
