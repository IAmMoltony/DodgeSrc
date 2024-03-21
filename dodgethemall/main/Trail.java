/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.AlphaComposite;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Rectangle;
/*    */ 
/*    */ public class Trail
/*    */   extends GameObject {
/* 11 */   private float alpha = 1.0F;
/*    */   
/*    */   private Handler handler;
/*    */   
/*    */   private Color color;
/*    */   
/*    */   public Trail(float x, float y, int w, int h, float l, ID id, Handler handler, Color color) {
/* 18 */     super(x, y, id);
/* 19 */     this.handler = handler;
/* 20 */     this.color = color;
/* 21 */     this.w = w;
/* 22 */     this.h = h;
/* 23 */     this.l = l;
/*    */   }
/*    */   private int w; private int h; private float l;
/*    */   
/*    */   public void tick() {
/* 28 */     if (this.alpha > this.l) {
/* 29 */       this.alpha -= this.l - 1.0E-4F;
/*    */     } else {
/* 31 */       this.handler.removeObj(this);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 37 */     Graphics2D g2d = (Graphics2D)g;
/*    */     
/* 39 */     g2d.setComposite(makeTransparent(this.alpha));
/* 40 */     g.setColor(this.color);
/* 41 */     g.fillRect((int)this.x, (int)this.y, this.w, this.h);
/* 42 */     g2d.setComposite(makeTransparent(1.0F));
/*    */   }
/*    */   
/*    */   private AlphaComposite makeTransparent(float alpha) {
/* 46 */     int type = 3;
/* 47 */     return AlphaComposite.getInstance(type, alpha);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 52 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/Trail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */