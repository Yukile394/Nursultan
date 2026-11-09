package minecraft;

import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;

public class class05024 {
   private final class05022[] N;
   private final double y;
   private final double L;

   public class05024(class06069 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   private class05024(class06069 var1, IntSortedSet var2) {
      super();
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Need some octaves!");
      } else {
         int i = -var2.firstInt();
         int j = var2.lastInt();
         int k = i + j + 1;
         if (k < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
         } else {
            class05022 class05022 = new class05022(var1);
            int l = j;
            this.N = new class05022[k];
            if (j >= 0 && j < k && var2.contains(0)) {
               this.N[j] = class05022;
            }

            for (int i1 = j + 1; i1 < k; i1++) {
               if (i1 >= 0 && var2.contains(l - i1)) {
                  this.N[i1] = new class05022(var1);
               } else {
                  var1.L(262);
               }
            }

            if (j > 0) {
               long k1 = (long)(class05022.N(class05022.y, class05022.L, class05022.u) * 9.223372E18F);
               class07836 class07836 = new class07836(new class06075(k1));

               for (int j1 = l - 1; j1 >= 0; j1--) {
                  if (j1 < k && var2.contains(l - j1)) {
                     this.N[j1] = new class05022(class07836);
                  } else {
                     class07836.L(262);
                  }
               }
            }

            this.L = Math.pow(2.0, j);
            this.y = 1.0 / (Math.pow(2.0, k) - 1.0);
         }
      }
   }

   public double N(double var1, double var3, boolean var5) {
      double d0 = 0.0;
      double d1 = this.L;
      double d2 = this.y;

      for (class05022 class05022 : this.N) {
         if (class05022 != null) {
            d0 += class05022.N(var1 * d1 + (var5 ? class05022.y : 0.0), var3 * d1 + (var5 ? class05022.L : 0.0)) * d2;
         }

         d1 /= 2.0;
         d2 *= 2.0;
      }

      return d0;
   }
}
