package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00391(class00398 entity) implements class00395 {
   public static final MapCodec<class00391> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00398.N.forGetter(class00391::y)).apply(var0, class00391::new)
   );

   public class00391(class00398 entity) {
      this.entity = entity;
   }

   public class00398 y() {
      return this.entity;
   }

   @Override
   public class00425 N() {
      return class00425.field_24344;
   }
}
