package minecraft;

import com.mojang.serialization.MapCodec;

public class class06859 extends class06781 {
   public static final MapCodec<class06859> N = y(class06859::new);
   public static final class06667 y = class06665.t;
   public static final class08071 u = class06665.Ng;

   public class06859(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(R, class07211.field_11043).y(u, 1).y(y, false).y(L, false));
   }

   @Override
   protected int U(class00500 var1) {
      return var1.L(u) * 2;
   }

   @Override
   protected boolean y() {
      return true;
   }

   @Override
   public boolean y(class05487 var1, class07209 var2, class00500 var3) {
      return this.N((class03589)var1, var2, var3) > 0;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(L)) {
         class07211 class07211 = var1.L(R);
         double d0 = var3.method_10263() + 0.5 + (var4.U() - 0.5) * 0.2;
         double d1 = var3.method_10264() + 0.4 + (var4.U() - 0.5) * 0.2;
         double d2 = var3.method_10260() + 0.5 + (var4.U() - 0.5) * 0.2;
         float f = -5.0F;
         if (var4.Z()) {
            f = var1.L(u) * 2 - 1;
         }

         f /= 16.0F;
         double d3 = f * class07211.P();
         double d4 = f * class07211.T();
         var2.method_8406(class07138.y, d0 + d3, d1, d2 + d4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public MapCodec<class06859> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, u, y, L);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11033 && !this.N(var2, var6, var7)) {
         return class00869.N.W();
      } else {
         return !var2.method_8608() && var5.z() != var1.L(R).z()
            ? var1.y(y, this.y(var2, var4, var1))
            : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = super.N(var1);
      return class00500.y(y, this.y(var1.method_8045(), var1.method_8037(), class00500));
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var4.method_31549().i) {
         return class07082.i;
      } else {
         var2.method_8652(var3, var1.N(u), 3);
         return class07082.N;
      }
   }
}
