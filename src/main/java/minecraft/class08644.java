package minecraft;

public class class08644 extends class06078<class08670> {
   private static final float N = 14.0F;
   private final class01686 y;

   public class08644(class01686 var1) {
      super(var1);
      this.y = var1.y("goggles");
   }

   public void method_2819(class08670 var1) {
      super.method_2819(var1);
      if (var1.y) {
         this.y.i = 0.0F;
         this.y.L = 14.0F;
      } else {
         this.y.i = -0.7854F;
         this.y.L = 9.0F;
      }
   }

   public static class04806 N(boolean var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("harness", class04822.L().N(0, 0).N(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F), class04838.N(0.0F, 24.0F, 0.0F));
      class04839.N("goggles", class04822.L().N(0, 32).N(-8.0F, -2.5F, -2.5F, 16.0F, 5.0F, 5.0F, new class04834(0.15F)), class04838.N(0.0F, 14.0F, -5.5F));
      return class04806.N(class04792, 64, 64).N(class02415.N(4.0F)).N(var0 ? class08684.N : class02415.N);
   }
}
