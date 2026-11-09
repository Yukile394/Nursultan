package minecraft;

import java.util.stream.Stream;

public abstract class class04050 extends class04297 {
   public class04050() {
      super();
   }

   protected abstract boolean y(class01034 var1, class06069 var2, class07209 var3);

   @Override
   public final Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      return this.y(var1, var2, var3) ? Stream.of(var3) : Stream.of();
   }
}
