package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01468 extends class01479 {
   public static final MapCodec<class01468> N = RecordCodecBuilder.mapCodec(var0 -> y(var0).apply(var0, class01468::new));

   public class01468(class02142 var1, class02142 var2) {
      super(var1, var2);
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return 0;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 == 0 ? (var2 > 1 || var4 > 1) && var2 != 0 && var4 != 0 : var2 == var5 && var4 == var5 && var5 > 0;
   }

   @Override
   protected class01448<?> N() {
      return class01448.u;
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      boolean flag = var6.L();
      class07209 class07209 = var6.N().method_10086(var9);
      this.N(var1, var2, var3, var4, class07209, var8 + var6.y(), -1 - var7, flag);
      this.N(var1, var2, var3, var4, class07209, var8 - 1, -var7, flag);
      this.N(var1, var2, var3, var4, class07209, var8 + var6.y() - 1, 0, flag);
   }
}
