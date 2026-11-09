package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;

class class02033 {
   private final Set<class04469> y;
   private class03926 L;
   private boolean u;
   private int i;

   class02033(class03791 var1, class03926 var2) {
      super();
      this.N = var1;
      this.u = true;
      this.y = new ObjectOpenHashSet(var2.W().u().y());
      this.L = var2;
   }

   boolean N(class03926 var1) {
      if (var1.equals(this.L)) {
         return false;
      } else {
         boolean flag = this.y.remove(var1.E());
         if (this.u && this.L.M().equals(var1.M())) {
            if (this.L.U().N(var1.U())) {
               flag = true;
               this.L = var1;
            } else {
               this.u = false;
            }
         }

         if (flag) {
            this.i++;
         }

         return flag;
      }
   }

   boolean N() {
      return this.i >= this.N.N || !this.u && this.y.isEmpty();
   }
}
