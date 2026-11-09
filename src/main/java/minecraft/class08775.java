package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;

public record class08775(class01894 id, Optional<class07001> additions) implements class08752 {
   public static final MapCodec<class08775> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("id").forGetter(class08775::y), class07001.N.optionalFieldOf("additions").forGetter(class08775::L))
         .apply(var0, class08775::new)
   );

   public Optional<class07001> L() {
      return this.additions;
   }

   public class08775(class01894 id, Optional<class07001> additions) {
      super();
      this.id = id;
      this.additions = additions;
   }

   public class01894 y() {
      return this.id;
   }

   @Override
   public MapCodec<class08775> N() {
      return N;
   }

   @Override
   public Optional<class00647> N(Map<String, class08737> var1) {
      class07001 class07001 = this.additions.<class07001>map(class07001::N).orElseGet(class07001::new);
      var1.forEach((var1x, var2x) -> class07001.N(var1x, var2x.y()));
      return Optional.of(new class00669(this.id, Optional.of(class07001)));
   }
}
