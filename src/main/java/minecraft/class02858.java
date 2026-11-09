package minecraft;

public class class02858 extends class06078<class08800> {
   private final class01686 N;
   private final class01686 y;

   public class02858(class01686 var1) {
      super(var1);
      this.N = var1.y("left_blue_fin");
      this.y = var1.y("right_blue_fin");
   }

   public void method_2819(class08800 var1) {
      super.method_2819(var1);
      this.y.M = -0.2F + 0.4F * class04995.m(var1.P * 0.2F);
      this.N.M = 0.2F - 0.4F * class04995.m(var1.P * 0.2F);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      byte b0 = 22;
      class04839.N("body", class04822.L().N(0, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), class04838.N(0.0F, 22.0F, 0.0F));
      class04839.N("right_blue_fin", class04822.L().N(24, 0).N(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), class04838.N(-4.0F, 15.0F, -2.0F));
      class04839.N("left_blue_fin", class04822.L().N(24, 3).N(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), class04838.N(4.0F, 15.0F, -2.0F));
      class04839.N(
         "top_front_fin", class04822.L().N(15, 17).N(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), class04838.N(0.0F, 14.0F, -4.0F, (float) (Math.PI / 4), 0.0F, 0.0F)
      );
      class04839.N("top_middle_fin", class04822.L().N(14, 16).N(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F), class04838.N(0.0F, 14.0F, 0.0F));
      class04839.N(
         "top_back_fin", class04822.L().N(23, 18).N(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), class04838.N(0.0F, 14.0F, 4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F)
      );
      class04839.N(
         "right_front_fin",
         class04822.L().N(5, 17).N(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F),
         class04838.N(-4.0F, 22.0F, -4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F)
      );
      class04839.N(
         "left_front_fin", class04822.L().N(1, 17).N(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), class04838.N(4.0F, 22.0F, -4.0F, 0.0F, (float) (Math.PI / 4), 0.0F)
      );
      class04839.N(
         "bottom_front_fin",
         class04822.L().N(15, 20).N(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F),
         class04838.N(0.0F, 22.0F, -4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F)
      );
      class04839.N("bottom_middle_fin", class04822.L().N(15, 20).N(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), class04838.N(0.0F, 22.0F, 0.0F));
      class04839.N(
         "bottom_back_fin", class04822.L().N(15, 20).N(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), class04838.N(0.0F, 22.0F, 4.0F, (float) (Math.PI / 4), 0.0F, 0.0F)
      );
      class04839.N(
         "right_back_fin", class04822.L().N(9, 17).N(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), class04838.N(-4.0F, 22.0F, 4.0F, 0.0F, (float) (Math.PI / 4), 0.0F)
      );
      class04839.N(
         "left_back_fin", class04822.L().N(9, 17).N(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), class04838.N(4.0F, 22.0F, 4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F)
      );
      return class04806.N(class04792, 32, 32);
   }
}
