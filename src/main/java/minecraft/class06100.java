package minecraft;

class class06100 implements class05845 {
   class06100(class06119 var1) {
      super();
      this.N = var1;
   }

   @Override
   public int N() {
      return 1;
   }

   @Override
   public void N(int var1, int var2) {
      if (var1 == 0) {
         this.N.N(var2);
      }
   }

   @Override
   public int N(int var1) {
      return var1 == 0 ? this.N.R : 0;
   }
}
