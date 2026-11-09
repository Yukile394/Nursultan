package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class04773(Optional<class05946<class07299>> dimension, Optional<class06889> position, Optional<class07109> rotation) {
   public static final MapCodec<class04773> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07299.field_25178.optionalFieldOf("Dimension").forGetter(class04773::N),
            class06889.N.optionalFieldOf("Pos").forGetter(class04773::y),
            class07109.Z.optionalFieldOf("Rotation").forGetter(class04773::L)
         )
         .apply(var0, class04773::new)
   );
   public static final class04773 y = new class04773(Optional.empty(), Optional.empty(), Optional.empty());

   public Optional<class07109> L() {
      return this.rotation;
   }

   public class04773(Optional<class05946<class07299>> dimension, Optional<class06889> position, Optional<class07109> rotation) {
      super();
      this.dimension = dimension;
      this.position = position;
      this.rotation = rotation;
   }

   public Optional<class06889> y() {
      return this.position;
   }

   public Optional<class05946<class07299>> N() {
      return this.dimension;
   }
}
