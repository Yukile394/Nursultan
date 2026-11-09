package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01600 extends class06041 {
   public static final MapCodec<class01600> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.INT.fieldOf("noise_to_count_ratio").forGetter(var0x -> var0x.L),
            Codec.DOUBLE.fieldOf("noise_factor").forGetter(var0x -> var0x.u),
            Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter(var0x -> var0x.i)
         )
         .apply(var0, class01600::new)
   );
   private final int L;
   private final double u;
   private final double i;

   private class01600(int var1, double var2, double var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var4;
   }

   @Override
   public class04323<?> N() {
      return class04323.M;
   }

   public static class01600 N(int var0, double var1, double var3) {
      return new class01600(var0, var1, var3);
   }

   @Override
   protected int N(class06069 var1, class07209 var2) {
      return (int)Math.ceil((class00780.R.N(var2.method_10263() / this.u, var2.method_10260() / this.u, false) + this.i) * this.L);
   }
}
