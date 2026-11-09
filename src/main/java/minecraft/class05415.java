package minecraft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public abstract class class05415<V> {
   private final Map<class05390, V> N = new HashMap<>();

   private void L() {
      List<class08092<?>> list = this.y();
      Stream stream = Stream.of(class05390.N);

      for (class08092<?> class08092 : list) {
         stream = stream.flatMap(var1x -> class08092.L().map(var1x::N));
      }

      List list1 = stream.filter(var1x -> !this.N.containsKey(var1x)).toList();
      if (!list1.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + list1);
      }
   }

   public class05415() {
      super();
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> class05411<class08503, T1, T2, T3, T4> y(
      class08092<T1> var0, class08092<T2> var1, class08092<T3> var2, class08092<T4> var3
   ) {
      return new class05411<>(var0, var1, var2, var3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> class05408<class08503, T1, T2, T3> y(
      class08092<T1> var0, class08092<T2> var1, class08092<T3> var2
   ) {
      return new class05408<>(var0, var1, var2);
   }

   public static <T1 extends Comparable<T1>> class05392<class08503, T1> y(class08092<T1> var0) {
      return new class05392<>(var0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> class05413<class08503, T1, T2> y(class08092<T1> var0, class08092<T2> var1) {
      return new class05413<>(var0, var1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> class05426<class08503, T1, T2, T3, T4, T5> y(
      class08092<T1> var0, class08092<T2> var1, class08092<T3> var2, class08092<T4> var3, class08092<T5> var4
   ) {
      return new class05426<>(var0, var1, var2, var3, var4);
   }

   abstract List<class08092<?>> y();

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> class05413<class03264, T1, T2> N(class08092<T1> var0, class08092<T2> var1) {
      return new class05413<>(var0, var1);
   }

   public static <T1 extends Comparable<T1>> class05392<class03264, T1> N(class08092<T1> var0) {
      return new class05392<>(var0);
   }

   Map<class05390, V> N() {
      this.L();
      return Map.copyOf(this.N);
   }

   protected void N(class05390 var1, V var2) {
      if (this.N.put(var1, (V)var2) != null) {
         throw new IllegalStateException("Value " + var1 + " is already defined");
      }
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> class05408<class03264, T1, T2, T3> N(
      class08092<T1> var0, class08092<T2> var1, class08092<T3> var2
   ) {
      return new class05408<>(var0, var1, var2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> class05411<class03264, T1, T2, T3, T4> N(
      class08092<T1> var0, class08092<T2> var1, class08092<T3> var2, class08092<T4> var3
   ) {
      return new class05411<>(var0, var1, var2, var3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> class05426<class03264, T1, T2, T3, T4, T5> N(
      class08092<T1> var0, class08092<T2> var1, class08092<T3> var2, class08092<T4> var3, class08092<T5> var4
   ) {
      return new class05426<>(var0, var1, var2, var3, var4);
   }
}
