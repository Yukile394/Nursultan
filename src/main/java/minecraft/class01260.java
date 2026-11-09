package minecraft;

import java.util.Optional;

public class class01260 extends class01284 {
   private final class07049 N;

   public class01260(class07049 var1) {
      super();
      this.N = var1;
   }

   @Override
   public Optional N(class07307 var1, class07290 var2, class07209 var3, class00500 var4, class04688 var5) {
      Optional<Float> optional = super.N(var1, var2, var3, var4, var5);
      if (optional.isPresent()) {
         float f = optional.get();
         float f1 = this.N.method_5774(var1, var2, var3, var4, var5, f);
         if (f1 != f) {
            return Optional.of(f1);
         }
      }

      return optional;
   }

   @Override
   public boolean N(class07307 var1, class07290 var2, class07209 var3, class00500 var4, float var5) {
      return this.N.method_5853(var1, var2, var3, var4, var5);
   }
}
