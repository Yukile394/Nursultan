package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public class class00787 extends class00765 {
   public static final MapCodec<class00787> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00780.u.fieldOf("biomes").forGetter(var0x -> var0x.L), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter(var0x -> var0x.i)
         )
         .apply(var0, class00787::new)
   );
   private final class03543<class00780> L;
   private final int u;
   private final int i;

   public class00787(class03543<class00780> var1, int var2) {
      super();
      this.L = var1;
      this.u = var2 + 2;
      this.i = var2;
   }

   @Override
   protected Stream<class03556<class00780>> y() {
      return this.L.N();
   }

   @Override
   protected MapCodec<? extends class00765> N() {
      return y;
   }

   @Override
   public class03556<class00780> method_38109(int var1, int var2, int var3, class03222 var4) {
      return this.L.N(Math.floorMod((var1 >> this.u) + (var3 >> this.u), this.L.y()));
   }
}
