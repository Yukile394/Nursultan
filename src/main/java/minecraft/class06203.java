package minecraft;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Function;

public class class06203 extends class06391<class06191> {
   public class06203(Codec<class06191> var1) {
      super(var1);
   }

   protected static boolean N(class06069 var0, float var1) {
      if (var1 <= 0.0F) {
         return true;
      } else {
         return var1 >= 1.0F ? false : var0.z() >= var1;
      }
   }

   public static boolean N(class00500 var0, Function<class07209, class00500> var1, class06069 var2, class06191 var3, class06209 var4, class07218 var5) {
      if (!var4.y.N(var0, var2)) {
         return false;
      } else {
         return N(var2, var3.u) ? true : !N(var1, var5);
      }
   }

   protected boolean N(
      class05974 var1,
      class06069 var2,
      class06191 var3,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      int i = 0;
      BitSet bitset = new BitSet(var19 * var20 * var19);
      class07218 class07218 = new class07218();
      int j = var3.L;
      double[] adouble = new double[j * 4];

      for (int k = 0; k < j; k++) {
         float f = (float)k / j;
         double d0 = class04995.u((double)f, var4, var6);
         double d1 = class04995.u((double)f, var12, var14);
         double d2 = class04995.u((double)f, var8, var10);
         double d3 = var2.U() * j / 16.0;
         double d4 = ((class04995.m((float) Math.PI * f) + 1.0F) * d3 + 1.0) / 2.0;
         adouble[k * 4 + 0] = d0;
         adouble[k * 4 + 1] = d1;
         adouble[k * 4 + 2] = d2;
         adouble[k * 4 + 3] = d4;
      }

      for (int l3 = 0; l3 < j - 1; l3++) {
         if (!(adouble[l3 * 4 + 3] <= 0.0)) {
            for (int i4 = l3 + 1; i4 < j; i4++) {
               if (!(adouble[i4 * 4 + 3] <= 0.0)) {
                  double d8 = adouble[l3 * 4 + 0] - adouble[i4 * 4 + 0];
                  double d10 = adouble[l3 * 4 + 1] - adouble[i4 * 4 + 1];
                  double d12 = adouble[l3 * 4 + 2] - adouble[i4 * 4 + 2];
                  double d14 = adouble[l3 * 4 + 3] - adouble[i4 * 4 + 3];
                  if (d14 * d14 > d8 * d8 + d10 * d10 + d12 * d12) {
                     if (d14 > 0.0) {
                        adouble[i4 * 4 + 3] = -1.0;
                     } else {
                        adouble[l3 * 4 + 3] = -1.0;
                     }
                  }
               }
            }
         }
      }

      try (class06054 class06054 = new class06054(var1)) {
         for (int j4 = 0; j4 < j; j4++) {
            double d9 = adouble[j4 * 4 + 3];
            if (!(d9 < 0.0)) {
               double d11 = adouble[j4 * 4 + 0];
               double d13 = adouble[j4 * 4 + 1];
               double d15 = adouble[j4 * 4 + 2];
               int k4 = Math.max(class04995.N(d11 - d9), var16);
               int l = Math.max(class04995.N(d13 - d9), var17);
               int i1 = Math.max(class04995.N(d15 - d9), var18);
               int j1 = Math.max(class04995.N(d11 + d9), k4);
               int k1 = Math.max(class04995.N(d13 + d9), l);
               int l1 = Math.max(class04995.N(d15 + d9), i1);

               for (int i2 = k4; i2 <= j1; i2++) {
                  double d5 = (i2 + 0.5 - d11) / d9;
                  if (d5 * d5 < 1.0) {
                     for (int j2 = l; j2 <= k1; j2++) {
                        double d6 = (j2 + 0.5 - d13) / d9;
                        if (d5 * d5 + d6 * d6 < 1.0) {
                           for (int k2 = i1; k2 <= l1; k2++) {
                              double d7 = (k2 + 0.5 - d15) / d9;
                              if (d5 * d5 + d6 * d6 + d7 * d7 < 1.0 && !var1.method_31601(j2)) {
                                 int l2 = i2 - var16 + (j2 - var17) * var19 + (k2 - var18) * var19 * var20;
                                 if (!bitset.get(l2)) {
                                    bitset.set(l2);
                                    class07218.N(i2, j2, k2);
                                    if (var1.u(class07218)) {
                                       class00554 class00554 = class06054.N(class07218);
                                       if (class00554 != null) {
                                          int i3 = class01296.y(i2);
                                          int j3 = class01296.y(j2);
                                          int k3 = class01296.y(k2);
                                          class00500 class00500 = class00554.N(i3, j3, k3);

                                          for (class06209 class06209 : var3.y) {
                                             if (N(class00500, class06054::y, var2, var3, class06209, class07218)) {
                                                class00554.N(i3, j3, k3, class06209.L, false);
                                                i++;
                                                break;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return i > 0;
   }

   @Override
   public boolean N(class06058<class06191> var1) {
      class06069 class06069 = var1.u();
      class07209 class07209 = var1.i();
      class05974 class05974 = var1.y();
      class06191 class06191 = (class06191)var1.R();
      float f = class06069.z() * (float) Math.PI;
      float f1 = class06191.L / 8.0F;
      int i = class04995.u((class06191.L / 16.0F * 2.0F + 1.0F) / 2.0F);
      double d0 = class07209.method_10263() + Math.sin(f) * f1;
      double d1 = class07209.method_10263() - Math.sin(f) * f1;
      double d2 = class07209.method_10260() + Math.cos(f) * f1;
      double d3 = class07209.method_10260() - Math.cos(f) * f1;
      byte b0 = 2;
      double d4 = class07209.method_10264() + class06069.y(3) - 2;
      double d5 = class07209.method_10264() + class06069.y(3) - 2;
      int j = class07209.method_10263() - class04995.u(f1) - i;
      int k = class07209.method_10264() - 2 - i;
      int l = class07209.method_10260() - class04995.u(f1) - i;
      int i1 = 2 * (class04995.u(f1) + i);
      int j1 = 2 * (2 + i);

      for (int k1 = j; k1 <= j + i1; k1++) {
         for (int l1 = l; l1 <= l + i1; l1++) {
            if (k <= class05974.method_8624(class07830.field_13195, k1, l1)) {
               return this.N(class05974, class06069, class06191, d0, d1, d2, d3, d4, d5, j, k, l, i1, j1);
            }
         }
      }

      return false;
   }
}
