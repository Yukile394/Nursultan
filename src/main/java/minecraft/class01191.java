package minecraft;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public abstract class class01191 {
   public static class01191 L(int var0) {
      return new class01160(var0, true);
   }

   public abstract OptionalInt L();

   public class01191() {
      super();
   }

   public abstract OptionalInt u();

   public static class01191 u(int var0) {
      return new class01160(var0 - 1, true);
   }

   public abstract OptionalInt y();

   public static class01168 y(int var0, int var1) {
      return new class01168(var0, var1);
   }

   public class01191 y(OptionalInt var1) {
      return N(this.L(), var1);
   }

   public static class01191 y(int var0) {
      return new class01160(var0 + 1, false);
   }

   private static OptionalInt N(class04887 var0, int var1, Predicate<class00500> var2, Predicate<class00500> var3, class07218 var4, int var5, class07211 var6) {
      var4.method_10099(var5);

      for (int i = 1; i < var1 && var0.method_16358(var4, var2); i++) {
         var4.N(var6);
      }

      return var0.method_16358(var4, var3) ? OptionalInt.of(var4.method_10264()) : OptionalInt.empty();
   }

   public class01191 N(OptionalInt var1) {
      return N(var1, this.y());
   }

   public static Optional<class01191> N(class04887 var0, class07209 var1, int var2, Predicate<class00500> var3, Predicate<class00500> var4) {
      class07218 class07218 = var1.method_25503();
      if (!var0.method_16358(var1, var3)) {
         return Optional.empty();
      } else {
         int i = var1.method_10264();
         OptionalInt optionalint = N(var0, var2, var3, var4, class07218, i, class07211.field_11036);
         return Optional.of(N(N(var0, var2, var3, var4, class07218, i, class07211.field_11033), optionalint));
      }
   }

   public static class01168 N(int var0, int var1) {
      return new class01168(var0 - 1, var1 + 1);
   }

   public static class01191 N(int var0) {
      return new class01160(var0, false);
   }

   public static class01191 N() {
      return class01179.N;
   }

   public static class01191 N(OptionalInt var0, OptionalInt var1) {
      if (var0.isPresent() && var1.isPresent()) {
         return y(var0.getAsInt(), var1.getAsInt());
      } else if (var0.isPresent()) {
         return L(var0.getAsInt());
      } else {
         return var1.isPresent() ? N(var1.getAsInt()) : N();
      }
   }
}
