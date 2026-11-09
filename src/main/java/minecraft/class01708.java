package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.slf4j.Logger;

public class class01708 extends class03855 {
   public static final MapCodec<class01708> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06055.N.fieldOf("min_inclusive").forGetter(var0x -> var0x.u),
            class06055.N.fieldOf("max_inclusive").forGetter(var0x -> var0x.i),
            Codec.INT.optionalFieldOf("plateau", 0).forGetter(var0x -> var0x.R)
         )
         .apply(var0, class01708::new)
   );
   private static final Logger y = LogUtils.getLogger();
   private final class06055 u;
   private final class06055 i;
   private final int R;

   private class01708(class06055 var1, class06055 var2, int var3) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
   }

   @Override
   public String toString() {
      return this.R == 0 ? "triangle (" + this.u + "-" + this.i + ")" : "trapezoid(" + this.R + ") in [" + this.u + "-" + this.i + "]";
   }

   public static class01708 N(class06055 var0, class06055 var1, int var2) {
      return new class01708(var0, var1, var2);
   }

   @Override
   public int N(class06069 var1, class06057 var2) {
      int ix = this.u.N(var2);
      int j = this.i.N(var2);
      if (ix > j) {
         y.warn("Empty height range: {}", this);
         return ix;
      } else {
         int k = j - ix;
         if (this.R >= k) {
            return class04995.y(var1, ix, j);
         } else {
            int l = (k - this.R) / 2;
            int i1 = k - l;
            return ix + class04995.y(var1, 0, i1) + class04995.y(var1, 0, l);
         }
      }
   }

   public static class01708 N(class06055 var0, class06055 var1) {
      return N(var0, var1, 0);
   }

   @Override
   public class03862<?> N() {
      return class03862.i;
   }
}
