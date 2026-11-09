package minecraft;

import Nursultan.class10532;
import Nursultan.class10533;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class class08240 extends class08224<class10533> {
   public class10533 y(Runnable var1) {
      return new class10533(0, var1);
   }

   public class08240(int var1, Executor var2, String var3) {
      super(new class10532(var1), var2, var3);
      class02672.N.N(this);
   }

   public <Source> CompletableFuture<Source> N(int var1, Consumer<CompletableFuture<Source>> var2) {
      CompletableFuture completablefuture = new CompletableFuture();
      this.N(new class10533(var1, () -> var2.accept(completablefuture)));
      return completablefuture;
   }
}
