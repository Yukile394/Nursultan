package minecraft;

public class class02914 extends class02840<class08047, class08260, class03093> {
   private static final class01894 N = class01894.y("textures/entity/witch.png");

   public class02914(class04832 var1) {
      super(var1, new class03093(var1.N(class04802.iz)), 0.5F);
      this.N(new class08480(this));
   }

   public class08260 method_55269() {
      return new class08260();
   }

   public void method_62354(class08047 var1, class08260 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08837.N(var1, var2, this.L);
      var2.N = var1.method_5628();
      class06584 class06584 = var1.method_6047();
      var2.y = !class06584.R();
      var2.L = class06584.N(class06570.ns);
   }

   public class01894 N(class08260 var1) {
      return N;
   }
}
