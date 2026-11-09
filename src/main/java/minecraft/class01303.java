package minecraft;

public abstract class class01303<R extends Runnable> extends class06709<R> {
   private int N;

   @Override
   public void M_1(R var1) {
      this.N++;

      try {
         super.M_1((R)var1);
      } finally {
         this.N--;
      }
   }

   public class01303(String var1) {
      super(var1);
   }

   protected boolean yl() {
      return this.N != 0;
   }

   @Override
   public boolean Y() {
      return this.yl() || super.Y();
   }
}
