package minecraft;

public class class07058 {
   public static final float N = 20.0F;
   public static final float y = 25.0F;
   public static final float L = 2.0F;
   public static final float u = 0.2F;
   private static final int i = 4;

   public class07058() {
      super();
   }

   public static float N(class07438 var0, float var1, class07072 var2, float var3, float var4) {
      float f = 2.0F + var4 / 4.0F;
      float f1 = class04995.N(var3 - var1 / f, var3 * 0.2F, 20.0F) / 25.0F;
      class06584 class06584 = var2.i();
      float f2;
      if (class06584 != null && var0.method_73183() instanceof class04782 class04782) {
         f2 = class04995.N(class07323.L(class04782, class06584, var0, var2, f1), 0.0F, 1.0F);
      } else {
         f2 = f1;
      }

      float f3 = 1.0F - f2;
      return var1 * f3;
   }

   public static float N(float var0, float var1) {
      float f = class04995.N(var1, 0.0F, 20.0F);
      return var0 * (1.0F - f / 25.0F);
   }
}
