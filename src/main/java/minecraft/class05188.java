package minecraft;

import java.util.Iterator;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class05188 {
   public class05188() {
      super();
   }

   public static class00494 N(class07290 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      return !class00500.N(class01210.yu) && (!(class00500.i() instanceof class00624) || !class00500.L(class00624.y))
         ? class00500.M(var0, var1)
         : class00389.N();
   }

   public static double N(class07209 var0, int var1, Function<class07209, class00494> var2) {
      class07218 class07218 = var0.method_25503();
      int i = 0;

      while (i < var1) {
         class00494 class00494 = (class00494)var2.apply(class07218);
         if (!class00494.method_1110()) {
            return var0.method_10264() + i + class00494.method_1091(class07185.field_11052);
         }

         i++;
         class07218.N(class07211.field_11036);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static class06889 N(class07078<?> var0, class07322 var1, class07209 var2, boolean var3) {
      if (var3 && var0.N(var1.method_8320(var2))) {
         return null;
      } else {
         double d0 = var1.N(N((class07290)var1, var2), () -> N((class07290)var1, var2.method_10074()));
         if (!N(d0)) {
            return null;
         } else if (var3 && d0 <= 0.0 && var0.N(var1.method_8320(var2.method_10074()))) {
            return null;
         } else {
            class06889 class06889 = class06889.N(var2, d0);
            class00734 class00734 = var0.E().N(class06889);
            Iterator<class00494> iterator = var1.method_20812(null, class00734).iterator();

            while (iterator.hasNext()) {
               if (!iterator.next().method_1110()) {
                  return null;
               }
            }

            if (var0 != class07078.Ly || !var1.method_8320(var2).N(class01210.Lq) && !var1.method_8320(var2.method_10084()).N(class01210.Lq)) {
               return !var1.method_8621().N(class00734) ? null : class06889;
            } else {
               return null;
            }
         }
      }
   }

   public static int[][] N(class07211 var0) {
      class07211 class07211xx = var0.R();
      class07211 class07211x = class07211xx.b();
      class07211 class07211xx = var0.b();
      return new int[][]{
         {class07211xx.P(), class07211xx.T()},
         {class07211x.P(), class07211x.T()},
         {class07211xx.P() + class07211xx.P(), class07211xx.T() + class07211xx.T()},
         {class07211xx.P() + class07211x.P(), class07211xx.T() + class07211x.T()},
         {var0.P() + class07211xx.P(), var0.T() + class07211xx.T()},
         {var0.P() + class07211x.P(), var0.T() + class07211x.T()},
         {class07211xx.P(), class07211xx.T()},
         {var0.P(), var0.T()}
      };
   }

   public static boolean N(double var0) {
      return !Double.isInfinite(var0) && var0 < 1.0;
   }

   public static boolean N(class07322 var0, class07438 var1, class00734 var2) {
      Iterator<class00494> iterator = var0.method_20812(var1, var2).iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().method_1110()) {
            return false;
         }
      }

      return var0.method_8621().N(var2);
   }

   public static boolean N(class07322 var0, class06889 var1, class07438 var2, class01312 var3) {
      return N(var0, var2, var2.method_24833(var3).L(var1));
   }
}
