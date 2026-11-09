package minecraft;

import java.util.concurrent.locks.LockSupport;

public class class06292 extends class06709<Runnable> {
   private Thread N = this.L();
   private volatile boolean L;

   @Override
   protected boolean L(Runnable var1) {
      return !this.L;
   }

   private Thread L() {
      Thread thread = new Thread(this::R);
      thread.setDaemon(true);
      thread.setName("Sound engine");
      thread.setUncaughtExceptionHandler((var0, var1x) -> class06202.Nq().u(class07080.N(var1x, "Uncaught exception on thread: " + var0.getName())));
      thread.start();
      return thread;
   }

   public class06292() {
      super("Sound executor");
   }

   @Override
   protected void o() {
      LockSupport.park("waiting for tasks");
   }

   @Override
   protected Thread k() {
      return this.N;
   }

   public void y() {
      this.L = false;
      this.N = this.L();
   }

   @Override
   public Runnable y(Runnable var1) {
      return var1;
   }

   public void N() {
      this.L = true;
      this.O();
      this.N.interrupt();

      try {
         this.N.join();
      } catch (InterruptedException interruptedexception) {
         Thread.currentThread().interrupt();
      }
   }

   @Override
   public void N(Runnable var1) {
      if (!this.L) {
         super.N(var1);
      }
   }

   private void R() {
      while (!this.L) {
         this.y(() -> this.L);
      }
   }
}
