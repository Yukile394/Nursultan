package minecraft;

import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public record class08717(ExecutorService service) implements Executor {
   public class08717(ExecutorService service) {
      super();
      this.service = service;
   }

   @Override
   public void execute(Runnable var1) {
      this.service.execute(N(var1));
   }

   public Executor N(String var1) {
      if (class07529.ND) {
         return var2 -> this.service.execute(() -> {
            Thread thread = Thread.currentThread();
            String s = thread.getName();
            thread.setName(var1);

            try {
               Zone zone = TracyClient.beginZone(var1, class07529.ND);

               try {
                  var2.run();
               } catch (Throwable throwable1) {
                  if (zone != null) {
                     try {
                        zone.close();
                     } catch (Throwable throwable) {
                        throwable1.addSuppressed(throwable);
                     }
                  }

                  throw throwable1;
               }

               if (zone != null) {
                  zone.close();
               }
            } finally {
               thread.setName(s);
            }
         });
      } else {
         return (Executor)(TracyClient.isAvailable() ? var2 -> this.service.execute(() -> {
            Zone zone = TracyClient.beginZone(var1, class07529.ND);

            try {
               var2.run();
            } catch (Throwable throwable1) {
               if (zone != null) {
                  try {
                     zone.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (zone != null) {
               zone.close();
            }
         }) : this.service);
      }
   }

   public void N(long var1, TimeUnit var3) {
      this.service.shutdown();

      boolean flag;
      try {
         flag = this.service.awaitTermination(var1, var3);
      } catch (InterruptedException interruptedexception) {
         flag = false;
      }

      if (!flag) {
         this.service.shutdownNow();
      }
   }

   public ExecutorService N() {
      return this.service;
   }

   private static Runnable N(Runnable var0) {
      return !TracyClient.isAvailable() ? var0 : () -> {
         Zone zone = TracyClient.beginZone("task", class07529.ND);

         try {
            var0.run();
         } catch (Throwable throwable1) {
            if (zone != null) {
               try {
                  zone.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (zone != null) {
            zone.close();
         }
      };
   }
}
