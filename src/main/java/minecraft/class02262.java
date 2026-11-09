package minecraft;

public class class02262 extends class06581 implements class02661 {
   public static float N = 1.5F;

   public class02262(class06573 var1) {
      super(var1);
   }

   @Override
   public class02649 N() {
      return class02649.N().N((var0, var1) -> class06758.N(var0, 1.0, class06889.L)).N(6.6666665F).y(1.0F).N(1051).N();
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      if (var1 instanceof class04782 class04782) {
         class08005.N(
            (var2x, var3x, var4x) -> new class04499(var2, var1, var2.method_73189().N(), var2.method_33571().y(), var2.method_73189().L()),
            class04782,
            class06584,
            var2,
            0.0F,
            N,
            1.0F
         );
      }

      var1.method_43128(
         null,
         var2.method_23317(),
         var2.method_23318(),
         var2.method_23321(),
         class04909.Ie,
         class04911.field_15254,
         0.5F,
         0.4F / (var1.method_8409().z() * 0.4F + 0.8F)
      );
      var2.method_7259(class01235.L.y(this));
      class06584.N(1, var2);
      return class07082.N;
   }

   @Override
   public void N(class08005 var1, double var2, double var4, double var6, float var8, float var9) {
   }

   @Override
   public class08005 N(class07299 var1, class00737 var2, class06584 var3, class07211 var4) {
      class06069 class06069 = var1.method_8409();
      double d0 = class06069.N((double)var4.P(), 0.11485000000000001);
      double d1 = class06069.N((double)var4.s(), 0.11485000000000001);
      double d2 = class06069.N((double)var4.T(), 0.11485000000000001);
      class06889 class06889 = new class06889(d0, d1, d2);
      class04499 class04499 = new class04499(var1, var2.N(), var2.y(), var2.L(), class06889);
      class04499.method_18799(class06889);
      return class04499;
   }
}
