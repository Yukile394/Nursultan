package minecraft;

class class07545 implements Runnable {
   class07545(Runnable var1, String var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void run() {
      this.N.run();
   }

   @Override
   public String toString() {
      return this.y;
   }
}
