package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02514(float value) implements class02546 {
   public static final Codec<class02514> L = Codec.FLOAT.xmap(class02514::new, class02514::y);
   public static final MapCodec<class02514> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.FLOAT.fieldOf("value").forGetter(class02514::y)).apply(var0, class02514::new)
   );

   public class02514(float value) {
      this.value = value;
   }

   public float y() {
      return this.value;
   }

   @Override
   public MapCodec<class02514> N() {
      return u;
   }

   @Override
   public float N(int var1) {
      return this.value;
   }
}
