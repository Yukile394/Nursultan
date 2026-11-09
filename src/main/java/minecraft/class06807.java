package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;

public final class class06807 implements class06763 {
   private final Function y;

   public class06807(class06776 var1, Function var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public ArgumentType y(class04348 var1) {
      return (ArgumentType)this.y.apply(var1);
   }

   @Override
   public class06799 N() {
      return this.N;
   }
}
