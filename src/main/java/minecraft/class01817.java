package minecraft;

import java.util.List;

class class01817 {
   private static final long y = 2048L;
   class01845 N;

   class01817(List<class03229> var1, class03222 var2) {
      super();
      this.N = N(var1, var2, 0, 0);
      this.N(var1, var2, 2048.0F, 512.0F);
      this.N(var1, var2, 512.0F, 32.0F);
   }

   private void N(List<class03229> var1, class03222 var2, float var3, float var4) {
      float f = 0.0F;
      float f1 = var4;
      class07209 class07209 = this.N.N();

      while (f1 <= var3) {
         int i = class07209.method_10263() + (int)(Math.sin(f) * f1);
         int j = class07209.method_10260() + (int)(Math.cos(f) * f1);
         class01845 class01845 = N(var1, var2, i, j);
         if (class01845.y() < this.N.y()) {
            this.N = class01845;
         }

         f += var4 / f1;
         if (f > Math.PI * 2) {
            f = 0.0F;
            f1 += var4;
         }
      }
   }

   private static class01845 N(List<class03229> var0, class03222 var1, int var2, int var3) {
      class03231 class03231x = var1.N(class01146.N(var2), 0, class01146.N(var3));
      class03231 class03231x = new class03231(class03231x.y(), class03231x.L(), class03231x.u(), class03231x.i(), 0L, class03231x.M());
      long i = Long.MAX_VALUE;

      for (class03229 class03229 : var0) {
         i = Math.min(i, class03229.N(class03231x));
      }

      long k = class04995.y((long)var2) + class04995.y((long)var3);
      long j = i * class04995.y(2048L) + k;
      return new class01845(new class07209(var2, 0, var3), j);
   }
}
