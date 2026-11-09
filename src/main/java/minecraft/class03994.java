package minecraft;

import java.util.Set;

public class class03994 extends class06078<class08282> {
   private static final float E = 13.0F;
   private static final float W = 1.0F;
   protected final class01686 N;
   protected final class01686 y;
   protected final class01686 L;
   protected final class01686 u;
   protected final class01686 i;
   protected final class01686 R;
   protected final class01686 M;
   protected final class01686 B;
   protected final class01686 Z;
   protected final class01686 z;
   protected final class01686 U;
   private final class00094 m;
   private final class00094 P;
   private final class00094 s;
   private final class00094 T;
   private final class00094 b;
   private final class00094 j;

   public static class04806 L() {
      return N().N(var0 -> {
         var0.N().y(Set.of("body"));
         return var0;
      });
   }

   public class03994(class01686 var1) {
      super(var1, class06851::M);
      this.N = var1.y("bone");
      this.y = this.N.y("body");
      this.L = this.y.y("head");
      this.z = this.N.y("right_leg");
      this.R = this.N.y("left_leg");
      this.Z = this.y.y("right_arm");
      this.M = this.y.y("left_arm");
      this.u = this.L.y("right_tendril");
      this.i = this.L.y("left_tendril");
      this.U = this.y.y("right_ribcage");
      this.B = this.y.y("left_ribcage");
      this.m = class03991.i.N(var1);
      this.P = class03991.R.N(var1);
      this.s = class03991.y.N(var1);
      this.T = class03991.N.N(var1);
      this.b = class03991.L.N(var1);
      this.j = class03991.u.N(var1);
   }

   public static class04806 i() {
      return N().N(var0 -> {
         var0.N().y(Set.of("body", "head", "left_arm", "right_arm", "left_leg", "right_leg"));
         return var0;
      });
   }

   public static class04806 u() {
      return N().N(var0 -> {
         var0.N().y(Set.of("head", "left_arm", "right_arm", "left_leg", "right_leg"));
         return var0;
      });
   }

   public static class04806 y() {
      return N().N(var0 -> {
         var0.N().y(Set.of("left_tendril", "right_tendril"));
         return var0;
      });
   }

   private void y(float var1, float var2) {
      float f = Math.min(0.5F, 3.0F * var2);
      float f1 = var1 * 0.8662F;
      float f2 = class04995.P(f1);
      float f3 = class04995.m(f1);
      float f4 = Math.min(0.35F, f);
      this.L.M += 0.3F * f3 * f;
      this.L.i = this.L.i + 1.2F * class04995.P(f1 + (float) (Math.PI / 2)) * f4;
      this.y.M = 0.1F * f3 * f;
      this.y.i = 1.0F * f2 * f4;
      this.R.i = 1.0F * f2 * f;
      this.z.i = 1.0F * class04995.P(f1 + (float) Math.PI) * f;
      this.M.i = -(0.8F * f2 * f);
      this.M.M = 0.0F;
      this.Z.i = -(0.8F * f3 * f);
      this.Z.M = 0.0F;
      this.R();
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N().N("bone", class04822.L(), class04838.N(0.0F, 24.0F, 0.0F));
      class04839 class04839x = class04839xx.N("body", class04822.L().N(0, 0).N(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), class04838.N(0.0F, -21.0F, 0.0F));
      class04839x.N("right_ribcage", class04822.L().N(90, 11).N(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), class04838.N(-7.0F, -2.0F, -4.0F));
      class04839x.N("left_ribcage", class04822.L().N(90, 11).N().N(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).N(false), class04838.N(7.0F, -2.0F, -4.0F));
      class04839 class04839xx = class04839x.N("head", class04822.L().N(0, 32).N(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), class04838.N(0.0F, -13.0F, 0.0F));
      class04839xx.N("right_tendril", class04822.L().N(52, 32).N(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), class04838.N(-8.0F, -12.0F, 0.0F));
      class04839xx.N("left_tendril", class04822.L().N(58, 0).N(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), class04838.N(8.0F, -12.0F, 0.0F));
      class04839x.N("right_arm", class04822.L().N(44, 50).N(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), class04838.N(-13.0F, -13.0F, 1.0F));
      class04839x.N("left_arm", class04822.L().N(0, 58).N(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), class04838.N(13.0F, -13.0F, 1.0F));
      class04839xx.N("right_leg", class04822.L().N(76, 48).N(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), class04838.N(-5.9F, -13.0F, 0.0F));
      class04839xx.N("left_leg", class04822.L().N(76, 76).N(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), class04838.N(5.9F, -13.0F, 0.0F));
      return class04806.N(class04792, 128, 128);
   }

   private void N(float var1) {
      float f = var1 * 0.1F;
      float f1 = class04995.P(f);
      float f2 = class04995.m(f);
      this.L.M += 0.06F * f1;
      this.L.i += 0.06F * f2;
      this.y.M += 0.025F * f2;
      this.y.i += 0.025F * f1;
   }

   public void method_2819(class08282 var1) {
      super.method_2819(var1);
      this.N(var1.D, var1.h);
      this.y(var1.NN, var1.Ny);
      this.N(var1.P);
      this.N(var1, var1.P);
      this.m.N(var1.M, var1.P);
      this.P.N(var1.B, var1.P);
      this.s.N(var1.R, var1.P);
      this.T.N(var1.i, var1.P);
      this.b.N(var1.L, var1.P);
      this.j.N(var1.u, var1.P);
   }

   private void N(class08282 var1, float var2) {
      float f = var1.N * (float)(Math.cos(var2 * 2.25) * Math.PI * 0.1F);
      this.i.i = f;
      this.u.i = -f;
   }

   private void N(float var1, float var2) {
      this.L.i = var2 * (float) (Math.PI / 180.0);
      this.L.R = var1 * (float) (Math.PI / 180.0);
   }

   private void R() {
      this.M.R = 0.0F;
      this.M.u = 1.0F;
      this.M.y = 13.0F;
      this.M.L = -13.0F;
      this.Z.R = 0.0F;
      this.Z.u = 1.0F;
      this.Z.y = -13.0F;
      this.Z.L = -13.0F;
   }
}
