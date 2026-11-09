package minecraft;

import java.util.ArrayList;

public class class04069 extends class02149 {
   public static final float N = 10.0F;

   public class04069() {
      super();
   }

   private boolean i(class04782 var1, class07438 var2, class07438 var3) {
      return class04067.N(var3) && class05355.y(var1, var2, var3);
   }

   @Override
   protected boolean u(class04782 var1, class07438 var2, class07438 var3) {
      return !var2.method_18868().N(class05378.S) && this.i(var1, var2, var3) && this.y(var3) && !this.N(var2, var3) ? var3.method_24516(var2, 10.0) : false;
   }

   private boolean y(class07438 var1) {
      return true;
   }

   @Override
   protected class05378<class07438> y() {
      return class05378.Q;
   }

   private boolean N(class07438 var1, class07438 var2) {
      return var1.method_18868().L(class05378.Ny).orElseGet(ArrayList::new).contains(var2.method_5667());
   }
}
