package minecraft;

import org.apache.commons.lang3.mutable.MutableInt;

public class class08206 implements class01857 {
   private final class06202 N;

   public class08206(class06202 var1) {
      super();
      this.N = var1;
   }

   private static float N(long var0, float var2) {
      float f = 0.1F;
      return class04995.M(var2 * (float)var0) * 0.9F + 0.1F;
   }

   private void N(class08222 var1, int var2, boolean var3, MutableInt var4, boolean var5) {
      class00734 class00734 = var1.y();
      long i = Math.round(class00734.y() / 16.0);
      if (i == 1L) {
         var4.add(1);
         int j = var5 ? -16711936 : -1;
         class06724.N(String.valueOf(var4.intValue()), class00734.R(), class06715.N(j).N(4.8F));
      }

      long k = i + 5L;
      class06724.N(class00734.B(0.1 * var2), class06747.N(class02566.N(var3 ? 0.4F : 1.0F, N(k, 0.3F), N(k, 0.8F), N(k, 0.5F))));
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class08230 class08230 = ((class03063)this.N.B_2).n().L();
      MutableInt mutableint = new MutableInt(0);
      class08230.N((var2, var3x, var4, var5x) -> this.N(var2, var4, var3x, mutableint, var5x), var8, 32);
   }
}
