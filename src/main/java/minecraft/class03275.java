package minecraft;

import java.util.List;

public class class03275 {
   private final List<class03285> N;
   private final class03285 y;

   public List<class03285> L() {
      return this.N;
   }

   class03275(List<class03285> var1, class03285 var2) {
      super();
      if (!var1.isEmpty() && !var2.equals(class03285.y_const)) {
         this.N = var1;
         this.y = var2;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public int i() {
      return this.u();
   }

   public int u() {
      return this.N.size();
   }

   public class03285 y() {
      return this.y;
   }

   public static class03267 N() {
      return new class03267();
   }

   public class03285 N(int var1) {
      return this.N.get(var1);
   }
}
