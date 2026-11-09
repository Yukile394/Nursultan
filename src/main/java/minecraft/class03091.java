package minecraft;

import java.util.Set;

public class class03091 extends class06078<class08285> {
   public static final class02415 N = new class02441(Set.of("head"));
   private static final String y = "real_head";
   private static final String L = "upper_body";
   private static final String u = "real_tail";
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;
   private static final int P = 8;

   public class03091(class01686 var1) {
      super(var1);
      this.i = var1.y("head");
      this.R = this.i.y("real_head");
      this.M = var1.y("body");
      this.m = var1.y("upper_body");
      this.B = var1.y("right_hind_leg");
      this.Z = var1.y("left_hind_leg");
      this.z = var1.y("right_front_leg");
      this.U = var1.y("left_front_leg");
      this.E = var1.y("tail");
      this.W = this.E.y("real_tail");
   }

   public static class04792 N(class04834 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      float f = 13.5F;
      class04839.N("head", class04822.L(), class04838.N(-1.0F, 13.5F, -7.0F))
         .N(
            "real_head",
            class04822.L()
               .N(0, 0)
               .N(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, var0)
               .N(16, 14)
               .N(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, var0)
               .N(16, 14)
               .N(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, var0)
               .N(0, 10)
               .N(-0.5F, -0.001F, -5.0F, 3.0F, 3.0F, 4.0F, var0),
            class04838.N
         );
      class04839.N(
         "body", class04822.L().N(18, 14).N(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, var0), class04838.N(0.0F, 14.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04839.N(
         "upper_body",
         class04822.L().N(21, 0).N(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, var0),
         class04838.N(-1.0F, 14.0F, -3.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04822 class04822x = class04822.L().N(0, 18).N(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, var0);
      class04822 class04822x = class04822.L().N().N(0, 18).N(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, var0);
      class04839.N("right_hind_leg", class04822x, class04838.N(-2.5F, 16.0F, 7.0F));
      class04839.N("left_hind_leg", class04822x, class04838.N(0.5F, 16.0F, 7.0F));
      class04839.N("right_front_leg", class04822x, class04838.N(-2.5F, 16.0F, -4.0F));
      class04839.N("left_front_leg", class04822x, class04838.N(0.5F, 16.0F, -4.0F));
      class04839.N("tail", class04822.L(), class04838.N(-1.0F, 12.0F, 8.0F, (float) (Math.PI / 5), 0.0F, 0.0F))
         .N("real_tail", class04822.L().N(9, 18).N(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, var0), class04838.N);
      return class04792;
   }

   public void method_2819(class08285 var1) {
      super.method_2819(var1);
      float f = var1.NN;
      float f1 = var1.Ny;
      if (var1.N) {
         this.E.R = 0.0F;
      } else {
         this.E.R = class04995.P(f * 0.6662F) * 1.4F * f1;
      }

      if (var1.y) {
         float f2 = var1.Nu;
         this.m.L += 2.0F * f2;
         this.m.i = (float) (Math.PI * 2.0 / 5.0);
         this.m.R = 0.0F;
         this.M.L += 4.0F * f2;
         this.M.u -= 2.0F * f2;
         this.M.i = (float) (Math.PI / 4);
         this.E.L += 9.0F * f2;
         this.E.u -= 2.0F * f2;
         this.B.L += 6.7F * f2;
         this.B.u -= 5.0F * f2;
         this.B.i = (float) (Math.PI * 3.0 / 2.0);
         this.Z.L += 6.7F * f2;
         this.Z.u -= 5.0F * f2;
         this.Z.i = (float) (Math.PI * 3.0 / 2.0);
         this.z.i = 5.811947F;
         this.z.y += 0.01F * f2;
         this.z.L += 1.0F * f2;
         this.U.i = 5.811947F;
         this.U.y -= 0.01F * f2;
         this.U.L += 1.0F * f2;
      } else {
         this.B.i = class04995.P(f * 0.6662F) * 1.4F * f1;
         this.Z.i = class04995.P(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
         this.z.i = class04995.P(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
         this.U.i = class04995.P(f * 0.6662F) * 1.4F * f1;
      }

      this.R.M = var1.u + var1.N(0.0F);
      this.m.M = var1.N(-0.08F);
      this.M.M = var1.N(-0.16F);
      this.W.M = var1.N(-0.2F);
      this.i.i = var1.h * (float) (Math.PI / 180.0);
      this.i.R = var1.D * (float) (Math.PI / 180.0);
      this.E.i = var1.L;
   }
}
