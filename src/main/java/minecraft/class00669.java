package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00669(class01894 id, Optional<class07709> payload) implements class00647 {
   public static final MapCodec<class00669> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("id").forGetter(class00669::y), class06338.L.optionalFieldOf("payload").forGetter(class00669::L))
         .apply(var0, class00669::new)
   );

   public Optional<class07709> L() {
      return this.payload;
   }

   public class00669(class01894 id, Optional<class07709> payload) {
      super();
      this.id = id;
      this.payload = payload;
   }

   public class01894 y() {
      return this.id;
   }

   @Override
   public class00654 N() {
      return class00654.field_60822;
   }
}
