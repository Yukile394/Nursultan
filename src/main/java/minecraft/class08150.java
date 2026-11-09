package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08150(class02546 base, class02546 exponent) implements class02536 {
   public static final MapCodec<class08150> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("base").forGetter(class08150::y), class02546.y.fieldOf("exponent").forGetter(class08150::L))
         .apply(var0, class08150::new)
   );

   public class02546 L() {
      return this.exponent;
   }

   public class08150(class02546 base, class02546 exponent) {
      this.base = base;
      this.exponent = exponent;
   }

   public class02546 y() {
      return this.base;
   }

   @Override
   public MapCodec<class08150> N() {
      return N;
   }

   @Override
   public float N(int var1, class06069 var2, float var3) {
      return (float)(var3 * Math.pow(this.base.N(var1), this.exponent.N(var1)));
   }
}
