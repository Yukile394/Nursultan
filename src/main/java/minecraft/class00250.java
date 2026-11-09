package minecraft;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.viaversion.viafabricplus.features.entity.r1_8_boat.PositionInterpolator1_8;
import com.viaversion.viafabricplus.features.entity.riding_offset.EntityRidingOffsetsPre1_20_2;
import com.viaversion.viafabricplus.injection.access.entity.r1_8_boat.IAbstractBoat;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00250 extends class01720 implements class02607, IAbstractBoat {
   private static final class02131<Boolean> B = class03289.N(class00250.class, class02154.U);
   private static final class02131<Boolean> Z = class03289.N(class00250.class, class02154.U);
   private static final class02131<Integer> W = class03289.N(class00250.class, class02154.y);
   public static final int N = 0;
   public static final int y = 1;
   private static final int m = 60;
   private static final float P = (float) (Math.PI / 8);
   public static final double L = (float) (Math.PI / 4);
   public static final int u = 60;
   private final float[] s;
   private float T;
   private float b;
   private final class08382 j;
   private boolean v;
   private boolean n;
   private boolean t;
   private boolean G;
   private double l;
   private float d;
   private class00274 w;
   private class00274 k;
   private double Y;
   private boolean Q;
   private boolean O;
   private float g;
   private float I;
   private float J;
   @Nullable
   private class02592 o;
   private final Supplier<class06581> q;
   private final class08382 K = new PositionInterpolator1_8(this);
   private double V = 0.07;
   private int e;
   private class06889 H = class06889.L;

   private void w() {
      if (this.method_5782()) {
         float f = 0.0F;
         if (this.v) {
            this.b--;
         }

         if (this.n) {
            this.b++;
         }

         if (this.n != this.v && !this.t && !this.G) {
            f += 0.005F;
         }

         this.method_36456(this.method_36454() + this.b);
         if (this.t) {
            f += 0.04F;
         }

         if (this.G) {
            f -= 0.005F;
         }

         this.method_18799(
            this.method_18798()
               .y(class04995.m(-this.method_36454() * (float) (Math.PI / 180.0)) * f, 0.0, class04995.P(this.method_36454() * (float) (Math.PI / 180.0)) * f)
         );
         this.N(this.n && !this.v || this.t, this.v && !this.n || this.t);
      }
   }

   public float M() {
      class00734 class00734x = this.method_5829();
      class00734 class00734x = new class00734(class00734x.N, class00734x.y - 0.001, class00734x.L, class00734x.u, class00734x.y, class00734x.R);
      int i = class04995.N(class00734x.N) - 1;
      int jx = class04995.L(class00734x.u) + 1;
      int kx = class04995.N(class00734x.y) - 1;
      int lx = class04995.L(class00734x.i) + 1;
      int i1 = class04995.N(class00734x.L) - 1;
      int j1 = class04995.L(class00734x.R) + 1;
      class00494 class00494 = class00389.N(class00734x);
      float f = 0.0F;
      int k1 = 0;
      class07218 class07218 = new class07218();

      for (int l1 = i; l1 < jx; l1++) {
         for (int i2 = i1; i2 < j1; i2++) {
            int j2 = (l1 != i && l1 != jx - 1 ? 0 : 1) + (i2 != i1 && i2 != j1 - 1 ? 0 : 1);
            if (j2 != 2) {
               for (int k2 = kx; k2 < lx; k2++) {
                  if (j2 <= 0 || k2 != kx && k2 != lx - 1) {
                     class07218.N(l1, k2, i2);
                     class00500 class00500 = this.method_73183().method_8320(class07218);
                     if (!(class00500.i() instanceof class00643)
                        && class00389.L(class00500.M(this.method_73183(), class07218).method_66507(class07218), class00494, class07003.Z)) {
                        f += class00500.i().Z();
                        k1++;
                     }
                  }
               }
            }
         }
      }

      return f / k1;
   }

   private class00274 T() {
      class00274 class00274 = this.n();
      if (class00274 != null) {
         this.l = this.method_5829().i;
         return class00274;
      } else if (this.v()) {
         return class00274.field_7718;
      } else {
         float f = this.M();
         if (f > 0.0F) {
            this.d = f;
            return class00274.field_7719;
         } else {
            return class00274.field_7720;
         }
      }
   }

   @Override
   public class06889 method_30633(class07185 var1, class01009 var2) {
      return class07438.method_31079(super.method_30633(var1, var2));
   }

   @Override
   public class06889 method_24829(class07438 var1) {
      class06889 class06889x = method_24826(this.method_17681() * class04995.M, var1.method_17681(), var1.method_36454());
      double d0 = this.method_23317() + class06889x.M;
      double d1 = this.method_23321() + class06889x.Z;
      class07209 class07209x = class07209.method_49637(d0, this.method_5829().i, d1);
      class07209 class07209x = class07209x.method_10074();
      if (!this.method_73183().z(class07209x)) {
         ArrayList arraylist = Lists.newArrayList();
         double d2 = this.method_73183().L(class07209x);
         if (class05188.N(d2)) {
            arraylist.add(new class06889(d0, class07209x.method_10264() + d2, d1));
         }

         double d3 = this.method_73183().L(class07209x);
         if (class05188.N(d3)) {
            arraylist.add(new class06889(d0, class07209x.method_10264() + d3, d1));
         }

         UnmodifiableIterator<class01312> unmodifiableiterator = var1.method_24831().iterator();

         while (unmodifiableiterator.hasNext()) {
            class01312 class01312 = (class01312)unmodifiableiterator.next();

            for (class06889 class06889x : arraylist) {
               if (class05188.N(this.method_73183(), class06889x, var1, class01312)) {
                  var1.method_18380(class01312);
                  return class06889x;
               }
            }
         }
      }

      return super.method_24829(var1);
   }

   @Override
   public class07211 method_5755() {
      return this.method_5735().R();
   }

   @Override
   public final class06584 method_31480() {
      return new class06584(this.q.get());
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(B, false);
      var1.N(Z, false);
      var1.N(W, 0);
   }

   @Override
   public void method_5773() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.k = this.w;
         this.w = this.T();
         if (this.w != class00274.field_7717 && this.w != class00274.field_7716) {
            this.T = 0.0F;
         } else {
            this.T++;
         }

         if (!this.method_73183().method_8608() && this.T >= 60.0F) {
            this.method_5772();
         }

         if (this.G() > 0) {
            this.y(this.G() - 1);
         }

         if (this.t() > 0.0F) {
            this.y(this.t() - 1.0F);
         }

         super.method_5773();
         this.j.method_66271();
         if (this.method_66247()) {
            if (!(this.method_31483() instanceof class08036)) {
               this.N(false, false);
            }

            this.d();
            if (this.method_73183().method_8608()) {
               this.w();
               this.method_73183().method_8522(new class07377(this.N(0), this.N(1)));
            }

            this.method_5784(class07451.field_6308, this.method_18798());
         } else {
            this.method_18799(class06889.L);
         }

         this.method_61409();
         this.method_61409();
         this.s();

         for (int i = 0; i <= 1; i++) {
            if (this.N(i)) {
               if (!this.method_5701()
                  && this.s[i] % (float) (Math.PI * 2) <= (float) (Math.PI / 4)
                  && (this.s[i] + (float) (Math.PI / 8)) % (float) (Math.PI * 2) >= (float) (Math.PI / 4)) {
                  class04891 class04891 = this.N();
                  if (class04891 != null) {
                     class06889 class06889 = this.method_5828(1.0F);
                     double d0 = i == 1 ? -class06889.Z : class06889.Z;
                     double d1 = i == 1 ? class06889.M : -class06889.M;
                     this.method_73183()
                        .method_43128(
                           null,
                           this.method_23317() + d0,
                           this.method_23318(),
                           this.method_23321() + d1,
                           class04891,
                           this.method_5634(),
                           1.0F,
                           0.8F + 0.4F * this.field_5974.z()
                        );
                  }
               }

               this.s[i] = this.s[i] + (float) (Math.PI / 8);
            } else {
               this.s[i] = 0.0F;
            }
         }

         class07299 class07299 = this.method_73183();
         class00734 class00734 = this.method_5829().L(0.2F, -0.01F, 0.2F);
         Predicate<class07049> predicate = class07042.N(this);
         class00734 class00734x = class00734;
         class07299 class07299x = class07299;
         List list = this.N(class07299x, this, class00734x, predicate);
         if (!list.isEmpty()) {
            boolean flag = !this.method_73183().method_8608() && !(this.method_5642() instanceof class08036);

            for (class07049 class07049 : list) {
               if (!class07049.method_5626(this)) {
                  if (flag
                     && this.method_5685().size() < this.Z()
                     && !class07049.method_5765()
                     && this.N(class07049)
                     && class07049 instanceof class07438
                     && !class07049.method_5864().N(class01217.a)) {
                     class07049.method_5804(this);
                  } else {
                     this.method_5697(class07049);
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_5650(class07062 var1) {
      if (!this.method_73183().method_8608() && var1.N() && this.g_()) {
         this.yU();
      }

      super.method_5650(var1);
   }

   @Override
   public void method_5644(class07049 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.y(var1);
      }
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.Y = this.method_18798().B;
         if (!this.method_5765()) {
            if (var3) {
               this.method_38785();
            } else if (!this.method_73183().method_8316(this.method_24515().method_10074()).N(class01231.N) && var1 < 0.0) {
               this.field_6017 -= (float)var1;
            }
         }
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   @Nullable
   @Override
   public class07438 method_5642() {
      class07049 class07049 = this.method_31483();
      return class07049 instanceof class07438 ? (class07438)class07049 : super.method_5642();
   }

   @Override
   public boolean method_5869() {
      return this.w == class00274.field_7717 || this.w == class00274.field_7716;
   }

   @Override
   protected double method_7490() {
      return 0.04;
   }

   @Override
   public void method_5697(class07049 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (var1 instanceof class00250) {
            if (var1.method_5829().y < this.method_5829().i) {
               super.method_5697(var1);
            }
         } else if (var1.method_5829().y <= this.method_5829().y) {
            super.method_5697(var1);
         }
      }
   }

   @Override
   public boolean method_5810() {
      return true;
   }

   @Override
   protected void method_5652(class08329 var1) {
      this.N(var1, this.o);
   }

   @Override
   public boolean method_5863() {
      return !this.method_31481();
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      class07082 class07082 = this.N(this, var1, var2);
      if (class07082 != class07082.i) {
         return class07082;
      } else {
         return (class07082)(var1.method_21823() || !(this.T < 60.0F) || !this.method_73183().method_8608() && !var1.method_5804(this)
            ? class07082.i
            : class07082.N);
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(var1);
   }

   @Override
   public boolean method_30948(@Nullable class07049 var1) {
      return true;
   }

   @Override
   public boolean method_30949(class07049 var1) {
      return N(this, var1);
   }

   @Override
   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      float f = this.B();
      if (this.method_5685().size() > 1) {
         if (this.method_5685().indexOf(var1) == 0) {
            f = 0.2F;
         } else {
            f = -0.6F;
         }

         if (var1 instanceof class07633) {
            f += 0.2F;
         }
      }

      return new class06889(0.0, this.N(var2), f).y(-this.method_36454() * (float) (Math.PI / 180.0));
   }

   @Override
   protected boolean method_5818(class07049 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : this.method_5685().size() < this.Z() && !this.method_5777(class01231.N);
   }

   @Override
   protected void method_5865(class07049 var1, class07067 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         super.method_5865(var1, var2);
         if (!var1.method_5864().N(class01217.v)) {
            var1.method_36456(var1.method_36454() + this.b);
            var1.method_5847(var1.method_5791() + this.b);
            this.y(var1);
            if (var1 instanceof class07633 && this.method_5685().size() == this.Z()) {
               int i = var1.method_5628() % 2 == 0 ? 90 : 270;
               var1.method_5636(((class07633)var1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 + i);
               var1.method_5847(var1.method_5791() + i);
            }
         }
      }
   }

   @Override
   public class08382 method_66233() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class08382)callbackinforeturnable.getReturnValue() : this.j;
   }

   @Override
   public void method_5750(class06889 var1) {
      super.method_5750(var1);
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         this.H = var1;
      }
   }

   @Override
   public void method_5879(float var1) {
      this.L(-this.l());
      this.y(10);
      this.y(this.t() * 11.0F);
   }

   @Override
   public void method_5700(boolean var1, class07209 var2) {
      if (this.method_73183() instanceof class04782) {
         this.Q = true;
         this.O = var1;
         if (this.k() == 0) {
            this.u(60);
         }
      }

      if (!this.method_5869() && this.field_5974.y(100) == 0) {
         this.method_73183()
            .method_8486(
               this.method_23317(),
               this.method_23318(),
               this.method_23321(),
               this.method_5625(),
               this.method_5634(),
               1.0F,
               0.8F + 0.4F * this.field_5974.z(),
               false
            );
         this.method_73183()
            .method_8406(
               class07107.NT, this.method_23317() + this.field_5974.z(), this.method_23318() + 0.7, this.method_23321() + this.field_5974.z(), 0.0, 0.0, 0.0
            );
         this.method_32875(class01194.X, this.method_5642());
      }
   }

   public class00250(class07078<? extends class00250> var1, class07299 var2, Supplier<class06581> var3) {
      super(var1, var2);
      this.s = new float[2];
      this.j = new class08382(this, 3);
      this.q = var3;
      this.field_23807 = true;
   }

   protected float B() {
      return 0.0F;
   }

   protected int Z() {
      return 2;
   }

   private void s() {
      if (this.method_73183().method_8608()) {
         int i = this.k();
         if (i > 0) {
            this.g += 0.05F;
         } else {
            this.g -= 0.1F;
         }

         this.g = class04995.N(this.g, 0.0F, 1.0F);
         this.J = this.I;
         this.I = 10.0F * (float)Math.sin(0.5 * this.field_6012) * this.g;
      } else {
         if (!this.Q) {
            this.u(0);
         }

         int jx = this.k();
         if (jx > 0) {
            this.u(--jx);
            if (60 - jx - 1 > 0 && jx == 0) {
               this.u(0);
               class06889 class06889 = this.method_18798();
               if (this.O) {
                  this.method_18799(class06889.y(0.0, -0.7, 0.0));
                  this.method_5772();
               } else {
                  this.method_18800(class06889.M, this.method_5703(var0 -> var0 instanceof class08036) ? 2.7 : 0.6, class06889.Z);
               }
            }

            this.Q = false;
         }
      }
   }

   @Nullable
   private class00274 n() {
      class00734 class00734 = this.method_5829();
      double d0 = class00734.i + 0.001;
      int i = class04995.N(class00734.N);
      int jx = class04995.L(class00734.u);
      int kx = class04995.N(class00734.i);
      int lx = class04995.L(d0);
      int i1 = class04995.N(class00734.L);
      int j1 = class04995.L(class00734.R);
      boolean flag = false;
      class07218 class07218 = new class07218();

      for (int k1 = i; k1 < jx; k1++) {
         for (int l1 = kx; l1 < lx; l1++) {
            for (int i2 = i1; i2 < j1; i2++) {
               class07218.N(k1, l1, i2);
               class04688 class04688 = this.method_73183().method_8316(class07218);
               if (class04688.N(class01231.N) && d0 < class07218.method_10264() + class04688.N(this.method_73183(), class07218)) {
                  if (!class04688.u()) {
                     return class00274.field_7716;
                  }

                  flag = true;
               }
            }
         }
      }

      return flag ? class00274.field_7717 : null;
   }

   private void d() {
      double d0 = -this.method_56989();
      double d1 = 0.0;
      float f = 0.05F;
      if (this.k == class00274.field_7720 && this.w != class00274.field_7720 && this.w != class00274.field_7719) {
         this.l = this.method_23323(1.0);
         double d2 = this.R() - this.method_17682() + 0.101;
         class00734 class00734 = this.method_5829().u(0.0, d2 - this.method_23318(), 0.0);
         class07299 class07299 = this.method_73183();
         if (this.N(class07299, this, class00734)) {
            this.method_5814(this.method_23317(), d2, this.method_23321());
            this.method_18799(this.method_18798().u(1.0, 0.0, 1.0));
            this.Y = 0.0;
         }

         this.w = class00274.field_7718;
      } else {
         if (this.w == class00274.field_7718) {
            d1 = (this.l - this.method_23318()) / this.method_17682();
            f = 0.9F;
         } else if (this.w == class00274.field_7716) {
            d0 = -7.0E-4;
            f = 0.9F;
         } else if (this.w == class00274.field_7717) {
            d1 = 0.01F;
            f = 0.45F;
         } else if (this.w == class00274.field_7720) {
            f = 0.9F;
         } else if (this.w == class00274.field_7719) {
            f = this.d;
            if (this.method_5642() instanceof class08036) {
               this.d /= 2.0F;
            }
         }

         class06889 class06889x = this.method_18798();
         this.method_18800(class06889x.M * f, class06889x.B + d0, class06889x.Z * f);
         this.b *= f;
         if (d1 > 0.0) {
            class06889 class06889x = this.method_18798();
            this.method_18800(class06889x.M, (class06889x.B + d1 * (this.method_7490() / 0.65)) * 0.75, class06889x.Z);
         }
      }
   }

   private int k() {
      return this.field_6011.N(W);
   }

   private boolean v() {
      class00734 class00734 = this.method_5829();
      int i = class04995.N(class00734.N);
      int jx = class04995.L(class00734.u);
      int kx = class04995.N(class00734.y);
      int lx = class04995.L(class00734.y + 0.001);
      int i1 = class04995.N(class00734.L);
      int j1 = class04995.L(class00734.R);
      boolean flag = false;
      this.l = -Double.MAX_VALUE;
      class07218 class07218 = new class07218();

      for (int k1 = i; k1 < jx; k1++) {
         for (int l1 = kx; l1 < lx; l1++) {
            for (int i2 = i1; i2 < j1; i2++) {
               class07218.N(k1, l1, i2);
               class04688 class04688 = this.method_73183().method_8316(class07218);
               if (class04688.N(class01231.N)) {
                  float f = l1 + class04688.N(this.method_73183(), class07218);
                  this.l = Math.max((double)f, this.l);
                  flag |= class00734.y < f;
               }
            }
         }
      }

      return flag;
   }

   @Override
   protected final class06581 z() {
      return this.q.get();
   }

   private void u(int var1) {
      this.field_6011.N(W, var1);
   }

   protected void y(class07049 var1) {
      var1.method_5636(this.method_36454());
      float f = class04995.R(var1.method_36454() - this.method_36454());
      float f1 = class04995.N(f, -105.0F, 105.0F);
      var1.field_5982 += f1 - f;
      var1.method_36456(var1.method_36454() + f1 - f);
      var1.method_5847(var1.method_36454());
   }

   private void y(class07049 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var2.cancel();
         super.method_5644(var1);
      }
   }

   public static boolean N(class07049 var0, class07049 var1) {
      return (var1.method_30948(var0) || var1.method_5810()) && !var0.method_5794(var1);
   }

   private List N(class07299 var1, class07049 var2, class00734 var3, Predicate var4) {
      if (var4 == Predicates.alwaysFalse()) {
         return Collections.emptyList();
      } else {
         if (var4 instanceof EntityPushablePredicate entitypushablepredicate) {
            class01129<class07049> class01129 = WorldHelper.getEntityCacheOrNull(var1);
            if (class01129 != null) {
               return WorldHelper.getPushableEntities(var1, class01129, var2, var3, entitypushablepredicate);
            }
         }

         return var1.method_8333(var2, var3, var4);
      }
   }

   private void N(class07049 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var2.cancel();
         super.method_5697(var1);
      }
   }

   private class07082 N(class01720 var1, class08036 var2, class07050 var3) {
      return (class07082)(ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) ? class07082.i : super.method_5688(var2, var3));
   }

   private void N(class07049 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var2.setReturnValue(super.method_5818(var1));
      }
   }

   private void N(class07049 var1, class07067 var2, CallbackInfo var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         class06889 class06889 = EntityRidingOffsetsPre1_20_2.getMountedHeightOffset(this, var1).i(this.method_73189());
         var2.accept(var1, class06889.M, class06889.B + EntityRidingOffsetsPre1_20_2.getHeightOffset(var1), class06889.Z);
         var3.cancel();
      }
   }

   private boolean N(class07299 var1, class07049 var2, class00734 var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) ? true : var1.method_8587(var2, var3);
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var1.setReturnValue(this.K);
      }
   }

   public void N(double var1, double var3, double var5) {
      this.method_5814(var1, var3, var5);
      this.field_6014 = var1;
      this.field_6036 = var3;
      this.field_5969 = var5;
   }

   private void N(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var1.cancel();
         super.method_5773();
         if (this.G() > 0) {
            this.y(this.G() - 1);
         }

         if (this.t() > 0.0F) {
            this.y(this.t() - 1.0F);
         }

         this.field_6014 = this.method_23317();
         this.field_6036 = this.method_23318();
         this.field_5969 = this.method_23321();
         byte b0 = 5;
         double d0 = 0.0;

         for (int i = 0; i < 5; i++) {
            double d1 = this.method_5829().y + this.method_5829().L() * i / 5.0 - 0.125;
            double d3 = this.method_5829().y + this.method_5829().L() * (i + 1) / 5.0 - 0.125;
            class00734 class00734 = new class00734(this.method_5829().N, d1, this.method_5829().L, this.method_5829().u, d3, this.method_5829().R);
            if (class07209.method_29715(class00734).anyMatch(var1x -> this.method_73183().method_8316(var1x).N(class01231.N))) {
               d0 += 0.2;
            }
         }

         double d9 = this.method_18798().Z();
         if (d9 > (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6) ? 0.2625 : 0.2975)) {
            double d2 = Math.cos(this.method_36454() * Math.PI / 180.0);
            double d4 = Math.sin(this.method_36454() * Math.PI / 180.0);

            for (int jx = 0; jx < 1.0 + d9 * 60.0; jx++) {
               double d5 = this.field_5974.z() * 2.0F - 1.0F;
               double d6 = (this.field_5974.y(2) * 2 - 1) * 0.7;
               if (this.field_5974.Z()) {
                  double d7 = this.method_23317() - d2 * d5 * 0.8 + d4 * d6;
                  double d8 = this.method_23321() - d4 * d5 * 0.8 - d2 * d6;
                  this.method_73183()
                     .method_8406(class07107.NT, d7, this.method_23318() - 0.125, d8, this.method_18798().M, this.method_18798().B, this.method_18798().Z);
               } else {
                  double d26 = this.method_23317() + d2 + d4 * d5 * 0.7;
                  double d28 = this.method_23321() + d4 - d2 * d5 * 0.7;
                  this.method_73183()
                     .method_8406(class07107.NT, d26, this.method_23318() - 0.125, d28, this.method_18798().M, this.method_18798().B, this.method_18798().Z);
               }
            }
         }

         if (this.method_73183().method_8608() && !this.method_5782()) {
            if (this.e > 0) {
               class08605 class08605 = this.K.field_55666;
               double d14 = this.method_23317() + (class08605.y.M - this.method_23317()) / this.e;
               double d20 = this.method_23318() + (class08605.y.B - this.method_23318()) / this.e;
               double d23 = this.method_23321() + (class08605.y.Z - this.method_23321()) / this.e;
               double d25 = this.method_36454() + class04995.R(class08605.L - this.method_36454()) / this.e;
               double d27 = this.method_36455() + (class08605.u - this.method_36455()) / this.e;
               this.e--;
               this.method_5814(d14, d20, d23);
               this.method_5710((float)d25, (float)d27);
            } else {
               this.method_5814(
                  this.method_23317() + this.method_18798().M, this.method_23318() + this.method_18798().B, this.method_23321() + this.method_18798().Z
               );
               if (this.method_24828()) {
                  this.method_18799(this.method_18798().L(0.5));
               }

               this.method_18799(this.method_18798().u(0.99, 0.95, 0.99));
            }
         } else {
            if (d0 < 1.0) {
               double d10 = d0 * 2.0 - 1.0;
               this.method_18799(this.method_18798().y(0.0, 0.04 * d10, 0.0));
            } else {
               if (this.method_18798().B < 0.0) {
                  this.method_18799(this.method_18798().u(1.0, 0.5, 1.0));
               }

               this.method_18799(this.method_18798().y(0.0, 0.007, 0.0));
            }

            if (this.method_5642() != null) {
               class07438 class07438 = this.method_5642();
               if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_5_2)) {
                  double d12 = class07438.method_18798().M * this.V;
                  double d18 = class07438.method_18798().Z * this.V;
                  this.method_18799(this.method_18798().y(d12, 0.0, d18));
               } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
                  if (class07438.fields_7212a028292fd3c078969e3ee4c71d9e8_2 > 0.0F) {
                     double d13 = -Math.sin(class07438.method_36454() * Math.PI / 180.0) * this.V * 0.05;
                     double d19 = Math.cos(class07438.method_36454() * Math.PI / 180.0) * this.V * 0.05;
                     this.method_18799(this.method_18798().y(d13, 0.0, d19));
                  }
               } else {
                  float f = class07438.method_36454() - class07438.fields_7212a028292fd3c078969e3ee4c71d9e8_0 * 90.0F;
                  double d15 = -Math.sin(f * Math.PI / 180.0) * this.V * class07438.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * 0.05;
                  double d21 = Math.cos(f * Math.PI / 180.0) * this.V * class07438.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * 0.05;
                  this.method_18799(this.method_18798().y(d15, 0.0, d21));
               }
            }

            double d11 = this.method_18798().Z();
            if (d11 > 0.35) {
               double d16 = 0.35 / d11;
               this.method_18799(this.method_18798().u(d16, 1.0, d16));
               d11 = 0.35;
            }

            if (d11 > d9 && this.V < 0.35) {
               this.V = this.V + (0.35 - this.V) / 35.0;
               if (this.V > 0.35) {
                  this.V = 0.35;
               }
            } else {
               this.V = this.V - (this.V - 0.07) / 35.0;
               if (this.V < 0.07) {
                  this.V = 0.07;
               }
            }

            if (ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_6_4)) {
               for (int lx = 0; lx < 4; lx++) {
                  int i1 = class04995.N(this.method_23317() + (lx % 2 - 0.5) * 0.8);
                  int j1 = class04995.N(this.method_23321() + (lx / 2 - 0.5) * 0.8);

                  for (int k1 = 0; k1 < 2; k1++) {
                     int kx = class04995.N(this.method_23318()) + k1;
                     class07209 class07209 = new class07209(i1, kx, j1);
                     class00891 class00891 = this.method_73183().method_8320(class07209).i();
                     if (class00891 == class00869.is) {
                        this.method_73183().method_8501(class07209, class00869.N.W());
                        this.field_5976 = false;
                     } else if (class00891 == class00869.RS) {
                        this.method_73183().N(class07209, true);
                        this.field_5976 = false;
                     }
                  }
               }
            }

            if (this.method_24828()) {
               this.method_18799(this.method_18798().L(0.5));
            }

            this.method_5784(class07451.field_6308, this.method_18798());
            if (!this.field_5976 || d9 <= 0.2975) {
               this.method_18799(this.method_18798().u(0.99, 0.95, 0.99));
            }

            this.method_36457(0.0F);
            double d17 = this.field_6014 - this.method_23317();
            double d22 = this.field_5969 - this.method_23321();
            if (d17 * d17 + d22 * d22 > 0.001) {
               double d24 = class04995.N(class04995.i(class04995.u(d22, d17) * 180.0 / Math.PI - this.method_36454()), -20.0, 20.0);
               this.method_36456((float)(this.method_36454() + d24));
            }
         }
      }
   }

   private void N(double var1, boolean var3, class00500 var4, class07209 var5, CallbackInfo var6) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
         var6.cancel();
         super.method_5623(var1, var3, var4, var5);
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         this.w = class00274.field_7719;
      }
   }

   public float N(float var1) {
      return class04995.B(var1, this.J, this.I);
   }

   public boolean N(int var1) {
      return this.field_6011.N(var1 == 0 ? B : Z) && this.method_5642() != null;
   }

   public float N(int var1, float var2) {
      return this.N(var1) ? class04995.y(var2, this.s[var1] - (float) (Math.PI / 8), this.s[var1]) : 0.0F;
   }

   @Override
   public void N(@Nullable class02592 var1) {
      this.o = var1;
   }

   public boolean N(class07049 var1) {
      return var1.method_17681() < this.method_17681();
   }

   protected abstract double N(class01325 var1);

   public void N(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.v = var1;
      this.n = var2;
      this.t = var3;
      this.G = var4;
   }

   public void N(boolean var1, boolean var2) {
      this.field_6011.N(B, var1);
      this.field_6011.N(Z, var2);
   }

   @Nullable
   protected class04891 N() {
      return switch (this.T()) {
         case field_7718, field_7717, field_7716 -> class04909.Ld;
         case field_7719 -> class04909.Ll;
         default -> null;
      };
   }

   public class06889 viaFabricPlus$getBoatVelocity() {
      return this.H;
   }

   public void viaFabricPlus$setBoatVelocity(class06889 var1) {
      this.H = var1;
   }

   public float R() {
      class00734 class00734 = this.method_5829();
      int i = class04995.N(class00734.N);
      int jx = class04995.L(class00734.u);
      int kx = class04995.N(class00734.i);
      int lx = class04995.L(class00734.i - this.Y);
      int i1 = class04995.N(class00734.L);
      int j1 = class04995.L(class00734.R);
      class07218 class07218 = new class07218();

      label39:
      for (int k1 = kx; k1 < lx; k1++) {
         float f = 0.0F;

         for (int l1 = i; l1 < jx; l1++) {
            for (int i2 = i1; i2 < j1; i2++) {
               class07218.N(l1, k1, i2);
               class04688 class04688 = this.method_73183().method_8316(class07218);
               if (class04688.N(class01231.N)) {
                  f = Math.max(f, class04688.N(this.method_73183(), class07218));
               }

               if (f >= 1.0F) {
                  continue label39;
               }
            }
         }

         if (f < 1.0F) {
            return class07218.method_10264() + f;
         }
      }

      return lx + 1;
   }

   @Override
   public boolean aa_() {
      return true;
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.88F * this.method_17682(), 0.64F * this.method_17681());
   }

   @Override
   public class06889[] ab_() {
      return class02607.N(this, 0.0, 0.64, 0.382, 0.88);
   }

   @Nullable
   @Override
   public class02592 S_() {
      return this.o;
   }

   public void viaFabricPlus$setBoatInterpolationSteps(int var1) {
      this.e = var1;
   }
}
