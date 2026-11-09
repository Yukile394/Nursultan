package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01470 implements class06386 {
   public static final Codec<class01470> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04688.N.fieldOf("state").forGetter(var0x -> var0x.y),
            Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter(var0x -> var0x.L),
            Codec.INT.fieldOf("rock_count").orElse(4).forGetter(var0x -> var0x.u),
            Codec.INT.fieldOf("hole_count").orElse(1).forGetter(var0x -> var0x.i),
            class03541.N(class04227.Z).fieldOf("valid_blocks").forGetter(var0x -> var0x.M)
         )
         .apply(var0, class01470::new)
   );
   public final class04688 y;
   public final boolean L;
   public final int u;
   public final int i;
   public final class03543<class00891> M;

   public class01470(class04688 var1, boolean var2, int var3, int var4, class03543<class00891> var5) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.M = var5;
   }
}
