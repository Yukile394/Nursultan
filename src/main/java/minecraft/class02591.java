package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class class02591 implements class05477 {
   protected final GameProfile L;
   protected final Executor u;

   protected class02591(class02593 var1, GameProfile var2) {
      super();
      this.i = var1;
      this.L = var2;
      class08214 class08214 = new class08214(var1.M, "chat stream for " + var2.name());
      this.u = class08214::N;
   }

   @Override
   public CompletableFuture<List<class06068>> N(List<String> var1) {
      return class07536.u(var1.stream().map(var1x -> this.i.N(this.L, var1x, this.i.R, this.u)).collect(ImmutableList.toImmutableList()))
         .exceptionally(var0 -> ImmutableList.of());
   }

   @Override
   public CompletableFuture<class06068> N(String var1) {
      return this.i.N(this.L, var1, this.i.R, this.u);
   }
}
