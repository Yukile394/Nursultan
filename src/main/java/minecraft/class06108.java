package minecraft;

class class06108 implements class06695 {
   class06108(class06119 var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return class06695.N(this.N, var1) && this.N.L();
   }

   @Override
   public void method_5448() {
   }

   @Override
   public boolean method_5437(int var1, class06584 var2) {
      return false;
   }

   @Override
   public int method_5444() {
      return 1;
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
   }

   @Override
   public void method_5431() {
      this.N.method_5431();
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      if (var1 == 0) {
         class06584 class06584 = this.N.i.N(var2);
         if (this.N.i.R()) {
            this.N.u();
         }

         return class06584;
      } else {
         return class06584.E;
      }
   }

   @Override
   public class06584 method_5441(int var1) {
      if (var1 == 0) {
         class06584 class06584 = this.N.i;
         this.N.i = class06584.E;
         this.N.u();
         return class06584;
      } else {
         return class06584.E;
      }
   }

   @Override
   public boolean method_5442() {
      return this.N.i.R();
   }

   @Override
   public class06584 method_5438(int var1) {
      return var1 == 0 ? this.N.i : class06584.E;
   }

   @Override
   public int method_5439() {
      return 1;
   }
}
