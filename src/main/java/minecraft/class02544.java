package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02544(class02546 factor) implements class02536 {
   public static final MapCodec<class02544> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("factor").forGetter(class02544::y)).apply(var0, class02544::new)
   );

   public class02544(class02546 factor) {
      this.factor = factor;
   }

   public class02546 y() {
      return this.factor;
   }

   @Override
   public MapCodec<class02544> N() {
      return N;
   }

   @Override
   public float N(int var1, class06069 var2, float var3) {
      return var3 * this.factor.N(var1);
   }
}
