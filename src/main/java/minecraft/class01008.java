package minecraft;

import Nursultan.class09432;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class class01008 {
   public class01008() {
      super();
   }

   public static Optional<class07209> N(class07290 var0, class07209 var1, class00891 var2, class07211 var3, class00891 var4) {
      class07218 class07218 = var1.method_25503();

      class00500 class00500;
      do {
         class07218.N(var3);
         class00500 = var0.method_8320(class07218);
      } while (class00500.N(var2));

      return class00500.N(var4) ? Optional.of(class07218) : Optional.empty();
   }

   static Pair<class09432, Integer> N(int[] var0) {
      int i = 0;
      int j = 0;
      int k = 0;
      IntArrayList intarraylist = new IntArrayList();
      intarraylist.push(0);

      for (int l = 1; l <= var0.length; l++) {
         int i1 = l == var0.length ? 0 : var0[l];

         while (!intarraylist.isEmpty()) {
            int j1 = var0[intarraylist.topInt()];
            if (i1 >= j1) {
               intarraylist.push(l);
               break;
            }

            intarraylist.popInt();
            int k1 = intarraylist.isEmpty() ? 0 : intarraylist.topInt() + 1;
            if (j1 * (l - k1) > k * (j - i)) {
               j = l;
               i = k1;
               k = j1;
            }
         }

         if (intarraylist.isEmpty()) {
            intarraylist.push(l);
         }
      }

      return new Pair(new class09432(i, j - 1), k);
   }

   private static int N(Predicate<class07209> var0, class07218 var1, class07211 var2, int var3) {
      int i = 0;

      while (i < var3 && var0.test(var1.N(var2))) {
         i++;
      }

      return i;
   }

   public static class01009 N(class07209 var0, class07185 var1, int var2, class07185 var3, int var4, Predicate<class07209> var5) {
      class07218 class07218 = var0.method_25503();
      class07211 class07211x = class07211.N(class07212.field_11060, var1);
      class07211 class07211x = class07211x.b();
      class07211 class07211xx = class07211.N(class07212.field_11060, var3);
      class07211 class07211xxx = class07211xx.b();
      int i = N(var5, class07218.N(var0), class07211x, var2);
      int j = N(var5, class07218.N(var0), class07211x, var2);
      int k = i;
      class09432[] aclass09432 = new class09432[i + 1 + j];
      aclass09432[i] = new class09432(N(var5, class07218.N(var0), class07211xx, var4), N(var5, class07218.N(var0), class07211xxx, var4));
      int l = aclass09432[i].N;

      for (int i1 = 1; i1 <= i; i1++) {
         class09432 class09432xx = aclass09432[k - (i1 - 1)];
         aclass09432[k - i1] = new class09432(
            N(var5, class07218.N(var0).N(class07211x, i1), class07211xx, class09432xx.N),
            N(var5, class07218.N(var0).N(class07211x, i1), class07211xxx, class09432xx.y)
         );
      }

      for (int l2 = 1; l2 <= j; l2++) {
         class09432 class09432xxx = aclass09432[k + l2 - 1];
         aclass09432[k + l2] = new class09432(
            N(var5, class07218.N(var0).N(class07211x, l2), class07211xx, class09432xxx.N),
            N(var5, class07218.N(var0).N(class07211x, l2), class07211xxx, class09432xxx.y)
         );
      }

      int i3 = 0;
      int j3 = 0;
      int j1 = 0;
      int k1 = 0;
      int[] aint = new int[aclass09432.length];

      for (int l1 = l; l1 >= 0; l1--) {
         for (int var22 = 0; var22 < aclass09432.length; var22++) {
            class09432 class09432x = aclass09432[var22];
            int j2 = l - class09432x.N;
            int k2 = l + class09432x.y;
            aint[var22] = l1 >= j2 && l1 <= k2 ? k2 + 1 - l1 : 0;
         }

         Pair<class09432, Integer> pair = N(aint);
         class09432 class09432 = (class09432)pair.getFirst();
         int k3 = 1 + class09432.y - class09432.N;
         int l3 = (Integer)pair.getSecond();
         if (k3 * l3 > j1 * k1) {
            i3 = class09432.N;
            j3 = l1;
            j1 = k3;
            k1 = l3;
         }
      }

      return new class01009(var0.method_30513(var1, i3 - k).method_30513(var3, j3 - l), j1, k1);
   }
}
