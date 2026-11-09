package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class02673 implements class06386 {
   public static final Codec<class02673> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04336.y.fieldOf("feature").forGetter(var0x -> var0x.y),
            Codec.intRange(1, 64).fieldOf("required_vertical_space_for_tree").forGetter(var0x -> var0x.L),
            Codec.intRange(1, 64).fieldOf("root_radius").forGetter(var0x -> var0x.u),
            class03530.y(class04227.Z).fieldOf("root_replaceable").forGetter(var0x -> var0x.i),
            class01471.N.fieldOf("root_state_provider").forGetter(var0x -> var0x.M),
            Codec.intRange(1, 256).fieldOf("root_placement_attempts").forGetter(var0x -> var0x.B),
            Codec.intRange(1, 4096).fieldOf("root_column_max_height").forGetter(var0x -> var0x.Z),
            Codec.intRange(1, 64).fieldOf("hanging_root_radius").forGetter(var0x -> var0x.z),
            Codec.intRange(1, 16).fieldOf("hanging_roots_vertical_span").forGetter(var0x -> var0x.U),
            class01471.N.fieldOf("hanging_root_state_provider").forGetter(var0x -> var0x.E),
            Codec.intRange(1, 256).fieldOf("hanging_root_placement_attempts").forGetter(var0x -> var0x.W),
            Codec.intRange(1, 64).fieldOf("allowed_vertical_water_for_tree").forGetter(var0x -> var0x.m),
            class04025.y.fieldOf("allowed_tree_position").forGetter(var0x -> var0x.P)
         )
         .apply(var0, class02673::new)
   );
   public final class03556<class04336> y;
   public final int L;
   public final int u;
   public final class03530<class00891> i;
   public final class01471 M;
   public final int B;
   public final int Z;
   public final int z;
   public final int U;
   public final class01471 E;
   public final int W;
   public final int m;
   public final class04025 P;

   public class02673(
      class03556<class04336> var1,
      int var2,
      int var3,
      class03530<class00891> var4,
      class01471 var5,
      int var6,
      int var7,
      int var8,
      int var9,
      class01471 var10,
      int var11,
      int var12,
      class04025 var13
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
      this.m = var12;
      this.P = var13;
   }
}
