/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SmartEnemy
/*    */   extends GameObject
/*    */ {
/*    */   private Handler handler;
/*    */   private GameObject player;
/*    */   private Game game;
/* 16 */   private Random r = new Random();
/*    */   
/*    */   private BufferedImage enemyImage;
/*    */   
/*    */   public SmartEnemy(int x, int y, ID id, Handler handler, Game game) {
/* 21 */     super(x, y, id);
/* 22 */     this.handler = handler;
/* 23 */     this.game = game;
/*    */     
/* 25 */     for (int i = 0; i < handler.objects.size(); i++) {
/* 26 */       if (((GameObject)handler.objects.get(i)).getID() == ID.Player) {
/* 27 */         this.player = handler.objects.get(i);
/* 28 */         System.out.println(this.player);
/*    */       } 
/*    */     } 
/*    */     
/* 32 */     Spritesheet ss = new Spritesheet(Game.spritesheet);
/* 33 */     this.enemyImage = ss.grabImage(1, 4, 24, 24);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 38 */     this.x += this.velX;
/* 39 */     this.y += this.velY;
/*    */     
/* 41 */     float diffX = this.x - this.player.getX() - 16.0F;
/* 42 */     float diffY = this.y - this.player.getY() - 16.0F;
/* 43 */     float dist = (float)Math.sqrt(((this.x - this.player.getX()) * (this.x - this.player.getX()) + (this.y - this.player.getY()) * (this.y - this.player.getY())));
/*    */     
/* 45 */     this.velX = (float)(-1.0D / dist * diffX);
/* 46 */     this.velY = (float)(-1.0D / dist * diffY);
/*    */     
/* 48 */     if (this.x > 776.0F) this.x = 776.0F; 
/* 49 */     if (this.y > 502.0F) this.y = 502.0F; 
/* 50 */     if (this.x < 0.0F) this.x = 0.0F; 
/* 51 */     if (this.y < 0.0F) this.y = 0.0F;
/*    */ 
/*    */ 
/*    */     
/* 55 */     checkForCollision();
/*    */   }
/*    */   
/*    */   private void checkForCollision() {
/* 59 */     for (GameObject object : this.handler.objects) {
/* 60 */       if (object == this)
/*    */         continue;  try {
/* 62 */         if (object.getBounds().intersects(getBounds())) {
/* 63 */           if (object.getID() == ID.SmartEnemy) {
/* 64 */             this.x = this.r.nextInt(800);
/* 65 */             this.y = this.r.nextInt(502);
/*    */           } 
/* 67 */           if (object.getID() == ID.BossEnemy);
/*    */         }
/*    */       
/*    */       }
/* 71 */       catch (Exception exception) {}
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(Graphics g) {
/* 79 */     g.drawImage(this.enemyImage, (int)this.x, (int)this.y, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public Rectangle getBounds() {
/* 84 */     return new Rectangle((int)this.x, (int)this.y, 24, 24);
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/SmartEnemy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */