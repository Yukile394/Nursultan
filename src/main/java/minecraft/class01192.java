package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01192 implements class07126 {
   private static final Codec<class01190> L = class01190.L
      .validate(var0 -> var0 instanceof class01177 ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success(var0));
   public static final MapCodec<class01192> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(L.fieldOf("destination").forGetter(class01192::N), Codec.INT.fieldOf("arrival_in_ticks").forGetter(class01192::y))
         .apply(var0, class01192::new)
   );
   public static final class02362<class04247, class01192> y = class02362.N(class01190.u, class01192::N, class02389.B, class01192::y, class01192::new);
   private final class01190 u;
   private final int i;

   public class01192(class01190 var1, int var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   public int y() {
      return this.i;
   }

   public class01190 N() {
      return this.u;
   }

   @Override
   public class07103<class01192> method_10295() {
      return class07107.x;
   }
}
