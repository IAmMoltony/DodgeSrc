/*    */ package dodgethemall.main;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.awt.Component;
/*    */ import java.awt.Dimension;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Window
/*    */   extends Canvas
/*    */ {
/*    */   public Window(int w, int h, String title, Game game) {
/*    */     try {
/* 17 */       JFrame frame = new JFrame(title);
/* 18 */       frame.setPreferredSize(new Dimension(w, h));
/* 19 */       frame.setMaximumSize(new Dimension(w, h));
/* 20 */       frame.setMinimumSize(new Dimension(w, h));
/* 21 */       frame.setDefaultCloseOperation(3);
/* 22 */       frame.setIconImage((new ImageIcon(getClass().getResource("icon.png"))).getImage());
/* 23 */       frame.setResizable(false);
/* 24 */       frame.setLocationRelativeTo((Component)null);
/* 25 */       frame.add(game);
/* 26 */       frame.setVisible(true);
/* 27 */       game.start();
/* 28 */     } catch (Exception ex) {
               // "Poor english" lmao
/* 29 */       JOptionPane.showMessageDialog(null, "Game failed to start. The problem is " + ex + ". Please reinstall the game, if you got it several times. If it does not work, contact the game's developer. (Sorry for poor english)", "Oh no!", 0);
/* 30 */       ex.printStackTrace();
/* 31 */       System.exit(1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/Window.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
