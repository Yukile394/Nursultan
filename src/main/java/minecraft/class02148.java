package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import net.caffeinemc.mods.lithium.common.ai.brain.SensorHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02148 extends class07633 {
   public static final class01325 N = class01325.y(0.9F, 1.3F).N(0.7F);
   private static final int M = 2;
   private static final int B = 1;
   protected static final ImmutableList<class05340<? extends class05355<? super class02148>>> y = ImmutableList.of(
      class05340.L, class05340.u, class05340.y, class05340.P, class05340.R, class05340.b
   );
   protected static final ImmutableList<class05378<?>> L = ImmutableList.of(
      class05378.P,
      class05378.B,
      class05378.m,
      class05378.I,
      class05378.n,
      class05378.NJ,
      class05378.j,
      class05378.f,
      class05378.C,
      class05378.a,
      class05378.e,
      class05378.p,
      new class05378[]{class05378.A, class05378.x, class05378.D, class05378.NN}
   );
   public static final int u = 10;
   public static final double i = 0.02;
   public static final double R = 0.1F;
   private static final class02131<Boolean> Z = class03289.N(class02148.class, class02154.U);
   private static final class02131<Boolean> X = class03289.N(class02148.class, class02154.U);
   private static final class02131<Boolean> p = class03289.N(class02148.class, class02154.U);
   private static final boolean F = false;
   private static final boolean A = true;
   private static final boolean f = true;
   private boolean C;
   private int S;

   public float w() {
      return this.S / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   @Override
   protected void M() {
      if (this.method_6109()) {
         this.method_5996(class05298.u).N(1.0);
         this.l();
      } else {
         this.method_5996(class05298.u).N(2.0);
         this.G();
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(Z, false);
      var1.N(X, true);
      var1.N(p, true);
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.Wf, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("IsScreamingGoat", this.d());
      var1.N("HasLeftHorn", this.v());
      var1.N("HasRightHorn", this.n());
   }

   @Override
   public void method_5847(float var1) {
      int ix = this.NR();
      float fx = class04995.N(class04995.u(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0, var1), (float)(-ix), (float)ix);
      super.method_5847(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 + fx);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("IsScreamingGoat", false));
      this.field_6011.N(X, var1.N("HasLeftHorn", true));
      this.field_6011.N(p, var1.N("HasRightHorn", true));
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 58) {
         this.C = true;
      } else if (var1 == 59) {
         this.C = false;
      } else {
         super.method_5711(var1);
      }
   }

   public class02148(class07078<? extends class02148> var1, class07299 var2) {
      super(var1, var2);
      this.f().N(true);
      this.N(class04425.field_33534, -1.0F);
      this.N(class04425.field_36432, -1.0F);
      this.N(null);
   }

   public class06584 B() {
      class06069 class06069 = class06069.y((long)this.method_5667().hashCode());
      class03530<class04449> class03530 = this.d() ? class04456.y : class04456.N;
      return this.method_73183()
         .method_30349()
         .L(class04227.yZ)
         .N(class03530, class06069)
         .map(var0 -> class04473.N(class06570.dH, (class03556<class04449>)var0))
         .orElseGet(() -> new class06584(class06570.dH));
   }

   @Override
   protected class04891 s() {
      return this.d() ? class04909.We : class04909.WQ;
   }

   public boolean n() {
      return this.field_6011.N(p);
   }

   @Override
   public void l() {
      this.field_6011.N(X, false);
      this.field_6011.N(p, false);
   }

   public boolean d() {
      return this.field_6011.N(Z);
   }

   protected class04891 m() {
      return this.d() ? class04909.Wp : class04909.Wo;
   }

   public boolean t() {
      boolean flag = this.v();
      boolean flag1 = this.n();
      if (!flag && !flag1) {
         return false;
      } else {
         class02131<Boolean> class02131;
         if (!flag) {
            class02131 = p;
         } else if (!flag1) {
            class02131 = X;
         } else {
            class02131 = this.field_5974.Z() ? X : p;
         }

         this.field_6011.N(class02131, false);
         class06889 class06889 = this.method_73189();
         class06584 class06584 = this.B();
         double d0 = class04995.y(this.field_5974, -0.2F, 0.2F);
         double d1 = class04995.y(this.field_5974, 0.3F, 0.7F);
         double d2 = class04995.y(this.field_5974, -0.2F, 0.2F);
         class00717 class00717 = new class00717(this.method_73183(), class06889.N(), class06889.y(), class06889.L(), class06584, d0, d1, d2);
         this.method_73183().method_8649(class00717);
         return true;
      }
   }

   public boolean v() {
      return this.field_6011.N(X);
   }

   public static boolean N(class07078<? extends class07633> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.LP) && N(var1, var3);
   }

   private void N(CallbackInfo var1) {
      if (!this.method_73183().method_8608()) {
         SensorHelper.disableSensor(this, class05340.y);
      }
   }

   public void N(boolean var1) {
      this.field_6011.N(Z, var1);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("goatBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("goatActivityUpdate");
      class02133.N(this);
      class04643.L();
      super.N(var1);
   }

   @Nullable
   public class02148 y(class04782 var1, class07077 var2) {
      class02148 class02148 = class07078.NW.N(var1, class06113.field_16466);
      if (class02148 != null) {
         class02133.N(class02148, var1.method_8409());
         Object object = var1.method_8409().Z() ? this : var2;
         boolean flag = object instanceof class02148 && ((class02148)object).d() || var1.method_8409().U() < 0.02;
         class02148.N(flag);
      }

      return class02148;
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584x = var1.method_5998(var2);
      if (class06584x.N(class06570.jU) && !this.method_6109()) {
         var1.method_5783(this.m(), 1.0F, 1.0F);
         class06584 class06584x = class05970.N(class06584x, var1, class06570.jT.E());
         var1.method_6122(var2, class06584x);
         return class07082.N;
      } else {
         class07082 class07082 = super.N(var1, var2);
         if (class07082.N() && this.N(class06584x)) {
            this.O();
         }

         return class07082;
      }
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      class02133.N(this, class06069);
      this.N(class06069.U() < 0.02);
      this.M();
      if (!this.method_6109() && class06069.z() < 0.1F) {
         class02131<Boolean> class02131 = class06069.Z() ? X : p;
         this.field_6011.N(class02131, false);
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NI);
   }

   public static class05300 W() {
      return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, 0.2F).N(class05298.u, 2.0);
   }

   @Override
   protected void O() {
      this.method_73183()
         .method_43129(
            null, this, this.d() ? class04909.Wc : class04909.Wg, class04911.field_15254, 1.0F, class04995.y(this.method_73183().field_9229, 0.8F, 1.2F)
         );
   }

   public void G() {
      this.field_6011.N(X, true);
      this.field_6011.N(p, true);
   }

   @Override
   public int NR() {
      return 15;
   }

   @Override
   public class05781<class02148> method_28306() {
      return class01289.N(L, y);
   }

   @Override
   public int method_23329(double var1, float var3) {
      return super.method_23329(var1, var3) - 10;
   }

   @Override
   public class04891 method_6002() {
      return this.d() ? class04909.WH : class04909.WO;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return var1 == class01312.field_30095 ? N.N(this.method_17825()) : super.method_55694(var1);
   }

   @Override
   public void method_6007() {
      if (this.C) {
         this.S++;
      } else {
         this.S -= 2;
      }

      this.S = class04995.N(this.S, 0, 20);
      super.method_6007();
   }

   @Override
   public class01289<class02148> method_18868() {
      return (class01289<class02148>)super.method_18868();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.d() ? class04909.WX : class04909.WI;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class02133.N(this.method_28306().N(var1));
   }
}
