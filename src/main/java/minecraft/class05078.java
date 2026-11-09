package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05078 extends class01479 {
   public static final MapCodec<class05078> N = RecordCodecBuilder.mapCodec(var0 -> y(var0).apply(var0, class05078::new));

   public class05078(class02142 var1, class02142 var2) {
      super(var1, var2);
   }

   @Override
   protected boolean y(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 != 0 || !var6 || var2 != -var5 && var2 < var5 || var4 != -var5 && var4 < var5 ? super.y(var1, var2, var3, var4, var5, var6) : true;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var3 == -1 && !var6) {
         return var2 == var5 && var4 == var5;
      } else {
         return var3 == 1 ? var2 + var4 > var5 * 2 - 2 : false;
      }
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      class07209 class07209 = var6.N().method_10086(var9);
      boolean flag = var6.L();
      if (flag) {
         this.N(var1, var2, var3, var4, class07209, var8 + 2, -1, flag);
         this.N(var1, var2, var3, var4, class07209, var8 + 3, 0, flag);
         this.N(var1, var2, var3, var4, class07209, var8 + 2, 1, flag);
         if (var3.Z()) {
            this.N(var1, var2, var3, var4, class07209, var8, 2, flag);
         }
      } else {
         this.N(var1, var2, var3, var4, class07209, var8 + 2, -1, flag);
         this.N(var1, var2, var3, var4, class07209, var8 + 1, 0, flag);
      }
   }

   @Override
   protected class01448<?> N() {
      return class01448.Z;
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return 4;
   }
}
