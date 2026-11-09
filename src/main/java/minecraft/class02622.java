package minecraft;

public class class02622 extends class04507<class00674, class08243> {
   public class02622(class04832 var1) {
      super(var1);
      this.field_4673 = 0.5F;
   }

   public void method_62354(class00674 var1, class08243 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.y() - var3 + 1.0F;
      var2.y = var1.L();
   }

   public class08243 method_55269() {
      return new class08243();
   }

   public void method_3936(class08243 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.N(0.0F, 0.5F, 0.0F);
      float f = var1.N;
      if (var1.N < 10.0F) {
         float f1 = 1.0F - var1.N / 10.0F;
         f1 = class04995.N(f1, 0.0F, 1.0F);
         f1 *= f1;
         f1 *= f1;
         float f2 = 1.0F + f1 * 0.3F;
         var2.y(f2, f2, f2);
      }

      var2.N(class02058.u.N(-90.0F));
      var2.N(-0.5F, -0.5F, 0.5F);
      var2.N(class02058.u.N(90.0F));
      if (var1.y != null) {
         class02652.N(var1.y, var2, var3, var1.G, (int)f / 5 % 2 == 0, var1.l);
      }

      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }
}
