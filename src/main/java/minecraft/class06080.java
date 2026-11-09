package minecraft;

import java.util.Optional;
import java.util.function.Function;

public class class06080 extends class06057 {
   private final class01042 N;
   private final class01837 y;
   private final class04084 L;
   private final class03028 u;

   public class06080(class04865 var1, class01042 var2, class05474 var3, class01837 var4, class04084 var5, class03028 var6) {
      super(var1, var3);
      this.N = var2;
      this.y = var4;
      this.L = var5;
      this.u = var6;
   }

   public class04084 y() {
      return this.L;
   }

   @Deprecated
   public Optional<class00500> N(Function<class07209, class03556<class00780>> var1, class08050 var2, class07209 var3, boolean var4) {
      return this.L.L().N(this.u, this, var1, var2, this.y, var3, var4);
   }

   @Deprecated
   public class01042 N() {
      return this.N;
   }
}
