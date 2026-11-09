package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07535 extends class07473 {
   private static final int N = 64;
   private final class07079 y;
   private final int L;

   @Override
   public void L() {
      class06889 class06889 = N(this.y, this.L);
      this.y.F().N(class06889.N(), class06889.y(), class06889.L(), 1.0);
   }

   public class07535(class07079 var1) {
      this(var1, 0);
   }

   public class07535(class07079 var1, int var2) {
      super();
      this.y = var1;
      this.L = var2;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean y() {
      return false;
   }

   private static class06889 N(class06889 var0, class06069 var1) {
      double d0 = var0.N() + (var1.z() * 2.0F - 1.0F) * 16.0F;
      double d1 = var0.y() + (var1.z() * 2.0F - 1.0F) * 16.0F;
      double d2 = var0.L() + (var1.z() * 2.0F - 1.0F) * 16.0F;
      return new class06889(d0, d1, d2);
   }

   private static boolean N(class07299 var0, class06889 var1, int var2) {
      if (var2 <= 0) {
         return true;
      } else {
         class07209 class07209x = class07209.method_49638(var1);
         if (!var0.method_8320(class07209x).P()) {
            return false;
         } else {
            for (class07211 class07211 : class07211.values()) {
               for (int i = 1; i < var2; i++) {
                  class07209 class07209x = class07209x.method_10079(class07211, i);
                  if (!var0.method_8320(class07209x).P()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }

   @Nullable
   private static class06889 N(class07079 var0, class06889 var1, class06069 var2) {
      class06889 class06889 = N(var1, var2);
      return var0.Nj() && !var0.N(class06889) ? null : class06889;
   }

   public static class06889 N(class07079 var0, int var1) {
      class07299 class07299 = var0.method_73183();
      class06069 class06069 = var0.method_59922();
      class06889 class06889x = var0.method_73189();
      class06889 class06889x = null;

      for (int i = 0; i < 64; i++) {
         class06889x = N(var0, class06889x, class06069);
         if (class06889x != null && N(class07299, class06889x, var1)) {
            return class06889x;
         }
      }

      if (class06889x == null) {
         class06889x = N(class06889x, class06069);
      }

      class07209 class07209 = class07209.method_49638(class06889x);
      int j = class07299.method_8624(class07830.field_13197, class07209.method_10263(), class07209.method_10260());
      if (j < class07209.method_10264() && j > class07299.method_31607()) {
         class06889x = new class06889(class06889x.N(), var0.method_23318() - Math.abs(var0.method_23318() - class06889x.y()), class06889x.L());
      }

      return class06889x;
   }

   @Override
   public boolean N() {
      class07458 class07458 = this.y.F();
      if (!class07458.y()) {
         return true;
      } else {
         double d0 = class07458.u() - this.y.method_23317();
         double d1 = class07458.i() - this.y.method_23318();
         double d2 = class07458.R() - this.y.method_23321();
         double d3 = d0 * d0 + d1 * d1 + d2 * d2;
         return d3 < 1.0 || d3 > 3600.0;
      }
   }
}
