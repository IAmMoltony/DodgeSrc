/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ 
/*    */ public abstract class GameObject
/*    */ {
/*    */   protected float x;
/*    */   protected float y;
/*    */   
/*    */   public GameObject(float x, float y, ID id) {
/* 12 */     this.x = x;
/* 13 */     this.y = y;
/* 14 */     this.id = id;
/*    */   }
/*    */   protected ID id; protected float velX; protected float velY;
/*    */   public abstract void tick();
/*    */   public abstract void render(Graphics paramGraphics);
/*    */   
/*    */   public abstract Rectangle getBounds();
/*    */   
/*    */   public void setX(int x) {
/* 23 */     this.x = x;
/*    */   }
/*    */   
/*    */   public void setY(int y) {
/* 27 */     this.y = y;
/*    */   }
/*    */   
/*    */   public void setPosition(int x, int y) {
/* 31 */     this.x = x;
/* 32 */     this.y = y;
/*    */   }
/*    */   
/*    */   public float getX() {
/* 36 */     return this.x;
/*    */   }
/*    */   
/*    */   public float getY() {
/* 40 */     return this.y;
/*    */   }
/*    */   
/*    */   public void setID(ID id) {
/* 44 */     this.id = id;
/*    */   }
/*    */   
/*    */   public ID getID() {
/* 48 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setVelX(int velX) {
/* 52 */     this.velX = velX;
/*    */   }
/*    */   
/*    */   public void setVelY(int velY) {
/* 56 */     this.velY = velY;
/*    */   }
/*    */   
/*    */   public float getVelX() {
/* 60 */     return this.velX;
/*    */   }
/*    */   
/*    */   public float getVelY() {
/* 64 */     return this.velY;
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/GameObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */