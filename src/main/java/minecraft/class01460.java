package minecraft;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public class class01460 extends class01479 {
   public static final MapCodec<class01460> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class01460::new));
   protected final int y;

   public class01460(class02142 var1, class02142 var2, int var3) {
      super(var1, var2);
      this.y = var3;
   }

   protected static <P extends class01460> P3<Mu<P>, class02142, class02142, Integer> N(Instance<P> var0) {
      return y(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.y));
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && (var1.y(2) == 0 || var3 == 0);
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return this.y;
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      for (int i = var9; i >= var9 - var7; i--) {
         int j = Math.max(var8 + var6.y() - 1 - i / 2, 0);
         this.N(var1, var2, var3, var4, var6.N(), j, i, var6.L());
      }
   }

   @Override
   protected class01448<?> N() {
      return class01448.N;
   }
}
