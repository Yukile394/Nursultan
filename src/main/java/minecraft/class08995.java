package minecraft;

import org.jspecify.annotations.Nullable;

public class class08995 extends class09005 {
   private static final int N = -6743808;

   public class08995() {
      super();
   }

   @Override
   public boolean N(@Nullable class04798 var1, class07049 var2) {
      return var1 == class04798.field_27885;
   }

   @Override
   public void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5) {
      if (var2.B().method_7325()) {
         var1.N = -8.0F;
         var1.L = var4 * 0.5F;
      } else {
         class07049 class07049 = var2.B();
         if (class07049 instanceof class07438 && ((class07438)class07049).method_6059(class07047.E)) {
            var1.N = 0.0F;
            var1.L = 5.0F;
         } else {
            var1.N = 0.25F;
            var1.L = 1.0F;
         }
      }

      var1.i = var1.L;
      var1.R = var1.L;
   }

   @Override
   public int N(class03448 var1, class05363 var2, int var3, float var4) {
      return -6743808;
   }
}
