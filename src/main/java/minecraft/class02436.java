package minecraft;

public class class02436 extends class05452<class08784> {
   public static final float i = 0.87F;
   public static final float R = 0.92F;
   private static final class02415 M = var0 -> {
      N(var0.N());
      return var0;
   };
   private final class01686 B = this.L.y("left_chest");
   private final class01686 Z = this.L.y("right_chest");

   public class02436(class01686 var1) {
      super(var1);
   }

   public static class04806 y(float var0) {
      return class04806.N(class05452.L(class04834.N), 64, 64).N(M).N(y).N(class02415.N(var0));
   }

   public void method_2819(class08784 var1) {
      super.method_2819(var1);
      this.B.U = var1.N;
      this.Z.U = var1.N;
   }

   public static class04806 N(float var0, boolean var1) {
      return class00236.y(var1).N(M).N(var1 ? class05452.y : class02415.N).N(class02415.N(var0));
   }

   private static void N(class04839 var0) {
      class04839 class04839x = var0.y("body");
      class04822 class04822x = class04822.L().N(26, 21).N(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      class04839x.N("left_chest", class04822x, class04838.N(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      class04839x.N("right_chest", class04822x, class04838.N(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      class04839 class04839x = var0.y("head_parts").y("head");
      class04822 class04822x = class04822.L().N(0, 12).N(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      class04839x.N("left_ear", class04822x, class04838.N(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      class04839x.N("right_ear", class04822x, class04838.N(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public static class04806 N(float var0) {
      return class04806.N(class05452.N(class04834.N), 64, 64).N(M).N(class02415.N(var0));
   }
}
