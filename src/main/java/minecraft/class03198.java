package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

final class class03198<T> extends class03235<T> {
   final class03235<T>[] N;

   protected class03198(List<? extends class03235<T>> var1) {
      this(class03197.y(var1), var1);
   }

   protected class03198(List<class03195> var1, List<? extends class03235<T>> var2) {
      super(var1);
      this.N = var2.toArray(new class03235[0]);
   }

   @Override
   protected class03211<T> N(long[] var1, @Nullable class03211<T> var2, class03200<T> var3) {
      long i = var2 == null ? Long.MAX_VALUE : var3.distance(var2, var1);
      class03211 class03211x = var2;

      for (class03235 class03235 : this.N) {
         long j = var3.distance(class03235, var1);
         if (i > j) {
            class03211 class03211x = class03235.N(var1, class03211x, var3);
            long k = class03235 == class03211x ? j : var3.distance(class03211x, var1);
            if (i > k) {
               i = k;
               class03211x = class03211x;
            }
         }
      }

      return class03211x;
   }
}
