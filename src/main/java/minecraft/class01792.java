package minecraft;

public class class01792 extends class04507<class08009, class08486> {
   private static final class01894 N = class01894.y("textures/entity/illager/evoker_fangs.png");
   private final class06373 y;

   public class01792(class04832 var1) {
      super(var1);
      this.y = new class06373(var1.N(class04802.yy));
   }

   public void method_3936(class08486 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.y != 0.0F) {
         var2.N();
         var2.N(class02058.u.N(90.0F - var1.N));
         var2.y(-1.0F, -1.0F, 1.0F);
         var2.N(0.0F, -1.501F, 0.0F);
         var3.N(this.y, var1, var2, this.y.method_23500(N), var1.G, class01384.u, var1.l, null);
         var2.y();
         super.method_3936(var1, var2, var3, var4);
      }
   }

   public void method_62354(class08009 var1, class08486 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.method_36454();
      var2.y = var1.N(var3);
   }

   public class08486 method_55269() {
      return new class08486();
   }
}
