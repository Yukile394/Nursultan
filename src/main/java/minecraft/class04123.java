package minecraft;

import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public record class04123(Map<String, class08880> models) {
   public static final Codec<class04123> N = class06338.u(Codec.unboundedMap(Codec.STRING, class08880.L)).xmap(class04123::new, class04123::N);

   public class04123(Map<String, class08880> models) {
      this.models = models;
   }

   public Map<String, class08880> N() {
      return this.models;
   }

   public void N(class00507<class00891, class00500> var1, Supplier<String> var2, BiConsumer<class00500, class08889> var3) {
      this.models.forEach((var3x, var4) -> {
         try {
            Predicate predicate = class02449.N(var1, var3x);
            class08889 class08889 = var4.N();
            UnmodifiableIterator unmodifiableiterator = var1.N().iterator();

            while (unmodifiableiterator.hasNext()) {
               class00500 class00500 = (class00500)unmodifiableiterator.next();
               if (predicate.test(class00500)) {
                  var3.accept(class00500, class08889);
               }
            }
         } catch (Exception exception) {
            class04127.N.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{var2.get(), var3x, exception.getMessage()});
         }
      });
   }
}
