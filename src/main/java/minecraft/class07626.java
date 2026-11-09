package minecraft;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class class07626 {
   private final class07079 N;
   private final IntSet y = new IntOpenHashSet();
   private final IntSet L = new IntOpenHashSet();

   public class07626(class07079 var1) {
      super();
      this.N = var1;
   }

   public void N() {
      this.y.clear();
      this.L.clear();
   }

   public boolean N(class07049 var1) {
      int i = var1.method_5628();
      if (this.y.contains(i)) {
         return true;
      } else if (this.L.contains(i)) {
         return false;
      } else {
         class04643 class04643 = class08700.N();
         class04643.N("hasLineOfSight");
         boolean flag = this.N.method_6057(var1);
         class04643.L();
         if (flag) {
            this.y.add(i);
         } else {
            this.L.add(i);
         }

         return flag;
      }
   }
}
