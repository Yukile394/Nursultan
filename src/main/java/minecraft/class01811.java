package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01811 extends class04050 {
   public static final MapCodec<class01811> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07830.field_24772.fieldOf("heightmap").forGetter(var0x -> var0x.L),
            Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter(var0x -> var0x.u),
            Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter(var0x -> var0x.i)
         )
         .apply(var0, class01811::new)
   );
   private final class07830 L;
   private final int u;
   private final int i;

   private class01811(class07830 var1, int var2, int var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   @Override
   protected boolean y(class01034 var1, class06069 var2, class07209 var3) {
      long ix = var1.N(this.L, var3.method_10263(), var3.method_10260());
      long j = ix + this.u;
      long k = ix + this.i;
      return j <= var3.method_10264() && var3.method_10264() <= k;
   }

   public static class01811 N(class07830 var0, int var1, int var2) {
      return new class01811(var0, var1, var2);
   }

   @Override
   public class04323<?> N() {
      return class04323.L;
   }
}
