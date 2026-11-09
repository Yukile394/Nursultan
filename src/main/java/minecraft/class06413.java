package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06413 extends class06041 {
   public static final MapCodec<class06413> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.DOUBLE.fieldOf("noise_level").forGetter(var0x -> var0x.L),
            Codec.INT.fieldOf("below_noise").forGetter(var0x -> var0x.u),
            Codec.INT.fieldOf("above_noise").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class06413::new)
   );
   private final double L;
   private final int u;
   private final int i;

   private class06413(double var1, int var3, int var4) {
      super();
      this.L = var1;
      this.u = var3;
      this.i = var4;
   }

   @Override
   public class04323<?> N() {
      return class04323.B;
   }

   public static class06413 N(double var0, int var2, int var3) {
      return new class06413(var0, var2, var3);
   }

   @Override
   protected int N(class06069 var1, class07209 var2) {
      return class00780.R.N(var2.method_10263() / 200.0, var2.method_10260() / 200.0, false) < this.L ? this.u : this.i;
   }
}
