package minecraft;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class01520 {
   private static final int N = 10;
   private static final int y = 7;
   private static final int[][] L = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static class04142<class07475> L(float var0) {
      return N(var0, class01520::N, class07049::method_5799);
   }

   public class01520() {
      super();
   }

   public static class04142<class07475> y(float var0) {
      return N(var0, var0x -> N(var0x, 10, 7), var0x -> true);
   }

   public static class04119<class07475> N(float var0, boolean var1) {
      return N(var0, var0x -> class05456.N(var0x, 10, 7), var1 ? var0x -> true : var0x -> !var0x.method_5799());
   }

   private static class04119<class07475> N(float var0, Function<class07475, class06889> var1, Predicate<class07475> var2) {
      return class04137.N_42(var3 -> var3.group(var3.L(class05378.m)).apply(var3, var3x -> (var4, var5, var6) -> {
         if (!var2.test(var5)) {
            return false;
         } else {
            Optional optional = Optional.ofNullable((class06889)var1.apply(var5));
            var3x.N(optional.map(var1xxxx -> new class05352(var1xxxx, var0, 0)));
            return true;
         }
      }));
   }

   public static class04119<class07475> N(float var0) {
      return N(var0, true);
   }

   @Nullable
   private static class06889 N(class07475 var0, int var1, int var2) {
      class06889 class06889 = var0.method_5828(0.0F);
      return class05444.N(var0, var1, var2, -2, class06889.M, class06889.Z, (float) (Math.PI / 2));
   }

   public static class04142<class07475> N(float var0, int var1, int var2) {
      return N(var0, var2x -> class05456.N(var2x, var1, var2), var0x -> true);
   }

   @Nullable
   private static class06889 N(class07475 var0) {
      class06889 class06889x = null;
      class06889 class06889x = null;

      for (int[] aint : L) {
         if (class06889x == null) {
            class06889x = class06293.N(var0, aint[0], aint[1]);
         } else {
            class06889x = var0.method_73189().i(var0.method_73189().N(class06889x).u().u(aint[0], aint[1], aint[0]));
         }

         boolean flag = class05459.N(var0, aint[0]);
         if (class06889x == null || var0.method_73183().method_8316(class07209.method_49638(class06889x)).W() || class05459.N(flag, var0, class06889x)) {
            return class06889x;
         }

         class06889x = class06889x;
      }

      return class06889x;
   }
}
