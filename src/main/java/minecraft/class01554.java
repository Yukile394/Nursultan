package minecraft;

import com.mojang.serialization.Codec;

public class class01554 extends class06391<class03967> {
   private static boolean L(class00500 var0) {
      return var0.N(class00869.zn) || var0.N(class00869.ib) || var0.N(class00869.mf);
   }

   public class01554(Codec<class03967> var1) {
      super(var1);
   }

   private int y(int var1, int var2, int var3) {
      float f = 1.0F;
      return class04995.u((1.0F - (float)Math.pow(var1, 2.0) / (var2 * 1.0F)) * var3 / 2.0F);
   }

   private int y(class06069 var1, int var2, int var3, int var4) {
      float f = 1.0F + var1.z() / 2.0F;
      return class04995.u((1.0F - var2 / (var3 * f)) * var4 / 2.0F);
   }

   private double N(int var1, int var2, class07209 var3, int var4, class06069 var5) {
      return 10.0F * class04995.N(var5.z(), 0.2F, 0.8F) / var4
         + Math.pow(var1 - var3.method_10263(), 2.0)
         + Math.pow(var2 - var3.method_10260(), 2.0)
         - Math.pow(var4, 2.0);
   }

   private double N(int var1, int var2, class07209 var3, int var4, int var5, double var6) {
      return Math.pow(((var1 - var3.method_10263()) * Math.cos(var6) - (var2 - var3.method_10260()) * Math.sin(var6)) / var4, 2.0)
         + Math.pow(((var1 - var3.method_10263()) * Math.sin(var6) + (var2 - var3.method_10260()) * Math.cos(var6)) / var5, 2.0)
         - 1.0;
   }

   private int N(class06069 var1, int var2, int var3, int var4) {
      float f = 3.5F - var1.z();
      float f1 = (1.0F - (float)Math.pow(var2, 2.0) / (var3 * f)) * var4;
      if (var3 > 15 + var1.y(5)) {
         int i = var2 < 3 + var1.y(6) ? var2 / 2 : var2;
         f1 = (1.0F - i / (var3 * f * 0.4F)) * var4;
      }

      return class04995.u(f1 / 2.0F);
   }

   private void N(class07284 var1, class07209 var2, int var3, int var4, boolean var5, int var6) {
      int i = var5 ? var6 : var3 / 2;

      for (int j = -i; j <= i; j++) {
         for (int k = -i; k <= i; k++) {
            for (int l = 0; l <= var4; l++) {
               class07209 class07209 = var2.method_10069(j, l, k);
               class00500 class00500 = var1.method_8320(class07209);
               if (L(class00500) || class00500.N(class00869.is)) {
                  if (this.N((class07290)var1, class07209)) {
                     this.N(var1, class07209, class00869.N.W());
                     this.N(var1, class07209.method_10084(), class00869.N.W());
                  } else if (L(class00500)) {
                     class00500[] aclass00500 = new class00500[]{
                        var1.method_8320(class07209.method_10067()),
                        var1.method_8320(class07209.method_10078()),
                        var1.method_8320(class07209.method_10095()),
                        var1.method_8320(class07209.method_10072())
                     };
                     int i1 = 0;
                     class00500[] aclass005001 = aclass00500;
                     int j1 = aclass00500.length;

                     for (int k1 = 0; k1 < j1; k1++) {
                        if (!L(aclass005001[k1])) {
                           i1++;
                        }
                     }

                     if (i1 >= 3) {
                        this.N(var1, class07209, class00869.N.W());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean N(class07290 var1, class07209 var2) {
      return var1.method_8320(var2.method_10074()).P();
   }

   private void N(class07284 var1, class07209 var2) {
      if (var1.method_8320(var2.method_10084()).N(class00869.is)) {
         this.N(var1, var2.method_10084(), class00869.N.W());
      }
   }

   private void N(int var1, int var2, class07209 var3, class07284 var4, boolean var5, double var6, class07209 var8, int var9, int var10) {
      int i = var1 + 1 + var9 / 3;
      int j = Math.min(var1 - 3, 3) + var10 / 2 - 1;

      for (int k = -i; k < i; k++) {
         for (int l = -i; l < i; l++) {
            if (this.N(k, l, var8, i, j, var6) < 0.0) {
               class07209 class07209 = var3.method_10069(k, var2, l);
               class00500 class00500 = var4.method_8320(class07209);
               if (L(class00500) || class00500.N(class00869.ib)) {
                  if (var5) {
                     this.N(var4, class07209, class00869.K.W());
                  } else {
                     this.N(var4, class07209, class00869.N.W());
                     this.N(var4, class07209);
                  }
               }
            }
         }
      }
   }

   private void N(class06069 var1, class07284 var2, int var3, int var4, class07209 var5, boolean var6, int var7, double var8, int var10) {
      int i = var1.Z() ? -1 : 1;
      int j = var1.Z() ? -1 : 1;
      int k = var1.y(Math.max(var3 / 2 - 2, 1));
      if (var1.Z()) {
         k = var3 / 2 + 1 - var1.y(Math.max(var3 - var3 / 2 - 1, 1));
      }

      int l = var1.y(Math.max(var3 / 2 - 2, 1));
      if (var1.Z()) {
         l = var3 / 2 + 1 - var1.y(Math.max(var3 - var3 / 2 - 1, 1));
      }

      if (var6) {
         k = l = var1.y(Math.max(var7 - 5, 1));
      }

      class07209 class07209 = new class07209(i * k, 0, j * l);
      double d0 = var6 ? var8 + (Math.PI / 2) : var1.U() * 2.0 * Math.PI;

      for (int i1 = 0; i1 < var4 - 3; i1++) {
         int j1 = this.N(var1, i1, var4, var3);
         this.N(j1, i1, var5, var2, false, d0, class07209, var7, var10);
      }

      for (int k1 = -1; k1 > -var4 + var1.y(5); k1--) {
         int l1 = this.y(var1, -k1, var4, var3);
         this.N(l1, k1, var5, var2, true, d0, class07209, var7, var10);
      }
   }

   @Override
   public boolean N(class06058<class03967> var1) {
      class07209 class07209 = var1.i();
      class05974 class05974 = var1.y();
      class07209 = new class07209(class07209.method_10263(), var1.L().R(), class07209.method_10260());
      class06069 class06069 = var1.u();
      boolean flag = class06069.U() > 0.7;
      class00500 class00500 = ((class03967)var1.R()).y;
      double d0 = class06069.U() * 2.0 * Math.PI;
      int i = 11 - class06069.y(5);
      int j = 3 + class06069.y(3);
      boolean flag1 = class06069.U() > 0.7;
      byte b0 = 11;
      int k = flag1 ? class06069.y(6) + 6 : class06069.y(15) + 3;
      if (!flag1 && class06069.U() > 0.9) {
         k += class06069.y(19) + 7;
      }

      int l = Math.min(k + class06069.y(11), 18);
      int i1 = Math.min(k + class06069.y(7) - class06069.y(5), 11);
      int j1 = flag1 ? i : 11;

      for (int k1 = -j1; k1 < j1; k1++) {
         for (int l1 = -j1; l1 < j1; l1++) {
            for (int i2 = 0; i2 < k; i2++) {
               int j2 = flag1 ? this.y(i2, k, i1) : this.N(class06069, i2, k, i1);
               if (flag1 || k1 < j2) {
                  this.N(class05974, class06069, class07209, k, k1, i2, l1, j2, j1, flag1, j, d0, flag, class00500);
               }
            }
         }
      }

      this.N(class05974, class07209, i1, k, flag1, i);

      for (int l2 = -j1; l2 < j1; l2++) {
         for (int i3 = -j1; i3 < j1; i3++) {
            for (int j3 = -1; j3 > -l; j3--) {
               int k3 = flag1 ? class04995.u(j1 * (1.0F - (float)Math.pow(j3, 2.0) / (l * 8.0F))) : j1;
               int k2 = this.y(class06069, -j3, l, i1);
               if (l2 < k2) {
                  this.N(class05974, class06069, class07209, l, l2, j3, i3, k2, k3, flag1, j, d0, flag, class00500);
               }
            }
         }
      }

      boolean flag2 = flag1 ? class06069.U() > 0.1 : class06069.U() > 0.7;
      if (flag2) {
         this.N(class06069, class05974, i1, k, class07209, flag1, i, d0, j);
      }

      return true;
   }

   private void N(
      class07284 var1,
      class06069 var2,
      class07209 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      boolean var10,
      int var11,
      double var12,
      boolean var14,
      class00500 var15
   ) {
      double d0 = var10
         ? this.N(var5, var7, class07209.field_10980, var9, this.N(var6, var4, var11), var12)
         : this.N(var5, var7, class07209.field_10980, var8, var2);
      if (d0 < 0.0) {
         class07209 class07209 = var3.method_10069(var5, var6, var7);
         double d1 = var10 ? -0.5 : -6 - var2.y(3);
         if (d0 > d1 && var2.U() > 0.9) {
            return;
         }

         this.N(class07209, var1, var2, var4 - var6, var4, var10, var14, var15);
      }
   }

   private void N(class07209 var1, class07284 var2, class06069 var3, int var4, int var5, boolean var6, boolean var7, class00500 var8) {
      class00500 class00500 = var2.method_8320(var1);
      if (class00500.P() || class00500.N(class00869.ib) || class00500.N(class00869.iT) || class00500.N(class00869.K)) {
         boolean flag = !var6 || var3.U() > 0.05;
         int i = var6 ? 3 : 2;
         if (var7 && !class00500.N(class00869.K) && var4 <= var3.y(Math.max(1, var5 / i)) + var5 * 0.6 && flag) {
            this.N(var2, var1, class00869.ib.W());
         } else {
            this.N(var2, var1, var8);
         }
      }
   }

   private int N(int var1, int var2, int var3) {
      int i = var3;
      if (var1 > 0 && var2 - var1 <= 3) {
         i = var3 - (4 - (var2 - var1));
      }

      return i;
   }
}
