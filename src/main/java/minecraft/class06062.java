package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public class class06062 extends class02158<class06072> {
   public class06062(Codec<class06072> var1) {
      super(var1);
   }

   private boolean N(class06080 var1, float[] var2, double var3, double var5, double var7, int var9) {
      int i = var9 - var1.i();
      return (var3 * var3 + var7 * var7) * var2[i - 1] + var5 * var5 / 6.0 >= 1.0;
   }

   private double N(class06072 var1, class06069 var2, double var3, float var5, float var6) {
      float f = 1.0F - class04995.L(0.5F - var6 / var5) * 2.0F;
      return (var1.i.R + var1.i.M * f) * var3 * class04995.y(var2, 0.75F, 1.0F);
   }

   public boolean N(class06072 var1, class06069 var2) {
      return var2.z() <= var1.y;
   }

   public boolean N(
      class06080 var1,
      class06072 var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      class06069 var5,
      class03460 var6,
      class07321 var7,
      class03322 var8
   ) {
      int i = (this.u() * 2 - 1) * 16;
      double d0 = var7.N(var5.y(16));
      int j = var2.B.N(var5, var1);
      double d1 = var7.y(var5.y(16));
      float f = var5.z() * (float) (Math.PI * 2);
      float f1 = var2.u.N(var5);
      double d2 = var2.Z.N(var5);
      float f2 = var2.i.L.N(var5);
      int k = (int)(i * var2.i.y.N(var5));
      boolean flag = false;
      this.N(var1, var2, var3, var4, var5.B(), var6, d0, j, d1, f2, f, f1, 0, k, d2, var8);
      return true;
   }

   private void N(
      class06080 var1,
      class06072 var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      long var5,
      class03460 var7,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      int var17,
      int var18,
      double var19,
      class03322 var21
   ) {
      class06069 class06069 = class06069.y(var5);
      float[] afloat = this.N(var1, var2, class06069);
      float f = 0.0F;
      float f1 = 0.0F;

      for (int i = var17; i < var18; i++) {
         double d0 = 1.5 + class04995.m(i * (float) Math.PI / var18) * var14;
         double d1 = d0 * var19;
         d0 *= var2.i.i.N(class06069);
         d1 = this.N(var2, class06069, d1, var18, i);
         float f2 = class04995.P(var16);
         float f3 = class04995.m(var16);
         var8 += class04995.P(var15) * f2;
         var10 += f3;
         var12 += class04995.m(var15) * f2;
         var16 *= 0.7F;
         var16 += f1 * 0.05F;
         var15 += f * 0.05F;
         f1 *= 0.8F;
         f *= 0.5F;
         f1 += (class06069.z() - class06069.z()) * class06069.z() * 2.0F;
         f += (class06069.z() - class06069.z()) * class06069.z() * 4.0F;
         if (class06069.y(4) != 0) {
            if (!N(var3.R(), var8, var12, i, var18, var14)) {
               return;
            }

            this.N(
               var1,
               var2,
               var3,
               var4,
               var7,
               var8,
               var10,
               var12,
               d0,
               d1,
               var21,
               (var2x, var3x, var5x, var7x, var9) -> this.N(var2x, afloat, var3x, var5x, var7x, var9)
            );
         }
      }
   }

   private float[] N(class06080 var1, class06072 var2, class06069 var3) {
      int i = var1.R();
      float[] afloat = new float[i];
      float f = 1.0F;

      for (int j = 0; j < i; j++) {
         if (j == 0 || var3.y(var2.i.u) == 0) {
            f = 1.0F + var3.z() * var3.z();
         }

         afloat[j] = f * f;
      }

      return afloat;
   }
}
