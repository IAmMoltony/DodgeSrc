/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class MenuParticle
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/*    */   private Game game;
/*    */   private Color myColor;
/* 15 */   private Random r = new Random();
/*    */   
/* 17 */   private int red = this.r.nextInt(255);
/* 18 */   private int green = this.r.nextInt(255);
/* 19 */   private int blue = this.r.nextInt(255);
/*    */   
/* 21 */   private Color col = new Color(this.red, this.green, this.blue);
/*    */   
/*    */   public MenuParticle(float x, float y, ID id, Handler handler, Game game) {
/* 24 */     super(x, y, id);
/* 25 */     this.handler = handler;
/* 26 */     this.game = game;
/*    */     
/* 28 */     this.myColor = new Color(75, 75, this.r.nextInt(255));
/* 29 */     if (this.myColor.getBlue() <= 90) this.myColor = Color.cyan;
/*    */     
/* 31 */     this.velX = this.r.nextInt(21);
/* 32 */     this.velY = this.r.nextInt(21);
/* 33 */     if (this.velX == 0.0F) {
/* 34 */       this.velX = 5.0F;
/*    */     }
/* 36 */     if (this.velY == 0.0F) {
/* 37 */       this.velY = 5.0F;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 43 */     this.x += this.velX;
/* 44 */     this.y += this.velY;
/*    */     
/* 46 */     if (this.y <= 0.0F || this.y >= 576.0F) this.velY *= -1.0F; 
/* 47 */     if (this.x <= 0.0F || this.x >= 776.0F) this.velX *= -1.0F;
/*    */     
/* 49 */     if (ExtraStuff.showTrail) this.handler.addObj(new Trail(this.x, this.y, 24, 24, 0.04F, ID.Trail, this.handler, this.col));
/*    */     
/* 51 */     if (Game.gameState == Game.STATE.Game) {
/* 52 */       this.handler.removeObj(this);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 58 */     g.setColor(this.col);
/* 59 */     g.fillRect((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 64 */     return new Rectangle((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/MenuParticle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */