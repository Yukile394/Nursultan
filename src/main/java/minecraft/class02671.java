package minecraft;

public class class02671 extends class06078<class08800> {
   private final class01686 N;
   private final class01686 y;

   public class02671(class01686 var1) {
      super(var1);
      this.N = var1.y("left_fin");
      this.y = var1.y("right_fin");
   }

   public void method_2819(class08800 var1) {
      super.method_2819(var1);
      this.y.M = -0.2F + 0.4F * class04995.m(var1.P * 0.2F);
      this.N.M = 0.2F - 0.4F * class04995.m(var1.P * 0.2F);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      byte b0 = 23;
      class04839.N("body", class04822.L().N(0, 27).N(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), class04838.N(0.0F, 23.0F, 0.0F));
      class04839.N("right_eye", class04822.L().N(24, 6).N(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), class04838.N(0.0F, 20.0F, 0.0F));
      class04839.N("left_eye", class04822.L().N(28, 6).N(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), class04838.N(0.0F, 20.0F, 0.0F));
      class04839.N("back_fin", class04822.L().N(-3, 0).N(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), class04838.N(0.0F, 22.0F, 1.5F));
      class04839.N("right_fin", class04822.L().N(25, 0).N(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), class04838.N(-1.5F, 22.0F, -1.5F));
      class04839.N("left_fin", class04822.L().N(25, 0).N(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), class04838.N(1.5F, 22.0F, -1.5F));
      return class04806.N(class04792, 32, 32);
   }
}
