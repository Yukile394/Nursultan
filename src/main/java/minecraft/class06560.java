package minecraft;

import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class class06560 extends class06581 {
   public class06560(class06573 var1) {
      super(var1);
   }

   private static <T extends Comparable<T>> class00500 N(class00500 var0, class08092<T> var1, boolean var2) {
      return var0.y(var1, N(var1.N(), var0.L(var1), var2));
   }

   private static <T> T N(Iterable<T> var0, @Nullable T var1, boolean var2) {
      return var2 ? class07536.y(var0, (T)var1) : class07536.N(var0, (T)var1);
   }

   private static void N(class08036 var0, class00392 var1) {
      ((class04770)var0).method_43502(var1, true);
   }

   private static <T extends Comparable<T>> String N(class00500 var0, class08092<T> var1) {
      return var1.y(var0.L(var1));
   }

   private boolean N(class08036 var1, class00500 var2, class07284 var3, class07209 var4, boolean var5, class06584 var6) {
      if (!var1.method_7338()) {
         return false;
      } else {
         class03556<class00891> class03556 = var2.R();
         Collection<class08092<?>> collection = class03556.N().E().u();
         if (collection.isEmpty()) {
            N(var1, class00392.N(this.W + ".empty", class03556.M()));
            return false;
         } else {
            class02847 class02847 = var6.method_58694(class02484.Ni);
            if (class02847 == null) {
               return false;
            } else {
               class08092<?> class08092 = class02847.N().get(class03556);
               if (var5) {
                  if (class08092 == null) {
                     class08092 = collection.iterator().next();
                  }

                  class00500 class00500 = N(var2, class08092, var1.method_21823());
                  var3.method_8652(var4, class00500, 18);
                  N(var1, class00392.N(this.W + ".update", class08092.R(), N(class00500, class08092)));
               } else {
                  class08092 = N(collection, class08092, var1.method_21823());
                  var6.N(class02484.Ni, class02847.N(class03556, class08092));
                  N(var1, class00392.N(this.W + ".select", class08092.R(), N(var2, class08092)));
               }

               return true;
            }
         }
      }
   }

   @Override
   public class07082 N(class06501 var1) {
      class08036 class08036 = var1.method_8036();
      class07299 class07299 = var1.method_8045();
      if (!class07299.method_8608() && class08036 != null) {
         class07209 class07209 = var1.method_8037();
         if (!this.N(class08036, class07299.method_8320(class07209), class07299, class07209, true, var1.method_8041())) {
            return class07082.u;
         }
      }

      return class07082.N;
   }

   @Override
   public boolean N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class07438 var5) {
      if (!var3.method_8608() && var5 instanceof class08036 class08036) {
         this.N(class08036, var2, var3, var4, false, var1);
      }

      return false;
   }
}
