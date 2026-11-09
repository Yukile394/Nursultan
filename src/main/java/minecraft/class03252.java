package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03252(class08548 assets, class00392 description) {
   public static final Codec<class03252> N = RecordCodecBuilder.create(
      var0 -> var0.group(class08548.y.forGetter(class03252::N), class03748.N.fieldOf("description").forGetter(class03252::y)).apply(var0, class03252::new)
   );
   public static final class02362<class04247, class03252> y = class02362.N(class08548.L, class03252::N, class03748.y, class03252::y, class03252::new);
   public static final Codec<class03556<class03252>> L = class01281.N(class04227.yw, N);
   public static final class02362<class04247, class03556<class03252>> u = class02389.N(class04227.yw, y);

   public class03252(class08548 assets, class00392 description) {
      super();
      this.assets = assets;
      this.description = description;
   }

   public class00392 y() {
      return this.description;
   }

   public class08548 N() {
      return this.assets;
   }
}
