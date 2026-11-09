package minecraft;

import java.util.function.UnaryOperator;

public class class00243 extends class00275 {
   private final class06078<class08790> N;
   private final class01894 y;

   public class00243(class04832 var1, class01134 var2) {
      super(var1);
      this.y = var2.N().N((UnaryOperator<String>)(var0 -> "textures/entity/" + var0 + ".png"));
      this.N = new class03761(var1.N(var2));
   }

   @Override
   protected class07311 method_64520() {
      return this.N.method_23500(this.y);
   }

   @Override
   protected class06078<class08790> method_64517() {
      return this.N;
   }
}
