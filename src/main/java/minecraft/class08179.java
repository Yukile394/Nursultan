package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08179(class08195 level) implements class08159 {
   public static final MapCodec<class08179> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class08195.field_63201.fieldOf("level").forGetter(class08179::y)).apply(var0, class08179::new)
   );

   public class08179(class08195 level) {
      this.level = level;
   }

   public class08195 y() {
      return this.level;
   }

   @Override
   public MapCodec<class08179> N() {
      return L;
   }
}
