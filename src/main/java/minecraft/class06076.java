package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06076 implements class06386 {
   public static final Codec<class06076> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.intRange(0, 512).fieldOf("floor_search_range").forGetter(var0x -> var0x.y),
            Codec.intRange(0, 64).fieldOf("placement_radius_around_floor").forGetter(var0x -> var0x.L),
            Codec.floatRange(0.0F, 1.0F).fieldOf("placement_probability_per_valid_position").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class06076::new)
   );
   public final int y;
   public final int L;
   public final float u;

   public class06076(int var1, int var2, float var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }
}
