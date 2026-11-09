package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02517(float movementScale, class06052 base) {
   public static final MapCodec<class02517> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(class02517::N),
            class06052.L.optionalFieldOf("base", class06042.N).forGetter(class02517::y)
         )
         .apply(var0, class02517::new)
   );

   public class02517(float movementScale, class06052 base) {
      this.movementScale = movementScale;
      this.base = base;
   }

   public class06052 y() {
      return this.base;
   }

   public float N() {
      return this.movementScale;
   }

   public double N(double var1, class06069 var3) {
      return var1 * this.movementScale + this.base.N(var3);
   }
}
