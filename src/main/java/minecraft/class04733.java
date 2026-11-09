package minecraft;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicReference;
import org.jspecify.annotations.Nullable;

public class class04733 extends class05407 implements class00276 {
   private static final int y = 200;
   private static final int L = 80;
   private static final int u = 95;
   private static final int i = 1;
   private static final String[] R = new String[]{"", ".", ". .", ". . ."};
   private static final class00392 M = class00392.L("mco.upload.verifying");
   private final class04736 B;
   private final class06434 Z;
   @Nullable
   private final class04734 z;
   private final long U;
   private final int E;
   final AtomicReference<class00246> N = new AtomicReference<>();
   private final class05113 W;
   private final RateLimiter m;
   @Nullable
   private volatile class00392[] P;
   private volatile class00392 s = class00392.L("mco.upload.preparing");
   @Nullable
   private volatile String T;
   private volatile boolean b;
   private volatile boolean j;
   private volatile boolean v = true;
   private volatile boolean n;
   @Nullable
   private class05362 t;
   @Nullable
   private class05362 e;
   private int H;
   private final class03686 c = new class03686(this);

   public class04733(@Nullable class04734 var1, long var2, int var4, class04736 var5, class06434 var6) {
      super(class05153.N);
      this.z = var1;
      this.U = var2;
      this.E = var4;
      this.B = var5;
      this.Z = var6;
      this.W = new class05113();
      this.m = RateLimiter.create(0.1F);
   }

   private void Z() {
      Path path = ((File)this.field_22787.l_1).toPath().resolve("saves").resolve(this.Z.N());
      class04980 class04980 = class04980.N(this.Z.M(), this.Z.E().L());
      class00072 class00072 = new class00072(this.E, class04980, List.of(class00064.N(this.Z.M().L())));
      class00246 class00246 = new class00246(path, class00072, this.field_22787.Ny(), this.U, this);
      if (!this.N.compareAndSet(null, class00246)) {
         throw new IllegalStateException("Tried to start uploading but was already uploading");
      } else {
         class00246.N().handleAsync((var1x, var2x) -> {
            if (var2x != null) {
               if (var2x instanceof CompletionException completionexception) {
                  var2x = completionexception.getCause();
               }

               if (var2x instanceof class08688 class08688) {
                  if (class08688.N() != null) {
                     this.s = class08688.N();
                  }

                  this.N(class08688.y());
               } else {
                  this.s = class00392.N("mco.upload.failed", var2x.getMessage());
               }
            } else {
               this.s = class00392.L("mco.upload.done");
               if (this.t != null) {
                  this.t.method_25355(class05220.u);
               }
            }

            this.j = true;
            this.v = false;
            if (this.t != null) {
               this.t.field_22764 = true;
            }

            if (this.e != null) {
               this.e.field_22764 = false;
            }

            this.N.set(null);
            return null;
         }, this.field_22787);
      }
   }

   private void i() {
      this.b = true;
      class00246 class00246 = this.N.get();
      if (class00246 != null) {
         class00246.y();
      } else {
         this.field_22787.N(this.B);
      }
   }

   private void u() {
      this.field_22787.N(new class05092(new class05685(new class04705()), this.U));
   }

   private void y(class01054 var1) {
      this.N(var1, this.W.B());
   }

   @Override
   public void y() {
      this.s = class00392.N("mco.upload.uploading", this.Z.y());
   }

   private void N(@Nullable class00392... var1) {
      this.P = var1;
   }

   @Override
   public class05113 N() {
      return this.W;
   }

   private void N(class01054 var1, long var2) {
      String sx = this.T;
      if (var2 > 0L && sx != null) {
         int ix = this.field_22793.y(sx);
         String s1 = "(" + class04701.y(var2) + "/s)";
         var1.y(this.field_22793, s1, this.field_22789 / 2 + ix / 2 + 15, 84, -1);
      }
   }

   private void N(class01054 var1) {
      double d0 = this.W.R();
      this.T = String.format(Locale.ROOT, "%.1f", d0 * 100.0);
      int ix = (this.field_22789 - 200) / 2;
      int jx = ix + (int)Math.round(200.0 * d0);
      var1.N(ix - 1, 79, jx + 1, 96, -1);
      var1.N(ix, 80, jx, 95, -8355712);
      var1.N(this.field_22793, class00392.N("mco.upload.percent", this.T), this.field_22789 / 2, 84, -1);
   }

   @Override
   public void method_25426() {
      this.t = this.c.y(class05362.method_46430(class05220.U, var1x -> this.u()).N());
      this.t.field_22764 = false;
      this.e = this.c.y(class05362.method_46430(class05220.i, var1x -> this.i()).N());
      if (!this.n) {
         if (this.B.M == -1) {
            this.n = true;
            this.Z();
         } else {
            ArrayList arraylist = new ArrayList();
            if (this.z != null) {
               arraylist.add(this.z);
            }

            arraylist.add(new class04724(this.U, this.B.M, () -> {
               if (!this.n) {
                  this.n = true;
                  this.field_22787.execute(() -> {
                     this.field_22787.N(this);
                     this.Z();
                  });
               }
            }));
            this.field_22787.N(new class04708(this.B, arraylist.toArray(new class05129[0])));
         }
      }

      this.c.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.v() == 256) {
         if (this.v) {
            this.i();
         } else {
            this.u();
         }

         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_48640() {
      this.c.N();
   }

   @Override
   public void method_25393() {
      super.method_25393();
      this.H++;
      this.W.M();
      if (this.m.tryAcquire(1)) {
         class00392 class00392 = this.R();
         this.field_22787.NT().u(class00392);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (!this.j && this.W.u() && this.W.i() && this.e != null) {
         this.s = M;
         this.e.field_22763 = false;
      }

      var1.N(this.field_22793, this.s, this.field_22789 / 2, 50, -1);
      if (this.v) {
         var1.y(this.field_22793, R[this.H / 10 % R.length], this.field_22789 / 2 + this.field_22793.N(this.s) / 2 + 5, 50, -1);
      }

      if (this.W.u() && !this.b) {
         this.N(var1);
         this.y(var1);
      }

      class00392[] aclass00392 = this.P;
      if (aclass00392 != null) {
         for (int ix = 0; ix < aclass00392.length; ix++) {
            var1.N(this.field_22793, aclass00392[ix], this.field_22789 / 2, 110 + 12 * ix, -65536);
         }
      }
   }

   private class00392 R() {
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(this.s);
      if (this.T != null) {
         arraylist.add(class00392.N("mco.upload.percent", this.T));
      }

      class00392[] aclass00392 = this.P;
      if (aclass00392 != null) {
         arraylist.addAll(Arrays.asList(aclass00392));
      }

      return class05220.N(arraylist);
   }
}
