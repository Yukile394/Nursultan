package minecraft;

import com.google.common.base.Predicates;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;

public final class class07042 {
   public static final Predicate<class07049> N = class07049::method_5805;
   public static final Predicate<class07049> y = var0 -> var0.method_5805() && var0 instanceof class07438;
   public static final Predicate<class07049> L = var0 -> var0.method_5805() && !var0.method_5782() && !var0.method_5765();
   public static final Predicate<class07049> u = var0 -> var0 instanceof class06695 && var0.method_5805();
   public static final Predicate<class07049> i = var0 -> !(var0 instanceof class08036 class08036 && (var0.method_7325() || class08036.method_68878()));
   public static final Predicate<class07049> R = var0 -> !var0.method_7325();
   public static final Predicate<class07049> M = R.and(var0 -> var0.method_30948(null));
   public static final Predicate<class07049> B = R.and(class07049::method_5863);

   private class07042() {
      super();
   }

   public static Predicate<class07049> y(class07049 var0) {
      return var1 -> {
         while (var1.method_5765()) {
            var1 = var1.method_5854();
            if (var1 == var0) {
               return false;
            }
         }

         return true;
      };
   }

   public static Predicate<class07049> N(double var0, double var2, double var4, double var6) {
      double d0 = var6 * var6;
      return var8x -> var8x.method_5649(var0, var2, var4) <= d0;
   }

   private static Predicate N(Predicate var0, Predicate var1) {
      return EntityPushablePredicate.and(var0, var1);
   }

   public static Predicate<class07049> N(class07049 var0) {
      class00502 class00502 = var0.method_5781();
      class06656 class06656 = class00502 == null ? class06656.field_1437 : class00502.W();
      return (Predicate<class07049>)(class06656 == class06656.field_1435
         ? Predicates.alwaysFalse()
         : N(
            R,
            var3 -> {
               if (!var3.method_5810()) {
                  return false;
               } else if (!var0.method_73183().method_8608() || var3 instanceof class08036 class08036 && class08036.method_7340()) {
                  class00502 class00502x = var3.method_5781();
                  class06656 class06656x = class00502x == null ? class06656.field_1437 : class00502x.W();
                  if (class06656x == class06656.field_1435) {
                     return false;
                  } else {
                     boolean flag = class00502 != null && class00502.N(class00502x);
                     return (class06656 == class06656.field_1440 || class06656x == class06656.field_1440) && flag
                        ? false
                        : class06656 != class06656.field_1434 && class06656x != class06656.field_1434 || flag;
                  }
               } else {
                  return false;
               }
            }
         ));
   }
}
