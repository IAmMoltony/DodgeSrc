/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.image.BufferedImage;
/*    */ 
/*    */ public class Spritesheet {
/*    */   private BufferedImage sprite;
/*    */   
/*    */   public Spritesheet(BufferedImage ss) {
/*  9 */     this.sprite = ss;
/*    */   }
/*    */   
/*    */   public BufferedImage grabImage(int col, int row, int w, int h) {
/* 13 */     BufferedImage img = this.sprite.getSubimage(row * 32 - 32, col * 32 - 32, w, h);
/* 14 */     return img;
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/Spritesheet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */