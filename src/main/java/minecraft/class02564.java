package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class02564 extends class04050 {
   public static final MapCodec<class02564> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.INT.fieldOf("max_water_depth").forGetter(var0x -> var0x.L)).apply(var0, class02564::new)
   );
   private final int L;

   private class02564(int var1) {
      super();
      this.L = var1;
   }

   @Override
   protected boolean y(class01034 var1, class06069 var2, class07209 var3) {
      int i = var1.N(class07830.field_13200, var3.method_10263(), var3.method_10260());
      return var1.N(class07830.field_13202, var3.method_10263(), var3.method_10260()) - i <= this.L;
   }

   @Override
   public class04323<?> N() {
      return class04323.u;
   }

   public static class02564 N(int var0) {
      return new class02564(var0);
   }
}
