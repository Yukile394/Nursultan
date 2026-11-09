package minecraft;

public class class03853 extends class06078<class08266> {
   private final class01686 N;

   public class03853(class01686 var1) {
      super(var1);
      this.N = var1.y("tail");
   }

   public void method_2819(class08266 var1) {
      super.method_2819(var1);
      float f = var1.NZ ? 1.0F : 1.5F;
      this.N.R = -f * 0.45F * class04995.m(0.6F * var1.P);
   }

   public static class04806 N(class04834 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      byte b0 = 22;
      class04839.N("body", class04822.L().N(0, 0).N(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, var0), class04838.N(0.0F, 22.0F, 0.0F));
      class04839.N("tail", class04822.L().N(22, -6).N(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, var0), class04838.N(0.0F, 22.0F, 3.0F));
      class04839.N(
         "right_fin",
         class04822.L().N(2, 16).N(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var0),
         class04838.N(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F)
      );
      class04839.N(
         "left_fin", class04822.L().N(2, 12).N(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var0), class04838.N(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F)
      );
      class04839.N("top_fin", class04822.L().N(10, -5).N(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, var0), class04838.N(0.0F, 20.5F, -3.0F));
      return class04806.N(class04792, 32, 32);
   }
}
