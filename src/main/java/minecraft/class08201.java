package minecraft;

import Nursultan.class10533;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08201 implements class04767, AutoCloseable {
   public static final int N = 4;
   private static final Logger L = LogUtils.getLogger();
   private final class06263 u;
   private final class08199<Runnable> i;
   private final class08240 R;
   protected boolean y;

   @Nullable
   protected class06256 L() {
      return this.u.N();
   }

   public class08201(class08199<Runnable> var1, Executor var2) {
      super();
      this.u = new class06263(var1.as_() + "_queue");
      this.i = var1;
      this.R = new class08240(4, var2, "dispatcher");
      this.y = true;
   }

   @Override
   public void close() {
      this.i.close();
   }

   protected void y() {
      this.R.N(new class10533(3, () -> {
         class06256 class06256 = this.L();
         if (class06256 == null) {
            this.y = true;
         } else {
            this.N(class06256);
         }
      }));
   }

   public void N(long var1, Runnable var3, boolean var4) {
      this.R.N(new class10533(1, () -> {
         this.u.N(var1, var4);
         this.N(var1);
         if (this.y) {
            this.y = false;
            this.y();
         }

         var3.run();
      }));
   }

   protected void N(class06256 var1) {
      CompletableFuture.allOf(var1.y().stream().map(var1x -> this.i.N_87(var1xx -> {
         var1x.run();
         var1xx.complete(class06244.field_17274);
      })).toArray(CompletableFuture[]::new)).thenAccept(var1x -> this.y());
   }

   protected void N(long var1) {
   }

   public void N(Runnable var1, long var2, IntSupplier var4) {
      this.R.N(new class10533(2, () -> {
         int ix = var4.getAsInt();
         if (class07529.H) {
            L.debug("SUB {} {} {} {}", new Object[]{new class07321(var2), ix, this.i, this.u});
         }

         this.u.N(var1, var2, ix);
         if (this.y) {
            this.y = false;
            this.y();
         }
      }));
   }

   public boolean N() {
      return this.R.L() || this.u.y();
   }

   @Override
   public void method_17209(class07321 var1, IntSupplier var2, int var3, IntConsumer var4) {
      this.R.N(new class10533(0, () -> {
         int ix = var2.getAsInt();
         if (class07529.H) {
            L.debug("RES {} {} -> {}", new Object[]{var1, ix, var3});
         }

         this.u.N(ix, var1, var3);
         var4.accept(var3);
      }));
   }
}
