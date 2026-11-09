package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00627(String value) implements class00647 {
   public static final MapCodec<class00627> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("value").forGetter(class00627::y)).apply(var0, class00627::new)
   );

   public class00627(String value) {
      super();
      this.value = value;
   }

   public String y() {
      return this.value;
   }

   @Override
   public class00654 N() {
      return class00654.field_21462;
   }
}
