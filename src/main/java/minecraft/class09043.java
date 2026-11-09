package minecraft;

import org.jspecify.annotations.Nullable;

public class class09043 extends class09005 {
   public class09043() {
      super();
   }

   @Override
   public int N(class03448 var1, class05363 var2, int var3, float var4) {
      return var2.U().N(class00608.R, var4);
   }

   @Override
   public boolean N(@Nullable class04798 var1, class07049 var2) {
      return var1 == class04798.field_27886;
   }

   @Override
   public void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5) {
      float f = var5.N(false);
      var1.N = var2.U().N(class00608.M, f);
      var1.L = var2.U().N(class00608.B, f);
      if (var2.B() instanceof class04453 class04453) {
         var1.L = var1.L * Math.max(0.25F, class04453.j());
      }

      var1.i = var1.L;
      var1.R = var1.L;
   }
}
