package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07623 {
   private static final int N = 20;
   private static final int T = 100;
   private static final float b = 0.25F;
   protected final class07079 y;
   protected final class07299 L;
   @Nullable
   protected class00143 u;
   protected double i;
   protected int R;
   protected int M;
   protected class06889 B = class06889.L;
   protected class00753 Z = class00753.field_11176;
   protected long z;
   protected long U;
   protected double E;
   protected float W = 0.5F;
   protected boolean m;
   protected long P;
   protected class02119 s;
   @Nullable
   private class07209 j;
   private int v;
   private float n = 1.0F;
   private final class07068 t;
   private boolean G;
   private float l = 16.0F;

   protected abstract class06889 L();

   private boolean L(class06889 var1) {
      if (this.u.R() + 1 >= this.u.i()) {
         return false;
      } else {
         class06889 class06889xxxx = class06889.L(this.u.M());
         if (!var1.N((class00737)class06889xxxx, 2.0)) {
            return false;
         } else if (this.N(var1, this.u.N(this.y))) {
            return true;
         } else {
            class06889 class06889x = class06889.L(this.u.u(this.u.R() + 1));
            class06889 class06889xx = class06889xxxx.u(var1);
            class06889 class06889xxx = class06889x.u(var1);
            double d0 = class06889xx.B();
            boolean flag = class06889xxx.B() < d0;
            boolean flag1 = d0 < 0.5;
            if (!flag && !flag1) {
               return false;
            } else {
               class06889 class06889xxxx = class06889xx.u();
               return class06889xxx.u().y(class06889xxxx) < 0.0;
            }
         }
      }
   }

   @Nullable
   public class07209 M() {
      return this.j;
   }

   public class02119 P() {
      return this.s;
   }

   public float T() {
      return this.W;
   }

   public class07623(class07079 var1, class07299 var2) {
      super();
      this.y = var1;
      this.L = var2;
      this.t = this.N(class04995.N(var1.method_45326(class05298.P) * 16.0));
      if (var2 instanceof class04782) {
         class06954 class06954 = ((class04782)var2).method_8503().yV();
         this.t.N(() -> class06954.N(class00429.R));
      }
   }

   public void B() {
      if (this.L.N() - this.P > 20L) {
         if (this.j != null) {
            this.u = null;
            this.u = this.N(this.j, this.v);
            this.N(null);
            this.P = this.L.N();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public class00143 Z() {
      return this.u;
   }

   public void i() {
      int ix = class04995.y(this.j() * 16.0F);
      this.t.N(ix);
   }

   public boolean b() {
      return this.G;
   }

   public boolean s() {
      return this.s.R();
   }

   private void n() {
      this.Z = class00753.field_11176;
      this.z = 0L;
      this.E = 0.0;
      this.G = false;
   }

   protected void m() {
      if (this.u != null) {
         for (int ix = 0; ix < this.u.i(); ix++) {
            class01763 class01763x = this.u.N(ix);
            class01763 class01763x = ix + 1 < this.u.i() ? this.u.N(ix + 1) : null;
            if (this.L.method_8320(new class07209(class01763x.N, class01763x.y, class01763x.L)).N(class01210.yd)) {
               this.u.N(ix, class01763x.N(class01763x.N, class01763x.y + 1, class01763x.L));
               if (class01763x != null && class01763x.y >= class01763x.y) {
                  this.u.N(ix + 1, class01763x.N(class01763x.N, class01763x.y + 1, class01763x.L));
               }
            }
         }
      }
   }

   private void v() {
      this.n();
      this.W();
   }

   private float j() {
      return Math.max((float)this.y.method_45325(class05298.P), this.l);
   }

   public boolean U() {
      return this.u == null || this.u.L();
   }

   protected void z() {
      class06889 class06889 = this.L();
      this.W = this.y.method_17681() > 0.75F ? this.y.method_17681() / 2.0F : 0.75F - this.y.method_17681() / 2.0F;
      class07209 class07209 = this.u.M();
      double d0 = Math.abs(this.y.method_23317() - (class07209.method_10263() + 0.5));
      double d1 = Math.abs(this.y.method_23318() - class07209.method_10264());
      double d2 = Math.abs(this.y.method_23321() - (class07209.method_10260() + 0.5));
      if (d0 < this.W && d2 < this.W && d1 < 1.0 || this.N(this.u.B().E) && this.L(class06889)) {
         this.u.N();
      }

      this.y(class06889);
   }

   public abstract boolean u();

   protected void y(class06889 var1) {
      if (this.R - this.M > 100) {
         float f = this.y.method_6029() >= 1.0F ? this.y.method_6029() : this.y.method_6029() * this.y.method_6029();
         float f1 = f * 100.0F * 0.25F;
         if (var1.M(this.B) < f1 * f1) {
            this.G = true;
            this.W();
         } else {
            this.G = false;
         }

         this.M = this.R;
         this.B = var1;
      }

      if (this.u != null && !this.u.L()) {
         class07209 class07209 = this.u.M();
         long ix = this.L.N();
         if (class07209.equals(this.Z)) {
            this.z = this.z + (ix - this.U);
         } else {
            this.Z = class07209;
            double d0 = var1.R(class06889.L(this.Z));
            this.E = this.y.method_6029() > 0.0F ? d0 / this.y.method_6029() * 20.0 : 0.0;
         }

         if (this.E > 0.0 && this.z > this.E * 3.0) {
            this.v();
         }

         this.U = ix;
      }
   }

   private void y(CallbackInfo var1) {
      if (this.y.lithium$isRegisteredToWorld()) {
         ((ServerWorldExtended)this.L).lithium$setNavigationInactive(this.y);
      }
   }

   public boolean y(class07209 var1) {
      if (this.m) {
         return false;
      } else if (this.u != null && !this.u.L() && this.u.i() != 0) {
         class01763 class01763 = this.u.u();
         class06889 class06889 = new class06889(
            (class01763.N + this.y.method_23317()) / 2.0, (class01763.y + this.y.method_23318()) / 2.0, (class01763.L + this.y.method_23321()) / 2.0
         );
         return var1.method_19769(class06889, this.u.i() - this.u.R());
      } else {
         return false;
      }
   }

   protected abstract boolean y();

   public void y(float var1) {
      this.n = var1;
   }

   public void y(boolean var1) {
      this.s.y(var1);
   }

   public boolean E() {
      return !this.U();
   }

   public void N(boolean var1) {
      this.s.L(var1);
   }

   @Nullable
   public class00143 N(class07209 var1, int var2, int var3) {
      return this.N(ImmutableSet.of(var1), 8, false, var2, var3);
   }

   @Nullable
   public class00143 N(class07209 var1, int var2) {
      return this.N(ImmutableSet.of(var1), 8, false, var2);
   }

   @Nullable
   public class00143 N(Set<class07209> var1, int var2) {
      return this.N(var1, 8, false, var2);
   }

   public void N(float var1) {
      this.l = var1;
      this.i();
   }

   public boolean N(class07209 var1) {
      class07209 class07209 = var1.method_10074();
      return this.L.method_8320(class07209).t();
   }

   protected static boolean N(class07079 var0, class06889 var1, class06889 var2, boolean var3) {
      class06889 class06889 = new class06889(var2.M, var2.B + var0.method_17682() * 0.5, var2.Z);
      return var0.method_73183().N(new class05862(var1, class06889, class05849.field_17558, var3 ? class05835.field_1347 : class05835.field_1348, var0)).N()
         == class07113.field_1333;
   }

   public void N(double var1) {
      this.i = var1;
   }

   private void N(CallbackInfo var1) {
      if (this.y.lithium$isRegisteredToWorld()) {
         if (this.u == null) {
            ((ServerWorldExtended)this.L).lithium$setNavigationInactive(this.y);
         } else {
            ((ServerWorldExtended)this.L).lithium$setNavigationActive(this.y);
         }
      }
   }

   private void N(class00143 var1, double var2, CallbackInfoReturnable var4) {
      if (this.y.lithium$isRegisteredToWorld()) {
         if (this.u == null) {
            ((ServerWorldExtended)this.L).lithium$setNavigationInactive(this.y);
         } else {
            ((ServerWorldExtended)this.L).lithium$setNavigationActive(this.y);
         }
      }
   }

   @Nullable
   public final class00143 N(double var1, double var3, double var5, int var7) {
      return this.N(class07209.method_49637(var1, var3, var5), var7);
   }

   @Nullable
   public class00143 N(Stream<class07209> var1, int var2) {
      return this.N(var1.collect(Collectors.toSet()), 8, false, var2);
   }

   protected abstract class07068 N(int var1);

   public boolean N(double var1, double var3, double var5, double var7) {
      return this.N(this.N(var1, var3, var5, 1), var7);
   }

   public boolean N(double var1, double var3, double var5, int var7, double var8) {
      return this.N(this.N(var1, var3, var5, var7), var8);
   }

   public boolean N(class07049 var1, double var2) {
      class00143 class00143 = this.N(var1, 1);
      return class00143 != null && this.N(class00143, var2);
   }

   public boolean N(@Nullable class00143 var1, double var2) {
      if (var1 == null) {
         this.u = null;
         this.N(var1, var2, null);
         return false;
      } else {
         if (!var1.N(this.u)) {
            this.u = var1;
         }

         if (this.U()) {
            this.N(var1, var2, null);
            return false;
         } else {
            this.m();
            if (this.u.i() <= 0) {
               this.N(var1, var2, null);
               return false;
            } else {
               this.i = var2;
               class06889 class06889 = this.L();
               this.M = this.R;
               this.B = class06889;
               this.N(var1, var2, null);
               return true;
            }
         }
      }
   }

   public void N() {
      this.R++;
      if (this.m) {
         this.B();
      }

      if (!this.U()) {
         if (this.y()) {
            this.z();
         } else if (this.u != null && !this.u.L()) {
            class06889 class06889xx = this.L();
            class06889 class06889x = this.u.N(this.y);
            if (class06889xx.B > class06889x.B
               && !this.y.method_24828()
               && class04995.N(class06889xx.M) == class04995.N(class06889x.M)
               && class04995.N(class06889xx.Z) == class04995.N(class06889x.Z)) {
               this.u.N();
            }
         }

         if (!this.U()) {
            class06889 class06889 = this.u.N(this.y);
            this.y.F().N(class06889.M, this.N(class06889), class06889.Z, this.i);
         }
      }
   }

   protected double N(class06889 var1) {
      class07209 class07209 = class07209.method_49638(var1);
      return this.L.method_8320(class07209.method_10074()).P() ? var1.B : class07955.N(this.L, class07209);
   }

   protected boolean N(class06889 var1, class06889 var2) {
      return false;
   }

   public boolean N(class04425 var1) {
      return var1 != class04425.field_9 && var1 != class04425.field_5 && var1 != class04425.field_26446;
   }

   @Nullable
   protected class00143 N(Set<class07209> var1, int var2, boolean var3, int var4) {
      return this.N(var1, var2, var3, var4, this.j());
   }

   @Nullable
   public class00143 N(class07049 var1, int var2) {
      return this.N(ImmutableSet.of(var1.method_24515()), 16, true, var2);
   }

   @Nullable
   protected class00143 N(Set<class07209> var1, int var2, boolean var3, int var4, float var5) {
      if (var1.isEmpty()) {
         return null;
      } else if (this.y.method_23318() < this.L.method_31607()) {
         return null;
      } else if (!this.y()) {
         return null;
      } else if (this.u != null && !this.u.L() && var1.contains(this.j)) {
         return this.u;
      } else {
         class04643 class04643 = class08700.N();
         class04643.N("pathfind");
         class07209 class07209 = var3 ? this.y.method_24515().method_10084() : this.y.method_24515();
         int ix = (int)(var5 + var2);
         class00783 class00783 = new class00783(this.L, class07209.method_10069(-ix, -ix, -ix), class07209.method_10069(ix, ix, ix));
         class00143 class00143 = this.t.N(class00783, this.y, var1, var5, var4, this.n);
         class04643.L();
         if (class00143 != null && class00143.E() != null) {
            this.j = class00143.E();
            this.v = var4;
            this.n();
         }

         return class00143;
      }
   }

   public void W() {
      this.u = null;
      this.y(null);
   }

   public void R() {
      this.n = 1.0F;
   }
}
