package minecraft;

class class05680 extends Thread {
   class05680(class05685 var1, String var2, class04981 var3) {
      super(var2);
      this.y = var1;
      this.N = var3;
   }

   @Override
   public void run() {
      try {
         class05111 class05111 = class05111.N();
         class05111.L(this.N.y);
         class05685.N(this.y).execute(class05685::u);
      } catch (class05097 class05097) {
         class05685.B.error("Couldn't configure world", class05097);
         class05685.y(this.y).execute(() -> class05685.L(this.y).N(new class04702(class05097, this.y)));
      }
   }
}
