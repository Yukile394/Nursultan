package minecraft;

import java.util.Optional;
import net.caffeinemc.mods.lithium.common.util.POIRegistryEntries;

public class class00770 {
   public static final int N = 3;
   private static final int y = 16;
   private static final int L = 128;
   private static final int u = 5;
   private static final int i = 4;
   private static final int R = 3;
   private static final int M = -1;
   private static final int B = 4;
   private static final int Z = -1;
   private static final int z = 3;
   private static final int U = -1;
   private static final int E = 2;
   private static final int W = -1;
   private final class04782 m;

   public class00770(class04782 var1) {
      super();
      this.m = var1;
   }

   public Optional N(class07209 var1, boolean var2, class08057 var3) {
      int ix = var2 ? 16 : 128;
      class05368 class05368 = this.m.method_19494();
      class05368.N(this.m, var1, ix);
      return class05368.lithium$findNearestForPortalLogic(
            var1, ix, POIRegistryEntries.NETHER_PORTAL_ENTRY, class05372.field_18489, var1x -> this.m.method_8320(var1x.M()).y(class06665.K), var3
         )
         .map(class05377::M);
   }

   public Optional<class01009> N(class07209 var1, class07185 var2) {
      class07211 class07211x = class07211.N(class07212.field_11056, var2);
      double d0 = -1.0;
      class07209 class07209x = null;
      double d1 = -1.0;
      class07209 class07209x = null;
      class08057 class08057 = this.m.method_8621();
      int ix = Math.min(this.m.method_31600(), this.m.method_31607() + this.m.method_32819() - 1);
      boolean flag = true;
      class07218 class07218x = var1.method_25503();

      for (class07218 class07218x : class07209.method_30512(var1, 16, class07211.field_11034, class07211.field_11035)) {
         int j = Math.min(ix, this.m.method_8624(class07830.field_13197, class07218x.method_10263(), class07218x.method_10260()));
         if (class08057.N(class07218x) && class08057.N(class07218x.N(class07211x, 1))) {
            class07218x.N(class07211x.b(), 1);

            for (int k = j; k >= this.m.method_31607(); k--) {
               class07218x.method_10099(k);
               if (this.N(class07218x)) {
                  int l = k;

                  while (k > this.m.method_31607() && this.N(class07218x.N(class07211.field_11033))) {
                     k--;
                  }

                  if (k + 4 <= ix) {
                     int i1 = l - k;
                     if (i1 <= 0 || i1 >= 3) {
                        class07218x.method_10099(k);
                        if (this.N(class07218x, class07218x, class07211x, 0)) {
                           double d2 = var1.method_10262(class07218x);
                           if (this.N(class07218x, class07218x, class07211x, -1) && this.N(class07218x, class07218x, class07211x, 1) && (d0 == -1.0 || d0 > d2)
                              )
                            {
                              d0 = d2;
                              class07209x = class07218x.method_10062();
                           }

                           if (d0 == -1.0 && (d1 == -1.0 || d1 > d2)) {
                              d1 = d2;
                              class07209x = class07218x.method_10062();
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (d0 == -1.0 && d1 != -1.0) {
         class07209x = class07209x;
         d0 = d1;
      }

      if (d0 == -1.0) {
         int j1 = Math.max(this.m.method_31607() - -1, 70);
         int l1 = ix - 9;
         if (l1 < j1) {
            return Optional.empty();
         }

         class07209x = new class07209(
               var1.method_10263() - class07211x.P() * 1, class04995.N(var1.method_10264(), j1, l1), var1.method_10260() - class07211x.T() * 1
            )
            .method_10062();
         class07209x = class08057.y(class07209x);
         class07211 class07211x = class07211x.R();

         for (int l2 = -1; l2 < 2; l2++) {
            for (int i3 = 0; i3 < 2; i3++) {
               for (int j3 = -1; j3 < 3; j3++) {
                  class00500 class00500x = j3 < 0 ? class00869.LV.W() : class00869.N.W();
                  class07218x.N(class07209x, i3 * class07211x.P() + l2 * class07211x.P(), j3, i3 * class07211x.T() + l2 * class07211x.T());
                  this.m.method_8501(class07218x, class00500x);
               }
            }
         }
      }

      for (int k1 = -1; k1 < 3; k1++) {
         for (int i2 = -1; i2 < 4; i2++) {
            if (k1 == -1 || k1 == 2 || i2 == -1 || i2 == 3) {
               class07218x.N(class07209x, k1 * class07211x.P(), i2, k1 * class07211x.T());
               this.m.method_8652(class07218x, class00869.LV.W(), 3);
            }
         }
      }

      class00500 class00500 = class00869.iq.W().y(class07136.y, var2);

      for (int j2 = 0; j2 < 2; j2++) {
         for (int k2 = 0; k2 < 3; k2++) {
            class07218x.N(class07209x, j2 * class07211x.P(), k2, j2 * class07211x.T());
            this.m.method_8652(class07218x, class00500, 18);
         }
      }

      return Optional.of(new class01009(class07209x.method_10062(), 2, 3));
   }

   private boolean N(class07218 var1) {
      class00500 class00500 = this.m.method_8320(var1);
      return class00500.d() && class00500.Y().W();
   }

   private boolean N(class07209 var1, class07218 var2, class07211 var3, int var4) {
      class07211 class07211 = var3.R();

      for (int ix = -1; ix < 3; ix++) {
         for (int j = -1; j < 4; j++) {
            var2.N(var1, var3.P() * ix + class07211.P() * var4, j, var3.T() * ix + class07211.T() * var4);
            if (j < 0 && !this.m.method_8320(var2).B()) {
               return false;
            }

            if (j >= 0 && !this.N(var2)) {
               return false;
            }
         }
      }

      return true;
   }
}
