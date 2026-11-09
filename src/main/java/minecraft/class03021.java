package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.List;
import org.jspecify.annotations.Nullable;

public final class class03021 {
   private static final long N = 4L;
   private final List<? extends Dynamic<?>> y;
   private final long[] L;
   private final int u;
   private final long i;
   private final int R;

   public class03021(List<? extends Dynamic<?>> var1, long[] var2) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = Math.max(4, class03316.N(var1.size()));
      this.i = (1L << this.u) - 1L;
      this.R = (char)(64 / this.u);
   }

   public long[] y() {
      return this.L;
   }

   private int y(int var1, int var2, int var3) {
      return (var2 << 4 | var3) << 4 | var1;
   }

   public List<? extends Dynamic<?>> N() {
      return this.y;
   }

   @Nullable
   public Dynamic<?> N(int var1, int var2, int var3) {
      int ix = this.y.size();
      if (ix < 1) {
         return null;
      } else if (ix == 1) {
         return (Dynamic<?>)this.y.getFirst();
      } else {
         int j = this.y(var1, var2, var3);
         int k = j / this.R;
         if (k >= 0 && k < this.L.length) {
            long l = this.L[k];
            int i1 = (j - k * this.R) * this.u;
            int j1 = (int)(l >> i1 & this.i);
            return (Dynamic<?>)(j1 >= 0 && j1 < ix ? this.y.get(j1) : null);
         } else {
            return null;
         }
      }
   }
}
