package minecraft;

public class class07206 implements class00755 {
   private static final int N = 6;

   public class07206() {
      super();
   }

   private void y(class07210 var1, class06584 var2) {
      class06584 class06584 = var1.i().N(var2);
      if (!class06584.R()) {
         class07211 class07211 = var1.u().L(class06758.y);
         N(var1.y(), class06584, 6, class07211, class06758.N(var1));
         y(var1);
         y(var1, class07211);
      }
   }

   private static void y(class07210 var0) {
      var0.y().N(1000, var0.L(), 0);
   }

   private static void y(class07210 var0, class07211 var1) {
      var0.y().N(2000, var0.L(), var1.L());
   }

   protected class06584 N(class07210 var1, class06584 var2, class06584 var3) {
      var2.B(1);
      if (var2.R()) {
         return var3;
      } else {
         this.y(var1, var3);
         return var2;
      }
   }

   protected void N(class07210 var1, class07211 var2) {
      y(var1, var2);
   }

   protected class06584 N(class07210 var1, class06584 var2) {
      class07211 class07211 = var1.u().L(class06758.y);
      class00737 class00737 = class06758.N(var1);
      class06584 class06584 = var2.N(1);
      N(var1.y(), class06584, 6, class07211, class00737);
      return var2;
   }

   public static void N(class07299 var0, class06584 var1, int var2, class07211 var3, class00737 var4) {
      double d0 = var4.N();
      double d1 = var4.y();
      double d2 = var4.L();
      if (var3.z() == class07185.field_11052) {
         d1 -= 0.125;
      } else {
         d1 -= 0.15625;
      }

      class00717 class00717 = new class00717(var0, d0, d1, d2, var1);
      double d3 = var0.field_9229.U() * 0.1 + 0.2;
      class00717.method_18800(
         var0.field_9229.N(var3.P() * d3, 0.0172275 * var2), var0.field_9229.N(0.2, 0.0172275 * var2), var0.field_9229.N(var3.T() * d3, 0.0172275 * var2)
      );
      var0.method_8649(class00717);
   }

   protected void N(class07210 var1) {
      y(var1);
   }

   @Override
   public final class06584 dispense(class07210 var1, class06584 var2) {
      class06584 class06584 = this.N(var1, var2);
      this.N(var1);
      this.N(var1, var1.u().L(class06758.y));
      return class06584;
   }
}
