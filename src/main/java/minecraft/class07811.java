package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public class class07811 extends class02158<class04389> {
   public class07811(Codec<class04389> var1) {
      super(var1);
   }

   protected double y() {
      return 1.0;
   }

   protected void N(
      class06080 var1,
      class04389 var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      long var5,
      class03460 var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      float var18,
      float var19,
      float var20,
      int var21,
      int var22,
      double var23,
      class03322 var25,
      class04521 var26
   ) {
      class06069 class06069 = class06069.y(var5);
      int i = class06069.y(var22 / 2) + var22 / 4;
      boolean flag = class06069.y(6) == 0;
      float f = 0.0F;
      float f1 = 0.0F;

      for (int j = var21; j < var22; j++) {
         double d0 = 1.5 + class04995.m((float) Math.PI * j / var22) * var18;
         double d1 = d0 * var23;
         float f2 = class04995.P(var20);
         var8 += class04995.P(var19) * f2;
         var10 += class04995.m(var20);
         var12 += class04995.m(var19) * f2;
         var20 *= flag ? 0.92F : 0.7F;
         var20 += f1 * 0.1F;
         var19 += f * 0.1F;
         f1 *= 0.9F;
         f *= 0.75F;
         f1 += (class06069.z() - class06069.z()) * class06069.z() * 2.0F;
         f += (class06069.z() - class06069.z()) * class06069.z() * 4.0F;
         if (j == i && var18 > 1.0F) {
            this.N(
               var1,
               var2,
               var3,
               var4,
               class06069.B(),
               var7,
               var8,
               var10,
               var12,
               var14,
               var16,
               class06069.z() * 0.5F + 0.5F,
               var19 - (float) (Math.PI / 2),
               var20 / 3.0F,
               j,
               var22,
               1.0,
               var25,
               var26
            );
            this.N(
               var1,
               var2,
               var3,
               var4,
               class06069.B(),
               var7,
               var8,
               var10,
               var12,
               var14,
               var16,
               class06069.z() * 0.5F + 0.5F,
               var19 + (float) (Math.PI / 2),
               var20 / 3.0F,
               j,
               var22,
               1.0,
               var25,
               var26
            );
            return;
         }

         if (class06069.y(4) != 0) {
            if (!N(var3.R(), var8, var12, j, var22, var18)) {
               return;
            }

            this.N(var1, var2, var3, var4, var7, var8, var10, var12, d0 * var14, d1 * var16, var25, var26);
         }
      }
   }

   private static boolean N(double var0, double var2, double var4, double var6) {
      return var2 <= var6 ? true : var0 * var0 + var2 * var2 + var4 * var4 >= 1.0;
   }

   public boolean N(class04389 var1, class06069 var2) {
      return var2.z() <= var1.y;
   }

   public boolean N(
      class06080 var1,
      class04389 var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      class06069 var5,
      class03460 var6,
      class07321 var7,
      class03322 var8
   ) {
      int i = class01296.L(this.u() * 2 - 1);
      int j = var5.y(var5.y(var5.y(this.N()) + 1) + 1);

      for (int k = 0; k < j; k++) {
         double d0 = var7.N(var5.y(16));
         double d1 = var2.B.N(var5, var1);
         double d2 = var7.y(var5.y(16));
         double d3 = var2.u.N(var5);
         double d4 = var2.i.N(var5);
         class04521 class04521 = (var2x, var3x, var5x, var7x, var9x) -> N(var3x, var5x, var7x, var0);
         int l = 1;
         if (var5.y(4) == 0) {
            double d5 = var2.Z.N(var5);
            float f1 = 1.0F + var5.z() * 6.0F;
            this.N(var1, var2, var3, var4, var6, d0, d1, d2, f1, d5, var8, class04521);
            l += var5.y(4);
         }

         for (int j1 = 0; j1 < l; j1++) {
            float f = var5.z() * (float) (Math.PI * 2);
            float f3 = (var5.z() - 0.5F) / 4.0F;
            float f2 = this.N(var5);
            int i1 = i - var5.y(i / 4);
            boolean flag = false;
            this.N(var1, var2, var3, var4, var5.B(), var6, d0, d1, d2, d3, d4, f2, f, f3, 0, i1, this.y(), var8, class04521);
         }
      }

      return true;
   }

   protected int N() {
      return 15;
   }

   protected float N(class06069 var1) {
      float f = var1.z() * 2.0F + var1.z();
      if (var1.y(10) == 0) {
         f *= var1.z() * var1.z() * 3.0F + 1.0F;
      }

      return f;
   }

   protected void N(
      class06080 var1,
      class04389 var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      class03460 var5,
      double var6,
      double var8,
      double var10,
      float var12,
      double var13,
      class03322 var15,
      class04521 var16
   ) {
      double d0 = 1.5 + class04995.m((float) (Math.PI / 2)) * var12;
      double d1 = d0 * var13;
      this.N(var1, var2, var3, var4, var5, var6 + 1.0, var8, var10, d0, d1, var15, var16);
   }
}
