package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01978 extends class01479 {
   public static final MapCodec<class01978> N = RecordCodecBuilder.mapCodec(
      var0 -> y(var0)
         .and(
            var0.group(
               class02142.N(4, 16).fieldOf("height").forGetter(var0x -> var0x.y),
               Codec.floatRange(0.0F, 1.0F).fieldOf("wide_bottom_layer_hole_chance").forGetter(var0x -> var0x.R),
               Codec.floatRange(0.0F, 1.0F).fieldOf("corner_hole_chance").forGetter(var0x -> var0x.R),
               Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_chance").forGetter(var0x -> var0x.B),
               Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_extension_chance").forGetter(var0x -> var0x.Z)
            )
         )
         .apply(var0, class01978::new)
   );
   private final class02142 y;
   private final float R;
   private final float M;
   private final float B;
   private final float Z;

   public class01978(class02142 var1, class02142 var2, class02142 var3, float var4, float var5, float var6, float var7) {
      super(var1, var2);
      this.y = var3;
      this.R = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
   }

   @Override
   protected class01448<?> N() {
      return class01448.U;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var3 == -1 && (var2 == var5 || var4 == var5) && var1.z() < this.R) {
         return true;
      } else {
         boolean flag = var2 == var5 && var4 == var5;
         return var5 > 2 ? flag || var2 + var4 > var5 * 2 - 2 && var1.z() < this.M : flag && var1.z() < this.M;
      }
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      boolean flag = var6.L();
      class07209 class07209 = var6.N().method_10086(var9);
      int i = var8 + var6.y() - 1;
      this.N(var1, var2, var3, var4, class07209, i - 2, var7 - 3, flag);
      this.N(var1, var2, var3, var4, class07209, i - 1, var7 - 4, flag);

      for (int j = var7 - 5; j >= 0; j--) {
         this.N(var1, var2, var3, var4, class07209, i, j, flag);
      }

      this.N(var1, var2, var3, var4, class07209, i, -1, flag, this.B, this.Z);
      this.N(var1, var2, var3, var4, class07209, i - 1, -2, flag, this.B, this.Z);
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return this.y.N(var1);
   }
}
