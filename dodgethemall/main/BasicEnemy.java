/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.util.Random;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import javax.sound.sampled.LineUnavailableException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BasicEnemy
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/* 17 */   private Random r = new Random();
/*    */   
/*    */   private BufferedImage enemyImage;
/*    */   
/*    */   public BasicEnemy(float x, float y, ID id, Handler handler) {
/* 22 */     super(x, y, id);
/* 23 */     this.handler = handler;
/*    */     
/* 25 */     int initVelX = this.r.nextInt(10);
/* 26 */     int initVelY = this.r.nextInt(10);
/*    */     
/* 28 */     if (initVelX % 2 == 0) { this.velX = -5.0F; } else { this.velX = 5.0F; }
/* 29 */      if (initVelY % 2 == 0) { this.velY = -5.0F; } else { this.velY = 5.0F; }
/*    */     
/* 31 */     Spritesheet ss = new Spritesheet(Game.spritesheet);
/* 32 */     this.enemyImage = ss.grabImage(1, 2, 24, 24);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 37 */     this.x += this.velX;
/* 38 */     this.y += this.velY;
/*    */     
             // I had no idea how to use inheritance properly, so now we're stuck with copy-pasted code.
/* 40 */     if (this.y <= 0.0F || this.y >= 576.0F) {
/* 41 */       this.velY *= -1.0F;
/*    */       try {
/* 43 */         AudioPlayer.playSound("enemyjump.wav", false);
/* 44 */       } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 45 */         Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */       } 
/*    */     } 
/* 48 */     if (this.x <= 0.0F || this.x >= 776.0F) {
/* 49 */       this.velX *= -1.0F;
/*    */       try {
/* 51 */         AudioPlayer.playSound("enemyjump.wav", false);
/* 52 */       } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 53 */         Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 62 */     g.drawImage(this.enemyImage, (int)this.x, (int)this.y, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 67 */     return new Rectangle((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/BasicEnemy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
