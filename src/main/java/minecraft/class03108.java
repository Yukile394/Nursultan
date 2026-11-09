package minecraft;

class class03108 implements class05845 {
   private final int[] N = new int[9];
   private int y = 0;

   class03108(class03145 var1) {
      super();
   }

   @Override
   public int N() {
      return 10;
   }

   @Override
   public void N(int var1, int var2) {
      if (var1 == 9) {
         this.y = var2;
      } else {
         this.N[var1] = var2;
      }
   }

   @Override
   public int N(int var1) {
      return var1 == 9 ? this.y : this.N[var1];
   }
}
