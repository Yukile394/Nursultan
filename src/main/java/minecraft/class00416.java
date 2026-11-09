package minecraft;

class class00416 implements class05845 {
   class00416(class00415 var1) {
      super();
      this.N = var1;
   }

   @Override
   public int N() {
      return 2;
   }

   @Override
   public void N(int var1, int var2) {
      switch (var1) {
         case 0:
            this.N.R = var2;
            break;
         case 1:
            this.N.M = var2;
      }
   }

   @Override
   public int N(int var1) {
      return switch (var1) {
         case 0 -> this.N.R;
         case 1 -> this.N.M;
         default -> 0;
      };
   }
}
