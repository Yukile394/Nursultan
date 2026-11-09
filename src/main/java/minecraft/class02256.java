package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class02256 implements class06386 {
   public static final Codec<class02256> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03530.y(class04227.Z).fieldOf("replaceable").forGetter(var0x -> var0x.y),
            class01471.N.fieldOf("ground_state").forGetter(var0x -> var0x.L),
            class04336.y.fieldOf("vegetation_feature").forGetter(var0x -> var0x.u),
            class02258.field_29315.fieldOf("surface").forGetter(var0x -> var0x.i),
            class02142.N(1, 128).fieldOf("depth").forGetter(var0x -> var0x.M),
            Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter(var0x -> var0x.B),
            Codec.intRange(1, 256).fieldOf("vertical_range").forGetter(var0x -> var0x.Z),
            Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter(var0x -> var0x.z),
            class02142.L.fieldOf("xz_radius").forGetter(var0x -> var0x.U),
            Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter(var0x -> var0x.E)
         )
         .apply(var0, class02256::new)
   );
   public final class03530<class00891> y;
   public final class01471 L;
   public final class03556<class04336> u;
   public final class02258 i;
   public final class02142 M;
   public final float B;
   public final int Z;
   public final float z;
   public final class02142 U;
   public final float E;

   public class02256(
      class03530<class00891> var1,
      class01471 var2,
      class03556<class04336> var3,
      class02258 var4,
      class02142 var5,
      float var6,
      int var7,
      float var8,
      class02142 var9,
      float var10
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
   }
}
