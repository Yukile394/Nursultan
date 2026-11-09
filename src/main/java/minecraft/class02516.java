package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class02516(List<Float> values, class02546 fallback) implements class02546 {
   public static final MapCodec<class02516> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(class02516::y), class02546.y.fieldOf("fallback").forGetter(class02516::L))
         .apply(var0, class02516::new)
   );

   public class02546 L() {
      return this.fallback;
   }

   public class02516(List<Float> values, class02546 fallback) {
      this.values = values;
      this.fallback = fallback;
   }

   public List<Float> y() {
      return this.values;
   }

   @Override
   public MapCodec<class02516> N() {
      return L;
   }

   @Override
   public float N(int var1) {
      return var1 <= this.values.size() ? this.values.get(var1 - 1) : this.fallback.N(var1);
   }
}
