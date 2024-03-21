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
/*    */ public class CrazyEnemy
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/* 17 */   private Random r = new Random();
/*    */   
/*    */   private BufferedImage enemyImage;
/*    */   private Spritesheet ss;
/*    */   
/*    */   public CrazyEnemy(float x, float y, ID id, Handler handler) {
/* 23 */     super(x, y, id);
/* 24 */     this.handler = handler;
/*    */     
/* 26 */     int initVelX = this.r.nextInt(10);
/* 27 */     int initVelY = this.r.nextInt(10);
/*    */     
/* 29 */     if (initVelX % 2 == 0) { this.velX = -15.0F; } else { this.velX = 15.0F; }
/* 30 */      if (initVelY % 2 == 0) { this.velY = -15.0F; } else { this.velY = 15.0F; }
/*    */     
/* 32 */     this.ss = new Spritesheet(Game.spritesheet);
/* 33 */     this.enemyImage = this.ss.grabImage(2, 4, 24, 24);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 38 */     this.x += this.velX;
/* 39 */     this.y += this.velY;
/*    */     
/* 41 */     if (this.y <= 0.0F || this.y >= 576.0F) {
/* 42 */       this.velY *= -1.0F;
/*    */       try {
/* 44 */         AudioPlayer.playSound("enemyjump.wav", false);
/* 45 */       } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 46 */         Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */       } 
/*    */     } 
/* 49 */     if (this.x <= 0.0F || this.x >= 776.0F) {
/* 50 */       this.velX *= -1.0F;
/*    */       try {
/* 52 */         AudioPlayer.playSound("enemyjump.wav", false);
/* 53 */       } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 54 */         Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     int col = this.r.nextInt(5);
/* 59 */     if (col < 2) {
/* 60 */       col = 2;
/*    */     }
/* 62 */     if (col > 4) {
/* 63 */       col = 4;
/*    */     }
/* 65 */     this.enemyImage = this.ss.grabImage(col, 4, 24, 24);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 72 */     g.drawImage(this.enemyImage, (int)this.x, (int)this.y, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 77 */     return new Rectangle((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/CrazyEnemy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */