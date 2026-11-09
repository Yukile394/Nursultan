package minecraft;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import org.jspecify.annotations.Nullable;

public class class05464 {
   private static final int N = 10;

   public class05464() {
      super();
   }

   public static class07209 N(class07209 var0, int var1, int var2, Predicate<class07209> var3) {
      if (var1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + var1 + ", expected >= 0");
      } else if (!var3.test(var0)) {
         return var0;
      } else {
         class07218 class07218 = var0.method_25503().N(class07211.field_11036);

         while (class07218.method_10264() <= var2 && var3.test(class07218)) {
            class07218.N(class07211.field_11036);
         }

         int i = class07218.method_10264();

         while (class07218.method_10264() <= var2 && class07218.method_10264() - i < var1) {
            class07218.N(class07211.field_11036);
            if (var3.test(class07218)) {
               class07218.N(class07211.field_11033);
               break;
            }
         }

         return class07218.method_10062();
      }
   }

   @Nullable
   public static class06889 N(class07475 var0, Supplier<class07209> var1) {
      return N(var1, var0::u);
   }

   @Nullable
   public static class06889 N(Supplier<class07209> var0, ToDoubleFunction<class07209> var1) {
      double d0 = Double.NEGATIVE_INFINITY;
      class07209 class07209x = null;

      for (int i = 0; i < 10; i++) {
         class07209 class07209x = (class07209)var0.get();
         if (class07209x != null) {
            double d1 = var1.applyAsDouble(class07209x);
            if (d1 > d0) {
               d0 = d1;
               class07209x = class07209x;
            }
         }
      }

      return class07209x != null ? class06889.L(class07209x) : null;
   }

   public static class07209 N(class07475 var0, double var1, class06069 var3, class07209 var4) {
      double d0 = var4.method_10263();
      double d1 = var4.method_10260();
      if (var0.Nj() && var1 > 1.0) {
         class07209 class07209 = var0.Ns();
         if (var0.method_23317() > class07209.method_10263()) {
            d0 -= var3.U() * var1 / 2.0;
         } else {
            d0 += var3.U() * var1 / 2.0;
         }

         if (var0.method_23321() > class07209.method_10260()) {
            d1 -= var3.U() * var1 / 2.0;
         } else {
            d1 += var3.U() * var1 / 2.0;
         }
      }

      return class07209.method_49637(d0 + var0.method_23317(), var4.method_10264() + var0.method_23318(), d1 + var0.method_23321());
   }

   public static class07209 N(class07209 var0, int var1, Predicate<class07209> var2) {
      if (!var2.test(var0)) {
         return var0;
      } else {
         class07218 class07218 = var0.method_25503().N(class07211.field_11036);

         while (class07218.method_10264() <= var1 && var2.test(class07218)) {
            class07218.N(class07211.field_11036);
         }

         return class07218.method_10062();
      }
   }

   @Nullable
   public static class07209 N(class06069 var0, double var1, double var3, int var5, int var6, double var7, double var9, double var11) {
      double d0 = class04995.u(var9, var7) - (float) (Math.PI / 2) + (2.0F * var0.z() - 1.0F) * var11;
      double d1 = class04995.u(Math.sqrt(var0.U()), var1, var3) * class04995.M;
      double d2 = -d1 * Math.sin(d0);
      double d3 = d1 * Math.cos(d0);
      if (!(Math.abs(d2) > var3) && !(Math.abs(d3) > var3)) {
         int i = var0.y(2 * var5 + 1) - var5 + var6;
         return class07209.method_49637(d2, i, d3);
      } else {
         return null;
      }
   }

   public static class07209 N(class06069 var0, int var1, int var2) {
      int i = var0.y(2 * var1 + 1) - var1;
      int j = var0.y(2 * var2 + 1) - var2;
      int k = var0.y(2 * var1 + 1) - var1;
      return new class07209(i, j, k);
   }
}
