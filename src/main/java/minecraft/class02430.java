package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02430(Optional<Integer> width, Optional<Integer> height, boolean persistent, int clearColor) {
   public static final Codec<class02430> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.b.optionalFieldOf("width").forGetter(class02430::N),
            class06338.b.optionalFieldOf("height").forGetter(class02430::y),
            Codec.BOOL.optionalFieldOf("persistent", false).forGetter(class02430::L),
            class06338.W.optionalFieldOf("clear_color", 0).forGetter(class02430::u)
         )
         .apply(var0, class02430::new)
   );

   public boolean L() {
      return this.persistent;
   }

   public class02430(Optional<Integer> width, Optional<Integer> height, boolean persistent, int clearColor) {
      super();
      this.width = width;
      this.height = height;
      this.persistent = persistent;
      this.clearColor = clearColor;
   }

   public int u() {
      return this.clearColor;
   }

   public Optional<Integer> y() {
      return this.height;
   }

   public Optional<Integer> N() {
      return this.width;
   }
}
