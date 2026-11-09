package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02529(class02546 base, class02546 power) implements class02546 {
   public static final MapCodec<class02529> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("base").forGetter(class02529::y), class02546.y.fieldOf("power").forGetter(class02529::L))
         .apply(var0, class02529::new)
   );

   public class02546 L() {
      return this.power;
   }

   public class02529(class02546 base, class02546 power) {
      this.base = base;
      this.power = power;
   }

   public class02546 y() {
      return this.base;
   }

   @Override
   public MapCodec<class02529> N() {
      return L;
   }

   @Override
   public float N(int var1) {
      return (float)Math.pow(this.base.N(var1), this.power.N(var1));
   }
}
