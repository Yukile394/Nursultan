package minecraft;

import com.mojang.serialization.Codec;

@Deprecated
public class class01551 extends class06391<class01579> {
   private static final class00500 NE = class00869.mr.W();

   private boolean L(class00500 var1) {
      return !var1.N(class01210.Lu);
   }

   public class01551(Codec<class01579> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class01579> var1) {
      class07209 class07209xxx = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class01579 class01579 = (class01579)var1.R();
      if (class07209xxx.method_10264() <= class05974.method_31607() + 4) {
         return false;
      } else {
         class07209xxx = class07209xxx.method_10087(4);
         boolean[] aboolean = new boolean[2048];
         int i = class06069.y(4) + 4;

         for (int j = 0; j < i; j++) {
            double d0 = class06069.U() * 6.0 + 3.0;
            double d1 = class06069.U() * 4.0 + 2.0;
            double d2 = class06069.U() * 6.0 + 3.0;
            double d3 = class06069.U() * (16.0 - d0 - 2.0) + 1.0 + d0 / 2.0;
            double d4 = class06069.U() * (8.0 - d1 - 4.0) + 2.0 + d1 / 2.0;
            double d5 = class06069.U() * (16.0 - d2 - 2.0) + 1.0 + d2 / 2.0;

            for (int l = 1; l < 15; l++) {
               for (int i1 = 1; i1 < 15; i1++) {
                  for (int j1 = 1; j1 < 7; j1++) {
                     double d6 = (l - d3) / (d0 / 2.0);
                     double d7 = (j1 - d4) / (d1 / 2.0);
                     double d8 = (i1 - d5) / (d2 / 2.0);
                     if (d6 * d6 + d7 * d7 + d8 * d8 < 1.0) {
                        aboolean[(l * 16 + i1) * 8 + j1] = true;
                     }
                  }
               }
            }
         }

         class00500 class00500 = class01579.N().N(class06069, class07209xxx);

         for (int k1 = 0; k1 < 16; k1++) {
            for (int k = 0; k < 16; k++) {
               for (int l2 = 0; l2 < 8; l2++) {
                  boolean flag = !aboolean[(k1 * 16 + k) * 8 + l2]
                     && (
                        k1 < 15 && aboolean[((k1 + 1) * 16 + k) * 8 + l2]
                           || k1 > 0 && aboolean[((k1 - 1) * 16 + k) * 8 + l2]
                           || k < 15 && aboolean[(k1 * 16 + k + 1) * 8 + l2]
                           || k > 0 && aboolean[(k1 * 16 + (k - 1)) * 8 + l2]
                           || l2 < 7 && aboolean[(k1 * 16 + k) * 8 + l2 + 1]
                           || l2 > 0 && aboolean[(k1 * 16 + k) * 8 + (l2 - 1)]
                     );
                  if (flag) {
                     class00500 class00500x = class05974.method_8320(class07209xxx.method_10069(k1, l2, k));
                     if (l2 >= 4 && class00500x.T()) {
                        return false;
                     }

                     if (l2 < 4 && !class00500x.B() && class05974.method_8320(class07209xxx.method_10069(k1, l2, k)) != class00500) {
                        return false;
                     }
                  }
               }
            }
         }

         for (int l1 = 0; l1 < 16; l1++) {
            for (int i2 = 0; i2 < 16; i2++) {
               for (int i3 = 0; i3 < 8; i3++) {
                  if (aboolean[(l1 * 16 + i2) * 8 + i3]) {
                     class07209 class07209x = class07209xxx.method_10069(l1, i3, i2);
                     if (this.L(class05974.method_8320(class07209x))) {
                        boolean flag1 = i3 >= 4;
                        class05974.method_8652(class07209x, flag1 ? NE : class00500, 2);
                        if (flag1) {
                           class05974.N(class07209x, NE.i(), 0);
                           this.N_59(class05974, class07209x);
                        }
                     }
                  }
               }
            }
         }

         class00500 class00500xx = class01579.y().N(class06069, class07209xxx);
         if (!class00500xx.P()) {
            for (int j2 = 0; j2 < 16; j2++) {
               for (int j3 = 0; j3 < 16; j3++) {
                  for (int l3 = 0; l3 < 8; l3++) {
                     boolean flag2 = !aboolean[(j2 * 16 + j3) * 8 + l3]
                        && (
                           j2 < 15 && aboolean[((j2 + 1) * 16 + j3) * 8 + l3]
                              || j2 > 0 && aboolean[((j2 - 1) * 16 + j3) * 8 + l3]
                              || j3 < 15 && aboolean[(j2 * 16 + j3 + 1) * 8 + l3]
                              || j3 > 0 && aboolean[(j2 * 16 + (j3 - 1)) * 8 + l3]
                              || l3 < 7 && aboolean[(j2 * 16 + j3) * 8 + l3 + 1]
                              || l3 > 0 && aboolean[(j2 * 16 + j3) * 8 + (l3 - 1)]
                        );
                     if (flag2 && (l3 < 4 || class06069.y(2) != 0)) {
                        class00500 class00500xxx = class05974.method_8320(class07209xxx.method_10069(j2, l3, j3));
                        if (class00500xxx.B() && !class00500xxx.N(class01210.Li)) {
                           class07209 class07209x = class07209xxx.method_10069(j2, l3, j3);
                           class05974.method_8652(class07209x, class00500xx, 2);
                           this.N_59(class05974, class07209x);
                        }
                     }
                  }
               }
            }
         }

         if (class00500.Y().N(class01231.N)) {
            for (int k2 = 0; k2 < 16; k2++) {
               for (int k3 = 0; k3 < 16; k3++) {
                  byte b0 = 4;
                  class07209 class07209x = class07209xxx.method_10069(k2, 4, k3);
                  if (class05974.i(class07209x).N().N(class05974, class07209x, false) && this.L(class05974.method_8320(class07209x))) {
                     class05974.method_8652(class07209x, class00869.iT.W(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
