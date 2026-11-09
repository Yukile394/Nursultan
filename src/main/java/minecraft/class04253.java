package minecraft;

public class class04253 extends class02840<class07153, class08440, class01156> {
   private static final class01894 N = class01894.y("textures/entity/illager/ravager.png");

   public class04253(class04832 var1) {
      super(var1, new class01156(var1.N(class04802.Lf)), 1.1F);
   }

   public class08440 method_55269() {
      return new class08440();
   }

   public void method_62354(class07153 var1, class08440 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.W() > 0.0F ? var1.W() - var3 : 0.0F;
      var2.y = var1.B() > 0.0F ? var1.B() - var3 : 0.0F;
      if (var1.m() > 0) {
         var2.L = (20 - var1.m() + var3) / 20.0F;
      } else {
         var2.L = 0.0F;
      }
   }

   public class01894 N(class08440 var1) {
      return N;
   }
}
