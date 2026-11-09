package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02527(class02546 value) implements class02536 {
   public static final MapCodec<class02527> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("value").forGetter(class02527::y)).apply(var0, class02527::new)
   );

   public class02527(class02546 value) {
      super();
      this.value = value;
   }

   public class02546 y() {
      return this.value;
   }

   @Override
   public MapCodec<class02527> N() {
      return N;
   }

   @Override
   public float N(int var1, class06069 var2, float var3) {
      return var3 + this.value.N(var1);
   }
}
