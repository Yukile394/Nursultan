package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.CheckReturnValue;
import org.slf4j.Logger;

public abstract class class06709<R extends Runnable> implements class02510, class08199<R>, Executor {
   public static final long y = 100000L;
   private final String N;
   private static final Logger L = LogUtils.getLogger();
   private final Queue<R> u = Queues.newConcurrentLinkedQueue();
   private int i;

   protected abstract boolean L(R var1);

   protected void M_1(R var1) {
      try {
         Zone zone = TracyClient.beginZone("Task", class07529.ND);

         try {
            var1.run();
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
      } catch (Exception exception) {
         L.error(LogUtils.FATAL_MARKER, "Error executing task on {}", this.as_(), exception);
         if (N(exception)) {
            throw exception;
         }
      }
   }

   protected class06709(String var1) {
      super();
      this.N = var1;
      class02672.N.N(this);
   }

   private CompletableFuture<Void> B(Runnable var1) {
      return CompletableFuture.supplyAsync(() -> {
         var1.run();
         return null;
      }, this);
   }

   protected boolean I() {
      return this.i > 0;
   }

   public boolean J() {
      Runnable runnable = this.u.peek();
      if (runnable == null) {
         return false;
      } else if (!this.I() && !this.L((R)runnable)) {
         return false;
      } else {
         this.M_1(this.u.remove());
         return true;
      }
   }

   public void i(Runnable var1) {
      if (!this.E_()) {
         this.B(var1).join();
      } else {
         var1.run();
      }
   }

   protected void o() {
      Thread.yield();
      LockSupport.parkNanos("waiting for tasks", 100000L);
   }

   protected abstract Thread k();

   @Override
   public void execute(Runnable var1) {
      Runnable runnable = this.y(var1);
      if (this.Y()) {
         this.N((R)runnable);
      } else {
         this.M_1((R)runnable);
      }
   }

   protected void g() {
      while (this.J()) {
      }
   }

   @CheckReturnValue
   public CompletableFuture<Void> u(Runnable var1) {
      if (this.Y()) {
         return this.B(var1);
      } else {
         var1.run();
         return CompletableFuture.completedFuture(null);
      }
   }

   public void y(BooleanSupplier var1) {
      this.i++;

      try {
         while (!var1.getAsBoolean()) {
            if (!this.J()) {
               this.o();
            }
         }
      } finally {
         this.i--;
      }
   }

   public static boolean N(Throwable var0) {
      return var0 instanceof class07878 ? N(((class07878)var0).getCause()) : var0 instanceof OutOfMemoryError || var0 instanceof StackOverflowError;
   }

   @Override
   public void N(R var1) {
      this.u.add((R)var1);
      LockSupport.unpark(this.k());
   }

   public <V> CompletableFuture<V> N(Supplier<V> var1) {
      return this.Y() ? CompletableFuture.supplyAsync(var1, this) : CompletableFuture.completedFuture((V)var1.get());
   }

   public void R(Runnable var1) {
      this.execute(var1);
   }

   protected void O() {
      this.u.clear();
   }

   protected boolean Y() {
      return !this.E_();
   }

   public boolean E_() {
      return Thread.currentThread() == this.k();
   }

   public int F_() {
      return this.u.size();
   }

   @Override
   public String as_() {
      return this.N;
   }

   @Override
   public List<class04530> at_() {
      return ImmutableList.of(class04530.N(this.N + "-pending-tasks", class02253.field_29551, this::F_));
   }
}
