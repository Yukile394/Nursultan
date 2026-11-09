package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01165 implements class06386 {
   public static final Codec<class01165> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").orElse(30).forGetter(var0x -> var0x.y),
            class02142.N(1, 60).fieldOf("column_radius").forGetter(var0x -> var0x.L),
            class06052.N(0.0F, 20.0F).fieldOf("height_scale").forGetter(var0x -> var0x.u),
            Codec.floatRange(0.1F, 1.0F).fieldOf("max_column_radius_to_cave_height_ratio").forGetter(var0x -> var0x.i),
            class06052.N(0.1F, 10.0F).fieldOf("stalactite_bluntness").forGetter(var0x -> var0x.M),
            class06052.N(0.1F, 10.0F).fieldOf("stalagmite_bluntness").forGetter(var0x -> var0x.B),
            class06052.N(0.0F, 2.0F).fieldOf("wind_speed").forGetter(var0x -> var0x.Z),
            Codec.intRange(0, 100).fieldOf("min_radius_for_wind").forGetter(var0x -> var0x.z),
            Codec.floatRange(0.0F, 5.0F).fieldOf("min_bluntness_for_wind").forGetter(var0x -> var0x.U)
         )
         .apply(var0, class01165::new)
   );
   public final int y;
   public final class02142 L;
   public final class06052 u;
   public final float i;
   public final class06052 M;
   public final class06052 B;
   public final class06052 Z;
   public final int z;
   public final float U;

   public class01165(int var1, class02142 var2, class06052 var3, float var4, class06052 var5, class06052 var6, class06052 var7, int var8, float var9) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
      this.U = var9;
   }
}
