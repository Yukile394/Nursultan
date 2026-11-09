package minecraft;

import java.util.stream.Stream;

public class class03882 {
   public static final float N = -0.50375F;
   private static final float P = 0.08F;
   private static final double s = 1.5;
   private static final double T = 1.5;
   private static final double b = 1.5625;
   private static final double j = -0.703125;
   public static final double y = 0.390625;
   public static final int L = 64;
   public static final long u = 4096L;
   private static final int v = -64;
   private static final int n = 320;
   private static final double t = 1.5;
   private static final double G = -1.5;
   private static final int l = 24;
   private static final double d = 4.0;
   private static final class03877 w = class03865.N(10.0);
   private static final class03877 k = class03865.N();
   private static final class05946<class03877> Y = N("zero");
   private static final class05946<class03877> Q = N("y");
   private static final class05946<class03877> O = N("shift_x");
   private static final class05946<class03877> g = N("shift_z");
   private static final class05946<class03877> I = N("overworld/base_3d_noise");
   private static final class05946<class03877> J = N("nether/base_3d_noise");
   private static final class05946<class03877> o = N("end/base_3d_noise");
   public static final class05946<class03877> i = N("overworld/continents");
   public static final class05946<class03877> R = N("overworld/erosion");
   public static final class05946<class03877> M = N("overworld/ridges");
   public static final class05946<class03877> B = N("overworld/ridges_folded");
   public static final class05946<class03877> Z = N("overworld/offset");
   public static final class05946<class03877> z = N("overworld/factor");
   public static final class05946<class03877> U = N("overworld/jaggedness");
   public static final class05946<class03877> E = N("overworld/depth");
   private static final class05946<class03877> q = N("overworld/sloped_cheese");
   public static final class05946<class03877> W = N("overworld_large_biomes/continents");
   public static final class05946<class03877> m = N("overworld_large_biomes/erosion");
   private static final class05946<class03877> K = N("overworld_large_biomes/offset");
   private static final class05946<class03877> V = N("overworld_large_biomes/factor");
   private static final class05946<class03877> e = N("overworld_large_biomes/jaggedness");
   private static final class05946<class03877> H = N("overworld_large_biomes/depth");
   private static final class05946<class03877> c = N("overworld_large_biomes/sloped_cheese");
   private static final class05946<class03877> X = N("overworld_amplified/offset");
   private static final class05946<class03877> a = N("overworld_amplified/factor");
   private static final class05946<class03877> p = N("overworld_amplified/jaggedness");
   private static final class05946<class03877> F = N("overworld_amplified/depth");
   private static final class05946<class03877> A = N("overworld_amplified/sloped_cheese");
   private static final class05946<class03877> f = N("end/sloped_cheese");
   private static final class05946<class03877> C = N("overworld/caves/spaghetti_roughness_function");
   private static final class05946<class03877> S = N("overworld/caves/entrances");
   private static final class05946<class03877> x = N("overworld/caves/noodle");
   private static final class05946<class03877> D = N("overworld/caves/pillars");
   private static final class05946<class03877> h = N("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final class05946<class03877> r = N("overworld/caves/spaghetti_2d");

   private static class03877 L(class02055<class05056> var0) {
      double d0 = 25.0;
      double d1 = 0.3;
      class03877 class03877xx = class03865.y(var0.y(class03008.P), 25.0, 0.3);
      class03877 class03877x = class03865.N(var0.y(class03008.s), 0.0, -2.0);
      class03877 class03877xx = class03865.N(var0.y(class03008.T), 0.0, 1.1);
      return class03865.u(class03865.y(class03865.N(class03865.y(class03877xx, class03865.N(2.0)), class03877x), class03877xx.B()));
   }

   public static class03866 L(class02055<class03877> var0, class02055<class05056> var1) {
      return y(var0, var1, N(N(var0, o), 0, 256));
   }

   private static class03877 L(class03877 var0) {
      return class03865.y(class03865.N(class03865.R(var0)), class03865.N(0.64)).E();
   }

   public class03882() {
      super();
   }

   private static class03877 i(class02055<class03877> var0, class02055<class05056> var1) {
      class03877 class03877xxxxx = N(var0, Q);
      byte b0 = -64;
      byte b1 = -60;
      short short1 = 320;
      class03877 class03877x = N(class03877xxxxx, class03865.y(var1.y(class03008.q), 1.0, 1.0), -60, 320, -1);
      class03877 class03877xx = N(class03877xxxxx, class03865.N(var1.y(class03008.K), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double d0 = 2.6666666666666665;
      class03877 class03877xxx = N(class03877xxxxx, class03865.y(var1.y(class03008.V), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      class03877 class03877xxxx = N(class03877xxxxx, class03865.y(var1.y(class03008.e), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      class03877 class03877xxxxx = class03865.y(class03865.N(1.5), class03865.u(class03877xxx.R(), class03877xxxx.R()));
      return class03865.N(class03877x, -1000000.0, 0.0, class03865.N(64.0), class03865.N(class03877xx, class03877xxxxx));
   }

   private static class03877 u(class02055<class03877> var0, class02055<class05056> var1) {
      class03877 class03877xxxxx = class03865.u(class03865.y(var1.y(class03008.l), 2.0, 1.0));
      class03877 class03877x = class03865.N(var1.y(class03008.d), -0.065, -0.088);
      class03877 class03877xx = class03865.N(class03877xxxxx, var1.y(class03008.t), class03873.field_37066);
      class03877 class03877xxx = class03865.N(class03877xxxxx, var1.y(class03008.G), class03873.field_37066);
      class03877 class03877xxxx = class03865.N(class03865.u(class03877xx, class03877xxx), class03877x).N(-1.0, 1.0);
      class03877 class03877xxxxx = N(var0, C);
      return class03865.u(
         class03865.L(
            class03865.N(class03865.N(class03865.y(var1.y(class03008.Y), 0.75, 0.5), class03865.N(0.37)), class03865.N(-10, 30, 0.3, 0.0)),
            class03865.N(class03877xxxxx, class03877xxxx)
         )
      );
   }

   private static class03877 u(class03877 var0) {
      return N(var0, 0, 128);
   }

   private static class03877 y(class03877 var0, class03877 var1) {
      class03877 class03877 = class03865.y(var1, var0);
      return class03865.y(class03865.N(4.0), class03877.z());
   }

   public static class03866 y(class02055<class03877> var0, class02055<class05056> var1) {
      return y(var0, var1, N(var0, -64, 192));
   }

   private static class03866 y(class02055<class03877> var0, class02055<class05056> var1, class03877 var2) {
      class03877 class03877xxxx = N(var0, O);
      class03877 class03877x = N(var0, g);
      class03877 class03877xx = class03865.N(class03877xxxx, class03877x, 0.25, var1.y(class03008.N));
      class03877 class03877xxx = class03865.N(class03877xxxx, class03877x, 0.25, var1.y(class03008.y));
      class03877 class03877xxxx = L(var2);
      return new class03866(
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03877xx,
         class03877xxx,
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03877xxxx,
         class03865.N(),
         class03865.N(),
         class03865.N()
      );
   }

   private static class03877 y(class03877 var0) {
      return class03865.y(class03865.N(class03865.N(var0.R(), class03865.N(-0.6666666666666666)).R(), class03865.N(-0.3333333333333333)), class03865.N(-3.0));
   }

   private static class03877 y(class02055<class05056> var0) {
      class03877 class03877 = class03865.N(var0.y(class03008.w));
      return class03865.u(class03865.y(class03865.N(var0.y(class03008.k), 0.0, -0.1), class03865.N(class03877.R(), class03865.N(-0.4))));
   }

   public static class03866 N() {
      return new class03866(
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N()
      );
   }

   public static class03866 N(class02055<class03877> var0) {
      class03877 class03877x = class03865.L(class03865.N(0L));
      class03877 class03877x = L(u(N(var0, f)));
      return new class03866(
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03877x,
         class03865.N(),
         class03865.N(),
         class03865.N(),
         class03877x,
         class03865.N(),
         class03865.N(),
         class03865.N()
      );
   }

   private static class03877 N(class03877 var0, class03877 var1, int var2, int var3, int var4) {
      return class03865.N(class03865.N(var0, var2, var3 + 1, var1, class03865.N((double)var4)));
   }

   private static class05946<class03877> N(String var0) {
      return class05946.N(class04227.yy, class01894.y(var0));
   }

   private static class03877 N(class03877 var0, int var1, int var2, int var3, int var4, double var5, int var7, int var8, double var9) {
      class03877 class03877 = class03865.N(class03865.N(var1 + var2 - var3, var1 + var2 - var4, 1.0, 0.0), var5, var0);
      return class03865.N(class03865.N(var1 + var7, var1 + var8, 0.0, 1.0), var9, class03877);
   }

   private static class03877 N(class03877 var0, class03877 var1, boolean var2) {
      class03877 class03877xx = class03865.L(var1);
      class03877 class03877x = class03865.L(var0);
      class03877 class03877xx = N(
         class03865.N(class03865.y(class03865.N(0.2734375), class03877xx.U()), class03865.y(class03865.N(-1.0), class03877x)), 1.5, -1.5, -64.0, 320.0
      );
      class03877xx = class03877xx.N(-40.0, 320.0);
      return class03865.N(
         class03865.N(N(var2, class03865.N(y(class03877xx, N(class03877x)), class03865.N(-0.703125)).N(-64.0, 64.0)), class03865.N(-0.390625)),
         class03877xx,
         -64,
         class05967.y.N()
      );
   }

   private static class03877 N(class04116<class03877> var0, class05946<class03877> var1, class03877 var2) {
      return new class03885(var0.N(var1, var2));
   }

   private static class03877 N(class03877 var0, class03877 var1) {
      return class03865.y(class03865.L(class03865.N(class03865.y(), var1, var0)));
   }

   private static class03877 N(class03877 var0, double var1, double var3, double var5, double var7) {
      double d0 = (var7 - var5) / (var3 - var1);
      double d1 = var5 - var1 * d0;
      return class03865.N(class03865.y(var0, class03865.N(d0)), class03865.N(d1));
   }

   private static void N(
      class04116<class03877> var0,
      class02055<class03877> var1,
      class03877 var2,
      class03556<class03877> var3,
      class03556<class03877> var4,
      class05946<class03877> var5,
      class05946<class03877> var6,
      class05946<class03877> var7,
      class05946<class03877> var8,
      class05946<class03877> var9,
      boolean var10
   ) {
      class03890 class03890xxx = new class03890(var3);
      class03890 class03890x = new class03890(var4);
      class03890 class03890xx = new class03890(var1.y(M));
      class03890 class03890xxx = new class03890(var1.y(B));
      class03877 class03877xxxx = N(
         var0, var5, N(class03865.N(class03865.N(-0.50375F), class03865.N(class04300.N(class03890xxx, class03890x, class03890xxx, var10))), class03865.L())
      );
      class03877 class03877x = N(var0, var6, N(class03865.N(class04300.N(class03890xxx, class03890x, class03890xx, class03890xxx, var10)), w));
      class03877 class03877xx = N(var0, var8, N(class03877xxxx));
      class03877 class03877xxx = class03865.y(
         N(var0, var7, N(class03865.N(class04300.y(class03890xxx, class03890x, class03890xx, class03890xxx, var10)), k)), var2.Z()
      );
      class03877 class03877xxxx = y(class03877x, class03865.N(class03877xx, class03877xxx));
      var0.N(var9, class03865.N(class03877xxxx, N(var1, I)));
   }

   private static class03877 N(class02055<class03877> var0, class02055<class05056> var1, class03877 var2) {
      class03877 class03877xxxxxxxx = N(var0, r);
      class03877 class03877x = N(var0, C);
      class03877 class03877xx = class03865.N(var1.y(class03008.Q), 8.0);
      class03877 class03877xxx = class03865.y(class03865.N(4.0), class03877xx.M());
      class03877 class03877xxxx = class03865.N(var1.y(class03008.O), 0.6666666666666666);
      class03877 class03877xxxxx = class03865.N(
         class03865.N(class03865.N(0.27), class03877xxxx).N(-1.0, 1.0), class03865.N(class03865.N(1.5), class03865.y(class03865.N(-0.64), var2)).N(0.0, 0.5)
      );
      class03877 class03877xxxxxx = class03865.L(
         class03865.L(class03865.N(class03877xxx, class03877xxxxx), N(var0, S)), class03865.N(class03877xxxxxxxx, class03877x)
      );
      class03877 class03877xxxxxxx = N(var0, D);
      class03877 class03877xxxxxxxx = class03865.N(class03877xxxxxxx, -1000000.0, 0.03, class03865.N(-1000000.0), class03877xxxxxxx);
      return class03865.u(class03877xxxxxx, class03877xxxxxxxx);
   }

   private static class03877 N(class03877 var0) {
      return class03865.N(class03865.N(-64, 320, 1.5, -1.5), var0);
   }

   public static float N(float var0) {
      return -(Math.abs(Math.abs(var0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static class03877 N(class02055<class03877> var0, class05946<class03877> var1) {
      return new class03885(var0.y(var1));
   }

   private static class03877 N(class03877 var0, int var1, int var2) {
      return N(var0, var1, var2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   private static class03877 N(class02055<class03877> var0, int var1, int var2) {
      return N(N(var0, J), var1, var2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   public static class03866 N(class02055<class03877> var0, class02055<class05056> var1) {
      return y(var0, var1, N(var0, 0, 128));
   }

   public static class03866 N(class02055<class03877> var0, class02055<class05056> var1, boolean var2, boolean var3) {
      class03877 class03877xxxxxxxxxxxxxxxxxxxxx = class03865.N(var1.y(class03008.U), 0.5);
      class03877 class03877x = class03865.N(var1.y(class03008.E), 0.67);
      class03877 class03877xx = class03865.N(var1.y(class03008.m), 0.7142857142857143);
      class03877 class03877xxx = class03865.N(var1.y(class03008.W));
      class03877 class03877xxxx = N(var0, O);
      class03877 class03877xxxxx = N(var0, g);
      class03877 class03877xxxxxx = class03865.N(class03877xxxx, class03877xxxxx, 0.25, var1.y(var2 ? class03008.i : class03008.N));
      class03877 class03877xxxxxxx = class03865.N(class03877xxxx, class03877xxxxx, 0.25, var1.y(var2 ? class03008.R : class03008.y));
      class03877 class03877xxxxxxxx = N(var0, var2 ? K : (var3 ? X : Z));
      class03877 class03877xxxxxxxxx = N(var0, var2 ? V : (var3 ? a : z));
      class03877 class03877xxxxxxxxxx = N(var0, var2 ? H : (var3 ? F : E));
      class03877 class03877xxxxxxxxxxx = N(class03877xxxxxxxx, class03877xxxxxxxxx, var3);
      class03877 class03877xxxxxxxxxxxx = N(var0, var2 ? c : (var3 ? A : q));
      class03877 class03877xxxxxxxxxxxxx = class03865.L(class03877xxxxxxxxxxxx, class03865.y(class03865.N(5.0), N(var0, S)));
      class03877 class03877xxxxxxxxxxxxxx = class03865.N(
         class03877xxxxxxxxxxxx, -1000000.0, 1.5625, class03877xxxxxxxxxxxxx, N(var0, var1, class03877xxxxxxxxxxxx)
      );
      class03877 class03877xxxxxxxxxxxxxxx = class03865.L(L(N(var3, class03877xxxxxxxxxxxxxx)), N(var0, x));
      class03877 class03877xxxxxxxxxxxxxxxx = N(var0, Q);
      int ix = Stream.of(class03896.values()).mapToInt(var0x -> var0x.field_33607).min().orElse(-class07376.i * 2);
      int jx = Stream.of(class03896.values()).mapToInt(var0x -> var0x.field_33608).max().orElse(-class07376.i * 2);
      class03877 class03877xxxxxxxxxxxxxxxxx = N(class03877xxxxxxxxxxxxxxxx, class03865.y(var1.y(class03008.g), 1.5, 1.5), ix, jx, 0);
      float fx = 4.0F;
      class03877 class03877xxxxxxxxxxxxxxxxxx = N(class03877xxxxxxxxxxxxxxxx, class03865.y(var1.y(class03008.I), 4.0, 4.0), ix, jx, 0).R();
      class03877 class03877xxxxxxxxxxxxxxxxxxx = N(class03877xxxxxxxxxxxxxxxx, class03865.y(var1.y(class03008.J), 4.0, 4.0), ix, jx, 0).R();
      class03877 class03877xxxxxxxxxxxxxxxxxxxx = class03865.N(class03865.N(-0.08F), class03865.u(class03877xxxxxxxxxxxxxxxxxx, class03877xxxxxxxxxxxxxxxxxxx));
      class03877 class03877xxxxxxxxxxxxxxxxxxxxx = class03865.N(var1.y(class03008.o));
      return new class03866(
         class03877xxxxxxxxxxxxxxxxxxxxx,
         class03877x,
         class03877xx,
         class03877xxx,
         class03877xxxxxx,
         class03877xxxxxxx,
         N(var0, var2 ? W : i),
         N(var0, var2 ? m : R),
         class03877xxxxxxxxxx,
         N(var0, M),
         class03877xxxxxxxxxxx,
         class03877xxxxxxxxxxxxxxx,
         class03877xxxxxxxxxxxxxxxxx,
         class03877xxxxxxxxxxxxxxxxxxxx,
         class03877xxxxxxxxxxxxxxxxxxxxx
      );
   }

   public static class03556<? extends class03877> N(class04116<class03877> var0) {
      class02055 class02055x = var0.N(class04227.yW);
      class02055 class02055x = var0.N(class04227.yy);
      var0.N(Y, class03865.N());
      int ix = class07376.i * 2;
      int jx = class07376.u * 2;
      var0.N(Q, class03865.N(ix, jx, ix, jx));
      class03877 class03877xxx = N(var0, O, class03865.y(class03865.L(class03865.y(class02055x.y(class03008.z)))));
      class03877 class03877x = N(var0, g, class03865.y(class03865.L(class03865.L(class02055x.y(class03008.z)))));
      var0.N(I, class06066.N(0.25, 0.125, 80.0, 160.0, 8.0));
      var0.N(J, class06066.N(0.25, 0.375, 80.0, 60.0, 8.0));
      var0.N(o, class06066.N(0.25, 0.25, 80.0, 160.0, 4.0));
      class03529 class03529xxx = var0.N(i, class03865.y(class03865.N(class03877xxx, class03877x, 0.25, class02055x.y(class03008.L))));
      class03529 class03529x = var0.N(R, class03865.y(class03865.N(class03877xxx, class03877x, 0.25, class02055x.y(class03008.u))));
      class03877 class03877xx = N(var0, M, class03865.y(class03865.N(class03877xxx, class03877x, 0.25, class02055x.y(class03008.Z))));
      var0.N(B, y(class03877xx));
      class03877 class03877xxx = class03865.y(class02055x.y(class03008.H), 1500.0, 0.0);
      N(var0, class02055x, class03877xxx, class03529xxx, class03529x, Z, z, U, E, q, false);
      class03529 class03529xx = var0.N(W, class03865.y(class03865.N(class03877xxx, class03877x, 0.25, class02055x.y(class03008.M))));
      class03529 class03529xxx = var0.N(m, class03865.y(class03865.N(class03877xxx, class03877x, 0.25, class02055x.y(class03008.B))));
      N(var0, class02055x, class03877xxx, class03529xx, class03529xxx, K, V, e, H, c, false);
      N(var0, class02055x, class03877xxx, class03529xxx, class03529x, X, a, p, F, A, true);
      var0.N(f, class03865.N(class03865.N(0L), N(class02055x, o)));
      var0.N(C, y(class02055x));
      var0.N(h, class03865.u(class03865.N(class02055x.y(class03008.n), 2.0, 1.0, -0.6, -1.3)));
      var0.N(r, R(class02055x, class02055x));
      var0.N(S, u(class02055x, class02055x));
      var0.N(x, i(class02055x, class02055x));
      return var0.N(D, L(class02055x));
   }

   private static class03877 N(boolean var0, class03877 var1) {
      return N(var1, -64, 384, var0 ? 16 : 80, var0 ? 0 : 64, -0.078125, 0, 24, var0 ? 0.4 : 0.1171875);
   }

   private static class03877 R(class02055<class03877> var0, class02055<class05056> var1) {
      class03877 class03877xxx = class03865.N(class03865.y(var1.y(class03008.v), 2.0, 1.0), var1.y(class03008.b), class03873.field_37067);
      class03877 class03877x = class03865.N(var1.y(class03008.j), 0.0, Math.floorDiv(-64, 8), 8.0);
      class03877 class03877xx = N(var0, h);
      class03877 class03877xxx = class03865.N(class03865.N(class03877x, class03865.N(-64, 320, 8.0, -40.0)).R(), class03877xx).B();
      double d0 = 0.083;
      return class03865.u(class03865.N(class03877xxx, class03865.y(class03865.N(0.083), class03877xx)), class03877xxx).N(-1.0, 1.0);
   }
}
