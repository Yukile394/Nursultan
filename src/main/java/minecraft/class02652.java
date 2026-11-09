package minecraft;

public class class02652 extends class02855<class07507, class08472> {
   public class02652(class04832 var1) {
      super(var1, class04802.uq);
   }

   public void method_62354(class07507 var1, class08472 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.q = var1.U() > -1 ? var1.U() - var3 + 1.0F : -1.0F;
   }

   protected void N(class08472 var1, class00500 var2, class01421 var3, class01237 var4, int var5) {
      float f = var1.q;
      if (f > -1.0F && f < 10.0F) {
         float f1 = 1.0F - f / 10.0F;
         f1 = class04995.N(f1, 0.0F, 1.0F);
         f1 *= f1;
         f1 *= f1;
         float f2 = 1.0F + f1 * 0.3F;
         var3.y(f2, f2, f2);
      }

      N(var2, var3, var4, var5, f > -1.0F && (int)f / 5 % 2 == 0, var1.l);
   }

   public static void N(class00500 var0, class01421 var1, class01237 var2, int var3, boolean var4, int var5) {
      int i;
      if (var4) {
         i = class01384.N(class01384.N(1.0F), 10);
      } else {
         i = class01384.u;
      }

      var2.N(var1, var0, var3, i, var5);
   }

   public class08472 method_55269() {
      return new class08472();
   }
}
