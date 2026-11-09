package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public class class07692 {
   public static final Codec<class07692> N = class01894.N.xmap(class07692::new, class07692::N);
   private final class01894 y;
   private boolean L;
   private Optional<class07684<class07701>> u = Optional.empty();

   public class07692(class01894 var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this ? true : var1 instanceof class07692 class07692 && this.N().equals(class07692.N());
   }

   public Optional<class07684<class07701>> N(class03800 var1) {
      if (!this.L) {
         this.u = var1.N(this.y);
         this.L = true;
      }

      return this.u;
   }

   public class01894 N() {
      return this.y;
   }
}
