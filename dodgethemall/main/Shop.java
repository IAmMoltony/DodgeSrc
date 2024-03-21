/*     */ package dodgethemall.main;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.sound.sampled.LineUnavailableException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Shop
/*     */   extends MouseAdapter
/*     */ {
/*     */   Handler handler;
/*     */   HUD hud;
/*  20 */   private int[] boxes = new int[] { 10, 6, 5 }; // Cost of each item (every item gets more expensive each time you buy it)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Shop(Handler handler, HUD hud) {
/*  27 */     this.handler = handler;
/*  28 */     this.hud = hud;
/*     */   }
/*     */   
/*     */   public void render(Graphics g) {
/*  32 */     g.setColor(Color.white);
/*  33 */     g.setFont(new Font("Century Gothic", 0, 48));
/*  34 */     g.drawString("Shop", 300, 50);
/*     */ 
/*     */     
/*  37 */     g.setFont(new Font("Century Gothic", 0, 12));
/*  38 */     g.drawString("Upgrade health", 110, 120);
/*  39 */     g.drawString("Cost: " + this.boxes[0], 110, 140);
/*  40 */     g.drawRect(100, 100, 100, 80);
/*     */ 
/*     */     
/*  43 */     g.drawString("Upgrade speed", 260, 120);
/*  44 */     g.drawString("Cost: " + this.boxes[1], 260, 140);
/*  45 */     g.drawRect(250, 100, 100, 80);
/*     */ 
/*     */     
/*  48 */     g.setFont(new Font("Century Gothic", 0, 12));
/*  49 */     g.drawString("Refill health", 400, 120);
/*  50 */     g.drawString("Cost: " + this.boxes[2], 400, 140);
/*  51 */     g.drawRect(400, 100, 100, 80);
/*     */     
/*  53 */     g.setColor(Color.yellow);
/*  54 */     g.drawString("Coins: " + HUD.coins, 15, 15);
/*  55 */     g.drawString("Press space to go back", 15, 30);
/*     */   }
/*     */ 
/*     */   
/*     */   public void mousePressed(MouseEvent e) {
/*  60 */     int mx = e.getX();
/*  61 */     int my = e.getY();
/*     */     
/*  63 */     if (Game.gameState != Game.STATE.Shop) {
/*     */       return;
/*     */     }
              
              // This is what I call, the most terrible way to handle buttons in game development.
              // Drawing a button manually instead of having a dedicated class that handles input and clicks
              // automatically.
/*  66 */     if (mx >= 100 && mx < 200 && 
/*  67 */       my >= 100 && my <= 180) {
/*  68 */       if (HUD.coins >= this.boxes[0]) {
/*  69 */         HUD.coins -= this.boxes[0];
/*  70 */         this.boxes[0] = this.boxes[0] + this.boxes[0];
/*  71 */         this.hud.bounds += 20;
/*  72 */         HUD.HP = this.hud.bounds / 2 + 100;
/*     */         try {
/*  74 */           AudioPlayer.playSound("buysuccess.wav", false);
/*  75 */         } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/*  76 */           Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */         } 
/*     */       } else {
/*     */         try {
/*  80 */           AudioPlayer.playSound("buyunsuccess.wav", false);
/*  81 */         } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/*  82 */           Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  89 */     if (mx >= 250 && mx < 350 && 
/*  90 */       my >= 100 && my <= 180) {
/*  91 */       if (HUD.coins >= this.boxes[1]) {
/*  92 */         HUD.coins -= this.boxes[1];
/*  93 */         this.boxes[1] = this.boxes[1] + this.boxes[1];
/*  94 */         this.handler.speed++;
/*     */         try {
/*  96 */           AudioPlayer.playSound("buysuccess.wav", false);
/*  97 */         } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/*  98 */           Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */         } 
/*     */       } else {
/*     */         
/*     */         try {
/* 103 */           AudioPlayer.playSound("buyunsuccess.wav", false);
/* 104 */         } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 105 */           Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 112 */     if (mx >= 400 && mx < 500 && 
/* 113 */       my >= 100 && my <= 180)
/* 114 */       if (HUD.coins >= this.boxes[2]) {
/* 115 */         HUD.coins -= this.boxes[2];
/* 116 */         HUD.HP = 100 + this.hud.bounds / 2;
/*     */         try {
/* 118 */           AudioPlayer.playSound("buysuccess.wav", false);
/* 119 */         } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 120 */           Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */         } 
/*     */       } else {
/*     */         try {
/* 124 */           AudioPlayer.playSound("buyunsuccess.wav", false);
/* 125 */         } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/* 126 */           Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */         } 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/Shop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
