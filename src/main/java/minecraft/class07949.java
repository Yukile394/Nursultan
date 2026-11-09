package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class class07949 {
   public static final class07311 N = N(class00189.y());
   public static final Duration y = Duration.ofMinutes(5L);
   private final LoadingCache<class02689, CompletableFuture<Optional<class07923>>> R = CacheBuilder.newBuilder()
      .expireAfterAccess(y)
      .build(new class07922(this));
   private final LoadingCache<class02689, class07923> M = CacheBuilder.newBuilder().expireAfterAccess(y).build(new class07907(this));
   final class08627 L;
   final class08555 u;
   final class00909 i;

   public CompletableFuture<Optional<class07923>> L(class02689 var1) {
      return (CompletableFuture<Optional<class07923>>)this.R.getUnchecked(var1);
   }

   public class07949(class08627 var1, class08555 var2, class00909 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   public Supplier<class07923> y(class02689 var1) {
      class07923 class07923 = (class07923)this.M.getUnchecked(var1);
      CompletableFuture<Optional<class07923>> completablefuture = (CompletableFuture<Optional<class07923>>)this.R.getUnchecked(var1);
      Optional<class07923> optional = completablefuture.getNow(null);
      return optional != null ? () -> var0 : () -> completablefuture.getNow(Optional.empty()).orElse(class07923);
   }

   static class07311 N(class01631 var0) {
      return class03359.N(var0.N().y());
   }

   public class07923 N(class02689 var1) {
      class07923 class07923 = this.L(var1).getNow(Optional.empty()).orElse(null);
      return class07923 != null ? class07923 : (class07923)this.M.getUnchecked(var1);
   }
}
