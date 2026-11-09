package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00903 implements Predicate<class06646> {
   private static final Logger N = LogUtils.getLogger();
   private final class00500 y;
   private final Set<class08092<?>> L;
   @Nullable
   private final class07001 u;

   public class00903(class00500 var1, Set<class08092<?>> var2, @Nullable class07001 var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public Set<class08092<?>> y() {
      return this.L;
   }

   private class00500 N(class00500 var1) {
      if (var1 == this.y) {
         return var1;
      } else {
         for (class08092<?> class08092 : this.L) {
            var1 = N(var1, this.y, class08092);
         }

         return var1;
      }
   }

   public class00500 N() {
      return this.y;
   }

   public boolean test(class06646 var1) {
      class00500 class00500 = var1.N();
      if (!class00500.N(this.y.i())) {
         return false;
      } else {
         for (class08092<?> class08092 : this.L) {
            if (class00500.L(class08092) != this.y.L(class08092)) {
               return false;
            }
         }

         if (this.u == null) {
            return true;
         } else {
            class00394 class00394 = var1.y();
            return class00394 != null && class07717.N(this.u, class00394.y_2(var1.L().method_30349()), true);
         }
      }
   }

   public boolean N(class04782 var1, class07209 var2) {
      return this.test(new class06646(var1, var2, false));
   }

   public boolean N(class04782 var1, class07209 var2, int var3) {
      class00500 class00500 = (var3 & 16) != 0 ? this.y : class00891.a_(this.y, var1, var2);
      if (class00500.P()) {
         class00500 = this.y;
      }

      class00500 = this.N(class00500);
      boolean flag = false;
      if (var1.method_8652(var2, class00500, var3)) {
         flag = true;
      }

      if (this.u != null) {
         class00394 class00394 = var1.method_8321(var2);
         if (class00394 != null) {
            try (class04495 class04495 = new class04495(N)) {
               class01042 class01042 = var1.method_30349();
               class04490 class04490 = class04495.N_46(class00394.J());
               class08303 class08303x = class08303.N(class04490.N_46(() -> "(before)"), class01042);
               class00394.i(class08303x);
               class07001 class07001 = class08303x.y();
               class00394.y_1(class08308.N(class04495, class01042, this.u));
               class08303 class08303x = class08303.N(class04490.N_46(() -> "(after)"), class01042);
               class00394.i(class08303x);
               if (!class08303x.y().equals(class07001)) {
                  flag = true;
                  class00394.method_5431();
                  var1.method_14178().N(var2);
               }
            }
         }
      }

      return flag;
   }

   private static <T extends Comparable<T>> class00500 N(class00500 var0, class00500 var1, class08092<T> var2) {
      return var0.L(var2, var1.L(var2));
   }
}
