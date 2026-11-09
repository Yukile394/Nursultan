package minecraft;

public class class02143 extends class06078<class08458> {
   private static final String N = "main";
   private final class01686 y;

   public class02143(class01686 var1) {
      super(var1);
      this.y = var1.y("main");
   }

   public void method_2819(class08458 var1) {
      super.method_2819(var1);
      this.y.R = var1.y * (float) (Math.PI / 180.0);
      this.y.i = var1.N * (float) (Math.PI / 180.0);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04792.N()
         .N(
            "main",
            class04822.L()
               .N(0, 0)
               .N(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
               .N(0, 10)
               .N(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
               .N(20, 0)
               .N(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
            class04838.N
         );
      return class04806.N(class04792, 64, 32);
   }
}
