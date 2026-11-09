package minecraft;

import java.util.Set;

public abstract class class05452<T extends class08490> extends class06078<T> {
   private static final float i = 2.1816616F;
   private static final float R = (float) (Math.PI / 3);
   private static final float M = (float) (Math.PI / 4);
   private static final float B = (float) (Math.PI / 6);
   private static final float Z = (float) (Math.PI / 12);
   protected static final String N = "head_parts";
   public static final class02415 y = new class02441(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F, Set.of("head_parts"));
   protected final class01686 L;
   protected final class01686 u;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;

   public static class04792 L(class04834 var0) {
      class04792 class04792 = N(var0);
      class04839 class04839 = class04792.N();
      class04834 class04834 = var0.N(0.0F, 5.5F, 0.0F);
      class04839.N("left_hind_leg", class04822.L().N(48, 21).N().N(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, class04834), class04838.N(4.0F, 14.0F, 7.0F));
      class04839.N("right_hind_leg", class04822.L().N(48, 21).N(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, class04834), class04838.N(-4.0F, 14.0F, 7.0F));
      class04839.N("left_front_leg", class04822.L().N(48, 21).N().N(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, class04834), class04838.N(4.0F, 14.0F, -10.0F));
      class04839.N("right_front_leg", class04822.L().N(48, 21).N(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, class04834), class04838.N(-4.0F, 14.0F, -10.0F));
      return class04792;
   }

   public class05452(class01686 var1) {
      super(var1);
      this.L = var1.y("body");
      this.u = var1.y("head_parts");
      this.z = var1.y("right_hind_leg");
      this.U = var1.y("left_hind_leg");
      this.E = var1.y("right_front_leg");
      this.W = var1.y("left_front_leg");
      this.m = this.L.y("tail");
   }

   public static class04792 y(class04834 var0) {
      return y.apply(L(var0));
   }

   public static class04792 N(class04834 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839xxx = class04792.N();
      class04839 class04839x = class04839xxx.N(
         "body", class04822.L().N(0, 32).N(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new class04834(0.05F)), class04838.N(0.0F, 11.0F, 5.0F)
      );
      class04839 class04839xx = class04839xxx.N(
         "head_parts", class04822.L().N(0, 35).N(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), class04838.N(0.0F, 4.0F, -12.0F, (float) (Math.PI / 6), 0.0F, 0.0F)
      );
      class04839 class04839xxx = class04839xx.N("head", class04822.L().N(0, 13).N(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, var0), class04838.N);
      class04839xx.N("mane", class04822.L().N(56, 36).N(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, var0), class04838.N);
      class04839xx.N("upper_mouth", class04822.L().N(0, 25).N(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, var0), class04838.N);
      class04839xxx.N("left_hind_leg", class04822.L().N(48, 21).N().N(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var0), class04838.N(4.0F, 14.0F, 7.0F));
      class04839xxx.N("right_hind_leg", class04822.L().N(48, 21).N(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var0), class04838.N(-4.0F, 14.0F, 7.0F));
      class04839xxx.N("left_front_leg", class04822.L().N(48, 21).N().N(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var0), class04838.N(4.0F, 14.0F, -10.0F));
      class04839xxx.N("right_front_leg", class04822.L().N(48, 21).N(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var0), class04838.N(-4.0F, 14.0F, -10.0F));
      class04839x.N(
         "tail", class04822.L().N(42, 36).N(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, var0), class04838.N(0.0F, -5.0F, 2.0F, (float) (Math.PI / 6), 0.0F, 0.0F)
      );
      class04839xxx.N("left_ear", class04822.L().N(19, 16).N(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new class04834(-0.001F)), class04838.N);
      class04839xxx.N("right_ear", class04822.L().N(19, 16).N(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new class04834(-0.001F)), class04838.N);
      return class04792;
   }

   public void method_2819(T var1) {
      super.method_2819((T)var1);
      float f = class04995.N(var1.D, -20.0F, 20.0F);
      float f1 = var1.h * (float) (Math.PI / 180.0);
      float f2 = var1.Ny;
      float f3 = var1.NN;
      if (f2 > 0.2F) {
         f1 += class04995.P(f3 * 0.8F) * 0.15F * f2;
      }

      float f4 = var1.R;
      float f5 = var1.M;
      float f6 = 1.0F - f5;
      float f7 = var1.B;
      boolean flag = var1.i;
      this.u.i = (float) (Math.PI / 6) + f1;
      this.u.R = f * (float) (Math.PI / 180.0);
      float f8 = class04995.P((var1.NZ ? 0.2F : 1.0F) * f3 * 0.6662F + (float) Math.PI);
      float f9 = f8 * 0.8F * f2;
      float f10 = (1.0F - Math.max(f5, f4)) * ((float) (Math.PI / 6) + f1 + f7 * class04995.m(var1.P) * 0.05F);
      this.u.i = f5 * ((float) (Math.PI / 12) + f1) + f4 * (2.1816616F + class04995.m(var1.P) * 0.05F) + f10;
      this.u.R = f5 * f * (float) (Math.PI / 180.0) + (1.0F - Math.max(f5, f4)) * this.u.R;
      float f11 = var1.Nu;
      this.u.L = this.u.L + class04995.B(f4, class04995.B(f5, 0.0F, -8.0F * f11), 7.0F * f11);
      this.u.u = class04995.B(f5, this.u.u, -4.0F * f11);
      this.L.i = f5 * (float) (-Math.PI / 4) + f6 * this.L.i;
      float f12 = (float) (Math.PI / 12) * f5;
      float f13 = class04995.P(var1.P * 0.6F + (float) Math.PI);
      this.W.L -= 12.0F * f11 * f5;
      this.W.u += 4.0F * f11 * f5;
      this.E.L = this.W.L;
      this.E.u = this.W.u;
      float f14 = ((float) (-Math.PI / 3) + f13) * f5 + f9 * f6;
      float f15 = ((float) (-Math.PI / 3) - f13) * f5 - f9 * f6;
      this.U.i = f12 - f8 * 0.5F * f2 * f6;
      this.z.i = f12 + f8 * 0.5F * f2 * f6;
      this.W.i = f14;
      this.E.i = f15;
      this.m.i = (float) (Math.PI / 6) + f2 * 0.75F;
      this.m.L += f2 * f11;
      this.m.u += f2 * 2.0F * f11;
      if (flag) {
         this.m.R = class04995.P(var1.P * 0.7F);
      } else {
         this.m.R = 0.0F;
      }
   }
}
