package minecraft;

public class class01767 extends class06078<class08800> {
   private static final int N = 16;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;

   public class01767(class01686 var1) {
      super(var1, class06851::z);
      this.y = var1.y("bone");
      this.u = this.y.y("wind");
      this.L = this.y.y("wind_charge");
   }

   public void method_2819(class08800 var1) {
      super.method_2819(var1);
      this.L.R = -var1.P * 16.0F * (float) (Math.PI / 180.0);
      this.u.R = var1.P * 16.0F * (float) (Math.PI / 180.0);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N().N("bone", class04822.L(), class04838.N(0.0F, 0.0F, 0.0F));
      class04839.N(
         "wind",
         class04822.L()
            .N(15, 20)
            .N(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new class04834(0.0F))
            .N(0, 9)
            .N(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new class04834(0.0F)),
         class04838.N(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      class04839.N("wind_charge", class04822.L().N(0, 0).N(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new class04834(0.0F)), class04838.N(0.0F, 0.0F, 0.0F));
      return class04806.N(class04792, 64, 32);
   }
}
