package minecraft;

import com.mojang.serialization.Codec;

public class class06396 extends class06391<class01812> {
   public class06396(Codec<class01812> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class01812> var1) {
      class01812 class01812 = (class01812)var1.R();
      class07209 class07209x = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      boolean flag = false;
      int i = class07209x.method_10264();
      int j = i + class01812.i();
      int k = i - class01812.i() - 1;
      int l = class01812.L().N(class06069);
      class07218 class07218 = new class07218();

      for (class07209 class07209x : class07209.method_10097(class07209x.method_10069(-l, 0, -l), class07209x.method_10069(l, 0, l))) {
         int i1 = class07209x.method_10263() - class07209x.method_10263();
         int j1 = class07209x.method_10260() - class07209x.method_10260();
         if (i1 * i1 + j1 * j1 <= l * l) {
            flag |= this.N(class01812, class05974, class06069, j, k, class07218.N(class07209x));
         }
      }

      return flag;
   }

   protected boolean N(class01812 var1, class05974 var2, class06069 var3, int var4, int var5, class07218 var6) {
      boolean flag = false;
      boolean flag1 = false;

      for (int i = var4; i > var5; i--) {
         var6.method_10099(i);
         if (var1.y().test(var2, var6)) {
            class00500 class00500 = var1.N().N(var2, var3, var6);
            var2.method_8652(var6, class00500, 2);
            if (!flag1) {
               this.N_59(var2, var6);
            }

            flag = true;
            flag1 = true;
         } else {
            flag1 = false;
         }
      }

      return flag;
   }
}
