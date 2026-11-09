package minecraft;

public interface class04391 {
   String M = "Inventory";

   class07075 n();

   default void N(class08329 var1) {
      this.n().N(var1.N("Inventory", class06584.y));
   }

   static void N(class04782 var0, class07079 var1, class04391 var2, class00717 var3) {
      class06584 class06584x = var3.N();
      if (var1.y(var0, class06584x)) {
         class07075 class07075 = var2.n();
         if (!class07075.L(class06584x)) {
            return;
         }

         var1.method_29499(var3);
         int i = class06584x.c();
         class06584 class06584x = class07075.N(class06584x);
         var1.method_6103(var3, i - class06584x.c());
         if (class06584x.R()) {
            var3.method_31472();
         } else {
            class06584x.i(class06584x.c());
         }
      }
   }

   default void b_(class08299 var1) {
      var1.y("Inventory", class06584.y).ifPresent(var1x -> this.n().N((class08310<class06584>)var1x));
   }
}
