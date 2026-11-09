package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

record class04870(class04841 id, class02263 filter, Either<CompletableFuture<Optional<class06262>>, class01894> result) {

   public Either<CompletableFuture<Optional<class06262>>, class01894> L() {
      return this.result;
   }

   class04870(class04841 id, class02263 filter, Either<CompletableFuture<Optional<class06262>>, class01894> result) {
      this.id = id;
      this.filter = filter;
      this.result = result;
   }

   public class02263 y() {
      return this.filter;
   }

   public class04841 N() {
      return this.id;
   }

   private class06251 N(class06251 var1) {
      return new class06251(var1.N(), this.filter.N(var1.y()));
   }

   public Optional<List<class06251>> N(Function<class01894, List<class06251>> var1) {
      return (Optional<List<class06251>>)this.result
         .map(
            var1x -> ((Optional)var1x.join()).map(var1xx -> List.of(new class06251(var1xx, this.filter))),
            var2 -> {
               List list = (List)var1.apply(var2);
               if (list == null) {
                  class04866.N
                     .warn(
                        "Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", var2, this.id
                     );
                  return Optional.empty();
               } else {
                  return Optional.of(list.stream().map(this::N).toList());
               }
            }
         );
   }
}
