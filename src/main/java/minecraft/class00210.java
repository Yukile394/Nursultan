package minecraft;

public class class00210 extends class03797 {
   private static final String L = "saddle";
   private static final String u = "bridle";
   private static final String i = "reins";
   private final class01686 R = this.y.y("reins");

   public class00210(class01686 var1) {
      super(var1);
   }

   @Override
   public void method_2819(class08787 var1) {
      super.method_2819(var1);
      this.R.U = var1.y;
   }

   public static class04806 N() {
      class04792 class04792 = L();
      class04839 class04839x = class04792.N().y("body");
      class04839 class04839x = class04839x.y("head");
      class04834 class04834 = new class04834(0.05F);
      class04839x.N(
         "saddle",
         class04822.L()
            .N(74, 64)
            .N(-4.5F, -17.0F, -15.5F, 9.0F, 5.0F, 11.0F, class04834)
            .N(92, 114)
            .N(-3.5F, -20.0F, -15.5F, 7.0F, 3.0F, 11.0F, class04834)
            .N(0, 89)
            .N(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F, class04834),
         class04838.N(0.0F, 0.0F, 0.0F)
      );
      class04839x.N(
         "reins",
         class04822.L()
            .N(98, 42)
            .N(3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F)
            .N(84, 57)
            .N(-3.5F, -18.0F, -2.0F, 7.0F, 7.0F, 0.0F)
            .N(98, 42)
            .N(-3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F),
         class04838.N(0.0F, 0.0F, 0.0F)
      );
      class04839x.N(
         "bridle",
         class04822.L()
            .N(60, 87)
            .N(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F, class04834)
            .N(21, 64)
            .N(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F, class04834)
            .N(50, 64)
            .N(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F, class04834)
            .N(74, 70)
            .N(2.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F)
            .N(74, 70)
            .N()
            .N(-3.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F),
         class04838.N(0.0F, 0.0F, 0.0F)
      );
      return class04806.N(class04792, 128, 128);
   }
}
