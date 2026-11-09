package minecraft;

public class class02492 extends class02840<class07155, class08461, class06074> {
   private static final class01894 N = class01894.y("textures/entity/phantom.png");

   public class02492(class04832 var1) {
      super(var1, new class06074(var1.N(class04802.Lb)), 0.75F);
      this.N(new class02432(this));
   }

   public class08461 method_55269() {
      return new class08461();
   }

   public void method_62354(class07155 var1, class08461 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.B() + var2.P;
      var2.y = var1.M();
   }

   protected void y(class08461 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      var2.N(class02058.y.N(var1.h));
   }

   public class01894 N(class08461 var1) {
      return N;
   }

   protected void y(class08461 var1, class01421 var2) {
      float f = 1.0F + 0.15F * var1.y;
      var2.y(f, f, f);
      var2.N(0.0F, 1.3125F, 0.1875F);
   }
}
