package minecraft;

import com.mojang.serialization.MapCodec;

public final class class03906 implements class03908 {
   public static final class03979<class03906> N = class03979.N(MapCodec.unit(new class03906(0L)));
   private static final float y = -0.9F;
   private final class05022 L;

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public class03906(long var1) {
      super();
      class06075 class06075 = new class06075(var1);
      class06075.L(17292);
      this.L = new class05022(class06075);
   }

   @Override
   public double y() {
      return 0.5625;
   }

   @Override
   public double N() {
      return -0.84375;
   }

   private static float N(class05022 var0, int var1, int var2) {
      int i = var1 / 2;
      int j = var2 / 2;
      int k = var1 % 2;
      int l = var2 % 2;
      float f = 100.0F - class04995.N((float)(var1 * var1 + var2 * var2)) * 8.0F;
      f = class04995.N(f, -100.0F, 80.0F);

      for (int i1 = -12; i1 <= 12; i1++) {
         for (int j1 = -12; j1 <= 12; j1++) {
            long k1 = i + i1;
            long l1 = j + j1;
            if (k1 * k1 + l1 * l1 > 4096L && var0.N(k1, l1) < -0.9F) {
               float f1 = (class04995.L((float)k1) * 3439.0F + class04995.L((float)l1) * 147.0F) % 13.0F + 9.0F;
               float f2 = k - i1 * 2;
               float f3 = l - j1 * 2;
               float f4 = 100.0F - class04995.N(f2 * f2 + f3 * f3) * f1;
               f4 = class04995.N(f4, -100.0F, 80.0F);
               f = Math.max(f, f4);
            }
         }
      }

      return f;
   }

   @Override
   public double N(class03875 var1) {
      return (N(this.L, var1.y() / 8, var1.u() / 8) - 8.0) / 128.0;
   }
}
