package minecraft;

import java.util.function.Supplier;

class class00128 implements class00127<class09035> {
   class00128() {
      super();
   }

   public void N(class09035 var1, class05096 var2, class00129 var3) {
      class01590 class01590 = var2.method_64506();
      Object object;
      Supplier supplier;
      if (var1.M().isPresent()) {
         class00102 class00102 = var1.M().get();
         int i = class00102.y().orElseGet(() -> {
            int ix = class00102.N().orElse(4);
            return Math.min(9 * ix + 8, 512);
         });
         class03943 class03943 = class03943.L().N(class01590, var1.y(), i, class05220.N);
         class03943.N(var1.R());
         class00102.N().ifPresent(class03943::y);
         class03943.N(var1.i());
         object = class03943;
         supplier = class03943::y;
      } else {
         class04927 class04927 = new class04927(class01590, var1.y(), 20, var1.L());
         class04927.method_1880(var1.R());
         class04927.method_1852(var1.i());
         object = class04927;
         supplier = class04927::method_1882;
      }

      Object object1 = var1.u() ? class03725.N(class01590, (class02102)object, var1.L()) : object;
      var3.accept((class02102)object1, new class00096(this, supplier));
   }
}
