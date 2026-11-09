package minecraft;

import java.util.function.Predicate;

public class class05757 {
   private static final int N = 16;

   public class05757() {
      super();
   }

   private static boolean N(class04782 var0, class07209 var1) {
      return !var0.N(class08041.class, new class00734(var1), class07438::method_6113).isEmpty();
   }

   private static boolean N(class04782 var0, class07209 var1, class07438 var2) {
      class00500 class00500 = var0.method_8320(var1);
      return class00500.N(class01210.F) && class00500.L(class07789.L) && !var2.method_6113();
   }

   public static class04142<class07438> N(Predicate<class03556<class05369>> var0, class05378<class06289> var1) {
      return class04137.N_42(var2 -> var2.group(var2.y(var1)).apply(var2, var2x -> (var3, var4, var5) -> {
         class06289 class06289 = var2.y(var2x);
         class07209 class07209 = class06289.y();
         if (var3.method_27983() == class06289.N() && class07209.method_19769(var4.method_73189(), 16.0)) {
            class04782 class04782 = var3.method_8503().N(class06289.N());
            if (class04782 == null || !class04782.method_19494().N(class07209, var0)) {
               var2x.y();
            } else if (N(class04782, class07209, var4)) {
               var2x.y();
               if (!N(class04782, class07209)) {
                  var3.method_19494().y(class07209);
                  var3.method_74535().y(class07209);
               }
            }

            return true;
         } else {
            return false;
         }
      }));
   }
}
