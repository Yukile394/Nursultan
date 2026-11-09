package minecraft;

public class class06114 implements Runnable {
   private final int N;
   private final Runnable y;

   public class06114(int var1, Runnable var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void run() {
      this.y.run();
   }

   public int N() {
      return this.N;
   }
}
