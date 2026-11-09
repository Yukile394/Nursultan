package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02519(class02546 value) implements class02536 {
   public static final MapCodec<class02519> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("value").forGetter(class02519::y)).apply(var0, class02519::new)
   );

   public class02519(class02546 value) {
      this.value = value;
   }

   public class02546 y() {
      return this.value;
   }

   @Override
   public MapCodec<class02519> N() {
      return N;
   }

   @Override
   public float N(int var1, class06069 var2, float var3) {
      return this.value.N(var1);
   }
}
