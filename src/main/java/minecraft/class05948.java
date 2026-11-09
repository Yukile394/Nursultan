package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

final class class05948 {
   public static final Codec<class05948> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.INT.fieldOf("spacing").forGetter(var0x -> var0x.y),
            Codec.INT.fieldOf("separation").forGetter(var0x -> var0x.L),
            Codec.INT.fieldOf("salt").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class05948::new)
   );
   final int y;
   final int L;
   final int u;

   public class05948(int var1, int var2, int var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public <T> Dynamic<T> N(DynamicOps<T> var1) {
      return new Dynamic(var1, N.encodeStart(var1, this).result().orElse(var1.emptyMap()));
   }
}
