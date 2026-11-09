package minecraft;

class class07880 implements class04803 {
   class07880(class07877 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class06584 N() {
      return this.N.v() ? new class06584(class06570.Rv) : class06584.E;
   }

   @Override
   public boolean N(class06584 var1) {
      if (var1.R()) {
         if (this.N.v()) {
            this.N.N(false);
            this.N.No();
         }

         return true;
      } else if (var1.N(class06570.Rv)) {
         if (!this.N.v()) {
            this.N.N(true);
            this.N.No();
         }

         return true;
      } else {
         return false;
      }
   }
}
