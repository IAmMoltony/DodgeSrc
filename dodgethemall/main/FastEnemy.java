/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Color;
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
/*    */ public class FastEnemy
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/*    */   private Color myColor;
/* 19 */   private Random r = new Random();
/*    */   
/*    */   private BufferedImage enemyImage;
/*    */   
/*    */   public FastEnemy(float x, float y, ID id, Handler handler) {
/* 24 */     super(x, y, id);
/* 25 */     this.handler = handler;
/*    */     
/* 27 */     this.myColor = new Color(75, 75, this.r.nextInt(255));
/* 28 */     if (this.myColor.getBlue() <= 90) this.myColor = Color.cyan;
/*    */     
/* 30 */     int initVelX = this.r.nextInt(10);
/* 31 */     int initVelY = this.r.nextInt(10);
/*    */     
/* 33 */     if (initVelX % 2 == 0) { this.velX = -2.0F; } else { this.velX = 2.0F; }
/* 34 */      if (initVelY % 2 == 0) { this.velY = -9.0F; } else { this.velY = 9.0F; }
/*    */     
/* 36 */     Spritesheet ss = new Spritesheet(Game.spritesheet);
/* 37 */     this.enemyImage = ss.grabImage(1, 3, 24, 24);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 42 */     this.x += this.velX;
/* 43 */     this.y += this.velY;
/*    */     
/* 45 */     if (this.y <= 0.0F || this.y >= 576.0F) {
/* 46 */       this.velY *= -1.0F;
/*    */       try {
/* 48 */         AudioPlayer.playSound("enemyjump.wav", false);
/* 49 */       } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 50 */         Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */       } 
/*    */     } 
/* 53 */     if (this.x <= 0.0F || this.x >= 776.0F) {
/* 54 */       this.velX *= -1.0F;
/*    */       try {
/* 56 */         AudioPlayer.playSound("enemyjump.wav", false);
/* 57 */       } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 58 */         Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 67 */     g.drawImage(this.enemyImage, (int)this.x, (int)this.y, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 72 */     return new Rectangle((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/FastEnemy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */