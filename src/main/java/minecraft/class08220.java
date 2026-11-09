package minecraft;

import org.jspecify.annotations.Nullable;

public class class08220 extends class06093 {
   @Nullable
   private class07209 N;
   @Nullable
   private class07209 y;

   protected class08220(class07504 var1, boolean var2) {
      super(var1, var2, false);
      this.N(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void N(class07504 var1) {
      class07209 class07209 = var1.L();
      class00500 class00500 = var1.method_73183().method_8320(class07209);
      if (class07760.U(class00500)) {
         this.N = class07209.method_10074();
         class08080 class08080 = class00500.L(((class07760)class00500.i()).L());
         if (class08080.y()) {
            this.y = switch (class08080) {
               case field_12667 -> class07209.method_10078();
               case field_12666 -> class07209.method_10067();
               case field_12670 -> class07209.method_10095();
               case field_12668 -> class07209.method_10072();
               default -> null;
            };
         }
      }
   }

   @Override
   public class00494 N(class00500 var1, class07322 var2, class07209 var3) {
      return !var3.equals(this.N) && !var3.equals(this.y) ? super.N(var1, var2, var3) : class00389.N();
   }
}
