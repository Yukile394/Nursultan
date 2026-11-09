package minecraft;

import org.jspecify.annotations.Nullable;

final class class01183 {
   private final int N;
   @Nullable
   private final class06889 y;

   class01183(int var1, class06069 var2, class06052 var3) {
      super();
      this.N = var1;
      float f = var3.N(var2);
      float f1 = class04995.y(var2, 0.0F, (float) Math.PI);
      this.y = new class06889(class04995.P(f1) * f, 0.0, class04995.m(f1) * f);
   }

   private class01183() {
      super();
      this.N = 0;
      this.y = null;
   }

   class07209 N(class07209 var1) {
      if (this.y == null) {
         return var1;
      } else {
         int i = this.N - var1.method_10264();
         class06889 class06889 = this.y.L((double)i);
         return var1.method_10069(class04995.N(class06889.M), 0, class04995.N(class06889.Z));
      }
   }

   static class01183 N() {
      return new class01183();
   }
}
