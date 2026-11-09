package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class07068 {
   private static final float N = 1.5F;
   private final class01763[] y = new class01763[32];
   private int L;
   private final class02119 u;
   private final class05334 i = new class05334();
   private BooleanSupplier R = () -> false;

   public class07068(class02119 var1, int var2) {
      super();
      this.u = var1;
      this.L = var2;
   }

   private class00143 N(class01763 var1, class07209 var2, boolean var3) {
      ArrayList arraylist = Lists.newArrayList();
      class01763 class01763 = var1;
      arraylist.add(0, var1);

      while (class01763.B != null) {
         class01763 = class01763.B;
         arraylist.add(0, class01763);
      }

      return new class00143(arraylist, var2, var3);
   }

   public void N(BooleanSupplier var1) {
      this.R = var1;
   }

   public void N(int var1) {
      this.L = var1;
   }

   @Nullable
   public class00143 N(class00783 var1, class07079 var2, Set<class07209> var3, float var4, int var5, float var6) {
      this.i.N();
      this.u.N(var1, var2);
      class01763 class01763 = this.u.y();
      if (class01763 == null) {
         return null;
      } else {
         Map map = var3.stream()
            .collect(Collectors.toMap(var1x -> this.u.N(var1x.method_10263(), var1x.method_10264(), var1x.method_10260()), Function.identity()));
         class00143 class00143 = this.N(class01763, map, var4, var5, var6);
         this.u.N();
         return class00143;
      }
   }

   @Nullable
   private class00143 N(class01763 var1, Map<class04604, class07209> var2, float var3, int var4, float var5) {
      class04643 class04643 = class08700.N();
      class04643.N("find_path");
      class04643.N(class02253.field_33876);
      Set set = var2.keySet();
      var1.i = 0.0F;
      var1.R = this.N(var1, set);
      var1.M = var1.R;
      this.i.N();
      this.i.N(var1);
      boolean flag = this.R.getAsBoolean();
      Object object = flag ? new HashSet() : Set.of();
      int ix = 0;
      HashSet hashset = Sets.newHashSetWithExpectedSize(set.size());
      int j = (int)(this.L * var5);

      while (!this.i.i()) {
         if (++ix >= j) {
            break;
         }

         class01763 class01763x = this.i.L();
         class01763x.Z = true;

         for (class04604 class04604 : set) {
            if (class01763x.u(class04604) <= var4) {
               class04604.y();
               hashset.add(class04604);
            }
         }

         if (!hashset.isEmpty()) {
            break;
         }

         if (flag) {
            object.add(class01763x);
         }

         if (!(class01763x.N(var1) >= var3)) {
            int k = this.u.N(this.y, class01763x);

            for (int l = 0; l < k; l++) {
               class01763 class01763x = this.y[l];
               float f = this.N(class01763x, class01763x);
               class01763x.z = class01763x.z + f;
               float f1 = class01763x.i + f + class01763x.U;
               if (class01763x.z < var3 && (!class01763x.R() || f1 < class01763x.i)) {
                  class01763x.B = class01763x;
                  class01763x.i = f1;
                  class01763x.R = this.N(class01763x, set) * 1.5F;
                  if (class01763x.R()) {
                     this.i.N(class01763x, class01763x.i + class01763x.R);
                  } else {
                     class01763x.M = class01763x.i + class01763x.R;
                     this.i.N(class01763x);
                  }
               }
            }
         }
      }

      Optional optional = !hashset.isEmpty()
         ? hashset.stream().map(var2x -> this.N(var2x.N(), (class07209)var2.get(var2x), true)).min(Comparator.comparingInt(class00143::i))
         : set.stream()
            .map(var2x -> this.N(var2x.N(), (class07209)var2.get(var2x), false))
            .min(Comparator.comparingDouble(class00143::W).thenComparingInt(class00143::i));
      class04643.L();
      if (optional.isEmpty()) {
         return null;
      } else {
         class00143 class00143 = (class00143)optional.get();
         if (flag) {
            class00143.N(this.i.R(), object.toArray(class01763[]::new), set);
         }

         return class00143;
      }
   }

   protected float N(class01763 var1, class01763 var2) {
      return var1.N(var2);
   }

   private float N(class01763 var1, Set<class04604> var2) {
      float f = Float.MAX_VALUE;

      for (class04604 class04604 : var2) {
         float f1 = var1.N(class04604);
         class04604.N(f1, var1);
         f = Math.min(f1, f);
      }

      return f;
   }
}
