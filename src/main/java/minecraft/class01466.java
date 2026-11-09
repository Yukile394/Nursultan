package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01466 implements class06386 {
   public static final Codec<class01466> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01471.N.fieldOf("cap_provider").forGetter(var0x -> var0x.y),
            class01471.N.fieldOf("stem_provider").forGetter(var0x -> var0x.L),
            Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter(var0x -> var0x.u)
         )
         .apply(var0, class01466::new)
   );
   public final class01471 y;
   public final class01471 L;
   public final int u;

   public class01466(class01471 var1, class01471 var2, int var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }
}
