package minecraft;

public class class02644 extends class02795<class07872, class08288, class03857> {
   private static final class01894 N = class01894.y("textures/entity/turtle/big_sea_turtle.png");

   public class02644(class04832 var1) {
      super(var1, new class03857(var1.N(class04802.up)), new class03857(var1.N(class04802.uF)), 0.7F);
   }

   public class08288 method_55269() {
      return new class08288();
   }

   public class01894 N(class08288 var1) {
      return N;
   }

   public void method_62354(class07872 var1, class08288 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = !var1.method_5799() && var1.method_24828();
      var2.y = var1.W();
      var2.L = !var1.method_6109() && var1.B();
   }

   protected float u(class08288 var1) {
      float f = super.method_55831(var1);
      return var1.NB ? f * 0.83F : f;
   }
}
