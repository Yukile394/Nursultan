package minecraft;

class class00721 extends class01989 {
   class00721() {
      super();
   }

   @Override
   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 class04782 = var1.y();
      this.N(true);
      class07211 class07211 = var1.u().L(class06758.y);
      class07209 class07209 = var1.L().method_10093(class07211);
      class00500 class00500 = class04782.method_8320(class07209);
      if (class05989.N(class04782, class07209, class07211)) {
         class04782.method_8501(class07209, class05989.y(class04782, class07209));
         class04782.N(null, class01194.Z, class07209);
      } else if (class05847.T(class00500) || class05440.v(class00500) || class05467.v(class00500)) {
         class04782.method_8501(class07209, class00500.y(class06665.n, true));
         class04782.N(null, class01194.L, class07209);
      } else if (class00500.i() instanceof class00655) {
         if (class00655.N(class04782, class07209)) {
            class04782.method_8650(class07209, false);
         } else {
            this.N(false);
         }
      } else {
         this.N(false);
      }

      if (this.y()) {
         var2.N(1, class04782, null, var0 -> {});
      }

      return var2;
   }
}
