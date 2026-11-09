package minecraft;

public class class01881 extends class07084 {
   public static final int L = 40;

   public class01881(class01286 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean N(class04782 var1, class07438 var2, int var3) {
      var2.method_64397(var1, var2.method_48923().b(), 1.0F);
      return true;
   }

   @Override
   public boolean N(int var1, int var2) {
      int i = 40 >> var2;
      return i > 0 ? var1 % i == 0 : true;
   }
}
