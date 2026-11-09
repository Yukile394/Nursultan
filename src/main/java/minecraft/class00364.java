package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00364(class06563 baseColor) implements class00335 {
   public static final MapCodec<class00364> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.fieldOf("color").forGetter(class00364::y)).apply(var0, class00364::new)
   );

   public class00364(class06563 baseColor) {
      super();
      this.baseColor = baseColor;
   }

   public class06563 y() {
      return this.baseColor;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      return new class00375(this.baseColor, new class03571(var1));
   }

   @Override
   public MapCodec<class00364> N() {
      return N;
   }
}
