package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01489 extends class01238 implements class04391, class04854 {
   private static final class02131<Boolean> R = class03289.N(class01489.class, class02154.U);
   private static final class02131<Boolean> B = class03289.N(class01489.class, class02154.U);
   private static final class02131<Boolean> Z = class03289.N(class01489.class, class02154.U);
   private static final class01894 W = class01894.y("baby");
   private static final class07471 T = new class07471(W, 0.2F, class07463.field_6330);
   private static final int b = 16;
   private static final float X = 0.35F;
   private static final int a = 5;
   private static final float p = 0.1F;
   private static final int F = 3;
   private static final float A = 0.2F;
   private static final class01325 f = class07078.Nr.E().N(0.5F).y(0.97F);
   private static final double C = 0.5;
   private static final boolean S = false;
   private static final boolean x = false;
   private final class07075 D = new class07075(8);
   private boolean h = false;
   protected static final ImmutableList<class05340<? extends class05355<? super class01489>>> N = ImmutableList.of(
      class05340.L, class05340.u, class05340.y, class05340.R, class05340.E
   );
   protected static final ImmutableList<class05378<?>> y = ImmutableList.of(
      class05378.P,
      class05378.G,
      class05378.M,
      class05378.B,
      class05378.U,
      class05378.E,
      class05378.Nw,
      class05378.Nd,
      class05378.H,
      class05378.yN,
      class05378.d,
      class05378.w,
      new class05378[]{
         class05378.m,
         class05378.I,
         class05378.s,
         class05378.T,
         class05378.b,
         class05378.n,
         class05378.NW,
         class05378.Nm,
         class05378.k,
         class05378.NP,
         class05378.Ns,
         class05378.Nb,
         class05378.NT,
         class05378.Nv,
         class05378.Nn,
         class05378.Nj,
         class05378.NG,
         class05378.c,
         class05378.NQ,
         class05378.v,
         class05378.NO,
         class05378.Ng,
         class05378.Nt,
         class05378.Nl,
         class05378.NI,
         class05378.NJ,
         class05378.No,
         class05378.NB,
         class05378.NZ,
         class05378.Nz,
         class05378.NU,
         class05378.NE
      }
   );

   @Override
   protected void L(class04782 var1) {
      class01514.N(var1, this);
      this.D.N().forEach(var2 -> this.method_5775(var1, var2));
      super.L(var1);
   }

   protected void M(class06584 var1) {
      if (var1.N(class01514.L)) {
         this.method_5673(class07085.field_6171, var1);
         this.N(class07085.field_6171);
      } else {
         this.N(class07085.field_6171, var1);
      }
   }

   public void M(boolean var1) {
      this.field_6011.N(Z, var1);
   }

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 16.0).N(class05298.l, 0.35F).N(class05298.u, 5.0);
   }

   private class06584 Q() {
      return this.field_5974.z() < 0.5 ? new class06584(class06570.dw) : new class06584(this.field_5974.y(10) == 0 ? class06570.lH : class06570.TQ);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (R.equals(var1)) {
         this.method_18382();
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(R, false);
      var1.N(B, false);
      var1.N(Z, false);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag && var2.u() instanceof class07438 class07438) {
         class01514.N(var1, this, class07438);
      }

      return flag;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.Gw, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("IsBaby", this.method_6109());
      var1.N("CannotHunt", this.h);
      this.N(var1);
   }

   @Override
   public boolean method_6109() {
      return this.method_5841().N(R);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y(var1.N("IsBaby", false));
      this.Z(var1.N("CannotHunt", false));
      this.b_(var1);
   }

   @Override
   public boolean method_5873(class07049 var1, boolean var2, boolean var3) {
      if (this.method_6109() && var1.method_5864() == class07078.NP) {
         var1 = this.N(var1, 3);
      }

      return super.method_5873(var1, var2, var3);
   }

   public class01489(class07078<? extends class01238> var1, class07299 var2) {
      super(var1, var2);
      this.J = 5;
   }

   protected boolean B(class06584 var1) {
      class07085 class07085 = this.method_32326(var1);
      class06584 class06584 = this.method_6118(class07085);
      return this.N(var1, class06584, class07085);
   }

   @Override
   protected boolean B() {
      return !this.h;
   }

   private void Z(boolean var1) {
      this.h = var1;
   }

   protected boolean i(class06584 var1) {
      return this.D.L(var1);
   }

   @Nullable
   @Override
   protected class04891 s() {
      return this.method_73183().method_8608() ? null : class01514.y(this).orElse(null);
   }

   @Override
   public class07075 n() {
      return this.D;
   }

   @Override
   public void m() {
      super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
   }

   @Override
   protected void v() {
      this.method_56078(class04909.Gk);
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      return var1.method_64395().N(class07305.I) && this.method_5936() && class01514.N(this, var2);
   }

   @Override
   public void y(boolean var1) {
      this.method_5841().N(R, var1);
      if (!this.method_73183().method_8608()) {
         class07469 class07469 = this.method_5996(class05298.l);
         class07469.L(T.N());
         if (var1) {
            class07469.y(T);
         }
      }
   }

   @Override
   public boolean y(class06584 var1) {
      return var1.B() == class06570.dw || var1.L(class02484.X);
   }

   @Override
   public class01484 E() {
      if (this.W()) {
         return class01484.field_25166;
      } else if (class01514.N(this.method_6079())) {
         return class01484.field_22385;
      } else if (this.Nl() && this.d()) {
         return class01484.field_25165;
      } else if (this.O()) {
         return class01484.field_22384;
      } else {
         return this.method_24518(class06570.dw) && class06593.u(this.method_59958()) ? class01484.field_22383 : class01484.field_22386;
      }
   }

   @Override
   public void N(class07438 var1, float var2) {
      this.y(this, 1.6F);
   }

   public static boolean N(class07078<class01489> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return !var1.method_8320(var3.method_10074()).N(class00869.EJ);
   }

   private class07049 N(class07049 var1, int var2) {
      List<class07049> list = var1.method_5685();
      return var2 != 1 && !list.isEmpty() ? this.N(list.getFirst(), var2 - 1) : var1;
   }

   protected class06584 N(class06584 var1) {
      return this.D.N(var1);
   }

   @Override
   protected void N(class04782 var1, class00717 var2) {
      this.method_29499(var2);
      class01514.N(var1, this, var2);
   }

   @Override
   protected boolean N(class06584 var1, class06584 var2, class07085 var3) {
      if (class07323.N(var2, class02523.I)) {
         return false;
      } else {
         class03530<class06581> class03530 = this.NL();
         boolean flag = class01514.N(var1) || class03530 != null && var1.N(class03530);
         boolean flag1 = class01514.N(var2) || class03530 != null && var2.N(class03530);
         if (flag && !flag1) {
            return true;
         } else {
            return !flag && flag1 ? false : super.N(var1, var2, var3);
         }
      }
   }

   @Override
   public boolean N(double var1) {
      return !this.Nm();
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      if (this.l()) {
         this.N(class07085.field_6169, new class06584(class06570.bd), var1);
         this.N(class07085.field_6174, new class06584(class06570.bw), var1);
         this.N(class07085.field_6172, new class06584(class06570.bk), var1);
         this.N(class07085.field_6166, new class06584(class06570.bY), var1);
      }
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("piglinBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class01514.N(this);
      super.N(var1);
   }

   private void N(class07085 var1, class06584 var2, class06069 var3) {
      if (var3.z() < 0.1F) {
         this.method_5673(var1, var2);
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class07082 class07082 = super.N(var1, var2);
      if (class07082.N()) {
         return class07082;
      } else if (this.method_73183() instanceof class04782 class04782) {
         return class01514.N(class04782, this, var1, var2);
      } else {
         boolean flag = class01514.y(this, var1.method_5998(var2)) && this.E() != class01484.field_22385;
         return (class07082)(flag ? class07082.N : class07082.i);
      }
   }

   @Override
   public void N(boolean var1) {
      this.field_6011.N(B, var1);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      if (var3 != class06113.field_16474) {
         if (class06069.z() < 0.2F) {
            this.y(true);
         } else if (this.l()) {
            this.method_5673(class07085.field_6173, this.Q());
         }
      }

      class01514.N(this, var1.method_8409());
      this.N(class06069, var2);
      this.N(var1, class06069, var2);
      return super.N(var1, var2, var3, var4);
   }

   public boolean W() {
      return this.field_6011.N(Z);
   }

   protected void R(class06584 var1) {
      this.N(class07085.field_6173, var1);
   }

   private boolean O() {
      return this.field_6011.N(B);
   }

   @Nullable
   @Override
   public class03530<class06581> NL() {
      return this.method_6109() ? null : class01226.Ls;
   }

   @Override
   public int method_6110(class04782 var1) {
      return this.J;
   }

   @Override
   public class05781<class01489> method_28306() {
      return class01289.N(y, N);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Gt;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? f : super.method_55694(var1);
   }

   @Override
   public class01289<class01489> method_18868() {
      return (class01289<class01489>)super.method_18868();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Gl;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class01514.N(this, this.method_28306().N(var1));
   }

   @Override
   public void method_6099(class04782 var1, class07072 var2, boolean var3) {
      super.method_6099(var1, var2, var3);
      this.D.N().forEach(var2x -> this.method_5775(var1, var2x));
   }
}
