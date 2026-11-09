package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01100 implements class06386 {
   public static final Codec<Double> N = Codec.doubleRange(0.0, 1.0);
   public static final Codec<class01100> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01121.Z.fieldOf("blocks").forGetter(var0x -> var0x.L),
            class01119.N.fieldOf("layers").forGetter(var0x -> var0x.u),
            class01117.N.fieldOf("crack").forGetter(var0x -> var0x.i),
            N.fieldOf("use_potential_placements_chance").orElse(0.35).forGetter(var0x -> var0x.M),
            N.fieldOf("use_alternate_layer0_chance").orElse(0.0).forGetter(var0x -> var0x.B),
            Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter(var0x -> var0x.Z),
            class02142.N(1, 20).fieldOf("outer_wall_distance").orElse(class02135.y(4, 5)).forGetter(var0x -> var0x.z),
            class02142.N(1, 20).fieldOf("distribution_points").orElse(class02135.y(3, 4)).forGetter(var0x -> var0x.U),
            class02142.N(0, 10).fieldOf("point_offset").orElse(class02135.y(1, 2)).forGetter(var0x -> var0x.E),
            Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter(var0x -> var0x.W),
            Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter(var0x -> var0x.m),
            N.fieldOf("noise_multiplier").orElse(0.05).forGetter(var0x -> var0x.P),
            Codec.INT.fieldOf("invalid_blocks_threshold").forGetter(var0x -> var0x.s)
         )
         .apply(var0, class01100::new)
   );
   public final class01121 L;
   public final class01119 u;
   public final class01117 i;
   public final double M;
   public final double B;
   public final boolean Z;
   public final class02142 z;
   public final class02142 U;
   public final class02142 E;
   public final int W;
   public final int m;
   public final double P;
   public final int s;

   public class01100(
      class01121 var1,
      class01119 var2,
      class01117 var3,
      double var4,
      double var6,
      boolean var8,
      class02142 var9,
      class02142 var10,
      class02142 var11,
      int var12,
      int var13,
      double var14,
      int var16
   ) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.M = var4;
      this.B = var6;
      this.Z = var8;
      this.z = var9;
      this.U = var10;
      this.E = var11;
      this.W = var12;
      this.m = var13;
      this.P = var14;
      this.s = var16;
   }
}
