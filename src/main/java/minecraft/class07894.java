package minecraft;

import Nursultan.class10750;
import Nursultan.class10844;
import Nursultan.class10861;
import Nursultan.class10862;
import com.viaversion.viafabricplus.features.entity.metadata_handling.WolfHealthTracker1_14_4;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07894 extends class07453 implements class01279 {
   private static final class02131<Boolean> L = class03289.N(class07894.class, class02154.U);
   private static final class02131<Integer> u = class03289.N(class07894.class, class02154.y);
   private static final class02131<Long> i = class03289.N(class07894.class, class02154.L);
   private static final class02131<class03556<class02505>> R = class03289.N(class07894.class, class02154.w);
   private static final class02131<class03556<class08519>> M = class03289.N(class07894.class, class02154.k);
   public static final class01317 N = (var0, var1) -> {
      class07078 class07078 = var0.method_5864();
      return class07078 == class07078.yz || class07078 == class07078.yM || class07078 == class07078.Ni;
   };
   private static final float p = 8.0F;
   private static final float F = 40.0F;
   private static final float A = 0.125F;
   public static final float y = (float) (Math.PI / 5);
   private static final class06563 f = class06563.field_7964;
   private float C;
   private float S;
   private boolean x;
   private boolean D;
   private float h;
   private float r;
   private static final class02135 NN = class01517.N(20, 39);
   @Nullable
   private class08372<class07438> Ny;

   private void w() {
      this.D = false;
      this.h = 0.0F;
      this.r = 0.0F;
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NO);
      this.method_66650(var1, class02484.Ng);
      this.method_66650(var1, class02484.NI);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      class00751 class00751 = this.method_56673().L(class04227.yQ);
      var1.N(R, class08577.N(this.method_56673(), class02503.z));
      var1.N(M, class00751.N(class08526.N).or(class00751::N).orElseThrow());
      var1.N(L, false);
      var1.N(u, f.N());
      var1.N(i, -1L);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_5805()) {
         this.S = this.C;
         if (this.G()) {
            this.C = this.C + (1.0F - this.C) * 0.4F;
         } else {
            this.C = this.C + (0.0F - this.C) * 0.4F;
         }

         if (this.method_5721()) {
            this.x = true;
            if (this.D && !this.method_73183().method_8608()) {
               this.method_73183().method_8421(this, (byte)56);
               this.w();
            }
         } else if ((this.x || this.D) && this.D) {
            if (this.h == 0.0F) {
               this.method_5783(class04909.JM, this.method_6107(), (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
               this.method_32876(class01194.n);
            }

            this.r = this.h;
            this.h += 0.05F;
            if (this.r >= 2.0F) {
               this.x = false;
               this.D = false;
               this.r = 0.0F;
               this.h = 0.0F;
            }

            if (this.h > 0.4F) {
               float fx = (float)this.method_23318();
               int ix = (int)(class04995.m((this.h - 0.4F) * (float) Math.PI) * 7.0F);
               class06889 class06889 = this.method_18798();

               for (int j = 0; j < ix; j++) {
                  float f1 = (this.field_5974.z() * 2.0F - 1.0F) * this.method_17681() * 0.5F;
                  float f2 = (this.field_5974.z() * 2.0F - 1.0F) * this.method_17681() * 0.5F;
                  this.method_73183()
                     .method_8406(class07107.NT, this.method_23317() + f1, fx + 0.8F, this.method_23321() + f2, class06889.M, class06889.B, class06889.Z);
               }
            }
         }
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else {
         this.Z(false);
         return super.method_64397(var1, var2, var3);
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.JB, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("CollarColor", class06563.field_56666, this.t());
      class08577.N(var1, this.l());
      this.N(var1);
      this.d().i().ifPresent(var1x -> var1.N("sound_variant", class05946.N(class04227.yQ), var1x));
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      if (var1 == class02484.NO) {
         return method_66651(var1, this.l());
      } else if (var1 == class02484.Ng) {
         return method_66651(var1, this.d());
      } else {
         return var1 == class02484.NI ? method_66651(var1, this.t()) : super.method_58694(var1);
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class08577.N(var1, class04227.yY).ifPresent(this::N);
      this.N(var1.<class06563>N("CollarColor", class06563.field_56666).orElse(f));
      this.N(this.method_73183(), var1);
      var1.<class05946>N("sound_variant", class05946.N(class04227.yQ))
         .flatMap(var1x -> this.method_56673().L(class04227.yQ).N((class05946<class08519>)var1x))
         .ifPresent(this::y);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 8) {
         this.D = true;
         this.h = 0.0F;
         this.r = 0.0F;
      } else if (var1 == 56) {
         this.w();
      } else {
         super.method_5711(var1);
      }
   }

   public class07894(class07078<? extends class07894> var1, class07299 var2) {
      super(var1, var2);
      this.N(false, false);
      this.N(class04425.field_33534, -1.0F);
      this.N(class04425.field_36432, -1.0F);
   }

   public float i(float var1) {
      return class04995.B(var1, this.r, this.h);
   }

   @Override
   protected class04891 s() {
      if (this.P_()) {
         return this.d().N().L().N();
      } else if (this.field_5974.y(3) == 0) {
         return this.NQ() && this.y(this) < 20.0F ? this.d().N().R().N() : this.d().N().i().N();
      } else {
         return this.d().N().N().N();
      }
   }

   public float n() {
      if (this.P_()) {
         return 1.5393804F;
      } else if (this.NQ()) {
         float fx = this.method_6063();
         float f1 = (fx - this.y(this)) / fx;
         return (0.55F - f1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   private class03556<class02505> l() {
      return this.field_6011.N(R);
   }

   private class03556<class08519> d() {
      return this.field_6011.N(M);
   }

   public class01894 m() {
      class02505 class02505 = this.l().N();
      if (this.NQ()) {
         return class02505.y().y().y();
      } else {
         return this.P_() ? class02505.y().L().y() : class02505.y().N().y();
      }
   }

   public class06563 t() {
      return class06563.N(this.field_6011.N(u));
   }

   @Override
   public boolean g() {
      return !this.P_();
   }

   public static class05300 v() {
      return class07633.Ne().N(class05298.l, 0.3F).N(class05298.n, 8.0).N(class05298.u, 4.0);
   }

   public float u(float var1) {
      return !this.x ? 1.0F : Math.min(0.75F + class04995.B(var1, this.r, this.h) / 2.0F * 0.25F, 1.0F);
   }

   private float y(class07894 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)
         ? WolfHealthTracker1_14_4.getWolfHealth(this)
         : var1.method_6032();
   }

   private void y(class03556<class08519> var1) {
      this.field_6011.N(M, var1);
   }

   @Override
   public long E() {
      return this.field_6011.N(i);
   }

   @Override
   public boolean N(class07633 var1) {
      if (var1 == this) {
         return false;
      } else if (!this.NQ()) {
         return false;
      } else if (!(var1 instanceof class07894 class07894)) {
         return false;
      } else if (!class07894.NQ()) {
         return false;
      } else {
         return class07894.Ng() ? false : this.NX() && class07894.NX();
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.No);
   }

   @Override
   public boolean N(class07438 var1, class07438 var2) {
      if (var1 instanceof class07550 || var1 instanceof class07523 || var1 instanceof class00681) {
         return false;
      } else if (var1 instanceof class07894 class07894) {
         return !class07894.NQ() || class07894.L_() != var2;
      } else if (var1 instanceof class08036 class08036 && var2 instanceof class08036 && !((class08036)var2).method_7256(class08036)) {
         return false;
      } else {
         return var1 instanceof class07862 class07862 && class07862.I() ? false : !(var1 instanceof class07453 class07453 && class07453.NQ());
      }
   }

   public static boolean N(class07078<class07894> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.Ln) && N(var1, var3);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var4 instanceof class10844 class10844) {
         this.N(class10844.N);
      } else {
         Optional optional = class08577.N(class08579.N(var1, this.method_24515()), class04227.yY);
         if (optional.isPresent()) {
            this.N((class03556<class02505>)optional.get());
            var4 = new class10844((class03556<class02505>)optional.get());
         }
      }

      this.y(class08526.N(this.method_56673(), var1.method_8409()));
      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Nullable
   public class07894 y(class04782 var1, class07077 var2) {
      class07894 class07894x = class07078.yC.N(var1, class06113.field_16466);
      if (class07894x != null && var2 instanceof class07894 class07894x) {
         if (this.field_5974.Z()) {
            class07894x.N(this.l());
         } else {
            class07894x.N(class07894x.l());
         }

         if (this.NQ()) {
            class07894x.a_(this.NI());
            class07894x.N(true, true);
            class06563 class06563x = this.t();
            class06563 class06563x = class07894x.t();
            class07894x.N(class06563.N(var1, class06563x, class06563x));
         }

         class07894x.y(class08526.N(this.method_56673(), this.field_5974));
      }

      return class07894x;
   }

   public void N(boolean var1) {
      this.field_6011.N(L, var1);
   }

   @Override
   public void N(long var1) {
      this.field_6011.N(i, var1);
   }

   private void N(class06563 var1) {
      this.field_6011.N(u, var1.N());
   }

   private boolean N(class07072 var1) {
      return this.NZ().N(class06570.sA) && !var1.N(class03696.Q);
   }

   private void N(class03556<class02505> var1) {
      this.field_6011.N(R, (class03556<class02505>)var1);
   }

   private void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      class06584 class06584 = var1.method_5998(var2);
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
         class06581 class06581 = class06584.B();
         if (this.NQ()) {
            class05349 class05349 = class06584.method_58694(class02484.d);
            if (class05349 != null) {
               if (this.N(class06584) && WolfHealthTracker1_14_4.getWolfHealth(this) < 20.0F) {
                  if (!var1.method_31549().u) {
                     class06584.B(1);
                  }

                  this.method_6025(class05349.N());
                  var3.setReturnValue(class07082.N);
                  return;
               }
            } else if (class06581 instanceof class06559) {
               class06563 class06563 = ((class06559)class06581).N();
               if (class06563 != this.t()) {
                  this.N(class06563);
                  if (!var1.method_31549().u) {
                     class06584.B(1);
                  }

                  var3.setReturnValue(class07082.N);
                  return;
               }
            }
         } else if (class06581 == class06570.vO && !this.P_()) {
            if (!var1.method_31549().u) {
               class06584.B(1);
            }

            var3.setReturnValue(class07082.N);
            return;
         }

         var3.setReturnValue(super.N(var1, var2));
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5)
         && this.NQ()
         && class06584.N(class06570.vr)
         && this.L(var1)
         && this.NU()
         && (!class07323.N(this.NZ(), class02523.I) || var1.method_68878())) {
         this.method_43077(class04909.Nk);
         var3.setReturnValue(class07082.N);
      }
   }

   @Override
   public void N(@Nullable class08372<class07438> var1) {
      this.Ny = var1;
   }

   private void N(class08036 var1) {
      if (this.field_5974.y(3) == 0) {
         this.u(var1);
         this.V.W();
         this.y(null);
         this.Z(true);
         this.method_73183().method_8421(this, (byte)7);
      } else {
         this.method_73183().method_8421(this, (byte)6);
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class06584 class06584x = var1.method_5998(var2);
         class06581 class06581 = class06584x.B();
         if (this.NQ()) {
            if (this.N(class06584x) && this.y(this) < this.method_6063()) {
               this.N(var1, var2, class06584x);
               class05349 class05349 = class06584x.method_58694(class02484.d);
               float fx = class05349 != null ? class05349.N() : 1.0F;
               this.method_6025(2.0F * fx);
               return class07082.N;
            }

            if (!(class06581 instanceof class06559 class06559 && this.L(var1))) {
               if (this.method_63623(class06584x, class07085.field_48824) && !this.NU() && this.L(var1) && !this.method_6109()) {
                  this.u(class06584x.L(1));
                  class06584x.N(1, var1);
                  return class07082.N;
               }

               if (this.Ng() && this.NU() && this.L(var1) && this.NZ().m() && this.NZ().L(class06584x)) {
                  class06584x.B(1);
                  this.method_43077(class04909.JR);
                  class06584 class06584x = this.NZ();
                  int ix = (int)(class06584x.s() * 0.125F);
                  class06584x.y(Math.max(0, class06584x.P() - ix));
                  return class07082.N;
               }

               class07082 class07082 = super.N(var1, var2);
               if (!class07082.N() && this.L(var1)) {
                  this.Z(!this.NJ());
                  super.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
                  this.V.W();
                  this.y(null);
                  return class07082.N.y();
               }

               return class07082;
            }

            class06563 class06563 = class06559.N();
            if (class06563 != this.t()) {
               this.N(class06563);
               class06584x.N(1, var1);
               return class07082.N;
            }
         } else if (!this.method_73183().method_8608() && class06584x.N(class06570.vO) && !this.P_()) {
            class06584x.N(1, var1);
            this.N(var1);
            return class07082.y;
         }

         return super.N(var1, var2);
      }
   }

   @Nullable
   @Override
   public class08372<class07438> W() {
      return this.Ny;
   }

   public float R(float var1) {
      return class04995.B(var1, this.S, this.C) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Ni() {
      return this.Ng() ? 20 : super.Ni();
   }

   @Override
   public boolean G() {
      return this.field_6011.N(L);
   }

   @Override
   protected void NO() {
      if (this.NQ()) {
         this.method_5996(class05298.n).N(40.0);
         this.method_6033(40.0F);
      } else {
         this.method_5996(class05298.n).N(8.0);
      }
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.6F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NO) {
         this.N(method_66651(class02484.NO, var2));
         return true;
      } else if (var1 == class02484.Ng) {
         this.y(method_66651(class02484.Ng, var2));
         return true;
      } else if (var1 == class02484.NI) {
         this.N(method_66651(class02484.NI, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07427(this));
      this.e.N(1, new class10750((double)this, 1.5, class03696.J));
      this.e.N(2, new class07958(this));
      this.e.N(3, new class07864(this, this, (float)class00683.class, (double)24.0F, 1.5, 1.5));
      this.e.N(4, new class07982(this, 0.4F));
      this.e.N(5, new class07999(this, 1.0, true));
      this.e.N(6, new class07444(this, 1.0, 10.0F, 2.0F));
      this.e.N(7, new class07434(this, 1.0));
      this.e.N(8, new class07957(this, 1.0));
      this.e.N(9, new class07436(this, 8.0F));
      this.e.N(10, new class07962(this, class08036.class, 8.0F));
      this.e.N(10, new class07956(this));
      this.H.N(1, new class10861(this));
      this.H.N(2, new class10862(this));
      this.H.N(3, new class07989(this).N());
      this.H.N(4, new class07952<>(this, class08036.class, 10, true, false, this::N));
      this.H.N(5, new class07997<>(this, class07633.class, false, N));
      this.H.N(6, new class07997<>(this, class07872.class, false, class07872.y));
      this.H.N(7, new class07952<>(this, class07528.class, false));
      this.H.N(8, new class01251<>(this, true));
   }

   @Override
   public int n_() {
      return 8;
   }

   @Override
   public class04891 method_6002() {
      return this.d().N().y().N();
   }

   @Override
   public float method_6107() {
      return 0.4F;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (!this.method_73183().method_8608() && this.x && !this.D && !this.Nw() && this.method_24828()) {
         this.D = true;
         this.h = 0.0F;
         this.r = 0.0F;
         this.method_73183().method_8421(this, (byte)8);
      }

      if (!this.method_73183().method_8608()) {
         this.N((class04782)this.method_73183(), true);
      }
   }

   @Override
   public void method_6074(class04782 var1, class07072 var2, float var3) {
      if (!this.N(var2)) {
         super.method_6074(var1, var2, var3);
      } else {
         class06584 class06584 = this.NZ();
         int ix = class06584.P();
         int j = class06584.s();
         class06584.N(class04995.u(var3), this, class07085.field_48824);
         if (class02812.y.N(ix, j) != class02812.y.N(this.NZ())) {
            this.method_43077(class04909.Ju);
            var1.method_65096(
               new class07092(class07107.S, class06570.sF.E()), this.method_23317(), this.method_23318() + 1.0, this.method_23321(), 20, 0.2, 0.1, 0.2, 0.1
            );
         }
      }
   }

   @Override
   public void method_6078(class07072 var1) {
      this.x = false;
      this.D = false;
      this.r = 0.0F;
      this.h = 0.0F;
      super.method_6078(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.N(var1) ? class04909.Ji : this.d().N().u().N();
   }

   @Override
   public void method_6105(class07072 var1, float var2) {
      this.method_57292(var1, var2, new class07085[]{class07085.field_48824});
   }

   @Override
   public void W_() {
      this.y(NN.N(this.field_5974));
   }
}
