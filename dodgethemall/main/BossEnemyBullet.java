/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class BossEnemyBullet
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/* 12 */   private Random r = new Random();
/*    */   
/*    */   public BossEnemyBullet(float x, float y, ID id, Handler handler) {
/* 15 */     super(x, y, id);
/* 16 */     this.handler = handler;
/*    */     
/* 18 */     this.velX = (this.r.nextInt(10) + -5);
/* 19 */     this.velY = 5.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 24 */     this.x += this.velX;
/* 25 */     this.y += this.velY;
/*    */     
/* 27 */     if (this.y >= 576.0F) this.handler.removeObj(this);
/*    */     
/* 29 */     if (ExtraStuff.showTrail) this.handler.addObj(new Trail(this.x, this.y, 24, 24, 0.04F, ID.Trail, this.handler, Color.gray));
/*    */   
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {
/* 34 */     g.setColor(Color.gray);
/* 35 */     g.fillRect((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 40 */     return new Rectangle((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/BossEnemyBullet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */