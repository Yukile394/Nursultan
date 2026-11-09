package minecraft;

class class00385 implements class05845 {
   class00385(class00419 var1) {
      super();
      this.N = var1;
   }

   @Override
   public int N() {
      return 3;
   }

   @Override
   public void N(int var1, int var2) {
      switch (var1) {
         case 0:
            this.N.M = var2;
            break;
         case 1:
            if (!this.N.z.method_8608() && !this.N.R.isEmpty()) {
               class00419.N(this.N.z, this.N.U, class04909.yr);
            }

            this.N.B = class00419.N(class07501.N(var2));
            break;
         case 2:
            this.N.Z = class00419.N(class07501.N(var2));
      }
   }

   @Override
   public int N(int var1) {
      return switch (var1) {
         case 0 -> this.N.M;
         case 1 -> class07501.N(this.N.B);
         case 2 -> class07501.N(this.N.Z);
         default -> 0;
      };
   }
}
