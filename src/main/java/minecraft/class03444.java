package minecraft;

class class03444 {
   class03447<?> N;
   int y;
   boolean L;

   class03444() {
      super();
      this.N = class03447.N;
      this.y = -1;
   }

   public class03444 N(int var1, class03447<?> var2) {
      if (!this.N.equals(var2)) {
         this.N = var2;
         this.L = false;
      } else if (this.y + 1 != var1) {
         this.L = false;
      }

      this.y = var1;
      return this;
   }
}
