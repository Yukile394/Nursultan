package minecraft;

public class class02155 extends class06078<class08805> {
   private static final int N = 5;
   private static final int y = 12;
   private final class01686 L;
   private final class01686[] u = new class01686[5];
   private final class01686[] i = new class01686[12];
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;
   private final class01686 P;
   private final class01686 s;
   private final class01686 T;
   private final class01686 b;
   private final class01686 j;
   private final class01686 v;
   private final class01686 n;
   private final class01686 t;
   private final class01686 G;

   public class02155(class01686 var1) {
      super(var1);
      this.L = var1.y("head");
      this.R = this.L.y("jaw");

      for (int ix = 0; ix < this.u.length; ix++) {
         this.u[ix] = var1.y(N(ix));
      }

      for (int jx = 0; jx < this.i.length; jx++) {
         this.i[jx] = var1.y(y(jx));
      }

      this.M = var1.y("body");
      this.B = this.M.y("left_wing");
      this.Z = this.B.y("left_wing_tip");
      this.z = this.M.y("left_front_leg");
      this.U = this.z.y("left_front_leg_tip");
      this.E = this.U.y("left_front_foot");
      this.W = this.M.y("left_hind_leg");
      this.m = this.W.y("left_hind_leg_tip");
      this.P = this.m.y("left_hind_foot");
      this.s = this.M.y("right_wing");
      this.T = this.s.y("right_wing_tip");
      this.b = this.M.y("right_front_leg");
      this.j = this.b.y("right_front_leg_tip");
      this.v = this.j.y("right_front_foot");
      this.n = this.M.y("right_hind_leg");
      this.t = this.n.y("right_hind_leg_tip");
      this.G = this.t.y("right_hind_foot");
   }

   private static String y(int var0) {
      return "tail" + var0;
   }

   public void method_2819(class08805 var1) {
      super.method_2819(var1);
      float f = var1.N * (float) (Math.PI * 2);
      this.R.i = (class04995.m(f) + 1.0F) * 0.2F;
      float f1 = class04995.m(f - 1.0F) + 1.0F;
      f1 = (f1 * f1 + f1 * 2.0F) * 0.05F;
      this.field_54014.L = (f1 - 2.0F) * 16.0F;
      this.field_54014.u = -48.0F;
      this.field_54014.i = f1 * 2.0F * (float) (Math.PI / 180.0);
      float f2 = this.u[0].y;
      float f3 = this.u[0].L;
      float f4 = this.u[0].u;
      float f5 = 1.5F;
      class02753 class02753xxx = var1.N(6);
      float f6 = class04995.R(var1.N(5).y() - var1.N(10).y());
      float f7 = class04995.R(var1.N(5).y() + f6 / 2.0F);

      for (int ix = 0; ix < 5; ix++) {
         class01686 class01686x = this.u[ix];
         class02753 class02753x = var1.N(5 - ix);
         float f8 = class04995.P(ix * 0.45F + f) * 0.15F;
         class01686x.R = class04995.R(class02753x.y() - class02753xxx.y()) * (float) (Math.PI / 180.0) * 1.5F;
         class01686x.i = f8 + var1.N(ix, class02753xxx, class02753x) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         class01686x.M = -class04995.R(class02753x.y() - f7) * (float) (Math.PI / 180.0) * 1.5F;
         class01686x.L = f3;
         class01686x.u = f4;
         class01686x.y = f2;
         f2 -= class04995.m(class01686x.R) * class04995.P(class01686x.i) * 10.0F;
         f3 += class04995.m(class01686x.i) * 10.0F;
         f4 -= class04995.P(class01686x.R) * class04995.P(class01686x.i) * 10.0F;
      }

      this.L.L = f3;
      this.L.u = f4;
      this.L.y = f2;
      class02753 class02753x = var1.N(0);
      this.L.R = class04995.R(class02753x.y() - class02753xxx.y()) * (float) (Math.PI / 180.0);
      this.L.i = class04995.R(var1.N(6, class02753xxx, class02753x)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
      this.L.M = -class04995.R(class02753x.y() - f7) * (float) (Math.PI / 180.0);
      this.M.M = -f6 * 1.5F * (float) (Math.PI / 180.0);
      this.B.i = 0.125F - class04995.P(f) * 0.2F;
      this.B.R = -0.25F;
      this.B.M = -(class04995.m(f) + 0.125F) * 0.8F;
      this.Z.M = (class04995.m(f + 2.0F) + 0.5F) * 0.75F;
      this.s.i = this.B.i;
      this.s.R = -this.B.R;
      this.s.M = -this.B.M;
      this.T.M = -this.Z.M;
      this.N(f1, this.z, this.U, this.E, this.W, this.m, this.P);
      this.N(f1, this.b, this.j, this.v, this.n, this.t, this.G);
      float f9 = 0.0F;
      f3 = this.i[0].L;
      f4 = this.i[0].u;
      f2 = this.i[0].y;
      class02753xxx = var1.N(11);

      for (int jx = 0; jx < 12; jx++) {
         class02753 class02753xx = var1.N(12 + jx);
         f9 += class04995.m(jx * 0.45F + f) * 0.05F;
         class01686 class01686 = this.i[jx];
         class01686.R = (class04995.R(class02753xx.y() - class02753xxx.y()) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
         class01686.i = f9 + (float)(class02753xx.N() - class02753xxx.N()) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         class01686.M = class04995.R(class02753xx.y() - f7) * (float) (Math.PI / 180.0) * 1.5F;
         class01686.L = f3;
         class01686.u = f4;
         class01686.y = f2;
         f3 += class04995.m(class01686.i) * 10.0F;
         f4 -= class04995.P(class01686.R) * class04995.P(class01686.i) * 10.0F;
         f2 -= class04995.m(class01686.R) * class04995.P(class01686.i) * 10.0F;
      }
   }

   private void N(float var1, class01686 var2, class01686 var3, class01686 var4, class01686 var5, class01686 var6, class01686 var7) {
      var5.i = 1.0F + var1 * 0.1F;
      var6.i = 0.5F + var1 * 0.1F;
      var7.i = 0.75F + var1 * 0.1F;
      var2.i = 1.3F + var1 * 0.1F;
      var3.i = -0.5F - var1 * 0.1F;
      var4.i = 0.75F + var1 * 0.1F;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      float f = -16.0F;
      class04839x.N(
            "head",
            class04822.L()
               .N("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
               .N("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
               .N()
               .N("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
               .N("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
               .N()
               .N("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
               .N("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
            class04838.N(0.0F, 20.0F, -62.0F)
         )
         .N("jaw", class04822.L().N("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), class04838.N(0.0F, 4.0F, -8.0F));
      class04822 class04822 = class04822.L().N("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).N("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0);

      for (int ix = 0; ix < 5; ix++) {
         class04839x.N(N(ix), class04822, class04838.N(0.0F, 20.0F, -12.0F - ix * 10.0F));
      }

      for (int jx = 0; jx < 12; jx++) {
         class04839x.N(y(jx), class04822, class04838.N(0.0F, 10.0F, 60.0F + jx * 10.0F));
      }

      class04839 class04839x = class04839x.N(
         "body",
         class04822.L()
            .N("body", -12.0F, 1.0F, -16.0F, 24, 24, 64, 0, 0)
            .N("scale", -1.0F, -5.0F, -10.0F, 2, 6, 12, 220, 53)
            .N("scale", -1.0F, -5.0F, 10.0F, 2, 6, 12, 220, 53)
            .N("scale", -1.0F, -5.0F, 30.0F, 2, 6, 12, 220, 53),
         class04838.N(0.0F, 3.0F, 8.0F)
      );
      class04839x.N(
            "left_wing",
            class04822.L().N().N("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).N("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88),
            class04838.N(12.0F, 2.0F, -6.0F)
         )
         .N(
            "left_wing_tip",
            class04822.L().N().N("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).N("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
            class04838.N(56.0F, 0.0F, 0.0F)
         );
      class04839x.N("left_front_leg", class04822.L().N("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), class04838.N(12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F))
         .N("left_front_leg_tip", class04822.L().N("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), class04838.N(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F))
         .N("left_front_foot", class04822.L().N("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), class04838.N(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      class04839x.N("left_hind_leg", class04822.L().N("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), class04838.N(16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F))
         .N("left_hind_leg_tip", class04822.L().N("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), class04838.N(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F))
         .N("left_hind_foot", class04822.L().N("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), class04838.N(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      class04839x.N(
            "right_wing",
            class04822.L().N("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).N("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88),
            class04838.N(-12.0F, 2.0F, -6.0F)
         )
         .N(
            "right_wing_tip",
            class04822.L().N("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).N("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
            class04838.N(-56.0F, 0.0F, 0.0F)
         );
      class04839x.N("right_front_leg", class04822.L().N("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), class04838.N(-12.0F, 17.0F, -6.0F, 1.3F, 0.0F, 0.0F))
         .N("right_front_leg_tip", class04822.L().N("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), class04838.N(0.0F, 20.0F, -1.0F, -0.5F, 0.0F, 0.0F))
         .N("right_front_foot", class04822.L().N("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), class04838.N(0.0F, 23.0F, 0.0F, 0.75F, 0.0F, 0.0F));
      class04839x.N("right_hind_leg", class04822.L().N("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), class04838.N(-16.0F, 13.0F, 34.0F, 1.0F, 0.0F, 0.0F))
         .N("right_hind_leg_tip", class04822.L().N("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), class04838.N(0.0F, 32.0F, -4.0F, 0.5F, 0.0F, 0.0F))
         .N("right_hind_foot", class04822.L().N("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), class04838.N(0.0F, 31.0F, 4.0F, 0.75F, 0.0F, 0.0F));
      return class04806.N(class04792, 256, 256);
   }

   private static String N(int var0) {
      return "neck" + var0;
   }
}
