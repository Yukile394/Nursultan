package minecraft;

class class04081 extends class04082 {
   private final class04072[] y;

   public class04081(class04063 var1, class04072... var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public boolean N(class00500 var1) {
      return !var1.N(class00869.bf);
   }

   @Override
   public class04072[] N() {
      return this.y;
   }

   @Override
   public boolean N(class07290 var1, class07209 var2, class07209 var3, class07211 var4, class00500 var5) {
      class00500 class00500 = var1.method_8320(var3.method_10093(var4));
      if (!class00500.N(class00869.bA) && !class00500.N(class00869.bC) && !class00500.N(class00869.LN)) {
         if (var2.method_19455(var3) == 2) {
            class07209 class07209 = var2.method_10093(var4.b());
            if (var1.method_8320(class07209).L(var1, class07209, var4)) {
               return false;
            }
         }

         class04688 class04688 = var5.Y();
         if (!class04688.W() && !class04688.y(class04684.L)) {
            return false;
         } else {
            return var5.N(class01210.Nh) ? false : var5.d() || super.N(var1, var2, var3, var4, var5);
         }
      } else {
         return false;
      }
   }
}
