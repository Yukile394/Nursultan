package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06646 {
   private final class05487 N;
   private final class07209 y;
   private final boolean L;
   @Nullable
   private class00500 u;
   @Nullable
   private class00394 i;
   private boolean R;

   public class05487 L() {
      return this.N;
   }

   public class06646(class05487 var1, class07209 var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2.method_10062();
      this.L = var3;
   }

   public class07209 u() {
      return this.y;
   }

   @Nullable
   public class00394 y() {
      if (this.i == null && !this.R) {
         this.i = this.N.method_8321(this.y);
         this.R = true;
      }

      return this.i;
   }

   public class00500 N() {
      if (this.u == null && (this.L || this.N.E(this.y))) {
         this.u = this.N.method_8320(this.y);
      }

      return this.u;
   }

   public static Predicate<class06646> N(Predicate<class00500> var0) {
      return var1 -> var1 != null && var0.test(var1.N());
   }
}
