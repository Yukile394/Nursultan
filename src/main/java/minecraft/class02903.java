package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class02903 implements class02950 {
   public static final class02903 N = new class02903(0, 0, List.of());
   private final int y;
   private final int L;
   private final List<class06584> u;
   private final class02741 i = new class02741();
   private final int R;

   public class02741 L() {
      return this.i;
   }

   public int M() {
      return this.L;
   }

   private class02903(int var1, int var2, List<class06584> var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      int ix = 0;

      for (class06584 class06584 : var3) {
         if (!class06584.R()) {
            ix++;
            this.i.N(class06584, 1);
         }
      }

      this.R = ix;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof class02903 class02903)
            ? false
            : this.y == class02903.y && this.L == class02903.L && this.R == class02903.R && class06584.N(this.u, class02903.u);
      }
   }

   @Override
   public int hashCode() {
      int ix = class06584.N(this.u);
      ix = 31 * ix + this.y;
      return 31 * ix + this.L;
   }

   public int i() {
      return this.R;
   }

   public List<class06584> u() {
      return this.u;
   }

   @Override
   public boolean y() {
      return this.R == 0;
   }

   public static class02919 y(int var0, int var1, List<class06584> var2) {
      if (var0 != 0 && var1 != 0) {
         int ix = var0 - 1;
         int j = 0;
         int k = var1 - 1;
         int l = 0;

         for (int i1 = 0; i1 < var1; i1++) {
            boolean flag = true;

            for (int j1 = 0; j1 < var0; j1++) {
               class06584 class06584 = (class06584)var2.get(j1 + i1 * var0);
               if (!class06584.R()) {
                  ix = Math.min(ix, j1);
                  j = Math.max(j, j1);
                  flag = false;
               }
            }

            if (!flag) {
               k = Math.min(k, i1);
               l = Math.max(l, i1);
            }
         }

         int i2 = j - ix + 1;
         int j2 = l - k + 1;
         if (i2 <= 0 || j2 <= 0) {
            return class02919.N;
         } else if (i2 == var0 && j2 == var1) {
            return new class02919(new class02903(var0, var1, var2), ix, k);
         } else {
            ArrayList arraylist = new ArrayList(i2 * j2);

            for (int k2 = 0; k2 < j2; k2++) {
               for (int k1 = 0; k1 < i2; k1++) {
                  int l1 = k1 + ix + (k2 + k) * var0;
                  arraylist.add((class06584)var2.get(l1));
               }
            }

            return new class02919(new class02903(i2, j2, arraylist), ix, k);
         }
      } else {
         return class02919.N;
      }
   }

   @Override
   public int N() {
      return this.u.size();
   }

   public class06584 N(int var1, int var2) {
      return this.u.get(var1 + var2 * this.y);
   }

   @Override
   public class06584 N(int var1) {
      return this.u.get(var1);
   }

   public static class02903 N(int var0, int var1, List<class06584> var2) {
      return y(var0, var1, var2).N();
   }

   public int R() {
      return this.y;
   }
}
