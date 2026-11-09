package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;

public record class00133(class00106 template) implements class08752 {
   public static final MapCodec<class00133> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00106.N.fieldOf("template").forGetter(class00133::y)).apply(var0, class00133::new)
   );

   public class00133(class00106 template) {
      super();
      this.template = template;
   }

   public class00106 y() {
      return this.template;
   }

   @Override
   public Optional<class00647> N(Map<String, class08737> var1) {
      String s = this.template.N(class08737.N(var1));
      return Optional.of(new class00625(s));
   }

   @Override
   public MapCodec<class00133> N() {
      return N;
   }
}
