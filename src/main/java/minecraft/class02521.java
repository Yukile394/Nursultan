package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02521(class02546 chance) implements class02536 {
   public static final MapCodec<class02521> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("chance").forGetter(class02521::y)).apply(var0, class02521::new)
   );

   public class02521(class02546 chance) {
      this.chance = chance;
   }

   public class02546 y() {
      return this.chance;
   }

   @Override
   public MapCodec<class02521> N() {
      return N;
   }

   @Override
   public float N(int var1, class06069 var2, float var3) {
      float f = this.chance.N(var1);
      int i = 0;
      if (!(var3 <= 128.0F) && !(var3 * f < 20.0F) && !(var3 * (1.0F - f) < 20.0F)) {
         double d1 = Math.floor(var3 * f);
         double d0 = Math.sqrt(var3 * f * (1.0F - f));
         i = (int)Math.round(d1 + var2.E() * d0);
         i = Math.clamp((long)i, 0, (int)var3);
      } else {
         for (int j = 0; j < var3; j++) {
            if (var2.z() < f) {
               i++;
            }
         }
      }

      return var3 - i;
   }
}
