package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.slf4j.Logger;

public class class03851 extends class03855 {
   public static final MapCodec<class03851> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06055.N.fieldOf("min_inclusive").forGetter(var0x -> var0x.u),
            class06055.N.fieldOf("max_inclusive").forGetter(var0x -> var0x.i),
            Codec.intRange(1, Integer.MAX_VALUE).optionalFieldOf("inner", 1).forGetter(var0x -> var0x.R)
         )
         .apply(var0, class03851::new)
   );
   private static final Logger y = LogUtils.getLogger();
   private final class06055 u;
   private final class06055 i;
   private final int R;

   private class03851(class06055 var1, class06055 var2, int var3) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
   }

   @Override
   public String toString() {
      return "biased[" + this.u + "-" + this.i + " inner: " + this.R + "]";
   }

   public static class03851 N(class06055 var0, class06055 var1, int var2) {
      return new class03851(var0, var1, var2);
   }

   @Override
   public int N(class06069 var1, class06057 var2) {
      int ix = this.u.N(var2);
      int j = this.i.N(var2);
      if (j - ix - this.R + 1 <= 0) {
         y.warn("Empty height range: {}", this);
         return ix;
      } else {
         int k = var1.y(j - ix - this.R + 1);
         return var1.y(k + this.R) + ix;
      }
   }

   @Override
   public class03862<?> N() {
      return class03862.L;
   }
}
