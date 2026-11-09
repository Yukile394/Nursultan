package minecraft;

import com.mojang.serialization.Codec;

public abstract class class01469 extends class06391<class01466> {
   public class01469(Codec<class01466> var1) {
      super(var1);
   }

   protected boolean N(class07284 var1, class07209 var2, int var3, class07218 var4, class01466 var5) {
      int i = var2.method_10264();
      if (i >= var1.method_31607() + 1 && i + var3 + 1 <= var1.method_31600()) {
         class00500 class00500x = var1.method_8320(var2.method_10074());
         if (!y(class00500x) && !class00500x.N(class01210.yE)) {
            return false;
         } else {
            for (int j = 0; j <= var3; j++) {
               int k = this.N(-1, -1, var5.u, j);

               for (int l = -k; l <= k; l++) {
                  for (int i1 = -k; i1 <= k; i1++) {
                     class00500 class00500x = var1.method_8320(var4.N(var2, l, j, i1));
                     if (!class00500x.P() && !class00500x.N(class01210.H)) {
                        return false;
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class06058<class01466> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      class06069 class06069 = var1.u();
      class01466 class01466 = (class01466)var1.R();
      int i = this.N(class06069);
      class07218 class07218 = new class07218();
      if (!this.N(class05974, class07209, i, class07218, class01466)) {
         return false;
      } else {
         this.N(class05974, class06069, class07209, i, class07218, class01466);
         this.N(class05974, class06069, class07209, class01466, i, class07218);
         return true;
      }
   }

   protected abstract int N(int var1, int var2, int var3, int var4);

   protected abstract void N(class07284 var1, class06069 var2, class07209 var3, int var4, class07218 var5, class01466 var6);

   protected int N(class06069 var1) {
      int i = var1.y(3) + 4;
      if (var1.y(12) == 0) {
         i *= 2;
      }

      return i;
   }

   protected void N(class07284 var1, class07218 var2, class00500 var3) {
      class00500 class00500 = var1.method_8320(var2);
      if (class00500.P() || class00500.N(class01210.LI)) {
         this.N(var1, var2, var3);
      }
   }

   protected void N(class07284 var1, class06069 var2, class07209 var3, class01466 var4, int var5, class07218 var6) {
      for (int i = 0; i < var5; i++) {
         var6.N(var3).N(class07211.field_11036, i);
         this.N(var1, var6, var4.L.N(var2, var3));
      }
   }
}
