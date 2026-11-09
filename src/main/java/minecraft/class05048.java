package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05048 extends class01479 {
   public static final MapCodec<class05048> N = RecordCodecBuilder.mapCodec(
      var0 -> y(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.y)).apply(var0, class05048::new)
   );
   protected final int y;

   public class05048(class02142 var1, class02142 var2, int var3) {
      super(var1, var2);
      this.y = var3;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 >= 7 ? true : var2 * var2 + var4 * var4 > var5 * var5;
   }

   @Override
   protected class01448<?> N() {
      return class01448.M;
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return this.y;
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      int i = var6.L() ? var7 : 1 + var3.y(2);

      for (int j = var9; j >= var9 - i; j--) {
         int k = var8 + var6.y() + 1 - j;
         this.N(var1, var2, var3, var4, var6.N(), k, j, var6.L());
      }
   }
}
