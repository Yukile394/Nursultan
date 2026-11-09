package minecraft;

import org.jspecify.annotations.Nullable;

public class class08177 {
   private int u = -1;
   int N = -1;
   @Nullable
   class06889 y;
   boolean L = false;

   public boolean L() {
      if (this.N > 0) {
         this.N++;
         if (this.N > class08161.i) {
            this.L = true;
            return true;
         }
      }

      return false;
   }

   public class08177() {
      super();
   }

   public boolean y() {
      if (this.u > 0) {
         this.u--;
         if (this.u == 0) {
            return true;
         }
      }

      return false;
   }

   public boolean N() {
      return this.u < 0;
   }

   public void N(int var1) {
      this.u = var1;
   }
}
