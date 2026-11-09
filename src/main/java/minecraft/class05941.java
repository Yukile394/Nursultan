package minecraft;

import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

public class class05941<T> extends AbstractIterator<T> {
   private final class00734 N;
   private final class06092 y;
   private final class06153 L;
   private final class07218 u;
   private final class00494 i;
   private final class07322 R;
   private final boolean M;
   @Nullable
   private class07290 B;
   private long Z;
   private final BiFunction<class07218, class00494, T> z;

   public class05941(class07322 var1, @Nullable class07049 var2, class00734 var3, boolean var4, BiFunction<class07218, class00494, T> var5) {
      this(var1, var2 == null ? class06092.N() : class06092.N(var2), var3, var4, var5);
   }

   public class05941(class07322 var1, class06092 var2, class00734 var3, boolean var4, BiFunction<class07218, class00494, T> var5) {
      super();
      this.y = var2;
      this.u = new class07218();
      this.i = class00389.N(var3);
      this.R = var1;
      this.N = var3;
      this.M = var4;
      this.z = var5;
      int ix = class04995.N(var3.N - 1.0E-7) - 1;
      int j = class04995.N(var3.u + 1.0E-7) + 1;
      int k = class04995.N(var3.y - 1.0E-7) - 1;
      int l = class04995.N(var3.i + 1.0E-7) + 1;
      int i1 = class04995.N(var3.L - 1.0E-7) - 1;
      int j1 = class04995.N(var3.R + 1.0E-7) + 1;
      this.L = new class06153(ix, k, i1, j, l, j1);
   }

   @Nullable
   private class07290 N(int var1, int var2) {
      int ix = class01296.N(var1);
      int j = class01296.N(var2);
      long k = class07321.u(ix, j);
      if (this.B != null && this.Z == k) {
         return this.B;
      } else {
         class07290 class07290 = this.R.method_22338(ix, j);
         this.B = class07290;
         this.Z = k;
         return class07290;
      }
   }

   protected T computeNext() {
      while (this.L.N()) {
         int ix = this.L.y();
         int j = this.L.L();
         int k = this.L.u();
         int l = this.L.i();
         if (l != 3) {
            class07290 class07290 = this.N(ix, k);
            if (class07290 != null) {
               this.u.N(ix, j, k);
               class00500 class00500 = class07290.method_8320(this.u);
               if ((!this.M || class00500.z(class07290, this.u)) && (l != 1 || class00500.E()) && (l != 2 || class00500.N(class00869.LN))) {
                  class00494 class00494x = this.y.N(class00500, this.R, this.u);
                  if (class00494x == class00389.y()) {
                     if (this.N.N(ix, j, k, ix + 1.0, j + 1.0, k + 1.0)) {
                        return this.z.apply(this.u, class00494x.method_66507(this.u));
                     }
                  } else {
                     class00494 class00494x = class00494x.method_66507(this.u);
                     if (!class00494x.method_1110() && class00389.L(class00494x, this.i, class07003.Z)) {
                        return this.z.apply(this.u, class00494x);
                     }
                  }
               }
            }
         }
      }

      return (T)this.endOfData();
   }
}
