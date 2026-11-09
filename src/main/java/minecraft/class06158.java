package minecraft;

public class class06158 extends class02840<class06163, class08257, class03094> {
   private static final class01894 N = class01894.y("textures/entity/wandering_trader.png");

   public class06158(class04832 var1) {
      super(var1, new class03094(var1.N(class04802.iN)), 0.5F);
      this.N(new class02245<>(this, var1.R(), var1.U()));
      this.N(new class06174<>(this));
   }

   public class08257 method_55269() {
      return new class08257();
   }

   public void method_62354(class06163 var1, class08257 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08837.N(var1, var2, this.L);
      var2.N = var1.I() > 0;
   }

   public class01894 N(class08257 var1) {
      return N;
   }
}
