package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class class05554 extends class05355<class07475> {
   private static final class01328 N = class01328.y().u();
   private final BiPredicate<class07475, class06584> y;

   public class05554(Predicate<class06584> var1) {
      this((var1x, var2) -> var1.test(var2));
   }

   private class05554(BiPredicate<class07475, class06584> var1) {
      super();
      this.y = var1;
   }

   public static class05554 y() {
      return new class05554((var0, var1) -> var0 instanceof class07633 ? ((class07633)var0).N(var1) : false);
   }

   public void N(class04782 var1, class07475 var2) {
      class01289<?> class01289 = var2.method_18868();
      class01328 class01328 = N.L().N((float)var2.method_45325(class05298.J));
      class04770 class04770x = null;
      double d0 = Double.MAX_VALUE;

      for (class04770 class04770x : var1.method_18456()) {
         if (class07042.R.test(class04770x) && class01328.N(var1, var2, class04770x) && this.y(var2, (class08036)class04770x) && !var2.method_5626(class04770x)
            )
          {
            double d1 = var2.method_5858(class04770x);
            if (d1 < d0) {
               d0 = d1;
               class04770x = class04770x;
            }
         }
      }

      if (class04770x != null) {
         class01289.N(class05378.a, class04770x);
      } else {
         class01289.y(class05378.a);
      }
   }

   private boolean y(class07475 var1, class08036 var2) {
      return this.N(var1, var2.method_6047()) || this.N(var1, var2.method_6079());
   }

   private boolean N(class07475 var1, class06584 var2) {
      return this.y.test(var1, var2);
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.a);
   }
}
