package minecraft;

import com.google.common.collect.Iterables;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import org.jspecify.annotations.Nullable;

public interface class07322 extends class07290 {
   default boolean L(@Nullable class07049 var1, class00734 var2) {
      if (var1 == null) {
         return true;
      } else {
         class00494 class00494 = this.i(var1, var2);
         return class00494 == null || !class00389.L(class00494, class00389.N(var2), class07003.Z);
      }
   }

   default Optional<class06889> method_33594(@Nullable class07049 var1, class00494 var2, class06889 var3, double var4, double var6, double var8) {
      if (var2.method_1110()) {
         return Optional.empty();
      } else {
         class00734 class00734 = var2.method_1107().L(var4, var6, var8);
         class00494 class00494 = StreamSupport.stream(this.method_20812(var1, class00734).spliterator(), false)
            .filter(var1x -> this.method_8621() == null || this.method_8621().N(var1x.method_1107()))
            .flatMap(var0 -> var0.method_1090().stream())
            .map(var6x -> var6x.L(var4 / 2.0, var6 / 2.0, var8 / 2.0))
            .map(class00389::N)
            .reduce(class00389.N(), class00389::N);
         return class00389.N(var2, class00494, class07003.i).method_33661(var3);
      }
   }

   default boolean method_8587(@Nullable class07049 var1, class00734 var2) {
      return this.N(var1, var2, false);
   }

   default Optional<class07209> method_51718(class07049 var1, class00734 var2) {
      class07209 class07209x = null;
      double d0 = Double.MAX_VALUE;
      class05941 class05941 = new class05941<>(this, var1, var2, false, (var0, var1x) -> var0);

      while (class05941.hasNext()) {
         class07209 class07209x = (class07209)class05941.next();
         double d1 = class07209x.method_19770(var1.method_73189());
         if (d1 < d0 || d1 == d0 && (class07209x == null || class07209x.compareTo(class07209x) < 0)) {
            class07209x = class07209x.method_10062();
            d0 = d1;
         }
      }

      return Optional.ofNullable(class07209x);
   }

   List<class00494> method_20743(@Nullable class07049 var1, class00734 var2);

   default Iterable<class00494> method_20812(@Nullable class07049 var1, class00734 var2) {
      return this.N(var1 == null ? class06092.N() : class06092.N(var1), var2);
   }

   class08057 method_8621();

   @Nullable
   private class00494 i(class07049 var1, class00734 var2) {
      class08057 class08057 = this.method_8621();
      return class08057.N(var1, var2) ? class08057.N() : null;
   }

   default Iterable<class00494> u(@Nullable class07049 var1, class00734 var2) {
      return this.N(var1 == null ? class06092.y() : class06092.N(var1, true), var2);
   }

   default boolean y(class00734 var1) {
      return this.method_8587(null, var1);
   }

   default class06183 y(class05862 var1) {
      class06183 class06183 = this.N(var1);
      class08057 class08057 = this.method_8621();
      if (class08057.N(var1.y()) && !class08057.N(class06183.y())) {
         class06889 class06889x = class06183.y().u(var1.y());
         class07211 class07211 = class07211.N(class06889x.M, class06889x.B, class06889x.Z);
         class06889 class06889x = class08057.L(class06183.y());
         return new class06183(class06889x, class07211, class07209.method_49638(class06889x), false, true);
      } else {
         return class06183;
      }
   }

   default boolean y(@Nullable class07049 var1, class00734 var2, boolean var3) {
      Iterator<class00494> iterator = (var3 ? this.u(var1, var2) : this.method_20812(var1, var2)).iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().method_1110()) {
            return false;
         }
      }

      return true;
   }

   default boolean y(@Nullable class07049 var1, class00734 var2) {
      return this.method_20743(var1, var2).isEmpty();
   }

   default Iterable<class00494> N(@Nullable class07049 var1, class00734 var2, class06889 var3) {
      List<class00494> list = this.method_20743(var1, var2);
      Iterable<class00494> iterable = this.N(class06092.N(var1, var3.B), var2);
      return list.isEmpty() ? iterable : Iterables.concat(list, iterable);
   }

   private Iterable<class00494> N(class06092 var1, class00734 var2) {
      return () -> new class05941<class00494>(this, var1, var2, false, (var0, var1xx) -> var1xx);
   }

   default boolean N(class07049 var1) {
      return this.method_8587(var1, var1.method_5829());
   }

   default boolean N(@Nullable class07049 var1, class00734 var2, boolean var3) {
      return this.y(var1, var2, var3) && this.y(var1, var2) && this.L(var1, var2);
   }

   default boolean a_(@Nullable class07049 var1, class00734 var2) {
      return this.y(var1, var2, false);
   }

   @Nullable
   class07290 method_22338(int var1, int var2);

   default boolean method_8628(class00500 var1, class07209 var2, class06092 var3) {
      class00494 class00494 = var1.y(this, var2, var3);
      return class00494.method_1110() || this.method_8611(null, class00494.method_66507(var2));
   }

   default boolean method_8606(class07049 var1) {
      return this.method_8611(var1, class00389.N(var1.method_5829()));
   }

   default Iterable<class00494> method_8600(@Nullable class07049 var1, class00734 var2) {
      List<class00494> list = this.method_20743(var1, var2);
      Iterable<class00494> iterable = this.method_20812(var1, var2);
      return list.isEmpty() ? iterable : Iterables.concat(list, iterable);
   }

   default boolean method_8611(@Nullable class07049 var1, class00494 var2) {
      return true;
   }

   default boolean method_39454(@Nullable class07049 var1, class00734 var2) {
      class05941 class05941 = new class05941<>(this, var1, var2, true, (var0, var1x) -> var1x);

      while (class05941.hasNext()) {
         if (!((class00494)class05941.next()).method_1110()) {
            return true;
         }
      }

      return false;
   }
}
