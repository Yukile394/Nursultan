package minecraft;

import java.util.function.Supplier;

public class class02615 {
   public class02615() {
      super();
   }

   public static void N(class07284 var0, class07209 var1, int var2, double var3, double var5, boolean var7, class07126 var8) {
      class06069 class06069 = var0.method_8409();

      for (int i = 0; i < var2; i++) {
         double d0 = class06069.E() * 0.02;
         double d1 = class06069.E() * 0.02;
         double d2 = class06069.E() * 0.02;
         double d3 = 0.5 - var3;
         double d4 = var1.method_10263() + d3 + class06069.U() * var3 * 2.0;
         double d5 = var1.method_10264() + class06069.U() * var5;
         double d6 = var1.method_10260() + d3 + class06069.U() * var3 * 2.0;
         if (var7 || !var0.method_8320(class07209.method_49637(d4, d5, d6).method_10074()).P()) {
            var0.method_8406(var8, d4, d5, d6, d0, d1, d2);
         }
      }
   }

   public static void N(class07284 var0, class07209 var1, int var2, class07126 var3) {
      double d0 = 0.5;
      class00500 class00500 = var0.method_8320(var1);
      double d1 = class00500.P() ? 1.0 : class00500.R(var0, var1).method_1105(class07185.field_11052);
      N(var0, var1, var2, 0.5, d1, true, var3);
   }

   public static void N(class07299 var0, class07209 var1, class06069 var2, class07126 var3) {
      double d0 = var1.method_10263() + var2.U();
      double d1 = var1.method_10264() - 0.05;
      double d2 = var1.method_10260() + var2.U();
      var0.method_8406(var3, d0, d1, d2, 0.0, 0.0, 0.0);
   }

   public static void N(class07284 var0, class07209 var1, int var2) {
      class06889 class06889 = var1.method_46558().y(0.0, 0.5, 0.0);
      class07105 class07105 = N(new class07105(class07107.yR, var0.method_8320(var1)), var0, var1, var2);

      for (int i = 0; i < var2 / 3.0F; i++) {
         double d0 = class06889.M + var0.method_8409().E() / 2.0;
         double d1 = class06889.B;
         double d2 = class06889.Z + var0.method_8409().E() / 2.0;
         double d3 = var0.method_8409().E() * 0.2F;
         double d4 = var0.method_8409().E() * 0.2F;
         double d5 = var0.method_8409().E() * 0.2F;
         var0.method_8406(class07105, d0, d1, d2, d3, d4, d5);
      }

      for (int j = 0; j < var2 / 1.5F; j++) {
         double d6 = class06889.M + 3.5 * Math.cos(j) + var0.method_8409().E() / 2.0;
         double d7 = class06889.B;
         double d8 = class06889.Z + 3.5 * Math.sin(j) + var0.method_8409().E() / 2.0;
         double d9 = var0.method_8409().E() * 0.05F;
         double d10 = var0.method_8409().E() * 0.05F;
         double d11 = var0.method_8409().E() * 0.05F;
         var0.method_8406(class07105, d6, d7, d8, d9, d10, d11);
      }
   }

   private static class07105 N(class07105 var0, class07284 var1, class07209 var2, int var3) {
      var0.fabric_setBlockPos(var2);
      return var0;
   }

   public static void N(class07299 var0, class07209 var1, class07126 var2, class02142 var3) {
      for (class07211 class07211 : class07211.values()) {
         N(var0, var1, var2, var3, class07211, () -> N(var0.field_9229), 0.55);
      }
   }

   public static void N(class07299 var0, class07209 var1, class07126 var2, class02142 var3, class07211 var4, Supplier<class06889> var5, double var6) {
      int i = var3.N(var0.field_9229);

      for (int j = 0; j < i; j++) {
         N(var0, var1, var4, var2, (class06889)var5.get(), var6);
      }
   }

   private static class06889 N(class06069 var0) {
      return new class06889(class04995.N(var0, -0.5, 0.5), class04995.N(var0, -0.5, 0.5), class04995.N(var0, -0.5, 0.5));
   }

   public static void N(class07185 var0, class07299 var1, class07209 var2, double var3, class07126 var5, class02135 var6) {
      class06889 class06889 = class06889.y(var2);
      boolean flag = var0 == class07185.field_11048;
      boolean flag1 = var0 == class07185.field_11052;
      boolean flag2 = var0 == class07185.field_11051;
      int i = var6.N(var1.field_9229);

      for (int j = 0; j < i; j++) {
         double d0 = class06889.M + class04995.N(var1.field_9229, -1.0, 1.0) * (flag ? 0.5 : var3);
         double d1 = class06889.B + class04995.N(var1.field_9229, -1.0, 1.0) * (flag1 ? 0.5 : var3);
         double d2 = class06889.Z + class04995.N(var1.field_9229, -1.0, 1.0) * (flag2 ? 0.5 : var3);
         double d3 = flag ? class04995.N(var1.field_9229, -1.0, 1.0) : 0.0;
         double d4 = flag1 ? class04995.N(var1.field_9229, -1.0, 1.0) : 0.0;
         double d5 = flag2 ? class04995.N(var1.field_9229, -1.0, 1.0) : 0.0;
         var1.method_8406(var5, d0, d1, d2, d3, d4, d5);
      }
   }

   public static void N(class07299 var0, class07209 var1, class07211 var2, class07126 var3, class06889 var4, double var5) {
      class06889 class06889 = class06889.y(var1);
      int i = var2.P();
      int j = var2.s();
      int k = var2.T();
      double d0 = class06889.M + (i == 0 ? class04995.N(var0.field_9229, -0.5, 0.5) : i * var5);
      double d1 = class06889.B + (j == 0 ? class04995.N(var0.field_9229, -0.5, 0.5) : j * var5);
      double d2 = class06889.Z + (k == 0 ? class04995.N(var0.field_9229, -0.5, 0.5) : k * var5);
      double d3 = i == 0 ? var4.N() : 0.0;
      double d4 = j == 0 ? var4.y() : 0.0;
      double d5 = k == 0 ? var4.L() : 0.0;
      var0.method_8406(var3, d0, d1, d2, d3, d4, d5);
   }
}
