package minecraft;

import java.util.function.BiFunction;

public class class07269 implements class00381<class07280> {
   public static final class02362<class04247, class07269> N = class02362.N(
      class07209.field_48404, class07269::N, class02389.N(class04227.i), class07269::y, class02389.v, class07269::L, class07269::new
   );
   private final class07209 y;
   private final class00404<?> L;
   private final class07001 u;

   public class07001 L() {
      return this.u;
   }

   private class07269(class07209 var1, class00404<?> var2, class07001 var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public class00404<?> y() {
      return this.L;
   }

   public static class07269 N(class00394 var0, BiFunction<class00394, class01042, class07001> var1) {
      class01042 class01042 = var0.G().method_30349();
      return new class07269(var0.d(), var0.O(), (class07001)var1.apply(var0, class01042));
   }

   public class07209 N() {
      return this.y;
   }

   public static class07269 N(class00394 var0) {
      return N(var0, class00394::N);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class07269> method_65080() {
      return class04248.B;
   }
}
