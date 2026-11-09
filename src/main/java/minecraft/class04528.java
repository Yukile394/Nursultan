package minecraft;

import java.util.Set;

public class class04528 extends class06078<class08481> {
   private static final float N = 50.0F;
   private static final float y = -40.0F;
   private static final float L = 0.6F;
   private static final class02415 u = class02415.N(0.6F);
   private static final class02415 i = new class02441(true, 22.0F, 2.0F, 2.65F, 2.5F, 36.0F, Set.of("head", "left_ear", "right_ear", "nose"));
   private static final String R = "left_haunch";
   private static final String M = "right_haunch";
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;

   public class04528(class01686 var1) {
      super(var1);
      this.B = var1.y("left_haunch");
      this.Z = var1.y("right_haunch");
      this.z = var1.y("left_front_leg");
      this.U = var1.y("right_front_leg");
      this.E = var1.y("head");
   }

   public static class04806 N(boolean var0) {
      class04792 class04792 = new class04792();
      class04839 class04839xxx = class04792.N();
      class04839 class04839x = class04839xxx.N(
         "left_haunch", class04822.L().N(30, 15).N(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), class04838.N(3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F)
      );
      class04839 class04839xx = class04839xxx.N(
         "right_haunch", class04822.L().N(16, 15).N(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), class04838.N(-3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F)
      );
      class04839x.N("left_hind_foot", class04822.L().N(26, 24).N(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), class04838.y(0.36651915F, 0.0F, 0.0F));
      class04839xx.N("right_hind_foot", class04822.L().N(8, 24).N(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), class04838.y(0.36651915F, 0.0F, 0.0F));
      class04839xxx.N(
         "body", class04822.L().N(0, 0).N(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), class04838.N(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F)
      );
      class04839xxx.N(
         "left_front_leg", class04822.L().N(8, 15).N(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), class04838.N(3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F)
      );
      class04839xxx.N(
         "right_front_leg", class04822.L().N(0, 15).N(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), class04838.N(-3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F)
      );
      class04839 class04839xxx = class04839xxx.N("head", class04822.L().N(32, 0).N(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), class04838.N(0.0F, 16.0F, -1.0F));
      class04839xxx.N(
         "right_ear", class04822.L().N(52, 0).N(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), class04838.N(0.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 12), 0.0F)
      );
      class04839xxx.N(
         "left_ear", class04822.L().N(58, 0).N(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), class04838.N(0.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F)
      );
      class04839xxx.N("tail", class04822.L().N(52, 6).N(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), class04838.N(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      class04839xxx.N("nose", class04822.L().N(32, 9).N(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), class04838.N);
      return class04806.N(class04792, 64, 32).N(var0 ? i : u);
   }

   public void method_2819(class08481 var1) {
      super.method_2819(var1);
      this.E.i = var1.h * (float) (Math.PI / 180.0);
      this.E.R = var1.D * (float) (Math.PI / 180.0);
      float f = class04995.m(var1.N * (float) Math.PI);
      this.B.i += f * 50.0F * (float) (Math.PI / 180.0);
      this.Z.i += f * 50.0F * (float) (Math.PI / 180.0);
      this.z.i += f * -40.0F * (float) (Math.PI / 180.0);
      this.U.i += f * -40.0F * (float) (Math.PI / 180.0);
   }
}
