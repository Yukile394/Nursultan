package minecraft;

import org.jspecify.annotations.Nullable;

class class01641 {
   private final class01639[] N;

   class01641(int var1) {
      super();
      this.N = new class01639[var1];
   }

   public void N(class03345 var1, class01639 var2) {
      this.N[var1.y] = var2;
   }

   @Nullable
   public class01639 N(class03345 var1) {
      int i = var1.y;
      return i >= 0 && i < this.N.length ? this.N[i] : null;
   }
}
