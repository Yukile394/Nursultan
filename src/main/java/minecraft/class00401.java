package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00401(class00392 value) implements class00395 {
   public static final MapCodec<class00401> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03748.N.fieldOf("value").forGetter(class00401::y)).apply(var0, class00401::new)
   );

   public class00401(class00392 value) {
      super();
      this.value = value;
   }

   public class00392 y() {
      return this.value;
   }

   @Override
   public class00425 N() {
      return class00425.field_24342;
   }
}
