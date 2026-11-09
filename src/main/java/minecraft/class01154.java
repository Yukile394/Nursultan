package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01154 implements class06386 {
   public static final Codec<class01154> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").forGetter(var0x -> var0x.y),
            class02142.N(1, 128).fieldOf("height").forGetter(var0x -> var0x.L),
            class02142.N(1, 128).fieldOf("radius").forGetter(var0x -> var0x.u),
            Codec.intRange(0, 64).fieldOf("max_stalagmite_stalactite_height_diff").forGetter(var0x -> var0x.i),
            Codec.intRange(1, 64).fieldOf("height_deviation").forGetter(var0x -> var0x.M),
            class02142.N(0, 128).fieldOf("dripstone_block_layer_thickness").forGetter(var0x -> var0x.B),
            class06052.N(0.0F, 2.0F).fieldOf("density").forGetter(var0x -> var0x.Z),
            class06052.N(0.0F, 2.0F).fieldOf("wetness").forGetter(var0x -> var0x.z),
            Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_dripstone_column_at_max_distance_from_center").forGetter(var0x -> var0x.U),
            Codec.intRange(1, 64).fieldOf("max_distance_from_edge_affecting_chance_of_dripstone_column").forGetter(var0x -> var0x.E),
            Codec.intRange(1, 64).fieldOf("max_distance_from_center_affecting_height_bias").forGetter(var0x -> var0x.W)
         )
         .apply(var0, class01154::new)
   );
   public final int y;
   public final class02142 L;
   public final class02142 u;
   public final int i;
   public final int M;
   public final class02142 B;
   public final class06052 Z;
   public final class06052 z;
   public final float U;
   public final int E;
   public final int W;

   public class01154(
      int var1, class02142 var2, class02142 var3, int var4, int var5, class02142 var6, class06052 var7, class06052 var8, float var9, int var10, int var11
   ) {
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
      this.E = var10;
      this.W = var11;
   }
}
