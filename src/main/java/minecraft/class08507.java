package minecraft;

import com.mojang.serialization.Codec;
import java.util.Map;

public record class08507(Map<String, class08430> languages) {
   public static final Codec<String> N = Codec.string(1, 16);
   public static final Codec<class08507> y = Codec.unboundedMap(N, class08430.N).xmap(class08507::new, class08507::N);
   public static final class02968<class08507> L = new class02968<>("language", y);

   public class08507(Map<String, class08430> languages) {
      this.languages = languages;
   }

   public Map<String, class08430> N() {
      return this.languages;
   }
}
