package minecraft;

public class class03114 extends class06078<class08798> {
   public static final class02415 N = class02415.N(0.5F);
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;

   public class03114(class01686 var1) {
      super(var1);
      this.y = var1.y("body");
      this.L = this.y.y("tail");
      this.u = this.L.y("tail_fin");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      float f = 18.0F;
      float f1 = -8.0F;
      class04839 class04839x = class04839x.N("body", class04822.L().N(22, 0).N(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), class04838.N(0.0F, 22.0F, -5.0F));
      class04839x.N("back_fin", class04822.L().N(51, 0).N(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), class04838.y((float) (Math.PI / 3), 0.0F, 0.0F));
      class04839x.N(
         "left_fin",
         class04822.L().N(48, 20).N().N(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         class04838.N(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      class04839x.N(
         "right_fin",
         class04822.L().N(48, 20).N(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         class04838.N(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      class04839x.N("tail", class04822.L().N(0, 19).N(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), class04838.N(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F))
         .N("tail_fin", class04822.L().N(19, 20).N(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), class04838.N(0.0F, 0.0F, 9.0F));
      class04839x.N("head", class04822.L().N(0, 0).N(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), class04838.N(0.0F, -4.0F, -3.0F))
         .N("nose", class04822.L().N(0, 13).N(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), class04838.N);
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class08798 var1) {
      super.method_2819(var1);
      this.y.i = var1.h * (float) (Math.PI / 180.0);
      this.y.R = var1.D * (float) (Math.PI / 180.0);
      if (var1.N) {
         this.y.i = this.y.i + (-0.05F - 0.05F * class04995.P(var1.P * 0.3F));
         this.L.i = -0.1F * class04995.P(var1.P * 0.3F);
         this.u.i = -0.2F * class04995.P(var1.P * 0.3F);
      }
   }
}
