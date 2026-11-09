package minecraft;

public class class04300 {
   private static final float N = -0.51F;
   private static final float y = -0.4F;
   private static final float L = 0.1F;
   private static final float u = -0.15F;
   private static final class04573<Float> i = class04573.y;
   private static final class04573<Float> R = class04573.N(var0 -> var0 < 0.0F ? var0 : var0 * 2.0F);
   private static final class04573<Float> M = class04573.N(var0 -> 1.25F - 6.25F / (var0 + 5.0F));
   private static final class04573<Float> B = class04573.N(var0 -> var0 * 2.0F);

   public class04300() {
      super();
   }

   public static <C, I extends class04573<C>> class04562<C, I> y(I var0, I var1, I var2, I var3, boolean var4) {
      class04573<Float> class04573 = var4 ? B : i;
      float f = 0.65F;
      return class04562.<C, I>N((I)var0, class04573)
         .N(-0.11F, 0.0F)
         .N(0.03F, N((I)var1, (I)var2, (I)var3, 1.0F, 0.5F, 0.0F, 0.0F, class04573))
         .N(0.65F, N((I)var1, (I)var2, (I)var3, 1.0F, 1.0F, 1.0F, 0.0F, class04573))
         .N();
   }

   private static <C, I extends class04573<C>> class04562<C, I> N(
      I var0, float var1, float var2, float var3, float var4, float var5, float var6, class04573<Float> var7
   ) {
      float f = Math.max(0.5F * (var2 - var1), var6);
      float f1 = 5.0F * (var3 - var2);
      return class04562.<C, I>N((I)var0, var7)
         .N(-1.0F, var1, f)
         .N(-0.4F, var2, Math.min(f, f1))
         .N(0.0F, var3, f1)
         .N(0.4F, var4, 2.0F * (var4 - var3))
         .N(1.0F, var5, 0.7F * (var5 - var4))
         .N();
   }

   private static float N(float var0) {
      float f = 1.17F;
      float f1 = 0.46082947F;
      float f2 = 1.0F - (1.0F - var0) * 0.5F;
      return 0.5F * (1.0F - var0) / (0.46082947F * f2) - 1.17F;
   }

   public static <C, I extends class04573<C>> class04562<C, I> N(
      I var0, I var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, boolean var9, class04573<Float> var10
   ) {
      float f = 0.6F;
      float f1 = 0.5F;
      float f2 = 0.5F;
      class04562 class04562xxxxxxxx = N((I)var1, class04995.B(var5, 0.6F, 1.5F), var9, var10);
      class04562 class04562x = N((I)var1, class04995.B(var5, 0.6F, 1.0F), var9, var10);
      class04562 class04562xx = N((I)var1, var5, var9, var10);
      class04562 class04562xxx = N((I)var1, var2 - 0.15F, 0.5F * var5, class04995.B(0.5F, 0.5F, 0.5F) * var5, 0.5F * var5, 0.6F * var5, 0.5F, var10);
      class04562 class04562xxxx = N((I)var1, var2, var6 * var5, var3 * var5, 0.5F * var5, 0.6F * var5, 0.5F, var10);
      class04562 class04562xxxxx = N((I)var1, var2, var6, var6, var3, var4, 0.5F, var10);
      class04562 class04562xxxxxx = N((I)var1, var2, var6, var6, var3, var4, 0.5F, var10);
      class04562 class04562xxxxxxx = class04562.N((I)var1, var10).N(-1.0F, var2).N(-0.4F, class04562xxxxx).N(0.0F, var4 + 0.07F).N();
      class04562 class04562xxxxxxxx = N((I)var1, -0.02F, var7, var7, var3, var4, 0.0F, var10);
      class04571 class04571 = class04562.N((I)var0, var10)
         .N(-0.85F, class04562xxxxxxxx)
         .N(-0.7F, class04562x)
         .N(-0.4F, class04562xx)
         .N(-0.35F, class04562xxx)
         .N(-0.1F, class04562xxxx)
         .N(0.2F, class04562xxxxx);
      if (var8) {
         class04571.N(0.4F, class04562xxxxxx).N(0.45F, class04562xxxxxxx).N(0.55F, class04562xxxxxxx).N(0.58F, class04562xxxxxx);
      }

      class04571.N(0.7F, class04562xxxxxxxx);
      return class04571.N();
   }

   public static <C, I extends class04573<C>> class04562<C, I> N(I var0, I var1, I var2, boolean var3) {
      class04573<Float> class04573 = var3 ? R : i;
      class04562 class04562xxx = N((I)var1, (I)var2, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, class04573);
      class04562 class04562x = N((I)var1, (I)var2, -0.1F, 0.03F, 0.1F, 0.1F, 0.01F, -0.03F, false, false, class04573);
      class04562 class04562xx = N((I)var1, (I)var2, -0.1F, 0.03F, 0.1F, 0.7F, 0.01F, -0.03F, true, true, class04573);
      class04562 class04562xxx = N((I)var1, (I)var2, -0.05F, 0.03F, 0.1F, 1.0F, 0.01F, 0.01F, true, true, class04573);
      return class04562.<C, I>N((I)var0, class04573)
         .N(-1.1F, 0.044F)
         .N(-1.02F, -0.2222F)
         .N(-0.51F, -0.2222F)
         .N(-0.44F, -0.12F)
         .N(-0.18F, -0.12F)
         .N(-0.16F, class04562xxx)
         .N(-0.15F, class04562xxx)
         .N(-0.1F, class04562x)
         .N(0.25F, class04562xx)
         .N(1.0F, class04562xxx)
         .N();
   }

   private static <C, I extends class04573<C>> class04562<C, I> N(I var0, float var1, boolean var2, class04573<Float> var3) {
      class04571 class04571 = class04562.N((I)var0, var3);
      float f = -0.7F;
      float f1 = -1.0F;
      float f2 = N(-1.0F, var1, -0.7F);
      float f3 = 1.0F;
      float f4 = N(1.0F, var1, -0.7F);
      float f5 = N(var1);
      float f6 = -0.65F;
      if (-0.65F < f5 && f5 < 1.0F) {
         float f14 = N(-0.65F, var1, -0.7F);
         float f8 = -0.75F;
         float f9 = N(-0.75F, var1, -0.7F);
         float f10 = N(f2, f9, -1.0F, -0.75F);
         class04571.N(-1.0F, f2, f10);
         class04571.N(-0.75F, f9);
         class04571.N(-0.65F, f14);
         float f11 = N(f5, var1, -0.7F);
         float f12 = N(f11, f4, f5, 1.0F);
         float f13 = 0.01F;
         class04571.N(f5 - 0.01F, f11);
         class04571.N(f5, f11, f12);
         class04571.N(1.0F, f4, f12);
      } else {
         float f7 = N(f2, f4, -1.0F, 1.0F);
         if (var2) {
            class04571.N(-1.0F, Math.max(0.2F, f2));
            class04571.N(0.0F, class04995.B(0.5F, f2, f4), f7);
         } else {
            class04571.N(-1.0F, f2, f7);
         }

         class04571.N(1.0F, f4, f7);
      }

      return class04571.N();
   }

   private static <C, I extends class04573<C>> class04562<C, I> N(I var0, I var1, I var2, float var3, boolean var4, class04573<Float> var5) {
      class04562 class04562xxxx = class04562.N((I)var1, var5).N(-0.2F, 6.3F).N(0.2F, var3).N();
      class04571 class04571 = class04562.N((I)var0, var5)
         .N(-0.6F, class04562xxxx)
         .N(-0.5F, class04562.<C, I>N((I)var1, var5).N(-0.05F, 6.3F).N(0.05F, 2.67F).N())
         .N(-0.35F, class04562xxxx)
         .N(-0.25F, class04562xxxx)
         .N(-0.1F, class04562.<C, I>N((I)var1, var5).N(-0.05F, 2.67F).N(0.05F, 6.3F).N())
         .N(0.03F, class04562xxxx);
      if (var4) {
         class04562 class04562x = class04562.N((I)var1, var5).N(0.0F, var3).N(0.1F, 0.625F).N();
         class04562 class04562xx = class04562.N((I)var2, var5).N(-0.9F, var3).N(-0.69F, class04562x).N();
         class04571.N(0.35F, var3).N(0.45F, class04562xx).N(0.55F, class04562xx).N(0.62F, var3);
      } else {
         class04562 class04562x = class04562.N((I)var2, var5).N(-0.7F, class04562xxxx).N(-0.15F, 1.37F).N();
         class04562 class04562xx = class04562.N((I)var2, var5).N(0.45F, class04562xxxx).N(0.7F, 1.56F).N();
         class04571.N(0.05F, class04562xx).N(0.4F, class04562xx).N(0.45F, class04562x).N(0.55F, class04562x).N(0.58F, var3);
      }

      return class04571.N();
   }

   private static <C, I extends class04573<C>> class04562<C, I> N(I var0, float var1, class04573<Float> var2) {
      float f = 0.63F * var1;
      float f1 = 0.3F * var1;
      return class04562.<C, I>N((I)var0, var2).N(-0.01F, f).N(0.01F, f1).N();
   }

   private static <C, I extends class04573<C>> class04562<C, I> N(I var0, I var1, float var2, float var3, class04573<Float> var4) {
      float f = class03882.N(0.4F);
      float f1 = class03882.N(0.56666666F);
      float f2 = (f + f1) / 2.0F;
      class04571 class04571 = class04562.N((I)var1, var4);
      class04571.N(f, 0.0F);
      if (var3 > 0.0F) {
         class04571.N(f2, N((I)var0, var3, var4));
      } else {
         class04571.N(f2, 0.0F);
      }

      if (var2 > 0.0F) {
         class04571.N(1.0F, N((I)var0, var2, var4));
      } else {
         class04571.N(1.0F, 0.0F);
      }

      return class04571.N();
   }

   private static <C, I extends class04573<C>> class04562<C, I> N(
      I var0, I var1, I var2, float var3, float var4, float var5, float var6, class04573<Float> var7
   ) {
      float f = -0.5775F;
      class04562 class04562x = N((I)var1, (I)var2, var3, var5, var7);
      class04562 class04562x = N((I)var1, (I)var2, var4, var6, var7);
      return class04562.<C, I>N((I)var0, var7).N(-1.0F, class04562x).N(-0.78F, class04562x).N(-0.5775F, class04562x).N(-0.375F, 0.0F).N();
   }

   private static float N(float var0, float var1, float var2, float var3) {
      return (var1 - var0) / (var3 - var2);
   }

   public static <C, I extends class04573<C>> class04562<C, I> N(I var0, I var1, I var2, I var3, boolean var4) {
      class04573<Float> class04573 = var4 ? M : i;
      return class04562.<C, I>N((I)var0, i)
         .N(-0.19F, 3.95F)
         .N(-0.15F, N((I)var1, (I)var2, (I)var3, 6.25F, true, i))
         .N(-0.1F, N((I)var1, (I)var2, (I)var3, 5.47F, true, class04573))
         .N(0.03F, N((I)var1, (I)var2, (I)var3, 5.08F, true, class04573))
         .N(0.06F, N((I)var1, (I)var2, (I)var3, 4.69F, false, class04573))
         .N();
   }

   private static float N(float var0, float var1, float var2) {
      float f = 1.17F;
      float f1 = 0.46082947F;
      float f2 = 1.0F - (1.0F - var1) * 0.5F;
      float f3 = 0.5F * (1.0F - var1);
      float f4 = (var0 + 1.17F) * 0.46082947F * f2 - f3;
      return var0 < var2 ? Math.max(f4, -0.2222F) : Math.max(f4, 0.0F);
   }
}
