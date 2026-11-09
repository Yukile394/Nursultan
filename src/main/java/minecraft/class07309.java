package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import org.jspecify.annotations.Nullable;

public interface class07309 {
   default List<class00494> method_20743(@Nullable class07049 var1, class00734 var2) {
      if (var2.N() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<class07049> predicate = var1 == null ? class07042.M : class07042.R.and(var1::method_30949);
         class00734 class00734 = var2.M(1.0E-7);
         List list = this.N(this, var1, class00734, predicate);
         if (list.isEmpty()) {
            return List.of();
         } else {
            Builder builder = ImmutableList.builderWithExpectedSize(list.size());

            for (class07049 class07049 : list) {
               builder.add(class00389.N(class07049.method_5829()));
            }

            return builder.build();
         }
      }
   }

   List<? extends class08036> method_18456();

   @Nullable
   default class08036 N(class07049 var1, double var2) {
      return this.N(var1.method_23317(), var1.method_23318(), var1.method_23321(), var2, false);
   }

   @Nullable
   default class08036 N(double var1, double var3, double var5, double var7, @Nullable Predicate<class07049> var9) {
      double d0 = -1.0;
      class08036 class08036x = null;

      for (class08036 class08036x : this.method_18456()) {
         if (var9 == null || var9.test(class08036x)) {
            double d1 = class08036x.method_5649(var1, var3, var5);
            if ((var7 < 0.0 || d1 < var7 * var7) && (d0 == -1.0 || d1 < d0)) {
               d0 = d1;
               class08036x = class08036x;
            }
         }
      }

      return class08036x;
   }

   private List N(class07309 var1, class07049 var2, class00734 var3, Predicate var4) {
      return WorldHelper.getOtherEntitiesForCollision(var1, var3, var2, var4);
   }

   @Nullable
   default class08036 N(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate<class07049> predicate = var9 ? class07042.i : class07042.R;
      return this.N(var1, var3, var5, var7, predicate);
   }

   default boolean N(double var1, double var3, double var5, double var7) {
      for (class08036 class08036 : this.method_18456()) {
         if (class07042.R.test(class08036) && class07042.y.test(class08036)) {
            double d0 = class08036.method_5649(var1, var3, var5);
            if (var7 < 0.0 || d0 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default class08036 N(UUID var1) {
      for (int i = 0; i < this.method_18456().size(); i++) {
         class08036 class08036 = this.method_18456().get(i);
         if (var1.equals(class08036.method_5667())) {
            return class08036;
         }
      }

      return null;
   }

   default <T extends class07049> List<T> N(Class<T> var1, class00734 var2, Predicate<? super T> var3) {
      return this.method_18023(class01128.N(var1), var2, var3);
   }

   default List<class07049> N_70(@Nullable class07049 var1, class00734 var2) {
      return this.method_8333(var1, var2, class07042.R);
   }

   default <T extends class07049> List<T> N(Class<T> var1, class00734 var2) {
      return this.N(var1, var2, class07042.R);
   }

   List<class07049> method_8333(@Nullable class07049 var1, class00734 var2, Predicate<? super class07049> var3);

   <T extends class07049> List<T> method_18023(class01128<class07049, T> var1, class00734 var2, Predicate<? super T> var3);

   default boolean method_8611(@Nullable class07049 var1, class00494 var2) {
      if (var2.method_1110()) {
         return true;
      } else {
         for (class07049 class07049 : this.N_70(var1, var2.method_1107())) {
            if (!class07049.method_31481()
               && class07049.field_23807
               && (var1 == null || !class07049.method_5794(var1))
               && class00389.L(var2, class00389.N(class07049.method_5829()), class07003.Z)) {
               return false;
            }
         }

         return true;
      }
   }
}
