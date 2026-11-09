package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public interface class07396 {
   @Nullable
   class04770 L(String var1);

   Optional<class08774> L(UUID var1);

   Optional<class08774> y(UUID var1);

   List<class04770> y(String var1);

   Optional<class04770> y(Optional<UUID> var1, Optional<String> var2);

   void N(class04770 var1, class07403 var2);

   List<class04770> N();

   Optional<class08774> N(String var1);

   @Nullable
   class04770 N(UUID var1);

   default CompletableFuture<Optional<class08774>> N(Optional<UUID> var1, Optional<String> var2) {
      if (var1.isPresent()) {
         Optional<class08774> optional = this.L((UUID)var1.get());
         return optional.isPresent()
            ? CompletableFuture.completedFuture(optional)
            : CompletableFuture.supplyAsync(() -> this.y((UUID)var1.get()), class07536.z());
      } else {
         return var2.isPresent()
            ? CompletableFuture.supplyAsync(() -> this.N((String)var2.get()), class07536.z())
            : CompletableFuture.completedFuture(Optional.empty());
      }
   }
}
