package minecraft;

import java.util.Collection;
import java.util.Locale;

public class class08383 extends RuntimeException {
   private final Collection<class08387> N;

   public class08383(class08387 var1, Collection<class08387> var2) {
      super(
         String.format(
            Locale.ROOT,
            "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?",
            var1.method_45816(),
            var1.method_45807(),
            var1.method_45815()
         )
      );
      this.N = var2;
   }

   public Collection<class08387> N() {
      return this.N;
   }
}
