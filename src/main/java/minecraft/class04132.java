package minecraft;

import Nursultan.class10312;

public record class04132<T>(class01921<T> lookup, class03515<T> opsInfo) {
   class04132(class01921<T> lookup, class03515<T> opsInfo) {
      this.lookup = lookup;
      this.opsInfo = opsInfo;
   }

   public class03515<T> y() {
      return this.opsInfo;
   }

   public static <T> class04132<T> N(class02038 var0, class01921<T> var1) {
      return new class04132<>(new class10312<>(var0.N(), var1), new class03515<>(var0.N(), var1, var1.R()));
   }

   public class01921<T> N() {
      return this.lookup;
   }

   public static <T> class04132<T> N(class01921<T> var0) {
      return new class04132<>(new class10312<>(var0, var0), class03515.N(var0));
   }
}
