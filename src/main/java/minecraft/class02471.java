package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class class02471 implements Predicate<class02666> {
   public static final Codec<class02471> N = class02477.u
      .xmap(
         var0 -> new class02471(var0.entrySet().stream().map(class02480::N).collect(Collectors.toList())),
         var0 -> var0.u.stream().filter(var0x -> !var0x.N().u()).collect(Collectors.toMap(class02480::N, class02480::y))
      );
   public static final class02362<class04247, class02471> y = class02480.N.N_33(class02389.N()).N_10(class02471::new, var0 -> var0.u);
   public static final class02471 L = new class02471(List.of());
   private final List<class02480<?>> u;

   public boolean L() {
      return this.u.isEmpty();
   }

   class02471(List<class02480<?>> var1) {
      super();
      this.u = (List<class02480<?>>)var1;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class02471 class02471 && this.u.equals(class02471.u);
   }

   @Override
   public String toString() {
      return this.u.toString();
   }

   @Override
   public int hashCode() {
      return this.u.hashCode();
   }

   public class02678 u() {
      class02713 class02713 = class02678.N();

      for (class02480<?> class02480 : this.u) {
         class02713.N(class02480);
      }

      return class02713.N();
   }

   public boolean y() {
      return this.u.isEmpty();
   }

   public boolean test(class02666 var1) {
      for (class02480<?> class02480 : this.u) {
         Object object = var1.method_58694(class02480.N());
         if (!Objects.equals(class02480.y(), object)) {
            return false;
         }
      }

      return true;
   }

   public static class02471 N(class02695 var0) {
      return new class02471(ImmutableList.copyOf(var0));
   }

   public static class02471 N(class02695 var0, class02477<?>... var1) {
      class02504 class02504 = new class02504();

      for (class02477 class02477 : var1) {
         class02480 class02480 = var0.u(class02477);
         if (class02480 != null) {
            class02504.N(class02480);
         }
      }

      return class02504.N();
   }

   public static <T> class02471 N(class02477<T> var0, T var1) {
      return new class02471(List.of(new class02480<>(var0, var1)));
   }

   public static class02504 N() {
      return new class02504();
   }
}
