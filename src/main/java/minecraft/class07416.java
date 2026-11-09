package minecraft;

public class class07416 {
   public class07416() {
      super();
   }

   public static boolean N(class07393 var0, class07403 var1) {
      var0.N(() -> var0.M().N(false, var1));
      return true;
   }

   public static boolean N(class07393 var0, class07379 var1, class07403 var2) {
      class00392 class00392 = var1.N().N().orElse(null);
      if (class00392 == null) {
         return false;
      } else {
         if (var1.L().isPresent()) {
            if (var1.L().get().isEmpty()) {
               return false;
            }

            for (class07947 class07947 : var1.L().get()) {
               class04770 class04770;
               if (class07947.N().isPresent()) {
                  class04770 = var0.L().N(class07947.N().get());
               } else {
                  if (!class07947.y().isPresent()) {
                     continue;
                  }

                  class04770 = var0.L().L(class07947.y().get());
               }

               if (class04770 != null) {
                  class04770.method_43502(class00392, var1.y());
               }
            }
         } else {
            var0.M().N(class00392, var1.y(), var2);
         }

         return true;
      }
   }

   public static class07382 N(class07393 var0) {
      return !var0.M().N() ? class07382.y : new class07382(true, class07406.N(var0), class07808.N());
   }

   public static boolean N(class07393 var0, boolean var1, class07403 var2) {
      return var0.M().N(true, var1, true, var2);
   }
}
