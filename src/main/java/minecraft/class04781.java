package minecraft;

import com.mojang.serialization.Codec;

public class class04781 extends class06391<class06225> {
   private static final class07209 NE = new class07209(8, 3, 8);
   private static final class07321 NW = new class07321(NE);
   private static final int Nm = 16;
   private static final int NP = 1;

   public class04781(Codec<class06225> var1) {
      super(var1);
   }

   private static int N(int var0, int var1, int var2, int var3) {
      return Math.max(Math.abs(var0 - var2), Math.abs(var1 - var3));
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class05974 class05974 = var1.y();
      class07321 class07321 = new class07321(var1.i());
      if (N(class07321.B, class07321.Z, NW.B, NW.Z) > 1) {
         return true;
      } else {
         class07209 class07209 = NE.method_33096(var1.i().method_10264() + NE.method_10264());
         class07218 class07218 = new class07218();

         for (int i = class07321.R(); i <= class07321.B(); i++) {
            for (int j = class07321.i(); j <= class07321.M(); j++) {
               if (N(class07209.method_10263(), class07209.method_10260(), j, i) <= 16) {
                  class07218.N(j, class07209.method_10264(), i);
                  if (class07218.equals(class07209)) {
                     class05974.method_8652(class07218, class00869.W.W(), 2);
                  } else {
                     class05974.method_8652(class07218, class00869.y.W(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
