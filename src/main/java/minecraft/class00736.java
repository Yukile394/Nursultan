package minecraft;

class class00736 extends class01989 {
   class00736() {
      super();
   }

   private class06584 y(class07210 var1, class06584 var2, class06584 var3) {
      var1.y().N(null, class01194.d, var1.L());
      return this.N(var1, var2, var3);
   }

   @Override
   public class06584 N(class07210 var1, class06584 var2) {
      this.N(false);
      class04782 class04782 = var1.y();
      class07209 class07209 = var1.L().method_10093(var1.u().L(class06758.y));
      class00500 class00500 = class04782.method_8320(class07209);
      if (class00500.N(class01210.NC, var0 -> var0.y(class04593.L) && var0.i() instanceof class04593) && class00500.L(class04593.L) >= 5) {
         ((class04593)class00500.i()).N(class04782, class00500, class07209, null, class05497.field_20429);
         this.N(true);
         return this.y(var1, var2, new class06584(class06570.wZ));
      } else if (class04782.method_8316(class07209).N(class01231.N)) {
         this.N(true);
         return this.y(var1, var2, class06517.N(class06570.ns, class06506.N));
      } else {
         return super.N(var1, var2);
      }
   }
}
