package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record class08582(class02204<class04449> instrument) implements class02694 {
   public static final Codec<class08582> N = class02204.N(class04227.yZ, class04449.L).xmap(class08582::new, class08582::N);
   public static final class02362<class04247, class08582> y = class02204.N(class04227.yZ, class04449.u).N_10(class08582::new, class08582::N);

   public class08582(class02204<class04449> instrument) {
      super();
      this.instrument = (class02204<class04449>)instrument;
   }

   @Deprecated
   public class08582(class05946<class04449> var1) {
      this(new class02204<>(var1));
   }

   public class08582(class03556<class04449> var1) {
      this(new class02204<>(var1));
   }

   public Optional<class03556<class04449>> N(class01929 var1) {
      return this.instrument.N(var1);
   }

   public class02204<class04449> N() {
      return this.instrument;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      class01929 class01929 = var1.N();
      if (class01929 != null) {
         this.N(class01929).ifPresent(var1x -> {
            class00392 class00392 = class00390.N(var1x.N().u(), class00405.N.N(class06541.field_1080));
            var2.accept(class00392);
         });
      }
   }
}
