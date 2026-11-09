package minecraft;

public class class06483 extends class06581 implements class02661 {
   public static float N = 1.5F;

   public class06483(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      var1.method_43128(
         null,
         var2.method_23317(),
         var2.method_23318(),
         var2.method_23321(),
         class04909.YA,
         class04911.field_15254,
         0.5F,
         0.4F / (var1.method_8409().z() * 0.4F + 0.8F)
      );
      if (var1 instanceof class04782 class04782) {
         class08005.N(class08045::new, class04782, class06584, var2, 0.0F, N, 1.0F);
      }

      var2.method_7259(class01235.L.y(this));
      class06584.N(1, var2);
      return class07082.N;
   }

   @Override
   public class08005 N(class07299 var1, class00737 var2, class06584 var3, class07211 var4) {
      return new class08045(var1, var2.N(), var2.y(), var2.L(), var3);
   }
}
