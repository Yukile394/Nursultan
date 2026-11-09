package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08567 extends class07131 {
   public static final MapCodec<class08567> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.N(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter(var0x -> var0x.M),
            class07107.yE.fieldOf("leaf_particle").forGetter(var0x -> var0x.y),
            t()
         )
         .apply(var0, class08567::new)
   );
   protected final class07126 y;

   public class08567(float var1, class07126 var2, class01362 var3) {
      super(var1, var3);
      this.y = var2;
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class06069 var3) {
      class02615.N(var1, var2, var3, this.y);
   }

   @Override
   public MapCodec<class08567> N() {
      return N;
   }
}
