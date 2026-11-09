package minecraft;

import com.mojang.serialization.Codec;

public class class05986 extends class06391<class06020> {
   private static final float NE = 0.06F;

   public class05986(Codec<class06020> var1) {
      super(var1);
   }

   private void y(class05974 var1, class06069 var2, class06020 var3, class07209 var4, int var5, boolean var6) {
      class07218 class07218 = new class07218();
      boolean flag = var3.u.N(class00869.EJ);
      int i = Math.min(var2.y(1 + var5 / 3) + 5, var5);
      int j = var5 - i;

      for (int k = j; k <= var5; k++) {
         int l = k < var5 - var2.y(3) ? 2 : 1;
         if (i > 8 && k < j + 4) {
            l = 3;
         }

         if (var6) {
            l++;
         }

         for (int i1 = -l; i1 <= l; i1++) {
            for (int j1 = -l; j1 <= l; j1++) {
               boolean flag1 = i1 == -l || i1 == l;
               boolean flag2 = j1 == -l || j1 == l;
               boolean flag3 = !flag1 && !flag2 && k != var5;
               boolean flag4 = flag1 && flag2;
               boolean flag5 = k < j + 3;
               class07218.N(var4, i1, k, j1);
               if (N(var1, class07218, var3, false)) {
                  if (var3.B && !var1.method_8320(class07218.method_10074()).P()) {
                     var1.N(class07218, true);
                  }

                  if (flag5) {
                     if (!flag3) {
                        this.N(var1, var2, class07218, var3.u, flag);
                     }
                  } else if (flag3) {
                     this.N(var1, var2, var3, class07218, 0.1F, 0.2F, flag ? 0.1F : 0.0F);
                  } else if (flag4) {
                     this.N(var1, var2, var3, class07218, 0.01F, 0.7F, flag ? 0.083F : 0.0F);
                  } else {
                     this.N(var1, var2, var3, class07218, 5.0E-4F, 0.98F, flag ? 0.07F : 0.0F);
                  }
               }
            }
         }
      }
   }

   private static void N(class07209 var0, class07284 var1, class06069 var2) {
      class07218 class07218 = var0.method_25503().N(class07211.field_11033);
      if (var1.R(class07218)) {
         int i = class04995.N(var2, 1, 5);
         if (var2.y(7) == 0) {
            i *= 2;
         }

         byte b0 = 23;
         byte b1 = 25;
         class06011.N(var1, var2, class07218, i, 23, 25);
      }
   }

   private void N(class07284 var1, class06069 var2, class07209 var3, class00500 var4, boolean var5) {
      if (var1.method_8320(var3.method_10074()).N(var4.i())) {
         this.N(var1, var3, var4);
      } else if (var2.z() < 0.15) {
         this.N(var1, var3, var4);
         if (var5 && var2.y(11) == 0) {
            N(var3, var1, var2);
         }
      }
   }

   private void N(class07284 var1, class06069 var2, class06020 var3, class07218 var4, float var5, float var6, float var7) {
      if (var2.z() < var5) {
         this.N(var1, var4, var3.i);
      } else if (var2.z() < var6) {
         this.N(var1, var4, var3.u);
         if (var2.z() < var7) {
            N(var4, var1, var2);
         }
      }
   }

   @Override
   public boolean N(class06058<class06020> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      class06069 class06069 = var1.u();
      class08088 class08088 = var1.L();
      class06020 class06020 = (class06020)var1.R();
      class00891 class00891 = class06020.y.i();
      class07209 class07209x = null;
      if (class05974.method_8320(class07209x.method_10074()).N(class00891)) {
         class07209x = class07209x;
      }

      if (class07209x == null) {
         return false;
      } else {
         int i = class04995.N(class06069, 4, 13);
         if (class06069.y(12) == 0) {
            i *= 2;
         }

         if (!class06020.B) {
            int j = class08088.i();
            if (class07209x.method_10264() + i + 1 >= j) {
               return false;
            }
         }

         boolean flag = !class06020.B && class06069.z() < 0.06F;
         class05974.method_8652(class07209x, class00869.N.W(), 260);
         this.N(class05974, class06069, class06020, class07209x, i, flag);
         this.y(class05974, class06069, class06020, class07209x, i, flag);
         return true;
      }
   }

   private void N(class05974 var1, class06069 var2, class06020 var3, class07209 var4, int var5, boolean var6) {
      class07218 class07218 = new class07218();
      class00500 class00500 = var3.L;
      int i = var6 ? 1 : 0;

      for (int j = -i; j <= i; j++) {
         for (int k = -i; k <= i; k++) {
            boolean flag = var6 && class04995.N(j) == i && class04995.N(k) == i;

            for (int l = 0; l < var5; l++) {
               class07218.N(var4, j, l, k);
               if (N(var1, class07218, var3, true)) {
                  if (var3.B) {
                     if (!var1.method_8320(class07218.method_10074()).P()) {
                        var1.N(class07218, true);
                     }

                     var1.method_8652(class07218, class00500, 3);
                  } else if (flag) {
                     if (var2.z() < 0.1F) {
                        this.N(var1, class07218, class00500);
                     }
                  } else {
                     this.N(var1, class07218, class00500);
                  }
               }
            }
         }
      }
   }

   private static boolean N(class05974 var0, class07209 var1, class06020 var2, boolean var3) {
      if (var0.method_16358(var1, class01339::d)) {
         return true;
      } else {
         return var3 ? var2.M.test(var0, var1) : false;
      }
   }
}
