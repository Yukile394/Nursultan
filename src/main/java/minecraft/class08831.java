package minecraft;

public class class08831 extends class06271<class06244> {
   public static final int N = 20;
   public static final int y = 40;
   public static final String L = "flag";
   private static final String u = "pole";
   private static final String i = "bar";

   public class08831(class01686 var1) {
      super(var1, class06851::u);
   }

   public static class04806 N(boolean var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      if (var0) {
         class04839.N("pole", class04822.L().N(44, 0).N(-1.0F, -42.0F, -1.0F, 2.0F, 42.0F, 2.0F), class04838.N);
      }

      class04839.N("bar", class04822.L().N(0, 42).N(-10.0F, var0 ? -44.0F : -20.5F, var0 ? -1.0F : 9.5F, 20.0F, 2.0F, 2.0F), class04838.N);
      return class04806.N(class04792, 64, 64);
   }
}
