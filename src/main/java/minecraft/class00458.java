package minecraft;

import Nursultan.class09365;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import org.slf4j.Logger;

public class class00458 implements AutoCloseable {
   public static final Logger N = LogUtils.getLogger();
   private final Queue<class09365<?>> y = Queues.newConcurrentLinkedQueue();
   private final Thread L;
   private boolean u;

   public class00458(Thread var1) {
      super();
      this.L = var1;
   }

   @Override
   public void close() {
      this.u = true;
   }

   public void y() {
      if (!this.u) {
         while (!this.y.isEmpty()) {
            this.y.poll().N();
         }
      }
   }

   public boolean N() {
      return Thread.currentThread() == this.L;
   }

   public <T extends class00638> void N(T var1, class00381<T> var2) {
      if (this.u) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         this.y.add(new class09365<>(var1, var2));
      }
   }
}
