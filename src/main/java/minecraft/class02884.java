package minecraft;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;

public record class02884(Set<class00455<?>> subscriptions) implements class00381<class08051> {
   private static final class02362<class04247, Set<class00455<?>>> L = class02389.N(class04227.v).N_33(class02389.N(ReferenceOpenHashSet::new));
   public static final class02362<class04247, class02884> N = L.N_10(class02884::new, class02884::N);

   public class02884(Set<class00455<?>> subscriptions) {
      super();
      this.subscriptions = (Set<class00455<?>>)subscriptions;
   }

   public void method_65081(class08051 var1) {
      var1.method_56619(this);
   }

   public Set<class00455<?>> N() {
      return this.subscriptions;
   }

   @Override
   public class02897<class02884> method_65080() {
      return class04248.yK;
   }
}
