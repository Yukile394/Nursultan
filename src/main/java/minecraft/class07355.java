package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;

enum class07355 implements class07347 {
   field_12957(
      "BLACKLIST",
      0,
      class00869.EV,
      class00869.iq,
      class00869.Wq,
      class00869.WK,
      class00869.WV,
      class00869.We,
      class00869.WH,
      class00869.Wc,
      class00869.WX,
      class00869.Wa,
      class00869.Wp,
      class00869.WF,
      class00869.WA,
      class00869.Wf,
      class00869.WC,
      class00869.WS,
      class00869.Wx,
      class00869.WD,
      class00869.BK,
      class00869.BV,
      class00869.Be,
      class00869.Ms,
      class00869.X,
      class00869.e,
      class00869.c,
      class00869.uy,
      class00869.uL,
      class00869.uu,
      class00869.ui,
      class00869.uR,
      class00869.uM,
      class00869.uB,
      class00869.uZ,
      class00869.us,
      class00869.uT,
      class00869.ub,
      class00869.uj,
      class00869.un,
      class00869.ut,
      class00869.uG,
      class00869.uw,
      class00869.uk,
      class00869.uY,
      class00869.uQ,
      class00869.ug,
      class00869.uI,
      class00869.uJ,
      class00869.ue,
      class00869.uH,
      class00869.uc,
      class00869.uX,
      class00869.up,
      class00869.uF,
      class00869.uA
   ) {
      @Override
      public class00500 N(class00500 var1, class07211 var2, class00500 var3, class07284 var4, class07209 var5, class07209 var6) {
         return var1;
      }
   },
   field_12962("DEFAULT", 1) {
      @Override
      public class00500 N(class00500 var1, class07211 var2, class00500 var3, class07284 var4, class07209 var5, class07209 var6) {
         return var1.N(var4, var4, var5, var2, var6, var4.method_8320(var6), var4.method_8409());
      }
   },
   field_12960("CHEST", 2, class00869.LA, class00869.BH) {
      @Override
      public class00500 N(class00500 var1, class07211 var2, class00500 var3, class07284 var4, class07209 var5, class07209 var6) {
         if (var3.N(var1.i()) && var2.z().L() && var1.L(class00860.i) == class06638.field_12569 && var3.L(class00860.i) == class06638.field_12569) {
            class07211 class07211 = var1.L(class00860.u);
            if (var2.z() != class07211.z() && class07211 == var3.L(class00860.u)) {
               class06638 class06638 = var2 == class07211.R() ? class06638.field_12574 : class06638.field_12571;
               var4.method_8652(var6, var3.y(class00860.i, class06638.N()), 18);
               if (class07211 == class07211.field_11043 || class07211 == class07211.field_11034) {
                  class00394 class00394x = var4.method_8321(var5);
                  class00394 class00394x = var4.method_8321(var6);
                  if (class00394x instanceof class00379 && class00394x instanceof class00379) {
                     class00379.N((class00379)class00394x, (class00379)class00394x);
                  }
               }

               return var1.y(class00860.i, class06638);
            }
         }

         return var1;
      }
   },
   field_12963("LEAVES", 3, true, class00869.NX, class00869.Na, class00869.NH, class00869.NF, class00869.Np, class00869.Nc, class00869.NV, class00869.Ne) {
      private final ThreadLocal<List<ObjectSet<class07209>>> field_12964 = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

      @Override
      public void N(class07284 var1) {
         class07218 class07218 = new class07218();
         List<ObjectSet<class07209>> list = this.field_12964.get();

         for (int i = 2; i < list.size(); i++) {
            int j = i - 1;
            ObjectSet<class07209> objectset = list.get(j);
            ObjectSet<class07209> objectset1 = list.get(i);
            ObjectIterator<class07209> objectiterator = objectset.iterator();

            while (objectiterator.hasNext()) {
               class07209 class07209 = (class07209)objectiterator.next();
               class00500 class00500 = var1.method_8320(class07209);
               if (class00500.L(class06665.NJ) >= j) {
                  var1.method_8652(class07209, class00500.y(class06665.NJ, j), 18);
                  if (i != 7) {
                     int k = field_12959.length;

                     for (int l = 0; l < k; l++) {
                        class07211 class07211 = field_12959[l];
                        class07218.N(class07209, class07211);
                        if (var1.method_8320(class07218).y(class06665.NJ) && class00500.L(class06665.NJ) > i) {
                           objectset1.add(class07218.method_10062());
                        }
                     }
                  }
               }
            }
         }

         list.clear();
      }

      @Override
      public class00500 N(class00500 var1, class07211 var2, class00500 var3, class07284 var4, class07209 var5, class07209 var6) {
         class00500 class00500 = var1.N(var4, var4, var5, var2, var6, var4.method_8320(var6), var4.method_8409());
         if (var1 != class00500) {
            int i = class00500.L(class06665.NJ);
            List<ObjectSet<class07209>> list = this.field_12964.get();
            if (list.isEmpty()) {
               for (int j = 0; j < 7; j++) {
                  list.add(new ObjectOpenHashSet());
               }
            }

            list.get(i).add(var5.method_10062());
         }

         return var1;
      }
   },
   field_12958("STEM_BLOCK", 4, class00869.RH, class00869.Re) {
      @Override
      public class00500 N(class00500 var1, class07211 var2, class00500 var3, class07284 var4, class07209 var5, class07209 var6) {
         if (var1.L(class07728.L) == 7) {
            class00891 class00891 = var1.N(class00869.Re) ? class00869.Ro : class00869.Rq;
            if (var3.N(class00891)) {
               return (var1.N(class00869.Re) ? class00869.RK : class00869.RV).W().y(class07101.R, var2);
            }
         }

         return var1;
      }
   };

   public static final class07211[] field_12959 = class07211.values();

   class07355(boolean var3, class00891... var4) {
      for (class00891 class00891 : var4) {
         class07371.y.put(class00891, this);
      }

      if (var3) {
         class07371.L.add(this);
      }
   }

   class07355(class00891... var3) {
      this(false, var3);
   }
}
