package minecraft;

public class class06594 extends class06581 {
   public class06594(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209x = var1.method_8037();
      class00500 class00500 = class07299.method_8320(class07209x);
      if (!class00500.N(class00869.LV) && !class00500.N(class00869.q)) {
         return class07082.u;
      } else {
         class07209 class07209x = class07209x.method_10084();
         if (!class07299.R(class07209x)) {
            return class07082.u;
         } else {
            double d0 = class07209x.method_10263();
            double d1 = class07209x.method_10264();
            double d2 = class07209x.method_10260();
            if (!class07299.N_70(null, new class00734(d0, d1, d2, d0 + 1.0, d1 + 2.0, d2 + 1.0)).isEmpty()) {
               return class07082.u;
            } else {
               if (class07299 instanceof class04782) {
                  class00676 class00676 = new class00676(class07299, d0 + 0.5, d1, d2 + 0.5);
                  class00676.N(false);
                  class07299.method_8649(class00676);
                  class07299.N(var1.method_8036(), class01194.v, class07209x);
                  class07856 class07856 = ((class04782)class07299).method_29198();
                  if (class07856 != null) {
                     class07856.M();
                  }
               }

               var1.method_8041().B(1);
               return class07082.N;
            }
         }
      }
   }
}
