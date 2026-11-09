package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02524(class02546 value, float min, float max) implements class02546 {
   public static final MapCodec<class02524> L = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class02546.y.fieldOf("value").forGetter(class02524::y),
               Codec.FLOAT.fieldOf("min").forGetter(class02524::L),
               Codec.FLOAT.fieldOf("max").forGetter(class02524::u)
            )
            .apply(var0, class02524::new)
      )
      .validate(
         var0 -> var0.max <= var0.min
            ? DataResult.error(() -> "Max must be larger than min, min: " + var0.min + ", max: " + var0.max)
            : DataResult.success(var0)
      );

   public float L() {
      return this.min;
   }

   public class02524(class02546 value, float min, float max) {
      super();
      this.value = value;
      this.min = min;
      this.max = max;
   }

   public float u() {
      return this.max;
   }

   public class02546 y() {
      return this.value;
   }

   @Override
   public float N(int var1) {
      return class04995.N(this.value.N(var1), this.min, this.max);
   }

   @Override
   public MapCodec<class02524> N() {
      return L;
   }
}
