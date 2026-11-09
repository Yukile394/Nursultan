package minecraft;

public class class05970 {
   public class05970() {
      super();
   }

   public static class06584 N(class06584 var0, class08036 var1, class06584 var2) {
      return N(var0, var1, var2, true);
   }

   public static void N(class00717 var0, Iterable<class06584> var1) {
      class07299 class07299 = var0.method_73183();
      if (!class07299.method_8608()) {
         var1.forEach(var2x -> class07299.method_8649(new class00717(class07299, var0.method_23317(), var0.method_23318(), var0.method_23321(), var2x)));
      }
   }

   public static class06584 N(class06584 var0, class08036 var1, class06584 var2, boolean var3) {
      boolean flag = var1.method_56992();
      if (var3 && flag) {
         if (!var1.method_31548().z(var2)) {
            var1.method_31548().M(var2);
         }

         return var0;
      } else {
         var0.N(1, var1);
         if (var0.R()) {
            return var2;
         } else {
            if (!var1.method_31548().M(var2)) {
               var1.method_7328(var2, false);
            }

            return var0;
         }
      }
   }

   public static class07082 N(class07299 var0, class08036 var1, class07050 var2) {
      var1.method_6019(var2);
      return class07082.L;
   }
}
