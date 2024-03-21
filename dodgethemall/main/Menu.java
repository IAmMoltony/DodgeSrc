/*     */ package dodgethemall.main;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Menu
/*     */   extends MouseAdapter
/*     */ {
/*     */   private Game game;
/*     */   private Handler handler;
/*  20 */   private Random r = new Random();
/*     */   private final String splash;
/*     */   private int tempLevel;
/*     */   private int splashsize;
/*     */   private int splashsizestep;
/*  25 */   private int timer = 2;
/*  26 */   private int timer2 = 10;
/*     */   
/*     */   public Menu(Game game, Handler handler) {
/*  29 */     this.game = game;
/*  30 */     this.handler = handler;

              // The variable below wins the award for "Worst variable name of all time"
/*  31 */     int a = this.r.nextInt(40); // Choose the splash (I MADE 40 OF THESE???)
/*  32 */     this.splashsize = 24;
/*  33 */     this.splashsizestep = 1;
/*  34 */     switch (a) {
                // Below are the splashes.
                // I don't know how I feel about those.
/*     */       case 1:
/*  36 */         this.splash = "noobs not allowed";
/*     */         return;
/*     */       case 2:
/*  39 */         this.splash = "harder than top 1 extermr demon in geometry dash";
/*     */         return;
/*     */       case 3:
/*  42 */         this.splash = "hardest game you've ever played";
/*     */         return;
/*     */       case 4:
/*  45 */         this.splash = "wavy";
/*     */         return;
/*     */       case 5:
/*  48 */         this.splash = "undefined, i guess";
/*     */         return;
/*     */       case 6:
/*  51 */         this.splash = "public enum STATE {Rage, EvenMoreRage}";
/*     */         return;
/*     */       case 7:
/*  54 */         this.splash = "made in china using undefined";
/*     */         return;
/*     */       case 8:
/*  57 */         this.splash = "variable splash might already have been assigned";
/*     */         return;
/*     */       case 9:
/*  60 */         this.splash = "hotel? trivago";
/*     */         return;
/*     */       case 10:
/*  63 */         this.splash = "\\n";
/*     */         return;
/*     */       case 11:
/*  66 */         this.splash = "this splash is undefined, ok?";
/*     */         return;
/*     */       case 12:
/*  69 */         this.splash = "splash = \"splash = \"splash = \"splash\"\"\"";
/*     */         return;
/*     */       case 13:
/*  72 */         this.splash = "the city is sus";
/*     */         return;
/*     */       case 14:
/*  75 */         this.splash = "oh i forgot break statement";
/*     */         return;
/*     */       case 15:
/*  78 */         this.splash = "do not stay home";
/*     */         return;
/*     */       case 16:
/*  81 */         this.splash = "this is 69th line of code"; // You're wrong :)
/*     */         return;
/*     */       case 17:
/*  84 */         this.splash = "bite of 87???????";
/*     */         return;
/*     */       case 18:
/*  87 */         this.splash = "EPILEPSY WARNING";
/*     */         return;
/*     */       case 19:
/*  90 */         this.splash = "very illegal";
/*     */         return;
/*     */       case 20:
/*  93 */         this.splash = "orange tea in grey cup";
/*     */         return;
/*     */       case 21:
/*  96 */         this.splash = "indated";
/*     */         return;
/*     */       case 22:
/*  99 */         this.splash = "my eyes are hurt";
/*     */         return;
/*     */       case 23:
/* 102 */         this.splash = "indi gejm";
/*     */         return;
/*     */       case 24:
/* 105 */         this.splash = "network beans 12.2";
/*     */         return;
/*     */       case 25:
/* 108 */         this.splash = "this is an option";
/*     */         return;
/*     */       case 26:
/* 111 */         this.splash = "china kitayna";
/*     */         return;
/*     */       case 27:
/* 114 */         this.splash = "python edition coming somewhen";
/*     */         return;
/*     */       case 28:
/* 117 */         this.splash = "#$w@g";
/*     */         return;
/*     */       case 29:
/* 120 */         this.splash = "never gonna give you up never gonna let you down never gonna run around if you reading this then you are you";
/*     */         return;
/*     */       case 30:
/* 123 */         this.splash = "can i get a break from this game?";
/*     */         return;
/*     */       case 31:
/* 126 */         this.splash = "something";
/*     */         return;
/*     */       case 32:
/* 129 */         this.splash = "no more 69 moment"; // Yay, no more 69!
/*     */         return;
/*     */       case 33:
/* 132 */         this.splash = "also try new super mario bros wii";
/*     */         return;
                // I made only 33 of these... the rest are fallback
/*     */     } 
/* 135 */     this.splash = "this is not an option"; // (this is the fallback splash)
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ // The decompiler did this for no reason 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void mousePressed(MouseEvent e) {
              // This part didn't get decompiled!
              // What kind of black magic did I use back in 2021 to achieve such a result?...
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual getX : ()I
/*     */     //   4: istore_2
/*     */     //   5: aload_1
/*     */     //   6: invokevirtual getY : ()I
/*     */     //   9: istore_3
/*     */     //   10: iconst_1
/*     */     //   11: istore #4
/*     */     //   13: aload_0
/*     */     //   14: iload_2
/*     */     //   15: iload_3
/*     */     //   16: sipush #310
/*     */     //   19: sipush #260
/*     */     //   22: sipush #128
/*     */     //   25: bipush #64
/*     */     //   27: invokespecial mouseOver : (IIIIII)Z
/*     */     //   30: ifeq -> 173
/*     */     //   33: aload_0
/*     */     //   34: getfield game : Ldodgethemall/main/Game;
/*     */     //   37: pop
/*     */     //   38: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   41: getstatic dodgethemall/main/Game$STATE.Game : Ldodgethemall/main/Game$STATE;
/*     */     //   44: if_acmpeq -> 173
/*     */     //   47: iconst_0
/*     */     //   48: istore #4
/*     */     //   50: aload_0
/*     */     //   51: getfield game : Ldodgethemall/main/Game;
/*     */     //   54: pop
/*     */     //   55: getstatic dodgethemall/main/Game$STATE.Game : Ldodgethemall/main/Game$STATE;
/*     */     //   58: putstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   61: aload_0
/*     */     //   62: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   65: invokevirtual removeEnemies : ()V
/*     */     //   68: aload_0
/*     */     //   69: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   72: new dodgethemall/main/Player
/*     */     //   75: dup
/*     */     //   76: sipush #368
/*     */     //   79: sipush #268
/*     */     //   82: getstatic dodgethemall/main/ID.Player : Ldodgethemall/main/ID;
/*     */     //   85: aload_0
/*     */     //   86: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   89: aload_0
/*     */     //   90: getfield game : Ldodgethemall/main/Game;
/*     */     //   93: invokespecial <init> : (IILdodgethemall/main/ID;Ldodgethemall/main/Handler;Ldodgethemall/main/Game;)V
/*     */     //   96: invokevirtual addObj : (Ldodgethemall/main/GameObject;)V
/*     */     //   99: aload_0
/*     */     //   100: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   103: new dodgethemall/main/Coin
/*     */     //   106: dup
/*     */     //   107: aload_0
/*     */     //   108: getfield r : Ljava/util/Random;
/*     */     //   111: sipush #784
/*     */     //   114: invokevirtual nextInt : (I)I
/*     */     //   117: i2f
/*     */     //   118: aload_0
/*     */     //   119: getfield r : Ljava/util/Random;
/*     */     //   122: sipush #526
/*     */     //   125: invokevirtual nextInt : (I)I
/*     */     //   128: i2f
/*     */     //   129: getstatic dodgethemall/main/ID.Coin : Ldodgethemall/main/ID;
/*     */     //   132: aload_0
/*     */     //   133: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   136: invokespecial <init> : (FFLdodgethemall/main/ID;Ldodgethemall/main/Handler;)V
/*     */     //   139: invokevirtual addObj : (Ldodgethemall/main/GameObject;)V
/*     */     //   142: ldc 'play.wav'
/*     */     //   144: iconst_0
/*     */     //   145: invokestatic playSound : (Ljava/lang/String;Z)V
/*     */     //   148: goto -> 966
/*     */     //   151: astore #5
/*     */     //   153: ldc dodgethemall/main/Game
/*     */     //   155: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   158: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*     */     //   161: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */     //   164: aconst_null
/*     */     //   165: aload #5
/*     */     //   167: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   170: goto -> 966
/*     */     //   173: aload_0
/*     */     //   174: iload_2
/*     */     //   175: iload_3
/*     */     //   176: sipush #310
/*     */     //   179: sipush #420
/*     */     //   182: sipush #128
/*     */     //   185: bipush #64
/*     */     //   187: invokespecial mouseOver : (IIIIII)Z
/*     */     //   190: ifeq -> 375
/*     */     //   193: aload_0
/*     */     //   194: getfield game : Ldodgethemall/main/Game;
/*     */     //   197: pop
/*     */     //   198: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   201: getstatic dodgethemall/main/Game$STATE.Menu : Ldodgethemall/main/Game$STATE;
/*     */     //   204: if_acmpne -> 220
/*     */     //   207: aconst_null
/*     */     //   208: ldc 'goodbye'
/*     */     //   210: ldc 'never come back'
/*     */     //   212: iconst_0
/*     */     //   213: invokestatic showMessageDialog : (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
/*     */     //   216: iconst_0
/*     */     //   217: invokestatic exit : (I)V
/*     */     //   220: aload_0
/*     */     //   221: getfield game : Ldodgethemall/main/Game;
/*     */     //   224: pop
/*     */     //   225: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   228: getstatic dodgethemall/main/Game$STATE.Help : Ldodgethemall/main/Game$STATE;
/*     */     //   231: if_acmpeq -> 248
/*     */     //   234: aload_0
/*     */     //   235: getfield game : Ldodgethemall/main/Game;
/*     */     //   238: pop
/*     */     //   239: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   242: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   245: if_acmpne -> 259
/*     */     //   248: aload_0
/*     */     //   249: getfield game : Ldodgethemall/main/Game;
/*     */     //   252: pop
/*     */     //   253: getstatic dodgethemall/main/Game$STATE.Menu : Ldodgethemall/main/Game$STATE;
/*     */     //   256: putstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   259: aload_0
/*     */     //   260: getfield game : Ldodgethemall/main/Game;
/*     */     //   263: pop
/*     */     //   264: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   267: getstatic dodgethemall/main/Game$STATE.EndScreen : Ldodgethemall/main/Game$STATE;
/*     */     //   270: if_acmpne -> 966
/*     */     //   273: aload_0
/*     */     //   274: getfield game : Ldodgethemall/main/Game;
/*     */     //   277: pop
/*     */     //   278: getstatic dodgethemall/main/Game$STATE.Game : Ldodgethemall/main/Game$STATE;
/*     */     //   281: putstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   284: aload_0
/*     */     //   285: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   288: invokevirtual removeBoss : ()V
/*     */     //   291: aload_0
/*     */     //   292: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   295: invokevirtual removeEnemies : ()V
/*     */     //   298: aload_0
/*     */     //   299: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   302: new dodgethemall/main/Player
/*     */     //   305: dup
/*     */     //   306: sipush #368
/*     */     //   309: sipush #268
/*     */     //   312: getstatic dodgethemall/main/ID.Player : Ldodgethemall/main/ID;
/*     */     //   315: aload_0
/*     */     //   316: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   319: aload_0
/*     */     //   320: getfield game : Ldodgethemall/main/Game;
/*     */     //   323: invokespecial <init> : (IILdodgethemall/main/ID;Ldodgethemall/main/Handler;Ldodgethemall/main/Game;)V
/*     */     //   326: invokevirtual addObj : (Ldodgethemall/main/GameObject;)V
/*     */     //   329: aload_0
/*     */     //   330: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   333: new dodgethemall/main/Coin
/*     */     //   336: dup
/*     */     //   337: aload_0
/*     */     //   338: getfield r : Ljava/util/Random;
/*     */     //   341: sipush #784
/*     */     //   344: invokevirtual nextInt : (I)I
/*     */     //   347: i2f
/*     */     //   348: aload_0
/*     */     //   349: getfield r : Ljava/util/Random;
/*     */     //   352: sipush #526
/*     */     //   355: invokevirtual nextInt : (I)I
/*     */     //   358: i2f
/*     */     //   359: getstatic dodgethemall/main/ID.Coin : Ldodgethemall/main/ID;
/*     */     //   362: aload_0
/*     */     //   363: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   366: invokespecial <init> : (FFLdodgethemall/main/ID;Ldodgethemall/main/Handler;)V
/*     */     //   369: invokevirtual addObj : (Ldodgethemall/main/GameObject;)V
/*     */     //   372: goto -> 966
/*     */     //   375: aload_0
/*     */     //   376: iload_2
/*     */     //   377: iload_3
/*     */     //   378: sipush #310
/*     */     //   381: sipush #340
/*     */     //   384: sipush #128
/*     */     //   387: bipush #64
/*     */     //   389: invokespecial mouseOver : (IIIIII)Z
/*     */     //   392: ifeq -> 423
/*     */     //   395: aload_0
/*     */     //   396: getfield game : Ldodgethemall/main/Game;
/*     */     //   399: pop
/*     */     //   400: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   403: getstatic dodgethemall/main/Game$STATE.Menu : Ldodgethemall/main/Game$STATE;
/*     */     //   406: if_acmpne -> 423
/*     */     //   409: aload_0
/*     */     //   410: getfield game : Ldodgethemall/main/Game;
/*     */     //   413: pop
/*     */     //   414: getstatic dodgethemall/main/Game$STATE.Help : Ldodgethemall/main/Game$STATE;
/*     */     //   417: putstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   420: goto -> 966
/*     */     //   423: aload_0
/*     */     //   424: iload_2
/*     */     //   425: iload_3
/*     */     //   426: sipush #610
/*     */     //   429: sipush #460
/*     */     //   432: sipush #128
/*     */     //   435: bipush #64
/*     */     //   437: invokespecial mouseOver : (IIIIII)Z
/*     */     //   440: ifeq -> 471
/*     */     //   443: aload_0
/*     */     //   444: getfield game : Ldodgethemall/main/Game;
/*     */     //   447: pop
/*     */     //   448: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   451: getstatic dodgethemall/main/Game$STATE.Help : Ldodgethemall/main/Game$STATE;
/*     */     //   454: if_acmpne -> 471
/*     */     //   457: aload_0
/*     */     //   458: getfield game : Ldodgethemall/main/Game;
/*     */     //   461: pop
/*     */     //   462: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   465: putstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   468: goto -> 966
/*     */     //   471: aload_0
/*     */     //   472: iload_2
/*     */     //   473: iload_3
/*     */     //   474: bipush #30
/*     */     //   476: sipush #300
/*     */     //   479: sipush #128
/*     */     //   482: bipush #64
/*     */     //   484: invokespecial mouseOver : (IIIIII)Z
/*     */     //   487: ifeq -> 585
/*     */     //   490: aload_0
/*     */     //   491: getfield game : Ldodgethemall/main/Game;
/*     */     //   494: pop
/*     */     //   495: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   498: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   501: if_acmpne -> 585
/*     */     //   504: aconst_null
/*     */     //   505: ldc 'Do you want to see trail? Disabling the trail may increase your FPS, but the game will look uglier.'
/*     */     //   507: ldc 'baby shark'
/*     */     //   509: iconst_0
/*     */     //   510: invokestatic showConfirmDialog : (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
/*     */     //   513: istore #5
/*     */     //   515: iload #5
/*     */     //   517: lookupswitch default -> 565, 0 -> 544, 1 -> 551
/*     */     //   544: iconst_1
/*     */     //   545: putstatic dodgethemall/main/ExtraStuff.showTrail : Z
/*     */     //   548: goto -> 582
/*     */     //   551: iconst_0
/*     */     //   552: putstatic dodgethemall/main/ExtraStuff.showTrail : Z
/*     */     //   555: aload_0
/*     */     //   556: getfield handler : Ldodgethemall/main/Handler;
/*     */     //   559: invokevirtual removeTrail : ()V
/*     */     //   562: goto -> 582
/*     */     //   565: new java/lang/NullPointerException
/*     */     //   568: dup
/*     */     //   569: ldc 'Wait. That's illegal.'
/*     */     //   571: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   574: athrow
/*     */     //   575: astore #6
/*     */     //   577: aload #6
/*     */     //   579: invokevirtual printStackTrace : ()V
/*     */     //   582: goto -> 966
/*     */     //   585: aload_0
/*     */     //   586: iload_2
/*     */     //   587: iload_3
/*     */     //   588: sipush #168
/*     */     //   591: sipush #300
/*     */     //   594: sipush #128
/*     */     //   597: bipush #64
/*     */     //   599: invokespecial mouseOver : (IIIIII)Z
/*     */     //   602: ifeq -> 694
/*     */     //   605: aload_0
/*     */     //   606: getfield game : Ldodgethemall/main/Game;
/*     */     //   609: pop
/*     */     //   610: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   613: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   616: if_acmpne -> 694
/*     */     //   619: aconst_null
/*     */     //   620: ldc 'Do you want to enable DevMode? You will unlock some kind of "cheats". But gameplay may be unstable.'
/*     */     //   622: ldc 'mommy shark'
/*     */     //   624: iconst_0
/*     */     //   625: invokestatic showConfirmDialog : (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)I
/*     */     //   628: istore #5
/*     */     //   630: iload #5
/*     */     //   632: lookupswitch default -> 674, 0 -> 660, 1 -> 667
/*     */     //   660: iconst_1
/*     */     //   661: putstatic dodgethemall/main/ExtraStuff.devMode : Z
/*     */     //   664: goto -> 691
/*     */     //   667: iconst_0
/*     */     //   668: putstatic dodgethemall/main/ExtraStuff.devMode : Z
/*     */     //   671: goto -> 691
/*     */     //   674: new java/lang/NullPointerException
/*     */     //   677: dup
/*     */     //   678: ldc 'Wait. That's illegal.'
/*     */     //   680: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   683: athrow
/*     */     //   684: astore #6
/*     */     //   686: aload #6
/*     */     //   688: invokevirtual printStackTrace : ()V
/*     */     //   691: goto -> 966
/*     */     //   694: aload_0
/*     */     //   695: iload_2
/*     */     //   696: iload_3
/*     */     //   697: bipush #30
/*     */     //   699: sipush #180
/*     */     //   702: sipush #128
/*     */     //   705: bipush #64
/*     */     //   707: invokespecial mouseOver : (IIIIII)Z
/*     */     //   710: ifeq -> 762
/*     */     //   713: aload_0
/*     */     //   714: getfield game : Ldodgethemall/main/Game;
/*     */     //   717: pop
/*     */     //   718: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   721: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   724: if_acmpne -> 762
/*     */     //   727: iconst_1
/*     */     //   728: putstatic dodgethemall/main/ExtraStuff.skin : I
/*     */     //   731: ldc 'buysuccess.wav'
/*     */     //   733: iconst_0
/*     */     //   734: invokestatic playSound : (Ljava/lang/String;Z)V
/*     */     //   737: goto -> 966
/*     */     //   740: astore #5
/*     */     //   742: ldc dodgethemall/main/Game
/*     */     //   744: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   747: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*     */     //   750: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */     //   753: aconst_null
/*     */     //   754: aload #5
/*     */     //   756: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   759: goto -> 966
/*     */     //   762: aload_0
/*     */     //   763: iload_2
/*     */     //   764: iload_3
/*     */     //   765: sipush #158
/*     */     //   768: sipush #180
/*     */     //   771: sipush #128
/*     */     //   774: bipush #64
/*     */     //   776: invokespecial mouseOver : (IIIIII)Z
/*     */     //   779: ifeq -> 831
/*     */     //   782: aload_0
/*     */     //   783: getfield game : Ldodgethemall/main/Game;
/*     */     //   786: pop
/*     */     //   787: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   790: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   793: if_acmpne -> 831
/*     */     //   796: iconst_2
/*     */     //   797: putstatic dodgethemall/main/ExtraStuff.skin : I
/*     */     //   800: ldc 'buysuccess.wav'
/*     */     //   802: iconst_0
/*     */     //   803: invokestatic playSound : (Ljava/lang/String;Z)V
/*     */     //   806: goto -> 966
/*     */     //   809: astore #5
/*     */     //   811: ldc dodgethemall/main/Game
/*     */     //   813: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   816: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*     */     //   819: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */     //   822: aconst_null
/*     */     //   823: aload #5
/*     */     //   825: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   828: goto -> 966
/*     */     //   831: aload_0
/*     */     //   832: iload_2
/*     */     //   833: iload_3
/*     */     //   834: sipush #296
/*     */     //   837: sipush #180
/*     */     //   840: sipush #128
/*     */     //   843: bipush #64
/*     */     //   845: invokespecial mouseOver : (IIIIII)Z
/*     */     //   848: ifeq -> 900
/*     */     //   851: aload_0
/*     */     //   852: getfield game : Ldodgethemall/main/Game;
/*     */     //   855: pop
/*     */     //   856: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   859: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   862: if_acmpne -> 900
/*     */     //   865: iconst_3
/*     */     //   866: putstatic dodgethemall/main/ExtraStuff.skin : I
/*     */     //   869: ldc 'buysuccess.wav'
/*     */     //   871: iconst_0
/*     */     //   872: invokestatic playSound : (Ljava/lang/String;Z)V
/*     */     //   875: goto -> 966
/*     */     //   878: astore #5
/*     */     //   880: ldc dodgethemall/main/Game
/*     */     //   882: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   885: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*     */     //   888: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */     //   891: aconst_null
/*     */     //   892: aload #5
/*     */     //   894: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   897: goto -> 966
/*     */     //   900: aload_0
/*     */     //   901: iload_2
/*     */     //   902: iload_3
/*     */     //   903: sipush #444
/*     */     //   906: sipush #180
/*     */     //   909: sipush #128
/*     */     //   912: bipush #64
/*     */     //   914: invokespecial mouseOver : (IIIIII)Z
/*     */     //   917: ifeq -> 966
/*     */     //   920: aload_0
/*     */     //   921: getfield game : Ldodgethemall/main/Game;
/*     */     //   924: pop
/*     */     //   925: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   928: getstatic dodgethemall/main/Game$STATE.Options : Ldodgethemall/main/Game$STATE;
/*     */     //   931: if_acmpne -> 966
/*     */     //   934: iconst_4
/*     */     //   935: putstatic dodgethemall/main/ExtraStuff.skin : I
/*     */     //   938: ldc 'buysuccess.wav'
/*     */     //   940: iconst_0
/*     */     //   941: invokestatic playSound : (Ljava/lang/String;Z)V
/*     */     //   944: goto -> 966
/*     */     //   947: astore #5
/*     */     //   949: ldc dodgethemall/main/Game
/*     */     //   951: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   954: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*     */     //   957: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */     //   960: aconst_null
/*     */     //   961: aload #5
/*     */     //   963: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   966: aload_0
/*     */     //   967: getfield game : Ldodgethemall/main/Game;
/*     */     //   970: pop
/*     */     //   971: getstatic dodgethemall/main/Game.gameState : Ldodgethemall/main/Game$STATE;
/*     */     //   974: getstatic dodgethemall/main/Game$STATE.Shop : Ldodgethemall/main/Game$STATE;
/*     */     //   977: if_acmpne -> 983
/*     */     //   980: iconst_0
/*     */     //   981: istore #4
/*     */     //   983: iload #4
/*     */     //   985: ifeq -> 1016
/*     */     //   988: ldc 'click.wav'
/*     */     //   990: iconst_0
/*     */     //   991: invokestatic playSound : (Ljava/lang/String;Z)V
/*     */     //   994: goto -> 1016
/*     */     //   997: astore #5
/*     */     //   999: ldc dodgethemall/main/Game
/*     */     //   1001: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   1004: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*     */     //   1007: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */     //   1010: aconst_null
/*     */     //   1011: aload #5
/*     */     //   1013: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   1016: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #141	-> 0
/*     */     //   #142	-> 5
/*     */     //   #143	-> 10
/*     */     //   #145	-> 13
/*     */     //   #147	-> 47
/*     */     //   #148	-> 50
/*     */     //   #149	-> 61
/*     */     //   #150	-> 68
/*     */     //   #151	-> 99
/*     */     //   #153	-> 142
/*     */     //   #156	-> 148
/*     */     //   #154	-> 151
/*     */     //   #155	-> 153
/*     */     //   #156	-> 170
/*     */     //   #157	-> 173
/*     */     //   #159	-> 193
/*     */     //   #160	-> 207
/*     */     //   #161	-> 216
/*     */     //   #163	-> 220
/*     */     //   #164	-> 259
/*     */     //   #165	-> 273
/*     */     //   #166	-> 284
/*     */     //   #167	-> 291
/*     */     //   #168	-> 298
/*     */     //   #169	-> 329
/*     */     //   #172	-> 375
/*     */     //   #174	-> 409
/*     */     //   #176	-> 423
/*     */     //   #178	-> 457
/*     */     //   #180	-> 471
/*     */     //   #182	-> 504
/*     */     //   #183	-> 515
/*     */     //   #185	-> 544
/*     */     //   #186	-> 548
/*     */     //   #188	-> 551
/*     */     //   #189	-> 555
/*     */     //   #190	-> 562
/*     */     //   #193	-> 565
/*     */     //   #194	-> 575
/*     */     //   #195	-> 577
/*     */     //   #199	-> 582
/*     */     //   #200	-> 585
/*     */     //   #202	-> 619
/*     */     //   #203	-> 630
/*     */     //   #205	-> 660
/*     */     //   #206	-> 664
/*     */     //   #208	-> 667
/*     */     //   #209	-> 671
/*     */     //   #212	-> 674
/*     */     //   #213	-> 684
/*     */     //   #214	-> 686
/*     */     //   #217	-> 691
/*     */     //   #218	-> 694
/*     */     //   #219	-> 727
/*     */     //   #221	-> 731
/*     */     //   #224	-> 737
/*     */     //   #222	-> 740
/*     */     //   #223	-> 742
/*     */     //   #224	-> 759
/*     */     //   #226	-> 762
/*     */     //   #227	-> 796
/*     */     //   #229	-> 800
/*     */     //   #232	-> 806
/*     */     //   #230	-> 809
/*     */     //   #231	-> 811
/*     */     //   #232	-> 828
/*     */     //   #234	-> 831
/*     */     //   #235	-> 865
/*     */     //   #237	-> 869
/*     */     //   #240	-> 875
/*     */     //   #238	-> 878
/*     */     //   #239	-> 880
/*     */     //   #240	-> 897
/*     */     //   #242	-> 900
/*     */     //   #243	-> 934
/*     */     //   #245	-> 938
/*     */     //   #248	-> 944
/*     */     //   #246	-> 947
/*     */     //   #247	-> 949
/*     */     //   #251	-> 966
/*     */     //   #253	-> 983
/*     */     //   #255	-> 988
/*     */     //   #258	-> 994
/*     */     //   #256	-> 997
/*     */     //   #257	-> 999
/*     */     //   #260	-> 1016
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   153	17	5	ex	Ljava/lang/Exception;
/*     */     //   577	5	6	ex	Ljava/lang/NullPointerException;
/*     */     //   515	67	5	showTrail	I
/*     */     //   686	5	6	ex	Ljava/lang/NullPointerException;
/*     */     //   630	61	5	devMode	I
/*     */     //   742	17	5	ex	Ljava/lang/Exception;
/*     */     //   811	17	5	ex	Ljava/lang/Exception;
/*     */     //   880	17	5	ex	Ljava/lang/Exception;
/*     */     //   949	17	5	ex	Ljava/lang/Exception;
/*     */     //   999	17	5	ex	Ljava/lang/Exception;
/*     */     //   0	1017	0	this	Ldodgethemall/main/Menu;
/*     */     //   0	1017	1	e	Ljava/awt/event/MouseEvent;
/*     */     //   5	1012	2	mx	I
/*     */     //   10	1007	3	my	I
/*     */     //   13	1004	4	playclick	Z
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   142	148	151	javax/sound/sampled/LineUnavailableException
/*     */     //   142	148	151	javax/sound/sampled/UnsupportedAudioFileException
/*     */     //   142	148	151	java/io/IOException
/*     */     //   565	575	575	java/lang/NullPointerException
/*     */     //   674	684	684	java/lang/NullPointerException
/*     */     //   731	737	740	javax/sound/sampled/LineUnavailableException
/*     */     //   731	737	740	javax/sound/sampled/UnsupportedAudioFileException
/*     */     //   731	737	740	java/io/IOException
/*     */     //   800	806	809	javax/sound/sampled/LineUnavailableException
/*     */     //   800	806	809	javax/sound/sampled/UnsupportedAudioFileException
/*     */     //   800	806	809	java/io/IOException
/*     */     //   869	875	878	javax/sound/sampled/LineUnavailableException
/*     */     //   869	875	878	javax/sound/sampled/UnsupportedAudioFileException
/*     */     //   869	875	878	java/io/IOException
/*     */     //   938	944	947	javax/sound/sampled/LineUnavailableException
/*     */     //   938	944	947	javax/sound/sampled/UnsupportedAudioFileException
/*     */     //   938	944	947	java/io/IOException
/*     */     //   988	994	997	javax/sound/sampled/LineUnavailableException
/*     */     //   988	994	997	javax/sound/sampled/UnsupportedAudioFileException
/*     */     //   988	994	997	java/io/IOException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void mouseReleased(MouseEvent e) {}
/*     */ 
/*     */  // decompiler artifact: ton of blank space for some reason
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean mouseOver(int mx, int my, int x, int y, int w, int h) {
/* 268 */     if (mx > x && mx < x + w)
/* 269 */       return (my > y && my < y + h); 
/* 270 */     return false;
/*     */   }
/*     */   
/*     */   public void tick() {
/* 274 */     this.timer--;
/* 275 */     if (this.timer <= 0) {
/* 276 */       this.splashsize += this.splashsizestep;
/* 277 */       if (this.splashsize >= 34 + this.splash.length() / 2 || this.splashsize <= 14 - this.splash.length() / 2) {
/* 278 */         this.splashsizestep *= -1;
/*     */       }
/* 280 */       this.timer = 2;
/*     */     } 
/* 282 */     if (this.splashsize < 1) {
/* 283 */       this.splashsizestep *= -1;
/*     */     }
/*     */   }
/*     */   
/*     */   public void render(Graphics g) {
               // Drawing menus manually is super annoying
/* 288 */     if (null != Game.gameState) { Font fontMain; Font fontButtons; Font fontSplash; Font fontAbout; switch (Game.gameState) {
/*     */         case Menu:
/* 290 */           fontMain = new Font("Century Gothic", 1, 50);
/* 291 */           fontButtons = new Font("Century Gothic", 1, 24);
/* 292 */           fontSplash = new Font("Century Gothic", 1, this.splashsize);
/* 293 */           g.setColor(Color.white);
/* 294 */           g.setFont(fontMain);
/* 295 */           g.drawString("Dodge them all!", 220, 100);
/* 296 */           g.setFont(fontSplash);
/* 297 */           g.setColor(Color.yellow);
/* 298 */           g.drawString(this.splash, 220, 134 + this.splash.length());
/* 299 */           g.setColor(Color.white);
/* 300 */           g.setFont(fontButtons);
/* 301 */           g.drawString("Play", 350, 300);
/* 302 */           g.drawString("Help", 350, 380);
/* 303 */           g.drawString("Exit", 350, 460);
/* 304 */           g.drawRect(310, 260, 128, 64);
/* 305 */           g.drawRect(310, 340, 128, 64);
/* 306 */           g.drawRect(310, 420, 128, 64);
/* 307 */           g.drawString("Copyright 2018-2021 sergeyu. Dodge them all v1.2.", 10, 550);
/*     */           break;
/*     */         
/*     */         case Help:
/* 311 */           fontMain = new Font("Century Gothic", 1, 50);
/* 312 */           fontButtons = new Font("Century Gothic", 1, 16);
/* 313 */           g.setColor(Color.white);
/* 314 */           g.setFont(fontMain);
/* 315 */           g.drawString("Help", 310, 100);
/* 316 */           g.setFont(fontButtons);
/* 317 */           g.drawString("Use WASD/Arrows to move. Avoid enemies (red, blue, pink and gray squares). Pick up coins to", 50, 250);
/* 318 */           g.drawString("increase your score. Good luck!", 230, 270);
/* 319 */           g.drawRect(310, 420, 128, 64);
/* 320 */           g.drawRect(610, 460, 128, 64);
/* 321 */           g.drawString("Back", 350, 460);
/* 322 */           g.drawString("Options", 640, 500);
/* 323 */           fontAbout = new Font("Century Gothic", 1, 24);
/* 324 */           g.setFont(fontAbout);
/* 325 */           g.drawString("Copyright 2018-2021 sergeyu. Dodge them all v1.2.", 10, 550);
/*     */           break;
/*     */         
/*     */         case Options:
/* 329 */           fontMain = new Font("Century Gothic", 1, 50);
/* 330 */           fontButtons = new Font("Century Gothic", 1, 16);
/* 331 */           g.setColor(Color.white);
/* 332 */           g.setFont(fontMain);
/* 333 */           g.drawString("Options", 280, 100);
/* 334 */           g.setFont(fontButtons);
/* 335 */           g.drawString("Trail On/Off", 50, 335);
/* 336 */           g.drawString("DevMode On/Off", 178, 335);
/* 337 */           g.drawString("Standard", 50, 215);
/* 338 */           g.drawString("Geometry Dash", 178, 215);
/* 339 */           g.drawString("Spiral", 326, 215);
/* 340 */           g.drawString("Recursion", 464, 215);
/* 341 */           g.setFont(fontMain);
/* 342 */           g.drawString("Select skin", 30, 150);
/* 343 */           g.setFont(fontButtons);
/* 344 */           g.drawString("Back", 360, 460);
/* 345 */           g.drawRect(30, 300, 128, 64);
/* 346 */           g.drawRect(168, 300, 128, 64);
/* 347 */           g.drawRect(30, 180, 128, 64);
/* 348 */           g.drawRect(168, 180, 128, 64);
/* 349 */           g.drawRect(306, 180, 128, 64);
/* 350 */           g.drawRect(444, 180, 128, 64);
/* 351 */           g.drawRect(310, 420, 128, 64);
/* 352 */           fontAbout = new Font("Century Gothic", 1, 24);
/* 353 */           g.setFont(fontAbout);
/* 354 */           g.drawString("Copyright 2018-2021 sergeyu. Dodge them all v1.2.", 10, 550);
/*     */           break;
/*     */ 
/*     */         
/*     */         case EndScreen:
/* 359 */           fontMain = new Font("Century Gothic", 1, 50);
/* 360 */           fontButtons = new Font("Century Gothic", 1, 24);
/* 361 */           g.setColor(Color.white);
/* 362 */           g.setFont(fontMain);
/* 363 */           g.drawString("Game over", 270, 100);
/* 364 */           g.setFont(fontButtons);
/* 365 */           g.drawString("Game over! Your level is " + this.tempLevel, 50, 250);
/* 366 */           g.drawRect(310, 420, 128, 64);
/* 367 */           g.drawString("Try again", 330, 460);
/*     */           break;
/*     */       }  }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTempLevel(int level) {
/* 376 */     this.tempLevel = level;
/*     */   }
/*     */ }


/* Location:              /home/moltony/dev/DodgeSrc/DodgeThemAll.jar!/dodgethemall/main/Menu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
