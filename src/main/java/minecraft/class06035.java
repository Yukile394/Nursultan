package minecraft;

import com.mojang.serialization.Codec;

public class class06035 extends class06391<class06191> {
   private static final int NE = 7;

   class06035(Codec<class06191> var1) {
      super(var1);
   }

   private int N(class06069 var1, int var2) {
      return Math.round((var1.z() - var1.z()) * var2);
   }

   private void N(class07218 var1, class06069 var2, class07209 var3, int var4) {
      int i = this.N(var2, var4);
      int j = this.N(var2, var4);
      int k = this.N(var2, var4);
      var1.N(var3, i, j, k);
   }

   @Override
   public boolean N(class06058<class06191> var1) {
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class06191 class06191 = (class06191)var1.R();
      class07209 class07209 = var1.i();
      int i = class06069.y(class06191.L + 1);
      class07218 class07218 = new class07218();

      for (int j = 0; j < i; j++) {
         this.N(class07218, class06069, class07209, Math.min(j, 7));
         class00500 class00500 = class05974.method_8320(class07218);

         for (class06209 class06209 : class06191.y) {
            if (class06203.N(class00500, class05974::method_8320, class06069, class06191, class06209, class07218)) {
               class05974.method_8652(class07218, class06209.L, 2);
               break;
            }
         }
      }

      return true;
   }
}
