package minecraft;

public class class02157 extends class01097 {
   private final class01686 N;
   private final class01686 y;

   public class02157(class01686 var1) {
      super(var1);
      this.N = var1.y("head");
      this.y = this.N.y("jaw");
   }

   public void method_2819(class01112 var1) {
      super.method_2819(var1);
      this.y.i = (float)(Math.sin(var1.N * (float) Math.PI * 0.2F) + 1.0) * 0.2F;
      this.N.R = var1.y * (float) (Math.PI / 180.0);
      this.N.i = var1.L * (float) (Math.PI / 180.0);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      float f = -16.0F;
      class04839.N(
            "head",
            class04822.L()
               .N("upper_lip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
               .N("upper_head", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
               .N(true)
               .N("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
               .N("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
               .N(false)
               .N("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
               .N("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
            class04838.N(0.0F, -7.986666F, 0.0F).y(0.75F)
         )
         .N("jaw", class04822.L().N(176, 65).N("jaw", -6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F), class04838.N(0.0F, 4.0F, -8.0F));
      return class04806.N(class04792, 256, 256);
   }
}
