package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01117 {
   public static final Codec<class01117> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01100.N.fieldOf("generate_crack_chance").orElse(1.0).forGetter(var0x -> var0x.y),
            Codec.doubleRange(0.0, 5.0).fieldOf("base_crack_size").orElse(2.0).forGetter(var0x -> var0x.L),
            Codec.intRange(0, 10).fieldOf("crack_point_offset").orElse(2).forGetter(var0x -> var0x.u)
         )
         .apply(var0, class01117::new)
   );
   public final double y;
   public final double L;
   public final int u;

   public class01117(double var1, double var3, int var5) {
      super();
      this.y = var1;
      this.L = var3;
      this.u = var5;
   }
}
