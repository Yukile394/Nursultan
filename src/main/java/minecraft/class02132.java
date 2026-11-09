package minecraft;

public class class02132 extends class06078<class08489> {
   public static final String N = "lid";
   private static final String y = "base";
   private final class01686 L;
   private final class01686 u;

   private static class04792 L() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("lid", class04822.L().N(0, 0).N(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), class04838.N(0.0F, 24.0F, 0.0F));
      class04839.N("base", class04822.L().N(0, 28).N(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), class04838.N(0.0F, 24.0F, 0.0F));
      return class04792;
   }

   public class02132(class01686 var1) {
      super(var1, class06851::B);
      this.L = var1.y("lid");
      this.u = var1.y("head");
   }

   public static class04806 y() {
      return class04806.N(L(), 64, 64);
   }

   public static class04806 N() {
      class04792 class04792 = L();
      class04792.N().N("head", class04822.L().N(0, 52).N(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), class04838.N(0.0F, 12.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class08489 var1) {
      super.method_2819(var1);
      float f = (0.5F + var1.L) * (float) Math.PI;
      float f1 = -1.0F + class04995.m(f);
      float f2 = 0.0F;
      if (f > (float) Math.PI) {
         f2 = class04995.m(var1.P * 0.1F) * 0.7F;
      }

      this.L.N(0.0F, 16.0F + class04995.m(f) * 8.0F + f2, 0.0F);
      if (var1.L > 0.3F) {
         this.L.R = f1 * f1 * f1 * f1 * (float) Math.PI * 0.125F;
      } else {
         this.L.R = 0.0F;
      }

      this.u.i = var1.h * (float) (Math.PI / 180.0);
      this.u.R = (var1.u - 180.0F - var1.i) * (float) (Math.PI / 180.0);
   }
}
