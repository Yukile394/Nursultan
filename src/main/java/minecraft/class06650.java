package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06650 implements Predicate<class00500> {
   private final class00891 N;

   public class06650(class00891 var1) {
      super();
      this.N = var1;
   }

   public static class06650 N(class00891 var0) {
      return new class06650(var0);
   }

   public boolean test(@Nullable class00500 var1) {
      return var1 != null && var1.N(this.N);
   }
}
