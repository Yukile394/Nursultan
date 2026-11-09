package minecraft;

import org.jspecify.annotations.Nullable;

public class class06170 implements class05975 {
   private static final int y = 1200;
   public static final int N = 24000;
   private static final int L = 25;
   private static final int u = 75;
   private static final int i = 25;
   private static final int R = 10;
   private static final int M = 10;
   private final class06069 B = class06069.u();
   private final class05212 Z;
   private int z;
   private int U;
   private int E;

   public class06170(class05212 var1) {
      super();
      this.Z = var1;
      this.z = 1200;
      this.U = var1.j();
      this.E = var1.v();
      if (this.U == 0 && this.E == 0) {
         this.U = 24000;
         var1.u(this.U);
         this.E = 25;
         var1.i(this.E);
      }
   }

   @Nullable
   private class07209 N(class05487 var1, class07209 var2, int var3) {
      class07209 class07209x = null;
      class02875 class02875 = class07448.N(class07078.yc);

      for (int ix = 0; ix < 10; ix++) {
         int j = var2.method_10263() + this.B.y(var3 * 2) - var3;
         int k = var2.method_10260() + this.B.y(var3 * 2) - var3;
         int l = var1.method_8624(class07830.field_13202, j, k);
         class07209 class07209x = new class07209(j, l, k);
         if (class02875.isSpawnPositionOk(var1, class07209x, class07078.yc)) {
            class07209x = class07209x;
            break;
         }
      }

      return class07209x;
   }

   private boolean N(class07290 var1, class07209 var2) {
      for (class07209 class07209 : class07209.method_10097(var2, var2.method_10069(1, 2, 1))) {
         if (!var1.method_8320(class07209).M(var1, class07209).method_1110()) {
            return false;
         }
      }

      return true;
   }

   private void N(class04782 var1, class06163 var2, int var3) {
      class07209 class07209 = this.N(var1, var2.method_24515(), var3);
      if (class07209 != null) {
         class06179 class06179 = class07078.yJ.N(var1, class07209, class06113.field_16467);
         if (class06179 != null) {
            class06179.N(var2, true);
         }
      }
   }

   private boolean N(class04782 var1) {
      class04770 class04770 = var1.method_18779();
      if (class04770 == null) {
         return true;
      } else if (this.B.y(10) != 0) {
         return false;
      } else {
         class07209 class07209xx = class04770.method_24515();
         byte b0 = 48;
         class07209 class07209x = var1.method_19494()
            .u(var0 -> var0.N(class03927.P), var0 -> true, class07209xx, 48, class05372.field_18489)
            .orElse(class07209xx);
         class07209 class07209xx = this.N(var1, class07209x, 48);
         if (class07209xx != null && this.N(var1, class07209xx)) {
            if (var1.i(class07209xx).N(class03557.NL)) {
               return false;
            }

            class06163 class06163 = class07078.yc.N(var1, class07209xx, class06113.field_16467);
            if (class06163 != null) {
               for (int ix = 0; ix < 2; ix++) {
                  this.N(var1, class06163, 4);
               }

               this.Z.N(class06163.method_5667());
               class06163.y(48000);
               class06163.N(class07209x);
               class06163.N(class07209x, 16);
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public void N(class04782 var1, boolean var2) {
      if (var1.method_64395().N(class07305.r)) {
         if (--this.z <= 0) {
            this.z = 1200;
            this.U -= 1200;
            this.Z.u(this.U);
            if (this.U <= 0) {
               this.U = 24000;
               int ix = this.E;
               this.E = class04995.N(this.E + 25, 25, 75);
               this.Z.i(this.E);
               if (this.B.y(100) <= ix) {
                  if (this.N(var1)) {
                     this.E = 25;
                  }
               }
            }
         }
      }
   }
}
