/*     */ package dodgethemall.main;
/*     */ 
/*     */ import java.util.Random;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.sound.sampled.LineUnavailableException;
/*     */ 
/*     */ 
/*     */ public class Spawner
/*     */ {
/*     */   private Handler handler;
/*     */   private HUD hud;
/*     */   private Game game;
/*  14 */   private int nextScore = 1000;
/*     */   private Random r;
/*     */   
/*     */   public Spawner(Handler handler, HUD hud, Game game) {
/*  18 */     this.handler = handler;
/*  19 */     this.hud = hud;
/*  20 */     this.r = new Random();
/*     */   }
/*     */   
/*     */   public void createCrazyEnemy() {
/*  24 */     this.handler.addObj(new CrazyEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.CrazyEnemy, this.handler));
/*     */   }
/*     */   
/*     */   public void createBossEnemy() {
/*  28 */     this.handler.addObj(new BossEnemy(400.0F, -120.0F, ID.BossEnemy, this.handler));
/*     */   }
/*     */   
/*     */   public void createBasicEnemy() {
/*  32 */     this.handler.addObj(new BasicEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.BasicEnemy, this.handler));
/*     */   }
/*     */   
/*     */   public void createFastEnemy() {
/*  36 */     this.handler.addObj(new FastEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.FastEnemy, this.handler));
/*     */   }
/*     */   
/*     */   public void createSmartEnemy() {
/*  40 */     this.handler.addObj(new SmartEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.SmartEnemy, this.handler, this.game));
/*     */   }
/*     */   
/*     */   public void createEnemy(int howMany) {
/*  44 */     for (int i = 0; i < howMany; i++) {
/*  45 */       int a = this.r.nextInt(11);
/*  46 */       switch (a) {
/*     */         case 1:
/*  48 */           this.handler.addObj(new BasicEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.BasicEnemy, this.handler));
/*     */           break;
/*     */         case 2:
/*  51 */           this.handler.addObj(new FastEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.FastEnemy, this.handler));
/*     */           break;
/*     */         case 3:
/*  54 */           this.handler.addObj(new CrazyEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.BasicEnemy, this.handler));
/*     */           break;
/*     */         case 4:
/*  57 */           this.handler.addObj(new FastEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.FastEnemy, this.handler));
/*     */           break;
/*     */         case 5:
/*  60 */           this.handler.addObj(new FastEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.FastEnemy, this.handler));
/*     */           break;
/*     */         case 6:
/*  63 */           this.handler.addObj(new BasicEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.BasicEnemy, this.handler));
/*     */           break;
/*     */         case 7:
/*  66 */           this.handler.addObj(new BasicEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.BasicEnemy, this.handler));
/*     */           break;
/*     */         case 8:
/*  69 */           this.handler.addObj(new SmartEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.SmartEnemy, this.handler, this.game));
/*     */           break;
/*     */         case 9:
/*  72 */           this.handler.addObj(new CrazyEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.SmartEnemy, this.handler));
/*     */           break;
/*     */         case 10:
/*  75 */           this.handler.addObj(new SmartEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.SmartEnemy, this.handler, this.game));
/*     */           break;
/*     */         default:
/*  78 */           this.handler.addObj(new FastEnemy(this.r.nextInt(800), this.r.nextInt(502), ID.FastEnemy, this.handler));
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void tick() {
/*  85 */     if (HUD.score >= this.nextScore) {
/*     */       try {
/*  87 */         AudioPlayer.playSound("levelup.wav", false);
/*  88 */       } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/*  89 */         Logger.getLogger(Game.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */       } 
/*  91 */       HUD.score = 0;
/*  92 */       HUD.level++;
/*  93 */       this.nextScore += 500;
/*  94 */       this.hud.addToNS();
/*  95 */       for (GameObject obj : this.handler.objects) {
/*  96 */         if (obj.getID() == ID.Player) {
/*  97 */           obj.velX = (float)(obj.velX + 0.5D);
/*  98 */           obj.velY = (float)(obj.velY + 0.5D);
/*     */         } 
/*     */       } 
/*     */       
/* 102 */       switch (HUD.level) {
/*     */         case 1:
/*     */           return;
/*     */         case 2:
/* 106 */           createEnemy(1);
/*     */         
/*     */         case 3:
/* 109 */           createEnemy(1);
/*     */         
/*     */         case 4:
/* 112 */           createEnemy(1);
/*     */         
/*     */         case 5:
/* 115 */           this.handler.removeEnemies();
/* 116 */           createEnemy(2);
/*     */         
/*     */         case 6:
/* 119 */           createEnemy(3);
/*     */         
/*     */         case 8:
/* 122 */           this.handler.removeEnemies();
/* 123 */           createBossEnemy();
/*     */         
/*     */         case 9:
/* 126 */           this.handler.removeEnemies();
/* 127 */           createBasicEnemy();
/*     */         
/*     */         case 10:
/* 130 */           createSmartEnemy();
/*     */       } 
/*     */       
/* 133 */       createEnemy(1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void resetStats() {
/* 140 */     this.nextScore = 1000;
/*     */   }
/*     */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/Spawner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */