package minecraft;

import org.jspecify.annotations.Nullable;

public interface class06092 {
   boolean L();

   default boolean i() {
      return false;
   }

   boolean u();

   static class06092 y() {
      return class06123.y;
   }

   boolean N(class06581 var1);

   static class06092 N() {
      return class06123.N;
   }

   boolean N(class04688 var1, class04688 var2);

   class00494 N(class00500 var1, class07322 var2, class07209 var3);

   static class06092 N(class07049 var0) {
      return (class06092)(switch (var0) {
         case class07504 class07504 -> class07504.N(class07504.method_73183())
            ? new class08220(class07504, false)
            : new class06093((class07049)var0, false, false);
         default -> new class06093((class07049)var0, false, false);
      });
   }

   static class06092 N(class07049 var0, boolean var1) {
      return new class06093(var0, var1, false);
   }

   static class06092 N(@Nullable class08036 var0) {
      return new class06093(
         var0 != null ? var0.method_21752() : false,
         true,
         var0 != null ? var0.method_23318() : -Double.MAX_VALUE,
         var0 instanceof class07438 ? var0.method_6047() : class06584.E,
         false,
         var0
      );
   }

   static class06092 N(@Nullable class07049 var0, double var1) {
      return new class06093(
         var0 != null ? var0.method_21752() : false,
         true,
         var0 != null ? var1 : -Double.MAX_VALUE,
         var0 instanceof class07438 ? ((class07438)var0).method_6047() : class06584.E,
         false,
         var0
      );
   }

   boolean N(class00494 var1, class07209 var2, boolean var3);
}
