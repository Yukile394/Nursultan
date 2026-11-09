package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

public record class07422(Map<String, class07389<?>> schemas) {
   public static final MapCodec<class07422> N = y();

   public class07422(Map<String, class07389<?>> schemas) {
      super();
      this.schemas = schemas;
   }

   private static MapCodec<class07422> y() {
      return RecordCodecBuilder.mapCodec(
         var0 -> var0.group(Codec.unboundedMap(Codec.STRING, class07389.N).fieldOf("schemas").forGetter(class07422::N)).apply(var0, class07422::new)
      );
   }

   public Map<String, class07389<?>> N() {
      return this.schemas;
   }
}
