package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class class03267 {
   private final List<class03285> N = new ArrayList<>();
   private class03285 y = class03285.y_const;

   public class03267() {
      super();
   }

   public class03275 N() {
      int i = this.N.size();

      for (int j = 0; j < i; j++) {
         if (this.N.get(j).N() != j) {
            throw new IllegalArgumentException("Expected input slots to have continous indexes");
         }
      }

      if (this.y.N() != i) {
         throw new IllegalArgumentException("Expected result slot index to follow last input slot");
      } else {
         return new class03275(this.N, this.y);
      }
   }

   public class03267 N(int var1, int var2, int var3) {
      this.y = new class03285(var1, var2, var3, var0 -> false);
      return this;
   }

   public class03267 N(int var1, int var2, int var3, Predicate<class06584> var4) {
      this.N.add(new class03285(var1, var2, var3, var4));
      return this;
   }
}
