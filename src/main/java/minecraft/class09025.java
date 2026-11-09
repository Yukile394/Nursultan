package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class09025(String id, Optional<class00392> display, boolean initial) {
   public static final Codec<class09025> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("id").forGetter(class09025::y),
            class03748.N.optionalFieldOf("display").forGetter(class09025::L),
            Codec.BOOL.optionalFieldOf("initial", false).forGetter(class09025::u)
         )
         .apply(var0, class09025::new)
   );
   public static final Codec<class09025> y = Codec.withAlternative(N, Codec.STRING, var0 -> new class09025(var0, Optional.empty(), false));

   public Optional<class00392> L() {
      return this.display;
   }

   public class09025(String id, Optional<class00392> display, boolean initial) {
      super();
      this.id = id;
      this.display = display;
      this.initial = initial;
   }

   public boolean u() {
      return this.initial;
   }

   public String y() {
      return this.id;
   }

   public class00392 N() {
      return this.display.orElseGet(() -> class00392.y(this.id));
   }
}
