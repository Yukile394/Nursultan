package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04031(class02142 height, class01471 state) {
   public static final Codec<class04031> N = RecordCodecBuilder.create(
      var0 -> var0.group(class02142.u.fieldOf("height").forGetter(class04031::N), class01471.N.fieldOf("provider").forGetter(class04031::y))
         .apply(var0, class04031::new)
   );

   public class04031(class02142 height, class01471 state) {
      this.height = height;
      this.state = state;
   }

   public class01471 y() {
      return this.state;
   }

   public class02142 N() {
      return this.height;
   }
}
