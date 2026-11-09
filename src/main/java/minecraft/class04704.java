package minecraft;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04704 extends class05407 {
   private static final Logger N = LogUtils.getLogger();
   private static final ReentrantLock y = new ReentrantLock();
   private static final int L = 200;
   private static final int u = 80;
   private static final int i = 95;
   private static final int R = 1;
   private final class05096 M;
   private final class04945 B;
   private final class00392 Z;
   private final RateLimiter z;
   private class05362 U;
   private final String E;
   private final class04741 W;
   @Nullable
   private volatile class00392 m;
   private volatile class00392 P = class00392.L("mco.download.preparing");
   @Nullable
   private volatile String s;
   private volatile boolean T;
   private volatile boolean b = true;
   private volatile boolean j;
   private volatile boolean v;
   @Nullable
   private Long n;
   @Nullable
   private Long t;
   private long e;
   private int H;
   private static final String[] c = new String[]{"", ".", ". .", ". . ."};
   private int X;
   private boolean a;
   private final BooleanConsumer p;

   private void L(class01054 var1) {
      if (this.H % 20 == 0) {
         if (this.n != null) {
            long ix = class07536.L() - this.t;
            if (ix == 0L) {
               ix = 1L;
            }

            this.e = 1000L * (this.W.N - this.n) / ix;
            this.N(var1, this.e);
         }

         this.n = this.W.N;
         this.t = class07536.L();
      } else {
         this.N(var1, this.e);
      }
   }

   private void L() {
      new Thread(() -> {
         try {
            try {
               if (!y.tryLock(1L, TimeUnit.SECONDS)) {
                  this.P = class00392.L("mco.download.failed");
                  return;
               }

               if (this.T) {
                  this.u();
                  return;
               }

               this.P = class00392.N("mco.download.downloading", this.E);
               class05101 class05101 = new class05101();
               class05101.N(this.B, this.E, this.W, this.field_22787.NL());

               while (!class05101.y()) {
                  if (class05101.L()) {
                     class05101.N();
                     this.m = class00392.L("mco.download.failed");
                     this.U.method_25355(class05220.u);
                     return;
                  }

                  if (class05101.u()) {
                     if (!this.v) {
                        this.P = class00392.L("mco.download.extracting");
                     }

                     this.v = true;
                  }

                  if (this.T) {
                     class05101.N();
                     this.u();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException interruptedexception) {
                     N.error("Failed to check Realms backup download status");
                  }
               }

               this.j = true;
               this.P = class00392.L("mco.download.done");
               this.U.method_25355(class05220.u);
               return;
            } catch (InterruptedException interruptedexception1) {
               N.error("Could not acquire upload lock");
            } catch (Exception exception) {
               this.m = class00392.L("mco.download.failed");
               N.info("Exception while downloading world", exception);
            }
         } finally {
            if (!y.isHeldByCurrentThread()) {
               return;
            } else {
               y.unlock();
               this.b = false;
               this.j = true;
            }
         }
      }).start();
   }

   public class04704(class05096 var1, class04945 var2, String var3, BooleanConsumer var4) {
      super(class05153.N);
      this.p = var4;
      this.M = var1;
      this.E = var3;
      this.B = var2;
      this.W = new class04741();
      this.Z = class00392.L("mco.download.title");
      this.z = RateLimiter.create(0.1F);
   }

   private void u() {
      this.P = class00392.L("mco.download.cancelled");
   }

   private void y(class01054 var1) {
      double d0 = Math.min((double)this.W.N / this.W.y, 1.0);
      this.s = String.format(Locale.ROOT, "%.1f", d0 * 100.0);
      int ix = (this.field_22789 - 200) / 2;
      int jx = ix + (int)Math.round(200.0 * d0);
      var1.N(ix - 1, 79, jx + 1, 96, -1);
      var1.N(ix, 80, jx, 95, -8355712);
      var1.N(this.field_22793, class00392.N("mco.download.percent", this.s), this.field_22789 / 2, 84, -1);
   }

   private class00392 y() {
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(this.Z);
      arraylist.add(this.P);
      if (this.s != null) {
         arraylist.add(class00392.N("mco.download.percent", this.s));
         arraylist.add(class00392.N("mco.download.speed.narration", class04701.y(this.e)));
      }

      if (this.m != null) {
         arraylist.add(this.m);
      }

      return class05220.N(arraylist);
   }

   private void N(class01054 var1, long var2) {
      if (var2 > 0L) {
         int ix = this.field_22793.y(this.s);
         var1.y(this.field_22793, class00392.N("mco.download.speed", class04701.y(var2)), this.field_22789 / 2 + ix / 2 + 15, 84, -1);
      }
   }

   private void N(class01054 var1) {
      int ix = this.field_22793.N(this.P);
      if (this.H != 0 && this.H % 10 == 0) {
         this.X++;
      }

      var1.y(this.field_22793, c[this.X % c.length], this.field_22789 / 2 + ix / 2 + 5, 50, -1);
   }

   private long N(String var1) {
      return class05101.N(var1).orElse(0L);
   }

   private void N() {
      if (!this.j && !this.a) {
         this.a = true;
         if (this.N(this.B.N()) >= 5368709120L) {
            class05216 class05216 = class00392.N("mco.download.confirmation.oversized", class04701.y(5368709120L));
            this.field_22787.N(class02252.L(this, class05216, var1x -> {
               this.field_22787.N(this);
               this.L();
            }));
         } else {
            this.L();
         }
      }
   }

   @Override
   public void method_25426() {
      this.U = this.method_37063(
         class05362.method_46430(class05220.i, var1 -> this.method_25419()).N((this.field_22789 - 200) / 2, this.field_22790 - 42, 200, 20).N()
      );
      this.N();
   }

   @Override
   public void method_25393() {
      super.method_25393();
      this.H++;
      if (this.P != null && this.z.tryAcquire(1)) {
         class00392 class00392 = this.y();
         this.field_22787.NT().u(class00392);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.Z, this.field_22789 / 2, 20, -1);
      var1.N(this.field_22793, this.P, this.field_22789 / 2, 50, -1);
      if (this.b) {
         this.N(var1);
      }

      if (this.W.N != 0L && !this.T) {
         this.y(var1);
         this.L(var1);
      }

      if (this.m != null) {
         var1.N(this.field_22793, this.m, this.field_22789 / 2, 110, -65536);
      }
   }

   @Override
   public void method_25419() {
      this.T = true;
      if (this.j && this.p != null && this.m == null) {
         this.p.accept(true);
      }

      this.field_22787.N(this.M);
   }
}
