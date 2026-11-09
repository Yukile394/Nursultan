package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

record class02317() implements class02339 {
   public static final class02317 N = new class02317();
   public static final Codec<class02317> y = MapCodec.unitCodec(N);
   public static final class02320 L = new class02320(class01894.y("ore_drops"), y);

   private class02317() {
      super();
   }

   @Override
   public int N(class06069 var1, int var2, int var3) {
      if (var3 > 0) {
         int i = var1.y(var3 + 2) - 1;
         if (i < 0) {
            i = 0;
         }

         return var2 * (i + 1);
      } else {
         return var2;
      }
   }

   @Override
   public class02320 N() {
      return L;
   }
}
