package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01442 extends class01479 {
   public static final MapCodec<class01442> N = RecordCodecBuilder.mapCodec(
      var0 -> y(var0).and(class02142.N(0, 24).fieldOf("trunk_height").forGetter(var0x -> var0x.y)).apply(var0, class01442::new)
   );
   private final class02142 y;

   public class01442(class02142 var1, class02142 var2, class02142 var3) {
      super(var1, var2);
      this.y = var3;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }

   @Override
   protected class01448<?> N() {
      return class01448.y;
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return Math.max(4, var2 - this.y.N(var1));
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      class07209 class07209 = var6.N();
      int i = var3.y(2);
      int j = 1;
      byte b0 = 0;

      for (int k = var9; k >= -var7; k--) {
         this.N(var1, var2, var3, var4, class07209, i, k, var6.L());
         if (i >= j) {
            i = b0;
            b0 = 1;
            j = Math.min(j + 1, var8 + var6.y());
         } else {
            i++;
         }
      }
   }
}
