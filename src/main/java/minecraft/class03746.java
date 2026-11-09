package minecraft;

import java.util.function.UnaryOperator;

public class class03746 extends class00275 {
   private final class06260 N;
   private final class01894 y;
   private final class06078<class08790> L;

   public class03746(class04832 var1, class01134 var2) {
      super(var1);
      this.y = var2.N().N((UnaryOperator<String>)(var0 -> "textures/entity/" + var0 + ".png"));
      this.N = new class06260(var1.N(class04802.Q), var0 -> class06851.i());
      this.L = new class05437(var1.N(var2));
   }

   @Override
   protected class07311 method_64520() {
      return this.L.method_23500(this.y);
   }

   @Override
   protected class06078<class08790> method_64517() {
      return this.L;
   }

   @Override
   protected void method_64521(class08790 var1, class01421 var2, class01237 var3, int var4) {
      if (!var1.R) {
         var3.N(this.N, class06244.field_17274, var2, this.N.method_23500(this.y), var4, class01384.u, var1.l, null);
      }
   }
}
