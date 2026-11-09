package minecraft;

import com.mojang.serialization.MapCodec;

public class class04958 extends class00891 {
   public static final MapCodec<class04958> N = y(class04958::new);
   private static final class08071 y = class06665.ND;
   private static final int L = 20;
   private static final int u = 8;

   public class04958(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, 0));
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(y);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(y) != 0) {
         var2.method_8652(var3, var1.y(y, 0), 3);
      }
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var2.method_8608() && !var1.N(var4.i())) {
         if (var1.L(y) > 0 && !var2.method_8397().N(var3, this)) {
            var2.method_8652(var3, var1.y(y, 0), 18);
         }
      }
   }

   @Override
   public MapCodec<class04958> N() {
      return N;
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      int i = N((class07284)var1, var2, var3, (class07049)var4);
      if (var4.z() instanceof class04770 class04770) {
         class04770.method_7281(class01235.NJ);
         class06912.c.N(class04770, var4, var3.y(), i);
      }
   }

   private static int N(class07284 var0, class00500 var1, class06183 var2, class07049 var3) {
      int i = N(var2, var2.y());
      int j = var3 instanceof class08007 ? 20 : 8;
      if (!var0.method_8397().N(var2.u(), var1.i())) {
         N(var0, var1, i, var2.u(), j);
      }

      return i;
   }

   private static int N(class06183 var0, class06889 var1) {
      class07211 class07211 = var0.i();
      double d0 = Math.abs(class04995.R(var1.M) - 0.5);
      double d1 = Math.abs(class04995.R(var1.B) - 0.5);
      double d2 = Math.abs(class04995.R(var1.Z) - 0.5);
      class07185 class07185 = class07211.z();
      double d3;
      if (class07185 == class07185.field_11052) {
         d3 = Math.max(d0, d2);
      } else if (class07185 == class07185.field_11051) {
         d3 = Math.max(d0, d1);
      } else {
         d3 = Math.max(d1, d2);
      }

      return Math.max(1, class04995.L(15.0 * class04995.N((0.5 - d3) / 0.5, 0.0, 1.0)));
   }

   private static void N(class07284 var0, class00500 var1, int var2, class07209 var3, int var4) {
      var0.method_8652(var3, var1.y(y, var2), 3);
      var0.N(var3, var1.i(), var4);
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
