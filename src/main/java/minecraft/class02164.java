package minecraft;

public class class02164 extends class07084 {
   public class02164(class01286 var1, int var2, class07126 var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean N(int var1, int var2) {
      return var1 == 1;
   }

   @Override
   public boolean N(class04782 var1, class07438 var2, int var3) {
      if (var2 instanceof class04770 class04770 && !var2.method_7325()) {
         class07209 class07209 = class04770.method_58585();
         if (class07209 != null) {
            var1.method_19495().N(class04770, class07209);
            class04770.method_58584();
            return false;
         }
      }

      return true;
   }
}
