package minecraft;

public class class00236 extends class05452<class08490> {
   private static final String i = "saddle";
   private static final String R = "left_saddle_mouth";
   private static final String M = "left_saddle_line";
   private static final String B = "right_saddle_mouth";
   private static final String Z = "right_saddle_line";
   private static final String z = "head_saddle";
   private static final String U = "mouth_saddle_wrap";
   private final class01686[] E;

   public class00236(class01686 var1) {
      super(var1);
      class01686 class01686x = this.u.y("left_saddle_line");
      class01686 class01686x = this.u.y("right_saddle_line");
      this.E = new class01686[]{class01686x, class01686x};
   }

   public static class04806 y(boolean var0) {
      class04792 class04792 = var0 ? L(class04834.N) : N(class04834.N);
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.y("body");
      class04839 class04839xx = class04839xx.y("head_parts");
      class04839x.N("saddle", class04822.L().N(26, 0).N(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new class04834(0.5F)), class04838.N);
      class04839xx.N("left_saddle_mouth", class04822.L().N(29, 5).N(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), class04838.N);
      class04839xx.N("right_saddle_mouth", class04822.L().N(29, 5).N(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), class04838.N);
      class04839xx.N("left_saddle_line", class04822.L().N(32, 2).N(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), class04838.y((float) (-Math.PI / 6), 0.0F, 0.0F));
      class04839xx.N("right_saddle_line", class04822.L().N(32, 2).N(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), class04838.y((float) (-Math.PI / 6), 0.0F, 0.0F));
      class04839xx.N("head_saddle", class04822.L().N(1, 1).N(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new class04834(0.22F)), class04838.N);
      class04839xx.N("mouth_saddle_wrap", class04822.L().N(19, 0).N(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new class04834(0.2F)), class04838.N);
      return class04806.N(class04792, 64, 64);
   }

   public static class04806 N(boolean var0) {
      return y(var0).N(var0 ? y : class02415.N);
   }

   @Override
   public void method_2819(class08490 var1) {
      super.method_2819(var1);
      class01686[] aclass01686 = this.E;
      int ix = aclass01686.length;

      for (int j = 0; j < ix; j++) {
         aclass01686[j].U = var1.u;
      }
   }
}
