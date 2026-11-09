package minecraft;

public class class04814 extends class06078<class08476> {
   private final class01686 N;

   public class04814(class01686 var1) {
      super(var1);
      this.N = var1.y("tail_fin");
   }

   public void method_2819(class08476 var1) {
      super.method_2819(var1);
      float f = var1.NZ ? 1.0F : 1.5F;
      this.N.R = -f * 0.45F * class04995.m(0.6F * var1.P);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      byte b0 = 22;
      class04839.N("body", class04822.L().N(0, 0).N(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), class04838.N(0.0F, 22.0F, 0.0F));
      class04839.N("head", class04822.L().N(11, 0).N(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), class04838.N(0.0F, 22.0F, 0.0F));
      class04839.N("nose", class04822.L().N(0, 0).N(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), class04838.N(0.0F, 22.0F, -3.0F));
      class04839.N(
         "right_fin", class04822.L().N(22, 1).N(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), class04838.N(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4))
      );
      class04839.N(
         "left_fin", class04822.L().N(22, 4).N(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), class04838.N(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4))
      );
      class04839.N("tail_fin", class04822.L().N(22, 3).N(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), class04838.N(0.0F, 22.0F, 7.0F));
      class04839.N("top_fin", class04822.L().N(20, -6).N(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), class04838.N(0.0F, 20.0F, 0.0F));
      return class04806.N(class04792, 32, 32);
   }
}
