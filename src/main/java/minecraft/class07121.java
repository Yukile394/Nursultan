package minecraft;

import java.util.Optional;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class class07121 {
   private static final int L = 2;
   public static final int N = 21;
   private static final int u = 3;
   public static final int y = 21;
   private static final class01340 i = (var0, var1, var2) -> var0.N(class00869.LV);
   private static final float R = 4.0F;
   private static final double M = 1.0;
   private final class07185 B;
   private final class07211 Z;
   private final int z;
   private final class07209 U;
   private final int E;
   private final int W;

   private class07121(class07185 var1, int var2, class07211 var3, class07209 var4, int var5, int var6) {
      super();
      this.B = var1;
      this.z = var2;
      this.Z = var3;
      this.U = var4;
      this.W = var5;
      this.E = var6;
   }

   private static int y(class07290 var0, class07209 var1, class07211 var2) {
      class07218 class07218 = new class07218();

      for (int ix = 0; ix <= 21; ix++) {
         class07218.N(var1).N(var2, ix);
         class00500 class00500x = var0.method_8320(class07218);
         if (!N(class00500x)) {
            if (i.test(class00500x, var0, class07218)) {
               return ix;
            }
            break;
         }

         class00500 class00500x = var0.method_8320(class07218.N(class07211.field_11033));
         if (!i.test(class00500x, var0, class07218)) {
            break;
         }
      }

      return 0;
   }

   public boolean y() {
      return this.N() && this.z == this.W * this.E;
   }

   public static class06889 N(class06889 var0, class04782 var1, class07049 var2, class01325 var3) {
      if (!(var3.N() > 4.0F) && !(var3.y() > 4.0F)) {
         double d0 = var3.y() / 2.0;
         class06889 class06889 = var0.y(0.0, d0, 0.0);
         class00494 class00494 = class00389.N(class00734.N(class06889, var3.N(), 0.0, var3.N()).y(0.0, 1.0, 0.0).M(1.0E-6));
         return var1.method_33594(var2, class00494, class06889, var3.N(), var3.y(), var3.N()).map(var2x -> var2x.N(0.0, d0, 0.0)).orElse(var0);
      } else {
         return var0;
      }
   }

   public static class06889 N(class01009 var0, class07185 var1, class06889 var2, class01325 var3) {
      double d0 = (double)var0.y - var3.N();
      double d1 = (double)var0.L - var3.y();
      class07209 class07209 = var0.N;
      double d2;
      if (d0 > 0.0) {
         double d3 = class07209.method_30558(var1) + var3.N() / 2.0;
         d2 = class04995.N(class04995.L(var2.N(var1) - d3, 0.0, d0), 0.0, 1.0);
      } else {
         d2 = 0.5;
      }

      double d5;
      if (d1 > 0.0) {
         class07185 class07185x = class07185.field_11052;
         d5 = class04995.N(class04995.L(var2.N(class07185x) - class07209.method_30558(class07185x), 0.0, d1), 0.0, 1.0);
      } else {
         d5 = 0.0;
      }

      class07185 class07185 = var1 == class07185.field_11048 ? class07185.field_11051 : class07185.field_11048;
      double d4 = var2.N(class07185) - (class07209.method_30558(class07185) + 0.5);
      return new class06889(d2, d5, d4);
   }

   public void N(class07284 var1) {
      class00500 class00500 = class00869.iq.W().y(class07136.y, this.B);
      class07209.method_10097(this.U, this.U.method_10079(class07211.field_11036, this.E - 1).method_10079(this.Z, this.W - 1))
         .forEach(var2x -> var1.method_8652(var2x, class00500, 18));
   }

   private static boolean N(class00500 var0) {
      return var0.P() || var0.N(class01210.Nh) || var0.N(class00869.iq);
   }

   private static int N(class07290 var0, class07209 var1, class07211 var2, int var3, MutableInt var4) {
      class07218 class07218 = new class07218();
      int ix = N(var0, var1, var2, class07218, var3, var4);
      return ix >= 3 && ix <= 21 && N(var0, var1, var2, class07218, var3, ix) ? ix : 0;
   }

   private static int N(class07290 var0, class07209 var1, class07211 var2) {
      int ix = y(var0, var1, var2);
      return ix >= 2 && ix <= 21 ? ix : 0;
   }

   @Nullable
   private static class07209 N(class07290 var0, class07211 var1, class07209 var2) {
      int ix = Math.max(var0.method_31607(), var2.method_10264() - 21);

      while (var2.method_10264() > ix && N(var0.method_8320(var2.method_10074()))) {
         var2 = var2.method_10074();
      }

      class07211 class07211 = var1.b();
      int j = y(var0, var2, class07211) - 1;
      return j < 0 ? null : var2.method_10079(class07211, j);
   }

   public static class07121 N(class07290 var0, class07209 var1, class07185 var2) {
      class07211 class07211 = var2 == class07185.field_11048 ? class07211.field_11039 : class07211.field_11035;
      class07209 class07209 = N(var0, class07211, var1);
      if (class07209 == null) {
         return new class07121(var2, 0, class07211, var1, 0, 0);
      } else {
         int ix = N(var0, class07209, class07211);
         if (ix == 0) {
            return new class07121(var2, 0, class07211, class07209, 0, 0);
         } else {
            MutableInt mutableint = new MutableInt();
            int j = N(var0, class07209, class07211, ix, mutableint);
            return new class07121(var2, mutableint.intValue(), class07211, class07209, ix, j);
         }
      }
   }

   public static Optional<class07121> N(class07284 var0, class07209 var1, Predicate<class07121> var2, class07185 var3) {
      Optional optional = Optional.of(N((class07290)var0, var1, var3)).filter(var2);
      if (optional.isPresent()) {
         return optional;
      } else {
         class07185 class07185 = var3 == class07185.field_11048 ? class07185.field_11051 : class07185.field_11048;
         return Optional.of(N((class07290)var0, var1, class07185)).filter(var2);
      }
   }

   public boolean N() {
      return this.W >= 2 && this.W <= 21 && this.E >= 3 && this.E <= 21;
   }

   public static Optional<class07121> N(class07284 var0, class07209 var1, class07185 var2) {
      return N(var0, var1, var0x -> var0x.N() && var0x.z == 0, var2);
   }

   private static int N(class07290 var0, class07209 var1, class07211 var2, class07218 var3, int var4, MutableInt var5) {
      for (int ix = 0; ix < 21; ix++) {
         var3.N(var1).N(class07211.field_11036, ix).N(var2, -1);
         if (!i.test(var0.method_8320(var3), var0, var3)) {
            return ix;
         }

         var3.N(var1).N(class07211.field_11036, ix).N(var2, var4);
         if (!i.test(var0.method_8320(var3), var0, var3)) {
            return ix;
         }

         for (int j = 0; j < var4; j++) {
            var3.N(var1).N(class07211.field_11036, ix).N(var2, j);
            class00500 class00500 = var0.method_8320(var3);
            if (!N(class00500)) {
               return ix;
            }

            if (class00500.N(class00869.iq)) {
               var5.increment();
            }
         }
      }

      return 21;
   }

   private static boolean N(class07290 var0, class07209 var1, class07211 var2, class07218 var3, int var4, int var5) {
      for (int ix = 0; ix < var4; ix++) {
         class07218 class07218 = var3.N(var1).N(class07211.field_11036, var5).N(var2, ix);
         if (!i.test(var0.method_8320(class07218), var0, class07218)) {
            return false;
         }
      }

      return true;
   }
}
