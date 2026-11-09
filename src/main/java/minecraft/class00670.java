package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class00670 extends class03710 {
   protected static final MapCodec<class07134> N = class04206.z
      .T()
      .comapFlatMap(
         var0 -> var0 instanceof class07134 ? DataResult.success((class07134)var0) : DataResult.error(() -> "Not a SimpleParticleType: " + var0), var0 -> var0
      )
      .fieldOf("particle_options");
   public static final MapCodec<class00670> y = RecordCodecBuilder.mapCodec(var0 -> var0.group(N.forGetter(var0x -> var0x.L), t()).apply(var0, class00670::new));
   protected final class07134 L;

   public class00670(class07134 var1, class01362 var2) {
      super(var2);
      this.L = var1;
   }

   @Override
   public MapCodec<? extends class00670> N() {
      return y;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      double d0 = var3.method_10263() + 0.5;
      double d1 = var3.method_10264() + 0.7;
      double d2 = var3.method_10260() + 0.5;
      var2.method_8406(class07107.NZ, d0, d1, d2, 0.0, 0.0, 0.0);
      var2.method_8406(this.L, d0, d1, d2, 0.0, 0.0, 0.0);
   }
}
