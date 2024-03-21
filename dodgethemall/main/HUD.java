/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HUD
/*    */ {
/* 10 */   public int bounds = 0;
/* 11 */   public static int HP = 100;
/* 12 */   private int greenVal = 255;
/*    */   
/* 14 */   public static int score = 0;
/* 15 */   public static int coins = 0;
/* 16 */   public static int level = 1;
/*    */   
/* 18 */   private int nextScore = 1000;
/*    */   private int fps;
/*    */   
/*    */   public void addToNS() {
/* 22 */     this.nextScore += 500;
/*    */   }
/*    */   
/*    */   public void tick() {
/* 26 */     if (HP < 0) HP = 0; 
/* 27 */     if (HP > 100 + this.bounds / 2) HP = 100 + this.bounds / 2;
/*    */     
/* 29 */     if (this.greenVal < 0) this.greenVal = 0; 
/* 30 */     if (this.greenVal > 255) this.greenVal = 255;
/*    */     
/* 32 */     this.greenVal = HP * 2;
/*    */   }
/*    */   
/*    */   public void giveFPS(int fps) {
/* 36 */     this.fps = fps;
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {
/* 40 */     g.setColor(Color.gray);
/* 41 */     g.fillRect(10, 10, 200 + this.bounds, 20);
/* 42 */     g.setColor(new Color(75, this.greenVal, 0));
/* 43 */     g.fillRect(10, 10, HP * 2, 20);
/* 44 */     g.setColor(Color.yellow);
/* 45 */     g.drawRect(10, 10, 200 + this.bounds, 20);
/* 46 */     g.setColor(Color.red);
/* 47 */     g.drawString(String.valueOf(HP), 20, 25);
/*    */     
/* 49 */     g.setColor(Color.yellow);
/* 50 */     g.drawString("Score: " + score, 10, 50);
/* 51 */     g.drawString("Level: " + level, 10, 70);
/* 52 */     g.drawString("Coins: " + coins, 10, 90);
/* 53 */     g.drawString("Next level at " + this.nextScore, 10, 110);
/* 54 */     g.drawString("Press Space to open shop", 10, 130);
/* 55 */     g.drawString(String.valueOf(this.fps) + " fps", 10, 150);
/*    */   }
/*    */   
/*    */   public void resetStats() {
/* 59 */     level = 1;
/* 60 */     score = 0;
/* 61 */     coins = 0;
/* 62 */     this.nextScore = 1000;
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/HUD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */