package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class class03194 extends class06391<class01476> {
   private static final int NE = 19;

   public static boolean L(class04887 var0, class07209 var1) {
      return var0.method_16358(var1, var0x -> var0x.P() || var0x.N(class01210.Lg));
   }

   public class03194(Codec<class01476> var1) {
      super(var1);
   }

   public static boolean y(class04887 var0, class07209 var1) {
      return var0.method_16358(var1, var0x -> var0x.P() || var0x.N(class01210.H));
   }

   private static void y(class00807 var0, class07209 var1, class00500 var2) {
      var0.method_8652(var1, var2, 19);
   }

   public static List<class07209> N(class05894 var0) {
      ArrayList arraylist = Lists.newArrayList();
      ObjectArrayList<class07209> objectarraylist = var0.i();
      ObjectArrayList<class07209> objectarraylist1 = var0.L();
      if (objectarraylist.isEmpty()) {
         arraylist.addAll(objectarraylist1);
      } else if (!objectarraylist1.isEmpty() && ((class07209)objectarraylist.get(0)).method_10264() == ((class07209)objectarraylist1.get(0)).method_10264()) {
         arraylist.addAll(objectarraylist1);
         arraylist.addAll(objectarraylist);
      } else {
         arraylist.addAll(objectarraylist);
      }

      return arraylist;
   }

   public static boolean N(class04887 var0, class07209 var1) {
      return var0.method_16358(var1, var0x -> var0x.N(class00869.Rc));
   }

   @Override
   public final boolean N(class06058<class01476> var1) {
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class07209 class07209 = var1.i();
      class01476 class01476 = (class01476)var1.R();
      HashSet hashset = Sets.newHashSet();
      HashSet hashset1 = Sets.newHashSet();
      HashSet hashset2 = Sets.newHashSet();
      HashSet hashset3 = Sets.newHashSet();
      BiConsumer biconsumer = (var2x, var3x) -> {
         hashset.add(var2x.method_10062());
         class05974.method_8652(var2x, var3x, 19);
      };
      BiConsumer biconsumer1 = (var2x, var3x) -> {
         hashset1.add(var2x.method_10062());
         class05974.method_8652(var2x, var3x, 19);
      };
      class01805 class01805 = new class01805(this, hashset2, class05974);
      BiConsumer biconsumer2 = (var2x, var3x) -> {
         hashset3.add(var2x.method_10062());
         class05974.method_8652(var2x, var3x, 19);
      };
      if (this.N(class05974, class06069, class07209, biconsumer, biconsumer1, class01805, class01476) && (!hashset1.isEmpty() || !hashset2.isEmpty())) {
         if (!class01476.z.isEmpty()) {
            class05894 class05894 = new class05894(class05974, biconsumer2, class06069, hashset1, hashset2, hashset);
            class01476.z.forEach(var1x -> var1x.N(class05894));
         }

         return class05163.N(Iterables.concat(hashset, hashset1, hashset2, hashset3)).map(var4x -> {
            class07739 class07739 = N(class05974, var4x, hashset1, hashset3, hashset);
            class01207.N(class05974, 3, class07739, var4x.B(), var4x.Z(), var4x.z());
            return true;
         }).orElse(false);
      } else {
         return false;
      }
   }

   @Override
   protected void N(class00807 var1, class07209 var2, class00500 var3) {
      y(var1, var2, var3);
   }

   private int N(class04887 var1, int var2, class07209 var3, class01476 var4) {
      class07218 class07218 = new class07218();

      for (int i = 0; i <= var2 + 1; i++) {
         int j = var4.Z.N(var2, i);

         for (int k = -j; k <= j; k++) {
            for (int l = -j; l <= j; l++) {
               class07218.N(var3, k, i, l);
               if (!var4.u.y(var1, class07218) || !var4.U && N(var1, class07218)) {
                  return i - 2;
               }
            }
         }
      }

      return var2;
   }

   private boolean N(
      class05974 var1,
      class06069 var2,
      class07209 var3,
      BiConsumer<class07209, class00500> var4,
      BiConsumer<class07209, class00500> var5,
      class01455 var6,
      class01476 var7
   ) {
      int i = var7.u.N(var2);
      int j = var7.M.N(var2, i, var7);
      int k = i - j;
      int l = var7.M.N(var2, k);
      class07209 class07209 = var7.B.<class07209>map(var2x -> var2x.N(var3, var2)).orElse(var3);
      int i1 = Math.min(var3.method_10264(), class07209.method_10264());
      int j1 = Math.max(var3.method_10264(), class07209.method_10264()) + i + 1;
      if (i1 >= var1.method_31607() + 1 && j1 <= var1.method_31600() + 1) {
         OptionalInt optionalint = var7.Z.L();
         int k1 = this.N(var1, i, class07209, var7);
         if (k1 >= i || !optionalint.isEmpty() && k1 >= optionalint.getAsInt()) {
            if (var7.B.isPresent() && !var7.B.get().N(var1, var4, var2, var3, class07209, var7)) {
               return false;
            } else {
               var7.u.N(var1, var5, var2, k1, class07209, var7).forEach(var7x -> var7.M.N(var1, var6, var2, var7, k1, var7x, j, l));
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static class07739 N(class07284 var0, class05163 var1, Set<class07209> var2, Set<class07209> var3, Set<class07209> var4) {
      class06890 class06890 = new class06890(var1.u(), var1.i(), var1.R());
      byte b0 = 7;
      ArrayList arraylist = Lists.newArrayList();

      for (int i = 0; i < 7; i++) {
         arraylist.add(Sets.newHashSet());
      }

      for (class07209 class07209x : Lists.newArrayList(Sets.union(var3, var4))) {
         if (var1.y(class07209x)) {
            class06890.method_1049(class07209x.method_10263() - var1.B(), class07209x.method_10264() - var1.Z(), class07209x.method_10260() - var1.z());
         }
      }

      class07218 class07218 = new class07218();
      int j1 = 0;
      ((Set)arraylist.get(0)).addAll(var2);

      while (true) {
         while (j1 >= 7 || !((Set)arraylist.get(j1)).isEmpty()) {
            if (j1 >= 7) {
               return class06890;
            }

            Iterator iterator = ((Set)arraylist.get(j1)).iterator();
            class07209 class07209x = (class07209)iterator.next();
            iterator.remove();
            if (var1.y(class07209x)) {
               if (j1 != 0) {
                  class00500 class00500 = var0.method_8320(class07209x);
                  y(var0, class07209x, class00500.y(class06665.NJ, j1));
               }

               class06890.method_1049(class07209x.method_10263() - var1.B(), class07209x.method_10264() - var1.Z(), class07209x.method_10260() - var1.z());

               for (class07211 class07211 : class07211.values()) {
                  class07218.N(class07209x, class07211);
                  if (var1.y(class07218)) {
                     int j = class07218.method_10263() - var1.B();
                     int k = class07218.method_10264() - var1.Z();
                     int l = class07218.method_10260() - var1.z();
                     if (!class06890.method_1063(j, k, l)) {
                        OptionalInt optionalint = class07131.T(var0.method_8320(class07218));
                        if (!optionalint.isEmpty()) {
                           int i1 = Math.min(optionalint.getAsInt(), j1 + 1);
                           if (i1 < 7) {
                              ((Set)arraylist.get(i1)).add(class07218.method_10062());
                              j1 = Math.min(j1, i1);
                           }
                        }
                     }
                  }
               }
            }
         }

         j1++;
      }
   }
}
