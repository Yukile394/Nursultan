package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public record class08551(class02204<class03252> material) {
   public static final Codec<class08551> N = class02204.N(class04227.yw, class03252.L).xmap(class08551::new, class08551::N);
   public static final class02362<class04247, class08551> y = class02204.N(class04227.yw, class03252.u).N_10(class08551::new, class08551::N);

   public class08551(class02204<class03252> material) {
      this.material = (class02204<class03252>)material;
   }

   @Deprecated
   public class08551(class05946<class03252> var1) {
      this(new class02204<>(var1));
   }

   public class08551(class03556<class03252> var1) {
      this(new class02204<>(var1));
   }

   public class02204<class03252> N() {
      return this.material;
   }

   public Optional<class03556<class03252>> N(class01929 var1) {
      return this.material.N(var1);
   }
}
