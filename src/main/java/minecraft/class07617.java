package minecraft;

import Nursultan.class10750;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07617 extends class07453 {
   public static final double N = 0.6;
   public static final double y = 0.8;
   public static final double L = 1.33;
   private static final class02131<class03556<class03648>> u = class03289.N(class07617.class, class02154.G);
   private static final class02131<Boolean> i = class03289.N(class07617.class, class02154.U);
   private static final class02131<Boolean> R = class03289.N(class07617.class, class02154.U);
   private static final class02131<Integer> M = class03289.N(class07617.class, class02154.y);
   private static final class05946<class03648> p = class08574.y;
   private static final class06563 F = class06563.field_7964;
   @Nullable
   private class07613<class08036> A;
   @Nullable
   private class07960 f;
   private float C;
   private float S;
   private float x;
   private float D;
   private boolean h;
   private float r;
   private float NN;

   private void w() {
      this.S = this.C;
      this.D = this.x;
      if (this.W()) {
         this.C = Math.min(1.0F, this.C + 0.15F);
         this.x = Math.min(1.0F, this.x + 0.08F);
      } else {
         this.C = Math.max(0.0F, this.C - 0.22F);
         this.x = Math.max(0.0F, this.x - 0.13F);
      }
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.ND);
      this.method_66650(var1, class02484.Nh);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(u, class08577.N(this.method_56673(), p));
      var1.N(i, false);
      var1.N(R, false);
      var1.N(M, F.N());
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.f != null && this.f.U() && !this.NQ() && this.field_6012 % 100 == 0) {
         this.method_5783(class04909.iG, 1.0F, 1.0F);
      }

      this.d();
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      class08577.N(var1, this.B());
      var1.N("CollarColor", class06563.field_56666, this.v());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      if (var1 == class02484.ND) {
         return method_66651(var1, this.B());
      } else {
         return var1 == class02484.Nh ? method_66651(var1, this.v()) : super.method_58694(var1);
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class08577.N(var1, class04227.Nf).ifPresent(this::N);
      this.N(var1.<class06563>N("CollarColor", class06563.field_56666).orElse(F));
   }

   @Override
   public boolean method_21749() {
      return this.method_18276() || super.method_21749();
   }

   public class07617(class07078<? extends class07617> var1, class07299 var2) {
      super(var1, var2);
      this.l();
   }

   public class03556<class03648> B() {
      return this.field_6011.N(u);
   }

   public float i(float var1) {
      return class04995.B(var1, this.D, this.x);
   }

   @Nullable
   @Override
   protected class04891 s() {
      if (this.NQ()) {
         if (this.NX()) {
            return class04909.id;
         } else {
            return this.field_5974.y(4) == 0 ? class04909.iw : class04909.ib;
         }
      } else {
         return class04909.ij;
      }
   }

   public void n() {
      this.method_56078(class04909.it);
   }

   @Override
   protected void l() {
      if (this.A == null) {
         this.A = new class07613<>(this, class08036.class, 16.0F, 0.8, 1.33);
      }

      this.e.N(this.A);
      if (!this.NQ()) {
         this.e.N(4, this.A);
      }
   }

   private void d() {
      if ((this.W() || this.m()) && this.field_6012 % 5 == 0) {
         this.method_5783(class04909.id, 0.6F + 0.4F * (this.field_5974.z() - this.field_5974.z()), 1.0F);
      }

      this.w();
      this.Y();
      this.h = false;
      if (this.W()) {
         class07209 class07209 = this.method_24515();
         Iterator<class08036> iterator = this.method_73183().N(class08036.class, new class00734(class07209).L(2.0, 2.0, 2.0)).iterator();

         while (iterator.hasNext()) {
            if (iterator.next().method_6113()) {
               this.h = true;
               break;
            }
         }
      }
   }

   boolean m() {
      return this.field_6011.N(R);
   }

   public static class05300 t() {
      return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, 0.3F).N(class05298.u, 3.0);
   }

   public class06563 v() {
      return class06563.N(this.field_6011.N(M));
   }

   void z(boolean var1) {
      this.field_6011.N(R, var1);
   }

   public float u(float var1) {
      return class04995.B(var1, this.S, this.C);
   }

   private void N(class08036 var1) {
      if (this.field_5974.y(3) == 0) {
         this.u(var1);
         this.Z(true);
         this.method_73183().method_8421(this, (byte)7);
      } else {
         this.method_73183().method_8421(this, (byte)6);
      }
   }

   @Override
   public boolean N(class07633 var1) {
      if (!this.NQ()) {
         return false;
      } else {
         return !(var1 instanceof class07617 class07617) ? false : class07617.NQ() && super.N(var1);
      }
   }

   @Nullable
   public class07617 y(class04782 var1, class07077 var2) {
      class07617 class07617x = class07078.l.N(var1, class06113.field_16466);
      if (class07617x != null && var2 instanceof class07617 class07617x) {
         if (this.field_5974.Z()) {
            class07617x.N(this.B());
         } else {
            class07617x.N(class07617x.B());
         }

         if (this.NQ()) {
            class07617x.a_(this.NI());
            class07617x.N(true, true);
            class06563 class06563x = this.v();
            class06563 class06563x = class07617x.v();
            class07617x.N(class06563.N(var1, class06563x, class06563x));
         }
      }

      return class07617x;
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.Nq);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class06584 class06584 = var1.method_5998(var2);
         class06581 class06581 = class06584.B();
         if (this.NQ()) {
            if (this.L((class07438)var1)) {
               if (class06581 instanceof class06559 class06559) {
                  class06563 class06563 = class06559.N();
                  if (class06563 != this.v()) {
                     if (!this.method_73183().method_8608()) {
                        this.N(class06563);
                        class06584.N(1, var1);
                        this.NW();
                     }

                     return class07082.N;
                  }
               } else if (this.N(class06584) && this.method_6032() < this.method_6063()) {
                  if (!this.method_73183().method_8608()) {
                     this.N(var1, var2, class06584);
                     class05349 class05349 = class06584.method_58694(class02484.d);
                     this.method_6025(class05349 != null ? class05349.N() : 1.0F);
                     this.O();
                  }

                  return class07082.N;
               }

               class07082 class07082x = super.N(var1, var2);
               if (!class07082x.N()) {
                  this.Z(!this.NJ());
                  return class07082.N;
               }

               return class07082x;
            }
         } else if (this.N(class06584)) {
            if (!this.method_73183().method_8608()) {
               this.N(var1, var2, class06584);
               this.N(var1);
               this.NW();
               this.O();
            }

            return class07082.N;
         }

         class07082 class07082 = super.N(var1, var2);
         if (class07082.N()) {
            this.NW();
         }

         return class07082;
      }
   }

   @Override
   public boolean N(double var1) {
      return !this.NQ() && this.field_6012 > 2400;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      var4 = super.N(var1, var2, var3, var4);
      class08577.N(class08579.N(var1, this.method_24515()), class04227.Nf).ifPresent(this::N);
      return var4;
   }

   @Override
   public void N(boolean var1, boolean var2) {
      super.N(var1, var2);
      this.l();
   }

   private void N(class06563 var1) {
      this.field_6011.N(M, var1.N());
   }

   private void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
         class06584 class06584 = var1.method_5998(var2);
         if (this.NQ() && this.L((class07438)var1)) {
            var3.setReturnValue(class07082.N);
         } else {
            var3.setReturnValue(this.N(class06584) && (this.method_6032() < this.method_6063() || !this.NQ()) ? class07082.N : class07082.i);
         }
      }
   }

   public void N(boolean var1) {
      this.field_6011.N(i, var1);
   }

   @Override
   public void N(class04782 var1) {
      if (this.F().y()) {
         double d0 = this.F().L();
         if (d0 == 0.6) {
            this.method_18380(class01312.field_18081);
            this.method_5728(false);
         } else if (d0 == 1.33) {
            this.method_18380(class01312.field_18076);
            this.method_5728(true);
         } else {
            this.method_18380(class01312.field_18076);
            this.method_5728(false);
         }
      } else {
         this.method_18380(class01312.field_18076);
         this.method_5728(false);
      }
   }

   private void N(class03556<class03648> var1) {
      this.field_6011.N(u, var1);
   }

   public boolean W() {
      return this.field_6011.N(i);
   }

   public float R(float var1) {
      return class04995.B(var1, this.NN, this.r);
   }

   @Override
   protected void O() {
      this.method_5783(class04909.in, 1.0F, 1.0F);
   }

   @Override
   public boolean G() {
      return this.h;
   }

   private void Y() {
      this.NN = this.r;
      if (this.m()) {
         this.r = Math.min(1.0F, this.r + 0.1F);
      } else {
         this.r = Math.max(0.0F, this.r - 0.13F);
      }
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.ND) {
         this.N(method_66651(class02484.ND, var2));
         return true;
      } else if (var1 == class02484.Nh) {
         this.N(method_66651(class02484.Nh, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public int m_() {
      return 120;
   }

   @Override
   protected void l_() {
      this.f = new class07615(this, 0.6, var0 -> var0.N(class01226.Nq), true);
      this.e.N(1, new class07427(this));
      this.e.N(1, new class10750(this, 1.5));
      this.e.N(2, new class07958(this));
      this.e.N(3, new class07636(this));
      this.e.N(4, this.f);
      this.e.N(5, new class06097(this, 1.1, 8));
      this.e.N(6, new class07444(this, 1.0, 10.0F, 5.0F));
      this.e.N(7, new class07987(this, 0.8));
      this.e.N(8, new class07982(this, 0.3F));
      this.e.N(9, new class07983(this));
      this.e.N(10, new class07434(this, 0.8));
      this.e.N(11, new class07957(this, 0.8, 1.0000001E-5F));
      this.e.N(12, new class07962(this, class08036.class, 10.0F));
      this.H.N(1, new class07997<>(this, class07879.class, false, null));
      this.H.N(1, new class07997<>(this, class07872.class, false, class07872.y));
   }

   @Override
   public class04891 method_6002() {
      return class04909.iv;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.il;
   }
}
