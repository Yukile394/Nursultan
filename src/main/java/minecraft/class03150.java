package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

class class03150 {
   private final Map<class07209, class00394> N;
   @Nullable
   private final class07348<class00500> y;
   private final boolean L;
   private final class05474 u;

   class03150(class00570 var1, int var2) {
      super();
      this.u = var1;
      this.L = var1.J().method_27982();
      this.N = ImmutableMap.copyOf(var1.o());
      if (var1 instanceof class00561) {
         this.y = null;
      } else {
         class00554[] aclass00554 = var1.u();
         if (var2 >= 0 && var2 < aclass00554.length) {
            class00554 class00554 = aclass00554[var2];
            this.y = class00554.L() ? null : class00554.B().sodium$copy();
         } else {
            this.y = null;
         }
      }
   }

   public class00500 y(class07209 var1) {
      int i = var1.method_10263();
      int j = var1.method_10264();
      int k = var1.method_10260();
      if (this.L) {
         class00500 class00500 = null;
         if (j == 60) {
            class00500 = class00869.ZX.W();
         }

         if (j == 70) {
            class00500 = class07833.N(i, k);
         }

         return class00500 == null ? class00869.N.W() : class00500;
      } else if (this.y == null) {
         return class00869.N.W();
      } else {
         try {
            return this.y.N(i & 15, j & 15, k & 15);
         } catch (Throwable throwable) {
            class07080 class07080 = class07080.N(throwable, "Getting block state");
            class07080.N("Block being got").N("Location", () -> class07074.N(this.u, i, j, k));
            throw new class07878(class07080);
         }
      }
   }

   @Nullable
   public class00394 N(class07209 var1) {
      return this.N.get(var1);
   }
}
