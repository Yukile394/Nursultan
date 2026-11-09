package minecraft;

import java.util.function.LongFunction;

public enum class07813 {
   field_35142(class06075::new),
   field_35143(class04042::new);

   private final LongFunction<class06069> field_35144;

   private class07813(LongFunction<class06069> var3) {
      this.field_35144 = var3;
   }

   public class06069 N(long var1) {
      return this.field_35144.apply(var1);
   }
}
