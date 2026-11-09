package minecraft;

import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class04051 {
   private static final class04051 N = new class04051();
   private final List<class07438> y;
   private final Predicate<class07438> L;

   public Stream<class07438> L(Predicate<class07438> var1) {
      return this.y.stream().filter(var2 -> var1.test(var2) && this.L.test(var2));
   }

   private class04051() {
      super();
      this.y = List.of();
      this.L = var0 -> false;
   }

   public class04051(class04782 var1, class07438 var2, List<class07438> var3) {
      super();
      this.y = var3;
      Object2BooleanOpenHashMap object2booleanopenhashmap = new Object2BooleanOpenHashMap(var3.size());
      Predicate predicate = var2x -> class05355.N(var1, var2, var2x);
      this.L = var2x -> object2booleanopenhashmap.computeIfAbsent(var2x, predicate);
   }

   public boolean u(Predicate<class07438> var1) {
      for (class07438 class07438 : this.y) {
         if (var1.test(class07438) && this.L.test(class07438)) {
            return true;
         }
      }

      return false;
   }

   public Iterable<class07438> y(Predicate<class07438> var1) {
      return Iterables.filter(this.y, var2 -> var1.test(var2) && this.L.test(var2));
   }

   public Optional<class07438> N(Predicate<class07438> var1) {
      for (class07438 class07438 : this.y) {
         if (var1.test(class07438) && this.L.test(class07438)) {
            return Optional.of(class07438);
         }
      }

      return Optional.empty();
   }

   public boolean N(class07438 var1) {
      return this.y.contains(var1) && this.L.test(var1);
   }

   public static class04051 N() {
      return N;
   }
}
