package minecraft;

import com.mojang.serialization.Codec;
import java.util.Map;

public record class02719(Map<String, class02685> decorations) {
   public static final class02719 N = new class02719(Map.of());
   public static final Codec<class02719> y = Codec.unboundedMap(Codec.STRING, class02685.N).xmap(class02719::new, class02719::N);

   public class02719(Map<String, class02685> decorations) {
      super();
      this.decorations = decorations;
   }

   public Map<String, class02685> N() {
      return this.decorations;
   }

   public class02719 N(String var1, class02685 var2) {
      return new class02719(class07536.N(this.decorations, var1, var2));
   }
}
