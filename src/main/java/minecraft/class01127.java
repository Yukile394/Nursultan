package minecraft;

public class class01127 extends class06271<class01138> {
   private static final String N = "left_pages";
   private static final String y = "right_pages";
   private static final String L = "flip_page1";
   private static final String u = "flip_page2";
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;

   public class01127(class01686 var1) {
      super(var1, class06851::u);
      this.i = var1.y("left_lid");
      this.R = var1.y("right_lid");
      this.M = var1.y("left_pages");
      this.B = var1.y("right_pages");
      this.Z = var1.y("flip_page1");
      this.z = var1.y("flip_page2");
   }

   public void method_2819(class01138 var1) {
      super.method_2819(var1);
      float f = (class04995.m(var1.N() * 0.02F) * 0.1F + 1.25F) * var1.u();
      this.i.R = (float) Math.PI + f;
      this.R.R = -f;
      this.M.R = f;
      this.B.R = -f;
      this.Z.R = f - f * 2.0F * var1.y();
      this.z.R = f - f * 2.0F * var1.L();
      this.M.y = class04995.m(f);
      this.B.y = class04995.m(f);
      this.Z.y = class04995.m(f);
      this.z.y = class04995.m(f);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("left_lid", class04822.L().N(0, 0).N(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), class04838.N(0.0F, 0.0F, -1.0F));
      class04839.N("right_lid", class04822.L().N(16, 0).N(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), class04838.N(0.0F, 0.0F, 1.0F));
      class04839.N("seam", class04822.L().N(12, 0).N(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), class04838.y(0.0F, (float) (Math.PI / 2), 0.0F));
      class04839.N("left_pages", class04822.L().N(0, 10).N(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), class04838.N);
      class04839.N("right_pages", class04822.L().N(12, 10).N(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), class04838.N);
      class04822 class04822 = class04822.L().N(24, 10).N(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      class04839.N("flip_page1", class04822, class04838.N);
      class04839.N("flip_page2", class04822, class04838.N);
      return class04806.N(class04792, 64, 32);
   }
}
