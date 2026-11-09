package minecraft;

public class class05049 extends class01989 {
   public class05049() {
      super();
   }

   private static boolean N(class04782 var0, class07209 var1, class06584 var2) {
      for (class07049 class07049 : var0.N(class07049.class, new class00734(var1), class07042.R)) {
         if (class07049.method_70984(null)) {
            return true;
         }

         if (class07049 instanceof class05310 class05310 && class05310.d()) {
            class05310.N(var0, class04911.field_15245, var2);
            var0.N(null, class01194.H, var1);
            return true;
         }
      }

      return false;
   }

   private static boolean N(class04782 var0, class06584 var1, class07209 var2) {
      class00500 class00500 = var0.method_8320(var2);
      if (class00500.N(class01210.NC, var0x -> var0x.y(class04593.L) && var0x.i() instanceof class04593) && class00500.L(class04593.L) >= 5) {
         var0.method_8396(null, var2, class04909.Lz, class04911.field_15245, 1.0F, 1.0F);
         class04593.N(var0, var1, class00500, var0.method_8321(var2), null, var2);
         ((class04593)class00500.i()).N(var0, class00500, var2, null, class05497.field_20429);
         var0.N(null, class01194.H, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 class04782 = var1.y();
      if (!class04782.method_8608()) {
         class07209 class07209 = var1.L().method_10093(var1.u().L(class06758.y));
         this.N(N(class04782, var2, class07209) || N(class04782, class07209, var2));
         if (this.y()) {
            var2.N(1, class04782, null, var0 -> {});
         }
      }

      return var2;
   }
}
