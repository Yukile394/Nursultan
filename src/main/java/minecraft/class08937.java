package minecraft;

import java.util.Arrays;
import org.jspecify.annotations.Nullable;

public class class08937 implements class08910 {
   private static final int N = 16;
   private final class06572 y;
   private final float L;
   private final float[] u;
   private final class08910[] i;
   private final class08910 R;

   class08937(class06572 var1, float var2, float[] var3, class08910[] var4, class08910 var5) {
      super();
      this.y = var1;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.L = var2;
   }

   private static int N(float[] var0, float var1) {
      if (var0.length < 16) {
         for (int j = 0; j < var0.length; j++) {
            if (var0[j] > var1) {
               return j - 1;
            }
         }

         return var0.length - 1;
      } else {
         int ix = Arrays.binarySearch(var0, var1);
         return ix < 0 ? ~ix - 1 : ix;
      }
   }

   @Override
   public void method_65584(class08898 var1, class06584 var2, class08943 var3, class03662 var4, @Nullable class03448 var5, @Nullable class08961 var6, int var7) {
      var1.N(this);
      float f = this.y.N(var2, var5, var6, var7) * this.L;
      class08910 class08910;
      if (Float.isNaN(f)) {
         class08910 = this.R;
      } else {
         int ix = N(this.u, f);
         class08910 = ix == -1 ? this.R : this.i[ix];
      }

      class08910.method_65584(var1, var2, var3, var4, var5, var6, var7);
   }
}
