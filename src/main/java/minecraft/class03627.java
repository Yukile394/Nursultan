package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03627 implements class07126 {
   public static final MapCodec<class03627> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.INT.fieldOf("delay").forGetter(var0x -> var0x.L)).apply(var0, class03627::new)
   );
   public static final class02362<class04247, class03627> y = class02362.N(class02389.B, var0 -> var0.L, class03627::new);
   private final int L;

   public class03627(int var1) {
      super();
      this.L = var1;
   }

   public int N() {
      return this.L;
   }

   @Override
   public class07103<class03627> method_10295() {
      return class07107.Nr;
   }
}
