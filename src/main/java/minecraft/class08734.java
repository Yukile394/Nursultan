package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08734(class09027 button, Optional<class08752> action) {
   public static final Codec<class08734> N = RecordCodecBuilder.create(
      var0 -> var0.group(class09027.y.forGetter(class08734::N), class08752.y.optionalFieldOf("action").forGetter(class08734::y)).apply(var0, class08734::new)
   );

   public class08734(class09027 button, Optional<class08752> action) {
      this.button = button;
      this.action = action;
   }

   public Optional<class08752> y() {
      return this.action;
   }

   public class09027 N() {
      return this.button;
   }
}
