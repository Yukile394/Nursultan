package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class02257 extends class01479 {
   public static final MapCodec<class02257> N = RecordCodecBuilder.mapCodec(
      var0 -> y(var0)
         .and(
            var0.group(
               class02142.N(1, 512).fieldOf("foliage_height").forGetter(var0x -> var0x.y),
               Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter(var0x -> var0x.R)
            )
         )
         .apply(var0, class02257::new)
   );
   private final class02142 y;
   private final int R;

   public class02257(class02142 var1, class02142 var2, class02142 var3, int var4) {
      super(var1, var2);
      this.y = var3;
      this.R = var4;
   }

   @Override
   protected boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   @Override
   protected class01448<?> N() {
      return class01448.z;
   }

   @Override
   public int N(class06069 var1, int var2, class01476 var3) {
      return this.y.N(var1);
   }

   @Override
   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9) {
      class07209 class07209 = var6.N();
      class07218 class07218 = class07209.method_25503();

      for (int i = 0; i < this.R; i++) {
         class07218.N(class07209, var3.y(var8) - var3.y(var8), var3.y(var7) - var3.y(var7), var3.y(var8) - var3.y(var8));
         N(var1, var2, var3, var4, class07218);
      }
   }
}
