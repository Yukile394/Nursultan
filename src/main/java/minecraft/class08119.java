package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

record class08119(class08626 atlas, class08126 config) implements AutoCloseable {

   class08119(class08626 atlas, class08126 config) {
      super();
      this.atlas = atlas;
      this.config = config;
   }

   @Override
   public void close() {
      this.atlas.u();
   }

   public class08126 y() {
      return this.config;
   }

   CompletableFuture<class02008> N(class01089 var1, Executor var2, int var3) {
      return class01994.N(this.atlas).N(var1, this.config.y(), this.config.L() ? var3 : 0, var2, this.config.u());
   }

   public class08626 N() {
      return this.atlas;
   }
}
