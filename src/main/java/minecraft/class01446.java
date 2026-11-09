package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01446 extends class01479 {
   public static final MapCodec<class01446> N = RecordCodecBuilder.mapCodec(
      var0 -> y(var0).and(class02142.N(0, 24).fieldOf("height").forGetter(var0x -> var0x.y)).apply(var0, class01446::new)
   );
   private final class02142 y;

   public class01446(class02142 var1, class02142 var2, class02142 var3) {
      super(var1, var2);
      this.y = var3;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return this.y.N(var1);
   }

   @Override
   protected class01448<?> N() {
      return class01448.L;
   }

   @Override
   public int N(class06069 var1, int var2) {
      return super.N(var1, var2) + var1.y(Math.max(var2 + 1, 1));
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      int i = 0;

      for (int j = var9; j >= var9 - var7; j--) {
         this.N(var1, var2, var3, var4, var6.N(), i, j, var6.L());
         if (i >= 1 && j == var9 - var7 + 1) {
            i--;
         } else if (i < var8 + var6.y()) {
            i++;
         }
      }
   }
}
