package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02974(class03767 flags) {
   private static final Codec<class02974> L = RecordCodecBuilder.create(
      var0 -> var0.group(class03794.R.fieldOf("enabled").forGetter(class02974::N)).apply(var0, class02974::new)
   );
   public static final class02968<class02974> N = new class02968<>("features", L);

   public class02974(class03767 flags) {
      super();
      this.flags = flags;
   }

   public class03767 N() {
      return this.flags;
   }
}
