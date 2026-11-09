package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public record class02469(class03543<class06525> potions) implements class02465<class06517> {
   public static final Codec<class02469> N = class03541.N(class04227.NW).xmap(class02469::new, class02469::N);

   public class02469(class03543<class06525> potions) {
      this.potions = potions;
   }

   @Override
   public class02477<class06517> y() {
      return class02484.h;
   }

   public boolean N(class06517 var1) {
      Optional<class03556<class06525>> optional = var1.i();
      return !optional.isEmpty() && this.potions.N(optional.get());
   }

   public class03543<class06525> N() {
      return this.potions;
   }

   public static class02500 N(class03543<class06525> var0) {
      return new class02469(var0);
   }
}
