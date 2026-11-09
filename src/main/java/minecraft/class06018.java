package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class class06018 extends class07633 implements class05293, class07542 {
   private static final class02131<Boolean> R = class03289.N(class06018.class, class02154.U);
   private static final int M = 40;
   private static final float B = 0.3F;
   private static final int Z = 1;
   private static final float X = 0.6F;
   private static final int p = 6;
   private static final float F = 0.5F;
   private static final boolean A = false;
   private static final int f = 0;
   private static final boolean C = false;
   public static final int N = 300;
   private int S;
   private int x = 0;
   private boolean D = false;
   protected static final ImmutableList<? extends class05340<? extends class05355<? super class06018>>> y = ImmutableList.of(
      class05340.L, class05340.u, class05340.P, class05340.m
   );
   protected static final ImmutableList<? extends class05378<?>> L = ImmutableList.of(
      class05378.j,
      class05378.M,
      class05378.B,
      class05378.U,
      class05378.E,
      class05378.P,
      class05378.m,
      class05378.I,
      class05378.n,
      class05378.s,
      class05378.T,
      class05378.NY,
      new class05378[]{class05378.k, class05378.NO, class05378.Ng, class05378.Nk, class05378.e, class05378.No, class05378.Nq, class05378.NN}
   );

   @Override
   protected void M() {
      if (this.method_6109()) {
         this.J = 3;
         this.method_5996(class05298.u).N(0.5);
      } else {
         this.J = 5;
         this.method_5996(class05298.u).N(6.0);
      }
   }

   private void M(boolean var1) {
      this.D = var1;
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(R, false);
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag && var2.u() instanceof class07438 class07438) {
         class01524.N(var1, this, class07438);
      }

      return flag;
   }

   @Override
   protected class04891 method_5737() {
      return class04909.PD;
   }

   @Override
   protected class04891 method_5625() {
      return class04909.Px;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.Pv, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("IsImmuneToZombification", this.G());
      var1.N("TimeInOverworld", this.x);
      var1.N("CannotBeHunted", this.D);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("IsImmuneToZombification", false));
      this.x = var1.N("TimeInOverworld", 0);
      this.M(var1.N("CannotBeHunted", false));
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 4) {
         this.S = 10;
         this.method_56078(class04909.PP);
      } else {
         super.method_5711(var1);
      }
   }

   public class06018(class07078<? extends class06018> var1, class07299 var2) {
      super(var1, var2);
      this.J = 5;
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.n, 40.0).N(class05298.l, 0.3F).N(class05298.b, 0.6F).N(class05298.i, 1.0).N(class05298.u, 6.0);
   }

   @Override
   protected class04891 s() {
      return this.method_73183().method_8608() ? null : class01524.y(this).orElse(null);
   }

   public boolean n() {
      return this.m() && !this.D;
   }

   public boolean m() {
      return !this.method_6109();
   }

   private void t() {
      this.N(class07078.yS, class08234.N(this, true, false), var0 -> var0.method_6092(new class07055(class07047.Z, 200, 0)));
   }

   @Override
   public boolean g() {
      return true;
   }

   public boolean v() {
      return !this.G() && !this.Nt() && this.method_73183().method_75728().N(class00608.K, this.method_73189());
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      class06018 class06018 = class07078.NP.N(var1, class06113.field_16466);
      if (class06018 != null) {
         class06018.NW();
      }

      return class06018;
   }

   public void N(boolean var1) {
      this.method_5841().N(R, var1);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var1.method_8409().z() < 0.2F) {
         this.y(true);
      }

      return super.N(var1, var2, var3, var4);
   }

   public void N(int var1) {
      this.x = var1;
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class07082 class07082 = super.N(var1, var2);
      if (class07082.N()) {
         this.NW();
      }

      return class07082;
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      if (class01524.N(this, var1)) {
         return -1.0F;
      } else {
         return var2.method_8320(var1.method_10074()).N(class00869.sn) ? 10.0F : 0.0F;
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NC);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("hoglinBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class01524.N(this);
      if (this.v()) {
         this.x++;
         if (this.x > 300) {
            this.method_56078(class04909.Ps);
            this.t();
         }
      } else {
         this.x = 0;
      }
   }

   @Override
   public boolean N(double var1) {
      return true;
   }

   public static boolean N(class07078<class06018> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return !var1.method_8320(var3.method_10074()).N(class00869.EJ);
   }

   @Override
   public int W() {
      return this.S;
   }

   private boolean G() {
      return this.method_5841().N(R);
   }

   @Override
   public int method_6110(class04782 var1) {
      return this.J;
   }

   @Override
   public class05781<class06018> method_28306() {
      return class01289.N(L, y);
   }

   @Override
   public class04891 method_6002() {
      return class04909.PT;
   }

   @Override
   public void method_6007() {
      if (this.S > 0) {
         this.S--;
      }

      super.method_6007();
   }

   @Override
   public boolean method_6054() {
      return true;
   }

   @Override
   public class01289<class06018> method_18868() {
      return (class01289<class06018>)super.method_18868();
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      if (var2 instanceof class07438 class07438) {
         this.S = 10;
         this.method_73183().method_8421(this, (byte)4);
         this.method_56078(class04909.PP);
         class01524.N(this, class07438);
         return class05293.N(var1, this, class07438);
      } else {
         return false;
      }
   }

   @Override
   public void method_6060(class07438 var1) {
      if (this.m()) {
         class05293.N(this, var1);
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Pb;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class01524.N(this.method_28306().N(var1));
   }

   @Override
   public boolean T_() {
      return !class01524.L(this) && super.T_();
   }
}
