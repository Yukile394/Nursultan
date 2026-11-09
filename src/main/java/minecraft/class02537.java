package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02537(class02546 numerator, class02546 denominator) implements class02546 {
   public static final MapCodec<class02537> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("numerator").forGetter(class02537::y), class02546.y.fieldOf("denominator").forGetter(class02537::L))
         .apply(var0, class02537::new)
   );

   public class02546 L() {
      return this.denominator;
   }

   public class02537(class02546 numerator, class02546 denominator) {
      super();
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public class02546 y() {
      return this.numerator;
   }

   @Override
   public MapCodec<class02537> N() {
      return L;
   }

   @Override
   public float N(int var1) {
      float f = this.denominator.N(var1);
      return f == 0.0F ? 0.0F : this.numerator.N(var1) / f;
   }
}
