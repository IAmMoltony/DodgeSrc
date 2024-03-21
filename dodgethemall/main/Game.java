/*     */ package dodgethemall.main;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.image.BufferStrategy;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.util.Random;
/*     */ import javax.sound.sampled.LineUnavailableException;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Game
/*     */   extends Canvas
/*     */   implements Runnable
/*     */ {
/*     */   private Thread thread;
/*     */   private boolean isRunning = false;
/*     */   private Random r;
/*     */   private Handler handler;
/*     */   private HUD hud;
/*     */   private Spawner spawner;
/*  28 */   public Color backgroundColor = Color.BLACK;
/*     */   private Menu menu;
/*     */   private Shop shop;
/*     */   
/*     */   public enum STATE {
/*  33 */     Menu,
/*  34 */     Help,
/*  35 */     Shop,
/*  36 */     Options,
/*  37 */     Game,
/*  38 */     EndScreen;
/*     */   }
/*     */   
/*  41 */   public static STATE gameState = STATE.Menu;
/*     */   
/*     */   public static boolean paused = false;
/*     */   public boolean pulsingRed = false;
/*     */   public static BufferedImage spritesheet;
/*     */   
/*     */   public Game() {
/*  48 */     this.handler = new Handler(this);
/*  49 */     this.hud = new HUD();
/*  50 */     this.shop = new Shop(this.handler, this.hud);
/*  51 */     this.spawner = new Spawner(this.handler, this.hud, this);
/*  52 */     this.menu = new Menu(this, this.handler);
/*  53 */     addKeyListener(new KeyInput(this.handler, this.spawner));
/*  54 */     addMouseListener(this.menu);
/*  55 */     addMouseListener(this.shop);
/*     */     
              // Start the music
/*     */     try {
/*  58 */       AudioPlayer.playSound("music.wav", true);
/*  59 */     } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|java.io.IOException ex) {
/*  60 */       JOptionPane.showMessageDialog(null, ex + "\n" + ex.getMessage());
/*     */     } 
/*     */     
              // 800x600, my dear and beloved screen resolution.
/*  63 */     Window window = new Window(800, 600, "Dodge them all!", this);
/*     */     
/*  65 */     BufferedImageLoader loader = new BufferedImageLoader();
/*  66 */     spritesheet = loader.loadImage("spritesheet.png");
/*     */     
/*  68 */     this.r = new Random();
/*     */     
/*  70 */     if (gameState == STATE.Game) {
                // Code intended for Fast Testing(tm)
                // Basically, I would hardcode the game state to "Game" during testing
                // so that I can test new stuff a bit faster
/*  71 */       this.handler.addObj(new Player(368, 268, ID.Player, this.handler, this));
/*  72 */       this.handler.addObj(new Coin(this.r.nextInt(784), this.r.nextInt(526), ID.Coin, this.handler));
/*     */     } else {
                // 30 menu particles
/*  74 */       for (int i = 0; i < 30; i++) {
/*  75 */         this.handler.addObj(new MenuParticle(this.r.nextInt(800), this.r.nextInt(526), ID.MenuParticle, this.handler, this));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void throwAnError(Exception ex) {
/*  81 */     System.out.println("An error occured: " + ex + ". Please contact game's developer to solve this problem.");
/*     */   }
/*     */   
/*     */   public void throwAnError(InterruptedException ex) {
              // Yup, InterruptedException has its own overload of this function for some reason
/*  85 */     System.out.println("Interrupted! " + ex + ".");
/*     */   }
/*     */   
/*     */   public synchronized void start() {
/*  89 */     this.thread = new Thread(this);
/*  90 */     this.isRunning = true;
/*  91 */     this.thread.start();
/*     */   }
/*     */   
/*     */   public synchronized void stop() {
/*     */     try {
/*  96 */       this.thread.join();
/*  97 */       this.isRunning = false;
/*  98 */     } catch (InterruptedException ex) {
/*  99 */       throwAnError(ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/* 105 */     requestFocus(); // This makes it so we can control the game instantly after it's started without having to click its window

              // All variables below win the award for least descriptive variable name ever award.
/* 106 */     long lt = System.nanoTime(); // Last time
/* 107 */     double aot = 60.0D; // Something time
/* 108 */     double ns = 1.0E9D / aot; // Nanoseconds
/* 109 */     double dt = 0.0D; // Delta time
/* 110 */     long t = System.currentTimeMillis(); // Current time
/* 111 */     int f = 0; // FPS
/* 112 */     while (this.isRunning) {
/* 113 */       long now = System.nanoTime();
/* 114 */       dt += (now - lt) / ns;
/* 115 */       lt = now;
/* 116 */       while (dt >= 1.0D) {
/* 117 */         tick();
/* 118 */         dt--;
/*     */       } 
/* 120 */       if (this.isRunning) render(); 
/* 121 */       f++;
/*     */       
                // Every second, give FPS to HUD and reset FPS counter
/* 123 */       if (System.currentTimeMillis() - t > 1000L) {
/* 124 */         t += 1000L;
/* 125 */         this.hud.giveFPS(f); // "give fps" lol
/* 126 */         f = 0;
/*     */       } 
/*     */     } 
/* 129 */     stop();
/*     */   }
/*     */   
/*     */   private void tick() {
/* 133 */     if (gameState != STATE.EndScreen && gameState != STATE.Shop && !paused) this.handler.tick(); 
/* 134 */     if (gameState == STATE.Game)
/* 135 */     { this.hud.tick();
/* 136 */       this.spawner.tick();
/* 137 */       if (HUD.HP <= 0) {
/* 138 */         HUD.HP = 100;
/* 139 */         this.menu.setTempLevel(HUD.level);
/* 140 */         this.hud.resetStats();
/* 141 */         this.spawner.resetStats();
/* 142 */         gameState = STATE.EndScreen;
/* 143 */         this.handler.removeEnemies();
/* 144 */         this.handler.removeCoin();
/*     */       }  }
/* 146 */     else if (gameState == STATE.Menu || gameState == STATE.Help || gameState == STATE.Options || gameState == STATE.EndScreen) { this.menu.tick(); }
/*     */ 
/*     */     
/* 149 */     if (HUD.level >= 8 && HUD.level <= 10) {
                // On levels 8-10 inclusive we make the background flash random colors for no reason
/* 150 */       int a = this.r.nextInt(9);
/* 151 */       switch (a) {
/*     */         case 1:
/* 153 */           this.backgroundColor = Color.yellow;
/*     */           return;
/*     */         case 2:
/* 156 */           this.backgroundColor = Color.cyan;
/*     */           return;
/*     */         case 3:
/* 159 */           this.backgroundColor = Color.magenta;
/*     */           return;
/*     */         case 4:
/* 162 */           this.backgroundColor = Color.orange;
/*     */           return;
/*     */         case 5:
/* 165 */           this.backgroundColor = Color.pink;
/*     */           return;
/*     */         case 6:
/* 168 */           this.backgroundColor = Color.red;
/*     */           return;
/*     */         case 7:
/* 171 */           this.backgroundColor = Color.blue;
/*     */           return;
/*     */         case 8:
/* 174 */           this.backgroundColor = Color.gray;
/*     */           return;
/*     */       } 
/* 177 */       this.backgroundColor = Color.black;
/*     */ 
/*     */     
/*     */     }
/* 181 */     else if (gameState != STATE.EndScreen) {
/* 182 */       if (this.pulsingRed) {
/* 183 */         this.backgroundColor = Color.red;
/*     */       } else {
/* 185 */         this.backgroundColor = Color.black;
/*     */       } 
/*     */     } else {
/* 188 */       this.backgroundColor = Color.black;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void render() {
/* 194 */     BufferStrategy bs = getBufferStrategy();
/* 195 */     if (bs == null) {
/* 196 */       createBufferStrategy(3);
/*     */       
/*     */       return;
/*     */     } 
/* 200 */     Graphics g = bs.getDrawGraphics();
/*     */     
/* 202 */     g.setColor(this.backgroundColor);
/* 203 */     g.fillRect(0, 0, 1000, 1000);
/*     */     
/* 205 */     if (gameState == STATE.Game) {
                // Render gandler and HUD
/* 206 */       this.handler.render(g);
/* 207 */       this.hud.render(g);
/* 208 */     } else if (gameState == STATE.Menu || gameState == STATE.Help || gameState == STATE.Options || gameState == STATE.EndScreen) {
                // Render handler and menu
/* 209 */       this.handler.render(g);
/* 210 */       this.menu.render(g);
/* 211 */     } else if (gameState == STATE.Shop) {
                 // Just render the shop
/* 212 */       this.shop.render(g);
/*     */     } 
/*     */     
/* 215 */     if (paused) {
                // Pause screen. Didn't know this game had one :p
/* 216 */       g.setColor(Color.green);
/* 217 */       Font font = new Font("Century Gothic", 1, 50);
/* 218 */       g.setFont(font);
/* 219 */       g.drawString("Paused", 296, 300);
/*     */     } 
/*     */     
/* 222 */     g.dispose();
/* 223 */     bs.show();
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 227 */     Game game = new Game();
/*     */   }
/*     */ }
