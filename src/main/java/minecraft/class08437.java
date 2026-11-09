package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.stream.Stream;

public class class08437 {
   private final Builder<String, class01968> N = ImmutableMap.builder();

   public class08437() {
      super();
   }

   public final <T extends Comparable<T>> class08437 y(class08092<T> var1, T var2) {
      this.N(var1, new class01968(List.of(new class01937(var1.y((T)var2), true))));
      return this;
   }

   public class01975 N() {
      return new class01942(this.N.buildOrThrow());
   }

   @SafeVarargs
   public final <T extends Comparable<T>> class08437 N(class08092<T> var1, T var2, T... var3) {
      List list = Stream.concat(Stream.of(var2), Stream.of(var3)).map(var1::y).sorted().distinct().map(var0 -> new class01937(var0, false)).toList();
      this.N(var1, new class01968(list));
      return this;
   }

   public final <T extends Comparable<T>> class08437 N(class08092<T> var1, T var2) {
      this.N(var1, new class01968(List.of(new class01937(var1.y((T)var2), false))));
      return this;
   }

   private <T extends Comparable<T>> void N(class08092<T> var1, class01968 var2) {
      this.N.put(var1.R(), var2);
   }
}
