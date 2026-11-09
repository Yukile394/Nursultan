package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05295 extends class05318 {
   public static final MapCodec<class05295> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.y),
            Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.u),
            Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.i),
            Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.R)
         )
         .apply(var0, class05295::new)
   );
   private final float y;
   private final float u;
   private final int i;
   private final int R;

   public class05295(float var1, float var2, int var3, int var4) {
      super();
      if (var3 >= var4) {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      } else {
         this.y = var1;
         this.u = var2;
         this.i = var3;
         this.R = var4;
      }
   }

   @Override
   public boolean N(class07209 var1, class07209 var2, class07209 var3, class06069 var4) {
      int ix = var2.method_19455(var3);
      return var4.z() <= class04995.y(class04995.R((float)ix, (float)this.i, (float)this.R), this.y, this.u);
   }

   @Override
   protected class05301<?> N() {
      return class05301.y;
   }
}
