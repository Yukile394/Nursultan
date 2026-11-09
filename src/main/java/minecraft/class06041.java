package minecraft;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class class06041 extends class04297 {
   public class06041() {
      super();
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      return IntStream.range(0, this.N(var2, var3)).mapToObj(var1x -> var3);
   }

   protected abstract int N(class06069 var1, class07209 var2);
}
