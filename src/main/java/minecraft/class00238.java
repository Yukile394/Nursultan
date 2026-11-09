package minecraft;

public class class00238 extends class07206 {
   private final class07206 N = new class07206();
   private final class07078<? extends class07504> u;

   public class00238(class07078<? extends class07504> var1) {
      super();
      this.u = var1;
   }

   @Override
   protected void N(class07210 var1) {
      var1.y().N(1000, var1.L(), 0);
   }

   private static class08080 N(class00500 var0) {
      return var0.i() instanceof class07760 class07760 ? var0.L(class07760.L()) : class08080.field_12665;
   }

   @Override
   public class06584 N(class07210 var1, class06584 var2) {
      class07211 class07211 = var1.u().L(class06758.y);
      class04782 class04782 = var1.y();
      class06889 class06889x = var1.N();
      double d0 = class06889x.N() + class07211.P() * 1.125;
      double d1 = Math.floor(class06889x.y()) + class07211.s();
      double d2 = class06889x.L() + class07211.T() * 1.125;
      class07209 class07209 = var1.L().method_10093(class07211);
      class00500 class00500x = class04782.method_8320(class07209);
      double d3;
      if (class00500x.N(class01210.e)) {
         if (N(class00500x).y()) {
            d3 = 0.6;
         } else {
            d3 = 0.1;
         }
      } else {
         if (!class00500x.P()) {
            return this.N.dispense(var1, var2);
         }

         class00500 class00500x = class04782.method_8320(class07209.method_10074());
         if (!class00500x.N(class01210.e)) {
            return this.N.dispense(var1, var2);
         }

         if (class07211 != class07211.field_11033 && N(class00500x).y()) {
            d3 = -0.4;
         } else {
            d3 = -0.9;
         }
      }

      class06889 class06889x = new class06889(d0, d1 + d3, d2);
      class07504 class07504 = class07504.N(class04782, class06889x.M, class06889x.B, class06889x.Z, this.u, class06113.field_16470, var2, null);
      if (class07504 != null) {
         class04782.method_8649(class07504);
         var2.B(1);
      }

      return var2;
   }
}
