package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02563(float added) implements class02546 {
   public static final MapCodec<class02563> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.FLOAT.fieldOf("added").forGetter(class02563::y)).apply(var0, class02563::new)
   );

   public class02563(float added) {
      super();
      this.added = added;
   }

   public float y() {
      return this.added;
   }

   @Override
   public MapCodec<class02563> N() {
      return L;
   }

   @Override
   public float N(int var1) {
      return class04995.Z(var1) + this.added;
   }
}
