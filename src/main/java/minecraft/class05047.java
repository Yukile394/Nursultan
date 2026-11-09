package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05047 extends class01460 {
   public static final MapCodec<class05047> R = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class05047::new));

   public class05047(class02142 var1, class02142 var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      for (int i = var9; i >= var9 - var7; i--) {
         int j = var8 + var6.y() - 1 - i;
         this.N(var1, var2, var3, var4, var6.N(), j, i, var6.L());
      }
   }

   @Override
   protected class01448<?> N() {
      return class01448.i;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var1.y(2) == 0;
   }
}
