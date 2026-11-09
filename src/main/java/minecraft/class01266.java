package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class class01266 extends class01238 {
   private static final int R = 50;
   private static final float M = 0.35F;
   private static final int B = 7;
   private static final double Z = 12.0;
   protected static final ImmutableList<class05340<? extends class05355<? super class01266>>> N = ImmutableList.of(
      class05340.L, class05340.u, class05340.y, class05340.R, class05340.W
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
      class05378.d,
      class05378.w,
      class05378.m,
      class05378.I,
      new class05378[]{class05378.s, class05378.T, class05378.b, class05378.n, class05378.NW, class05378.c, class05378.y}
   );

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 50.0).N(class05298.l, 0.35F).N(class05298.u, 7.0).N(class05298.P, 12.0);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag && var2.u() instanceof class07438 class07438) {
         class01030.N(var1, this, class07438);
      }

      return flag;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.GI, 0.15F, 1.0F);
   }

   public class01266(class07078<? extends class01266> var1, class07299 var2) {
      super(var1, var2);
      this.J = 20;
   }

   @Override
   public boolean B() {
      return false;
   }

   @Override
   protected class04891 s() {
      return class04909.GY;
   }

   @Override
   protected void v() {
      this.method_56078(class04909.GJ);
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      return var2.N(class06570.TI) ? super.y(var1, var2) : false;
   }

   @Override
   public class01484 E() {
      return this.Nl() && this.d() ? class01484.field_25165 : class01484.field_22386;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class01030.N(this);
      this.N(var1.method_8409(), var2);
      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("piglinBruteBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class01030.y(this);
      class01030.L(this);
      super.N(var1);
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      this.method_5673(class07085.field_6173, new class06584(class06570.TI));
   }

   @Override
   protected void W() {
      this.method_56078(class04909.GQ);
   }

   @Override
   public class05781<class01266> method_28306() {
      return class01289.N(y, N);
   }

   @Override
   public class04891 method_6002() {
      return class04909.GO;
   }

   @Override
   public class01289<class01266> method_18868() {
      return (class01289<class01266>)super.method_18868();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Gg;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class01030.N(this, this.method_28306().N(var1));
   }
}
