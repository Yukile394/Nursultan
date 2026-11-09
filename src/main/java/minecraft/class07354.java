package minecraft;

import java.util.Optional;

public record class07354(Optional<class03556<class07084>> primary, Optional<class03556<class07084>> secondary) implements class00381<class08051> {
   public static final class02362<class04247, class07354> N = class02362.N(
      class07084.y.N_33(class02389::N), class07354::N, class07084.y.N_33(class02389::N), class07354::y, class07354::new
   );

   public class07354(Optional<class03556<class07084>> primary, Optional<class03556<class07084>> secondary) {
      super();
      this.primary = primary;
      this.secondary = secondary;
   }

   public Optional<class03556<class07084>> y() {
      return this.secondary;
   }

   public void method_65081(class08051 var1) {
      var1.method_12057(this);
   }

   public Optional<class03556<class07084>> N() {
      return this.primary;
   }

   @Override
   public class02897<class07354> method_65080() {
      return class04248.LZ;
   }
}
