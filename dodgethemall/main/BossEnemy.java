/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class BossEnemy
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/* 12 */   private Random r = new Random();
/*    */   
/* 14 */   private int timer = 100;
/* 15 */   private int timer2 = 50;
/*    */   
/* 17 */   private int startLevel = HUD.level;
/*    */   
/*    */   public BossEnemy(float x, float y, ID id, Handler handler) {
/* 20 */     super(x, y, id);
/* 21 */     this.handler = handler;
/*    */     
/* 23 */     int initVelY = this.r.nextInt(10);
/*    */     
/* 25 */     this.velX = 0.0F;
/* 26 */     this.velY = 2.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 31 */     this.x += this.velX;
/* 32 */     this.y += this.velY;
/*    */     
/* 34 */     if (this.timer <= 0) { this.velY = 0.0F; } else { this.timer--; }
/* 35 */      if (this.timer <= 0) this.timer2--; 
/* 36 */     if (this.timer2 <= 0) {
/* 37 */       if (this.velX == 0.0F) this.velX = 4.0F; 
/* 38 */       this.velX += 0.005F;
/* 39 */       if (this.velX < 0.0F) this.velX -= 0.005F;
/*    */       
/* 41 */       if (this.velX < -10.0F) this.velX = -7.0F; 
/* 42 */       if (this.velX > 10.0F) this.velX = 7.0F;
/*    */       
/* 44 */       int spawn = this.r.nextInt(15);
/* 45 */       if (spawn == 5) this.handler.addObj(new BossEnemyBullet(((int)this.x + 70), ((int)this.y + 70), ID.BasicEnemy, this.handler));
/*    */     
/*    */     } 
/* 48 */     if (this.x <= 0.0F || this.x >= 672.0F) this.velX *= -1.0F;
/*    */     
/* 50 */     if (this.startLevel != HUD.level) this.handler.removeObj(this);
/*    */     
/* 52 */     this.handler.addObj(new Trail(this.x, this.y, 128, 128, 0.045F, ID.Trail, this.handler, Color.red));
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 57 */     g.setColor(Color.red);
/* 58 */     g.fillRect((int)this.x, (int)this.y, 128, 128);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 63 */     return new Rectangle((int)this.x, (int)this.y, 128, 128);
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/BossEnemy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */