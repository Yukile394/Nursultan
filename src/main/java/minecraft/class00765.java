package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class class00765 implements class04330 {
   public static final Codec<class00765> N = class04206.r.T().dispatchStable(class00765::N, Function.identity());
   private final Supplier<Set<class03556<class00780>>> y = Suppliers.memoize(() -> this.y().distinct().collect(ImmutableSet.toImmutableSet()));

   public Set<class03556<class00780>> L() {
      Supplier<Set<class03556<class00780>>> supplier = this.y;
      return (Set<class03556<class00780>>)this.N(supplier);
   }

   public class00765() {
      super();
   }

   protected abstract Stream<class03556<class00780>> y();

   public void N(List<String> var1, class07209 var2, class03222 var3) {
   }

   private Object N(Supplier var1) {
      return this.N((Set)var1.get());
   }

   protected Set N(Set var1) {
      return var1;
   }

   public Set<class03556<class00780>> N(int var1, int var2, int var3, int var4, class03222 var5) {
      int i = class01146.N(var1 - var4);
      int j = class01146.N(var2 - var4);
      int k = class01146.N(var3 - var4);
      int l = class01146.N(var1 + var4);
      int i1 = class01146.N(var2 + var4);
      int j1 = class01146.N(var3 + var4);
      int k1 = l - i + 1;
      int l1 = i1 - j + 1;
      int i2 = j1 - k + 1;
      HashSet hashset = Sets.newHashSet();

      for (int j2 = 0; j2 < i2; j2++) {
         for (int k2 = 0; k2 < k1; k2++) {
            for (int l2 = 0; l2 < l1; l2++) {
               int i3 = i + k2;
               int j3 = j + l2;
               int k3 = k + j2;
               hashset.add(this.method_38109(i3, j3, k3, var5));
            }
         }
      }

      return hashset;
   }

   protected abstract MapCodec<? extends class00765> N();

   @Nullable
   public Pair<class07209, class03556<class00780>> N(
      class07209 var1, int var2, int var3, int var4, Predicate<class03556<class00780>> var5, class03222 var6, class05487 var7
   ) {
      Set set = this.L().stream().filter(var5).collect(Collectors.toUnmodifiableSet());
      if (set.isEmpty()) {
         return null;
      } else {
         int i = Math.floorDiv(var2, var3);
         int[] aint = class04995.y(var1.method_10264(), var7.method_31607() + 1, var7.method_31600() + 1, var4).toArray();

         for (class07218 class07218 : class07209.method_30512(class07209.field_10980, i, class07211.field_11034, class07211.field_11035)) {
            int j = var1.method_10263() + class07218.method_10263() * var3;
            int k = var1.method_10260() + class07218.method_10260() * var3;
            int l = class01146.N(j);
            int i1 = class01146.N(k);

            for (int j1 : aint) {
               int k1 = class01146.N(j1);
               class03556<class00780> class03556 = this.method_38109(l, k1, i1, var6);
               if (set.contains(class03556)) {
                  return Pair.of(new class07209(j, j1, k), class03556);
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public Pair<class07209, class03556<class00780>> N(
      int var1, int var2, int var3, int var4, int var5, Predicate<class03556<class00780>> var6, class06069 var7, boolean var8, class03222 var9
   ) {
      int i = class01146.N(var1);
      int j = class01146.N(var3);
      int k = class01146.N(var4);
      int l = class01146.N(var2);
      Pair pair = null;
      int i1 = 0;
      int j1 = var8 ? 0 : k;

      while (j1 <= k) {
         for (int k1 = !class07529.Nl && !class07529.NG ? -j1 : 0; k1 <= j1; k1 += var5) {
            boolean flag = Math.abs(k1) == j1;

            for (int l1 = -j1; l1 <= j1; l1 += var5) {
               if (var8) {
                  boolean flag1 = Math.abs(l1) == j1;
                  if (!flag1 && !flag) {
                     continue;
                  }
               }

               int j2 = i + l1;
               int i2 = j + k1;
               class03556<class00780> class03556 = this.method_38109(j2, l, i2, var9);
               if (var6.test(class03556)) {
                  if (pair == null || var7.y(i1 + 1) == 0) {
                     class07209 class07209 = new class07209(class01146.L(j2), var2, class01146.L(i2));
                     if (var8) {
                        return Pair.of(class07209, class03556);
                     }

                     pair = Pair.of(class07209, class03556);
                  }

                  i1++;
               }
            }
         }

         j1 += var5;
      }

      return pair;
   }

   @Nullable
   public Pair<class07209, class03556<class00780>> N(
      int var1, int var2, int var3, int var4, Predicate<class03556<class00780>> var5, class06069 var6, class03222 var7
   ) {
      return this.N(var1, var2, var3, var4, 1, var5, var6, false, var7);
   }

   @Override
   public abstract class03556<class00780> method_38109(int var1, int var2, int var3, class03222 var4);
}
