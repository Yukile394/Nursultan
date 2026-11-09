package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class class01132 extends class06391<class01100> {
   private static final class07211[] NE = class07211.values();

   public class01132(Codec<class01100> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class01100> var1) {
      class01100 class01100 = (class01100)var1.R();
      class06069 class06069 = var1.u();
      class07209 class07209xxxxxx = var1.i();
      class05974 class05974 = var1.y();
      int i = class01100.W;
      int j = class01100.m;
      LinkedList linkedlist = Lists.newLinkedList();
      int k = class01100.U.N(class06069);
      class05041 class05041 = class05041.N(new class07836(new class06075(class05974.method_8412())), -4, 1.0);
      LinkedList linkedlist1 = Lists.newLinkedList();
      double d0 = (double)k / class01100.z.L();
      class01119 class01119 = class01100.u;
      class01121 class01121 = class01100.L;
      class01117 class01117 = class01100.i;
      double d1 = 1.0 / Math.sqrt(class01119.y);
      double d2 = 1.0 / Math.sqrt(class01119.L + d0);
      double d3 = 1.0 / Math.sqrt(class01119.u + d0);
      double d4 = 1.0 / Math.sqrt(class01119.i + d0);
      double d5 = 1.0 / Math.sqrt(class01117.L + class06069.U() / 2.0 + (k > 3 ? d0 : 0.0));
      boolean flag = class06069.z() < class01117.y;
      int l = 0;

      for (int i1 = 0; i1 < k; i1++) {
         int var31 = class01100.z.N(class06069);
         int var32 = class01100.z.N(class06069);
         int l1 = class01100.z.N(class06069);
         class07209 class07209x = class07209xxxxxx.method_10069(var31, var32, l1);
         class00500 class00500 = class05974.method_8320(class07209x);
         if (class00500.P() || class00500.N(class01121.B)) {
            if (++l > class01100.s) {
               return false;
            }
         }

         linkedlist.add(Pair.of(class07209x, class01100.E.N(class06069)));
      }

      if (flag) {
         int i2 = class06069.y(4);
         int j2 = k * 2 + 1;
         if (i2 == 0) {
            linkedlist1.add(class07209xxxxxx.method_10069(j2, 7, 0));
            linkedlist1.add(class07209xxxxxx.method_10069(j2, 5, 0));
            linkedlist1.add(class07209xxxxxx.method_10069(j2, 1, 0));
         } else if (i2 == 1) {
            linkedlist1.add(class07209xxxxxx.method_10069(0, 7, j2));
            linkedlist1.add(class07209xxxxxx.method_10069(0, 5, j2));
            linkedlist1.add(class07209xxxxxx.method_10069(0, 1, j2));
         } else if (i2 == 2) {
            linkedlist1.add(class07209xxxxxx.method_10069(j2, 7, j2));
            linkedlist1.add(class07209xxxxxx.method_10069(j2, 5, j2));
            linkedlist1.add(class07209xxxxxx.method_10069(j2, 1, j2));
         } else {
            linkedlist1.add(class07209xxxxxx.method_10069(0, 7, 0));
            linkedlist1.add(class07209xxxxxx.method_10069(0, 5, 0));
            linkedlist1.add(class07209xxxxxx.method_10069(0, 1, 0));
         }
      }

      ArrayList arraylist = Lists.newArrayList();
      Predicate<class00500> predicate = N(class01100.L.M);

      for (class07209 class07209x : class07209.method_10097(class07209xxxxxx.method_10069(i, i, i), class07209xxxxxx.method_10069(j, j, j))) {
         double d8 = class05041.N(class07209x.method_10263(), class07209x.method_10264(), class07209x.method_10260()) * class01100.P;
         double d6 = 0.0;
         double d7 = 0.0;

         for (Pair pair : linkedlist) {
            d6 += class04995.M(class07209x.method_10262((class00753)pair.getFirst()) + ((Integer)pair.getSecond()).intValue()) + d8;
         }

         for (class07209 class07209xx : linkedlist1) {
            d7 += class04995.M(class07209x.method_10262(class07209xx) + class01117.u) + d8;
         }

         if (!(d6 < d4)) {
            if (flag && d7 >= d5 && d6 < d1) {
               this.N(class05974, class07209x, class00869.N.W(), predicate);

               for (class07211 class07211 : NE) {
                  class07209 class07209xx = class07209x.method_10093(class07211);
                  class04688 class04688 = class05974.method_8316(class07209xx);
                  if (!class04688.W()) {
                     class05974.N(class07209xx, class04688.N(), 0);
                  }
               }
            } else if (d6 >= d1) {
               this.N(class05974, class07209x, class01121.N.N(class06069, class07209x), predicate);
            } else if (d6 >= d2) {
               boolean flag1 = class06069.z() < class01100.B;
               if (flag1) {
                  this.N(class05974, class07209x, class01121.L.N(class06069, class07209x), predicate);
               } else {
                  this.N(class05974, class07209x, class01121.y.N(class06069, class07209x), predicate);
               }

               if ((!class01100.Z || flag1) && class06069.z() < class01100.M) {
                  arraylist.add(class07209x.method_10062());
               }
            } else if (d6 >= d3) {
               this.N(class05974, class07209x, class01121.u.N(class06069, class07209x), predicate);
            } else if (d6 >= d4) {
               this.N(class05974, class07209x, class01121.i.N(class06069, class07209x), predicate);
            }
         }
      }

      List<class00500> list = class01121.R;

      for (class07209 class07209x : arraylist) {
         class00500 class00500x = class07536.N_77(list, class06069);

         for (class07211 class07211x : NE) {
            if (class00500x.y(class06665.F)) {
               class00500x = class00500x.y(class06665.F, class07211x);
            }

            class07209 class07209xx = class07209x.method_10093(class07211x);
            class00500 class00500x = class05974.method_8320(class07209xx);
            if (class00500x.y(class06665.q)) {
               class00500x = class00500x.y(class06665.q, class00500x.Y().u());
            }

            if (class05481.U(class00500x)) {
               this.N(class05974, class07209xx, class00500x, predicate);
               break;
            }
         }
      }

      return true;
   }
}
