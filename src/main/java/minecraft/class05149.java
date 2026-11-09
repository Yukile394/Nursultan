package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class05149 implements Runnable {
   private static final Logger u = LogUtils.getLogger();
   private static final AtomicInteger i = new AtomicInteger(0);
   private static final int R = 5;
   protected volatile boolean N;
   protected final String y;
   @Nullable
   protected Thread L;

   public boolean L() {
      return this.N;
   }

   protected class05149(String var1) {
      super();
      this.y = var1;
   }

   public synchronized void y() {
      this.N = false;
      if (null != this.L) {
         int ix = 0;

         while (this.L.isAlive()) {
            try {
               this.L.join(1000L);
               if (++ix >= 5) {
                  u.warn("Waited {} seconds attempting force stop!", ix);
               } else if (this.L.isAlive()) {
                  u.warn("Thread {} ({}) failed to exit after {} second(s)", new Object[]{this, this.L.getState(), ix, new Exception("Stack:")});
                  this.L.interrupt();
               }
            } catch (InterruptedException interruptedexception) {
            }
         }

         u.info("Thread {} stopped", this.y);
         this.L = null;
      }
   }

   public synchronized boolean N() {
      if (this.N) {
         return true;
      } else {
         this.N = true;
         this.L = new Thread(this, this.y + " #" + i.incrementAndGet());
         this.L.setUncaughtExceptionHandler(new class07640(u));
         this.L.start();
         u.info("Thread {} started", this.y);
         return true;
      }
   }
}
