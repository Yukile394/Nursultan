package minecraft;

import java.util.concurrent.Executor;

class class00214 implements Runnable {
   private boolean L;
   private boolean u;

   class00214(class00232 var1, Executor var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      this.u = true;
      if (!this.L) {
         this.L = true;
         this.N.execute(this::N);
      }
   }

   private void N() {
      while (this.u) {
         this.u = false;
         this.y.L.R();
      }

      this.L = false;
   }
}
