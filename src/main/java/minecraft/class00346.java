package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00346(class01894 texture) implements class00335 {
   public static final MapCodec<class00346> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("texture").forGetter(class00346::y)).apply(var0, class00346::new)
   );

   public class00346(class06563 var1) {
      this(class05911.y(var1));
   }

   public class00346(class01894 texture) {
      super();
      this.texture = texture;
   }

   public class01894 y() {
      return this.texture;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      return new class00353(new class03357(var1), class05911.v.N(this.texture));
   }

   @Override
   public MapCodec<class00346> N() {
      return N;
   }
}
