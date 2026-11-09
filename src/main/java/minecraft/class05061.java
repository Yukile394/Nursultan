package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05061 extends class01479 {
   public static final MapCodec<class05061> N = RecordCodecBuilder.mapCodec(
      var0 -> y(var0).and(class02142.N(0, 24).fieldOf("crown_height").forGetter(var0x -> var0x.y)).apply(var0, class05061::new)
   );
   private final class02142 y;

   public class05061(class02142 var1, class02142 var2, class02142 var3) {
      super(var1, var2);
      this.y = var3;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 >= 7 ? true : var2 * var2 + var4 * var4 > var5 * var5;
   }

   @Override
   protected class01448<?> N() {
      return class01448.B;
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return this.y.N(var1);
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      class07209 class07209 = var6.N();
      int i = 0;

      for (int j = class07209.method_10264() - var7 + var9; j <= class07209.method_10264() + var9; j++) {
         int k = class07209.method_10264() - j;
         int l = var8 + var6.y() + class04995.y((float)k / var7 * 3.5F);
         int i1;
         if (k > 0 && l == i && (j & 1) == 0) {
            i1 = l + 1;
         } else {
            i1 = l;
         }

         this.N(var1, var2, var3, var4, new class07209(class07209.method_10263(), j, class07209.method_10260()), i1, 0, var6.L());
         i = l;
      }
   }
}
