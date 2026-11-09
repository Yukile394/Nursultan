package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04426(class04436 boundingBox, class04540<class01016> spawns) {
   public static final Codec<class04426> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04436.field_37202.fieldOf("bounding_box").forGetter(class04426::N), class04540.N(class01016.N).fieldOf("spawns").forGetter(class04426::y)
         )
         .apply(var0, class04426::new)
   );

   public class04426(class04436 boundingBox, class04540<class01016> spawns) {
      this.boundingBox = boundingBox;
      this.spawns = spawns;
   }

   public class04540<class01016> y() {
      return this.spawns;
   }

   public class04436 N() {
      return this.boundingBox;
   }
}
