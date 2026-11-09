package minecraft;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class class06323 {
   private final Set<class06311> L = Sets.newIdentityHashSet();
   final class06313 N;
   final Executor y;

   public class06323(class06313 var1, Executor var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void y() {
      this.L.forEach(class06311::y);
      this.L.clear();
   }

   public CompletableFuture<class06311> N(class06319 var1) {
      CompletableFuture completablefuture = new CompletableFuture();
      this.y.execute(() -> {
         class06297 class06297 = this.N.N(var1);
         if (class06297 != null) {
            class06311 class06311 = new class06311(this, class06297);
            this.L.add(class06311);
            completablefuture.complete(class06311);
         } else {
            completablefuture.complete(null);
         }
      });
      return completablefuture;
   }

   public void N(Consumer<Stream<class06297>> var1) {
      this.y.execute(() -> var1.accept(this.L.stream().map(var0 -> var0.N).filter(Objects::nonNull)));
   }

   public void N() {
      this.y.execute(() -> {
         Iterator<class06311> iterator = this.L.iterator();

         while (iterator.hasNext()) {
            class06311 class06311 = iterator.next();
            class06311.N.z();
            if (class06311.N.B()) {
               class06311.y();
               iterator.remove();
            }
         }
      });
   }
}
