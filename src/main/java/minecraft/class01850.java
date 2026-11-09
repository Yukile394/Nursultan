package minecraft;

public class class01850 extends class07084 {
   public class01850(class01286 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean N(class04782 var1, class07438 var2, int var3) {
      if (var2.method_6032() < var2.method_6063()) {
         var2.method_6025(1.0F);
      }

      return true;
   }

   @Override
   public boolean N(int var1, int var2) {
      int i = 50 >> var2;
      return i > 0 ? var1 % i == 0 : true;
   }
}
