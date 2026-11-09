package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01173 implements class06386 {
   public static final Codec<class01173> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_taller_dripstone").orElse(0.2F).forGetter(var0x -> var0x.y),
            Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_directional_spread").orElse(0.7F).forGetter(var0x -> var0x.L),
            Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_spread_radius2").orElse(0.5F).forGetter(var0x -> var0x.u),
            Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_spread_radius3").orElse(0.5F).forGetter(var0x -> var0x.i)
         )
         .apply(var0, class01173::new)
   );
   public final float y;
   public final float L;
   public final float u;
   public final float i;

   public class01173(float var1, float var2, float var3, float var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }
}
