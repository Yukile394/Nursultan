package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05559 {
   private static final Logger N = LogUtils.getLogger();
   private final String y;
   private final Semaphore L = new Semaphore(1);
   private final Lock u = new ReentrantLock();
   @Nullable
   private volatile Thread i;
   @Nullable
   private volatile class07878 R;

   public class05559(String var1) {
      super();
      this.y = var1;
   }

   public void y() {
      try {
         this.u.lock();
         Thread thread = this.i;
         if (thread != null) {
            class07878 class07878 = N(this.y, thread);
            this.R = class07878;
            this.L.release();
            throw class07878;
         }

         this.L.release();
      } finally {
         this.u.unlock();
      }
   }

   public static class07878 N(String var0, @Nullable Thread var1) {
      String s = Stream.of(Thread.currentThread(), var1).filter(Objects::nonNull).map(class05559::N).collect(Collectors.joining("\n"));
      String s1 = "Accessing " + var0 + " from multiple threads";
      class07080 class07080 = new class07080(s1, new IllegalStateException(s1));
      class07080.N("Thread dumps").N("Thread dumps", s);
      N.error("Thread dumps: \n{}", s);
      return new class07878(class07080);
   }

   private static String N(Thread var0) {
      return var0.getName() + ": \n\tat " + Arrays.stream(var0.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat "));
   }

   public void N() {
      boolean flag = false;

      try {
         this.u.lock();
         if (!this.L.tryAcquire()) {
            this.i = Thread.currentThread();
            flag = true;
            this.u.unlock();

            try {
               this.L.acquire();
            } catch (InterruptedException interruptedexception) {
               Thread.currentThread().interrupt();
            }

            throw this.R;
         }
      } finally {
         if (!flag) {
            this.u.unlock();
         }
      }
   }
}
