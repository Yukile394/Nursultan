package minecraft;

public class class01791 extends class04507<class00701, class08452> {
   public class01791(class04832 var1) {
      super(var1);
      this.field_4673 = 0.5F;
   }

   public void method_62354(class00701 var1, class08452 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class07209 class07209 = class07209.method_49637(var1.method_23317(), var1.method_5829().i, var1.method_23321());
      var2.N.N = var1.N();
      var2.N.y = class07209;
      var2.N.L = var1.L();
      var2.N.u = var1.method_73183().i(class07209);
      var2.N.i = var1.method_73183();
   }

   public class08452 method_55269() {
      return new class08452();
   }

   public void method_3936(class08452 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N.L.b() == class06898.field_11458) {
         var2.N();
         var2.N(-0.5, 0.0, -0.5);
         var3.N(var2, var1.N);
         var2.y();
         super.method_3936(var1, var2, var3, var4);
      }
   }

   public boolean method_3933(class00701 var1, class01383 var2, double var3, double var5, double var7) {
      return !super.method_3933(var1, var2, var3, var5, var7) ? false : var1.L() != var1.method_73183().method_8320(var1.method_24515());
   }
}
