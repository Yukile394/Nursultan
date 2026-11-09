package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06603 extends class06622 implements class06618 {
   private static final Logger R = LogUtils.getLogger();
   public static final class01631 i = class00189.N(class06622.L.y());
   private final class06602 M = new class06602();
   @Nullable
   private CompletableFuture<Optional<class01631>> B;
   private class01631 Z = i;
   private final class07949 W;

   private void L() {
      if (this.B != null) {
         CompletableFuture completablefuture = this.B;
         this.B = null;
         completablefuture.cancel(false);
      }

      this.B = this.W.L(this.N()).thenApply(var0 -> var0.map(class07923::y));
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (var1.equals(N)) {
         this.L();
      }
   }

   @Override
   public void method_5773() {
      super.method_5773();
      this.M.N(this.method_73189(), this.method_18798());
      if (this.B != null && this.B.isDone()) {
         try {
            this.B.get().ifPresent(this::N);
            this.B = null;
         } catch (Exception exception) {
            R.error("Error when trying to look up skin", exception);
         }
      }
   }

   public class06603(class07299 var1, class07949 var2) {
      super(var1);
      this.W = var2;
   }

   @Override
   public class06602 B() {
      return this.M;
   }

   @Override
   public class01631 Z() {
      return this.Z;
   }

   @Override
   public boolean U() {
      return false;
   }

   @Nullable
   @Override
   public class00392 z() {
      return this.y();
   }

   @Nullable
   @Override
   public class07648 y(boolean var1) {
      return null;
   }

   public static void N(class07949 var0) {
      class06622.u = (var1, var2) -> (class06622)(var2 instanceof class03448 ? new class06603(var2, var0) : new class06622(var1, var2));
   }

   private void N(class01631 var1) {
      this.Z = var1;
   }
}
