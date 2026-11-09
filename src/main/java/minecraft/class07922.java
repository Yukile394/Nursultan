package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

class class07922 extends CacheLoader<class02689, CompletableFuture<Optional<class07923>>> {
   class07922(class07949 var1) {
      super();
      this.N = var1;
   }

   public CompletableFuture<Optional<class07923>> load(class02689 var1) {
      return var1.N(this.N.i).thenCompose(var2 -> this.N.u.N(var2).thenApply(var3 -> var3.map(var3x -> new class07923(this.N, var2, var3x, var1.L()))));
   }
}
