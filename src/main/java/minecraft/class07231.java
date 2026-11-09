package minecraft;

class class07231 implements class05845 {
   class07231(class07242 var1) {
      super();
      this.N = var1;
   }

   @Override
   public int N() {
      return 4;
   }

   @Override
   public void N(int var1, int var2) {
      switch (var1) {
         case 0:
            this.N.T = var2;
            break;
         case 1:
            this.N.b = var2;
            break;
         case 2:
            this.N.j = var2;
            break;
         case 3:
            this.N.v = var2;
      }
   }

   @Override
   public int N(int var1) {
      switch (var1) {
         case 0:
            return this.N.T;
         case 1:
            return this.N.b;
         case 2:
            return this.N.j;
         case 3:
            return this.N.v;
         default:
            return 0;
      }
   }
}
