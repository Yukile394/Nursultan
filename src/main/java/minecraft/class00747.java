package minecraft;

class class00747 extends class01989 {
   class00747() {
      super();
   }

   @Override
   public class06584 N(class07210 var1, class06584 var2) {
      class07209 class07209 = var1.L().method_10093(var1.u().L(class06758.y));

      for (class07877 class07877 : var1.y().N(class07877.class, new class00734(class07209), var0 -> var0.method_5805() && !var0.v())) {
         if (class07877.I()) {
            class04803 class04803 = class07877.method_32318(499);
            if (class04803 != null && class04803.N(var2)) {
               var2.B(1);
               this.N(true);
               return var2;
            }
         }
      }

      return super.N(var1, var2);
   }
}
