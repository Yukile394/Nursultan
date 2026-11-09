package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02532(float base, float perLevelAboveFirst) implements class02546 {
   public static final MapCodec<class02532> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.FLOAT.fieldOf("base").forGetter(class02532::y), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(class02532::L))
         .apply(var0, class02532::new)
   );

   public float L() {
      return this.perLevelAboveFirst;
   }

   public class02532(float base, float perLevelAboveFirst) {
      super();
      this.base = base;
      this.perLevelAboveFirst = perLevelAboveFirst;
   }

   public float y() {
      return this.base;
   }

   @Override
   public MapCodec<class02532> N() {
      return L;
   }

   @Override
   public float N(int var1) {
      return this.base + this.perLevelAboveFirst * (var1 - 1);
   }
}
