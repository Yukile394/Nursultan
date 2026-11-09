package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class class04792 {
   private final class04839 N;

   public class04792() {
      this(new class04839(ImmutableList.of(), class04838.N));
   }

   private class04792(class04839 var1) {
      super();
      this.N = var1;
   }

   public class04792 N_50(UnaryOperator<class04838> var1) {
      return new class04792(this.N.N(var1));
   }

   public class04792 N(class02415 var1) {
      return var1.apply(this);
   }

   public class04839 N() {
      return this.N;
   }
}
