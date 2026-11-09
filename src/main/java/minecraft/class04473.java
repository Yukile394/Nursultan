package minecraft;

import java.util.Optional;

public class class04473 extends class06581 {
   public class04473(class06573 var1) {
      super(var1);
   }

   @Override
   public class06509 y(class06584 var1) {
      return class06509.field_39058;
   }

   private Optional<class03556<class04449>> N(class06584 var1, class01929 var2) {
      class08582 class08582 = var1.method_58694(class02484.NZ);
      return class08582 != null ? class08582.N(var2) : Optional.empty();
   }

   private static void N(class07299 var0, class08036 var1, class04449 var2) {
      class04891 class04891 = var2.N().N();
      float f = var2.L() / 16.0F;
      var0.method_43129(var1, var1, class04891, class04911.field_15247, f, 1.0F);
      var0.method_32888(class01194.Y, var1.method_73189(), class01164.N(var1));
   }

   @Override
   public int N(class06584 var1, class07438 var2) {
      return this.N(var1, var2.method_56673()).map(var0 -> class04995.y(var0.N().y() * 20.0F)).orElse(0);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      Optional<class03556<class04449>> optional = this.N(class06584, var2.method_56673());
      if (optional.isPresent()) {
         class04449 class04449 = optional.get().N();
         var2.method_6019(var3);
         N(var1, var2, class04449);
         var2.method_7357().N(class06584, class04995.y(class04449.y() * 20.0F));
         var2.method_7259(class01235.L.y(this));
         return class07082.L;
      } else {
         return class07082.u;
      }
   }

   public static class06584 N(class06581 var0, class03556<class04449> var1) {
      class06584 class06584 = new class06584(var0);
      class06584.N(class02484.NZ, new class08582(var1));
      return class06584;
   }
}
