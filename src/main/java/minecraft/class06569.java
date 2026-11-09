package minecraft;

public class class06569 extends class06581 {
   public class06569(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584x = var2.method_5998(var3);
      if (var1 instanceof class04782 class04782) {
         class06584x.N(1, var2);
         var2.method_7259(class01235.L.y(this));
         class04782.method_43129(null, var2, class04909.OH, var2.method_5634(), 1.0F, 1.0F);
         class06584 class06584x = class06548.N(class04782, var2.method_31477(), var2.method_31479(), (byte)0, true, false);
         if (class06584x.R()) {
            return class07082.N.N(class06584x);
         } else {
            if (!var2.method_31548().M(class06584x.t())) {
               var2.method_7328(class06584x, false);
            }

            return class07082.N;
         }
      } else {
         return class07082.N;
      }
   }
}
