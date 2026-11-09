package minecraft;

public class class03038 extends class07206 {
   private final class07206 N = new class07206();
   private final class07078<? extends class00250> u;

   public class03038(class07078<? extends class00250> var1) {
      super();
      this.u = var1;
   }

   @Override
   public class06584 N(class07210 var1, class06584 var2) {
      class07211 class07211 = var1.u().L(class06758.y);
      class04782 class04782 = var1.y();
      class06889 class06889 = var1.N();
      double d0 = 0.5625 + this.u.z() / 2.0;
      double d1 = class06889.N() + class07211.P() * d0;
      double d2 = class06889.y() + class07211.s() * 1.125F;
      double d3 = class06889.L() + class07211.T() * d0;
      class07209 class07209 = var1.L().method_10093(class07211);
      double d4;
      if (class04782.method_8316(class07209).N(class01231.N)) {
         d4 = 1.0;
      } else {
         if (!class04782.method_8320(class07209).P() || !class04782.method_8316(class07209.method_10074()).N(class01231.N)) {
            return this.N.dispense(var1, var2);
         }

         d4 = 0.0;
      }

      class00250 class00250 = this.u.N(class04782, class06113.field_16470);
      if (class00250 != null) {
         class00250.N(d1, d2 + d4, d3);
         class07078.<class00250>N(class04782, var2, null).accept(class00250);
         class00250.method_36456(class07211.U());
         class04782.method_8649(class00250);
         var2.B(1);
      }

      return var2;
   }

   @Override
   protected void N(class07210 var1) {
      var1.y().N(1000, var1.L(), 0);
   }
}
