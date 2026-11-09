package minecraft;

public class class04529 extends class06078<class08471> {
   public static final class02415 N = class02415.N(0.5F);
   public static final class02415 y = class02415.N(1.5F);
   private static final String L = "body_front";
   private static final String u = "body_back";
   private static final float i = -7.2F;
   private final class01686 R;

   public class04529(class01686 var1) {
      super(var1);
      this.R = var1.y("body_back");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N();
      byte b0 = 20;
      class04839 class04839x = class04839xx.N("body_front", class04822.L().N(0, 0).N(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), class04838.N(0.0F, 20.0F, -7.2F));
      class04839 class04839xx = class04839xx.N(
         "body_back", class04822.L().N(0, 13).N(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), class04838.N(0.0F, 20.0F, 0.8000002F)
      );
      class04839xx.N("head", class04822.L().N(22, 0).N(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), class04838.N(0.0F, 20.0F, -7.2F));
      class04839xx.N("back_fin", class04822.L().N(20, 10).N(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F), class04838.N(0.0F, 0.0F, 8.0F));
      class04839x.N("top_front_fin", class04822.L().N(2, 1).N(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), class04838.N(0.0F, -4.5F, 5.0F));
      class04839xx.N("top_back_fin", class04822.L().N(0, 2).N(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), class04838.N(0.0F, -4.5F, -1.0F));
      class04839xx.N(
         "right_fin", class04822.L().N(-4, 0).N(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), class04838.N(-1.5F, 21.5F, -7.2F, 0.0F, 0.0F, (float) (-Math.PI / 4))
      );
      class04839xx.N(
         "left_fin", class04822.L().N(0, 0).N(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), class04838.N(1.5F, 21.5F, -7.2F, 0.0F, 0.0F, (float) (Math.PI / 4))
      );
      return class04806.N(class04792, 32, 32);
   }

   public void method_2819(class08471 var1) {
      super.method_2819(var1);
      float f = 1.0F;
      float f1 = 1.0F;
      if (!var1.NZ) {
         f = 1.3F;
         f1 = 1.7F;
      }

      this.R.R = -f * 0.25F * class04995.m(f1 * 0.6F * var1.P);
   }
}
