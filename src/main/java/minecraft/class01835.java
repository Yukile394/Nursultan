package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class class01835 {
   private static final float B = 0.05F;
   private static final float Z = 0.26666668F;
   public static final float N = 0.4F;
   private static final float z = 0.93333334F;
   private static final float U = 0.1F;
   public static final float y = 0.56666666F;
   private static final float E = 0.7666667F;
   public static final float L = -0.11F;
   public static final float u = 0.03F;
   public static final float i = 0.3F;
   public static final float R = -0.78F;
   public static final float M = -0.375F;
   private static final float W = -0.225F;
   private static final float m = 0.9F;
   private final class03195 P = class03195.N(-1.0F, 1.0F);
   private final class03195[] s = new class03195[]{
      class03195.N(-1.0F, -0.45F), class03195.N(-0.45F, -0.15F), class03195.N(-0.15F, 0.2F), class03195.N(0.2F, 0.55F), class03195.N(0.55F, 1.0F)
   };
   private final class03195[] T = new class03195[]{
      class03195.N(-1.0F, -0.35F), class03195.N(-0.35F, -0.1F), class03195.N(-0.1F, 0.1F), class03195.N(0.1F, 0.3F), class03195.N(0.3F, 1.0F)
   };
   private final class03195[] b = new class03195[]{
      class03195.N(-1.0F, -0.78F),
      class03195.N(-0.78F, -0.375F),
      class03195.N(-0.375F, -0.2225F),
      class03195.N(-0.2225F, 0.05F),
      class03195.N(0.05F, 0.45F),
      class03195.N(0.45F, 0.55F),
      class03195.N(0.55F, 1.0F)
   };
   private final class03195 j = this.s[0];
   private final class03195 v = class03195.N(this.s[1], this.s[4]);
   private final class03195 n = class03195.N(-1.2F, -1.05F);
   private final class03195 t = class03195.N(-1.05F, -0.455F);
   private final class03195 G = class03195.N(-0.455F, -0.19F);
   private final class03195 l = class03195.N(-0.19F, -0.11F);
   private final class03195 d = class03195.N(-0.11F, 0.55F);
   private final class03195 w = class03195.N(-0.11F, 0.03F);
   private final class03195 k = class03195.N(0.03F, 0.3F);
   private final class03195 Y = class03195.N(0.3F, 1.0F);
   private final class05946<class00780>[][] Q = new class05946[][]{
      {class00795.h, class00795.x, class00795.C, class00795.A, class00795.p}, {class00795.D, class00795.S, class00795.f, class00795.F, class00795.p}
   };
   private final class05946<class00780>[][] O = new class05946[][]{
      {class00795.u, class00795.u, class00795.u, class00795.b, class00795.T},
      {class00795.y, class00795.y, class00795.Z, class00795.T, class00795.s},
      {class00795.z, class00795.y, class00795.Z, class00795.U, class00795.E},
      {class00795.j, class00795.j, class00795.Z, class00795.d, class00795.d},
      {class00795.R, class00795.R, class00795.R, class00795.R, class00795.R}
   };
   private final class05946<class00780>[][] g = new class05946[][]{
      {class00795.i, null, class00795.b, null, null},
      {null, null, null, null, class00795.P},
      {class00795.L, null, null, class00795.m, null},
      {null, null, class00795.y, class00795.w, class00795.k},
      {null, null, null, null, null}
   };
   private final class05946<class00780>[][] I = new class05946[][]{
      {class00795.u, class00795.u, class00795.u, class00795.b, class00795.b},
      {class00795.g, class00795.g, class00795.Z, class00795.T, class00795.s},
      {class00795.g, class00795.g, class00795.g, class00795.g, class00795.W},
      {class00795.v, class00795.v, class00795.Z, class00795.Z, class00795.d},
      {class00795.Y, class00795.Y, class00795.Y, class00795.O, class00795.O}
   };
   private final class05946<class00780>[][] J = new class05946[][]{
      {class00795.i, null, null, null, null},
      {class00795.I, null, class00795.g, class00795.g, class00795.P},
      {class00795.I, class00795.I, class00795.Z, class00795.U, null},
      {null, null, null, null, null},
      {class00795.Q, class00795.Q, null, null, null}
   };
   private final class05946<class00780>[][] o = new class05946[][]{
      {class00795.t, class00795.t, class00795.n, class00795.G, class00795.G},
      {class00795.t, class00795.t, class00795.n, class00795.G, class00795.G},
      {class00795.n, class00795.n, class00795.n, class00795.G, class00795.G},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   private class05946<class00780> L(int var1, int var2, class03195 var3) {
      return var1 == 0 ? this.M(var1, var2, var3) : this.y(var1, var2, var3);
   }

   private void L(Consumer<Pair<class03229, class05946<class00780>>> var1, class03195 var2) {
      this.N(var1, this.P, this.P, this.l, class03195.N(this.b[0], this.b[2]), var2, 0.0F, class00795.a);
      this.N(var1, class03195.N(this.s[1], this.s[2]), this.P, class03195.N(this.w, this.Y), this.b[6], var2, 0.0F, class00795.M);
      this.N(var1, class03195.N(this.s[3], this.s[4]), this.P, class03195.N(this.w, this.Y), this.b[6], var2, 0.0F, class00795.B);

      for (int ix = 0; ix < this.s.length; ix++) {
         class03195 class03195x = this.s[ix];

         for (int jx = 0; jx < this.T.length; jx++) {
            class03195 class03195x = this.T[jx];
            class05946<class00780> class05946 = this.N(ix, jx, var2);
            class05946<class00780> class05946x = this.y(ix, jx, var2);
            class05946<class00780> class05946xx = this.L(ix, jx, var2);
            class05946<class00780> class05946xxx = this.B(ix, jx, var2);
            class05946<class00780> class05946xxxx = this.i(ix, jx, var2);
            class05946<class00780> class05946xxxxx = this.N(ix, jx);
            class05946<class00780> class05946xxxxxx = this.N(ix, jx, var2, class05946);
            class05946<class00780> class05946xxxxxxx = this.u(ix, jx, var2);
            class05946<class00780> class05946xxxxxxxx = this.M(ix, jx, var2);
            this.N(var1, class03195x, class03195x, class03195.N(this.w, this.Y), this.b[0], var2, 0.0F, class05946xxxxxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.w, this.k), this.b[1], var2, 0.0F, class05946xx);
            this.N(var1, class03195x, class03195x, this.Y, this.b[1], var2, 0.0F, ix == 0 ? class05946xxxxxxxx : class05946xxxx);
            this.N(var1, class03195x, class03195x, this.w, this.b[2], var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, this.k, this.b[2], var2, 0.0F, class05946x);
            this.N(var1, class03195x, class03195x, this.Y, this.b[2], var2, 0.0F, class05946xxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.w), this.b[3], var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[3], var2, 0.0F, class05946x);
            if (var2.y() < 0L) {
               this.N(var1, class03195x, class03195x, this.l, this.b[4], var2, 0.0F, class05946xxxxx);
               this.N(var1, class03195x, class03195x, class03195.N(this.w, this.Y), this.b[4], var2, 0.0F, class05946);
            } else {
               this.N(var1, class03195x, class03195x, class03195.N(this.l, this.Y), this.b[4], var2, 0.0F, class05946);
            }

            this.N(var1, class03195x, class03195x, this.l, this.b[5], var2, 0.0F, class05946xxxxxxx);
            this.N(var1, class03195x, class03195x, this.w, this.b[5], var2, 0.0F, class05946xxxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[5], var2, 0.0F, class05946xxx);
            if (var2.y() < 0L) {
               this.N(var1, class03195x, class03195x, this.l, this.b[6], var2, 0.0F, class05946xxxxx);
            } else {
               this.N(var1, class03195x, class03195x, this.l, this.b[6], var2, 0.0F, class05946);
            }

            if (ix == 0) {
               this.N(var1, class03195x, class03195x, class03195.N(this.w, this.Y), this.b[6], var2, 0.0F, class05946);
            }
         }
      }
   }

   private void L(
      Consumer<Pair<class03229, class05946<class00780>>> var1,
      class03195 var2,
      class03195 var3,
      class03195 var4,
      class03195 var5,
      class03195 var6,
      float var7,
      class05946<class00780> var8
   ) {
      var1.accept(Pair.of(class03216.N(var2, var3, var4, var5, class03195.N(1.1F), var6, var7), var8));
   }

   private void L(Consumer<Pair<class03229, class05946<class00780>>> var1) {
      this.N(var1, this.P, this.P, this.n, this.P, this.P, 0.0F, class00795.r);

      for (int ix = 0; ix < this.s.length; ix++) {
         class03195 class03195 = this.s[ix];
         this.N(var1, class03195, this.P, this.t, this.P, this.P, 0.0F, this.Q[0][ix]);
         this.N(var1, class03195, this.P, this.G, this.P, this.P, 0.0F, this.Q[1][ix]);
      }
   }

   public class03195[] L() {
      return this.T;
   }

   public String L(double var1) {
      return N(var1, this.b);
   }

   public class03195[] M() {
      return new class03195[]{class03195.N(-2.0F, 0.0F), class03195.N(0.0F, 2.0F)};
   }

   private class05946<class00780> M(int var1, int var2, class03195 var3) {
      if (var1 >= 3) {
         return this.i(var1, var2, var3);
      } else {
         return var2 <= 1 ? class00795.o : class00795.J;
      }
   }

   public class01835() {
      super();
   }

   private class05946<class00780> B(int var1, int var2, class03195 var3) {
      class05946<class00780> class05946 = this.o[var1][var2];
      return class05946 == null ? this.N(var1, var2, var3) : class05946;
   }

   public String i(double var1) {
      return N(var1, this.T);
   }

   public class03195[] i() {
      return new class03195[]{this.n, this.t, this.G, this.l, this.w, this.k, this.Y};
   }

   private class05946<class00780> i(int var1, int var2, class03195 var3) {
      if (var3.y() >= 0L) {
         class05946<class00780> class05946 = this.J[var1][var2];
         if (class05946 != null) {
            return class05946;
         }
      }

      return this.I[var1][var2];
   }

   private void i(Consumer<Pair<class03229, class05946<class00780>>> var1, class03195 var2) {
      this.N(var1, this.j, this.P, this.l, class03195.N(this.b[0], this.b[1]), var2, 0.0F, var2.y() < 0L ? class00795.a : class00795.H);
      this.N(var1, this.v, this.P, this.l, class03195.N(this.b[0], this.b[1]), var2, 0.0F, var2.y() < 0L ? class00795.a : class00795.e);
      this.N(var1, this.j, this.P, this.w, class03195.N(this.b[0], this.b[1]), var2, 0.0F, class00795.H);
      this.N(var1, this.v, this.P, this.w, class03195.N(this.b[0], this.b[1]), var2, 0.0F, class00795.e);
      this.N(var1, this.j, this.P, class03195.N(this.l, this.Y), class03195.N(this.b[2], this.b[5]), var2, 0.0F, class00795.H);
      this.N(var1, this.v, this.P, class03195.N(this.l, this.Y), class03195.N(this.b[2], this.b[5]), var2, 0.0F, class00795.e);
      this.N(var1, this.j, this.P, this.l, this.b[6], var2, 0.0F, class00795.H);
      this.N(var1, this.v, this.P, this.l, this.b[6], var2, 0.0F, class00795.e);
      this.N(var1, class03195.N(this.s[1], this.s[2]), this.P, class03195.N(this.d, this.Y), this.b[6], var2, 0.0F, class00795.M);
      this.N(var1, class03195.N(this.s[3], this.s[4]), this.P, class03195.N(this.d, this.Y), this.b[6], var2, 0.0F, class00795.B);
      this.N(var1, this.j, this.P, class03195.N(this.d, this.Y), this.b[6], var2, 0.0F, class00795.H);

      for (int ix = 0; ix < this.s.length; ix++) {
         class03195 class03195x = this.s[ix];

         for (int jx = 0; jx < this.T.length; jx++) {
            class03195 class03195x = this.T[jx];
            class05946<class00780> class05946 = this.y(ix, jx, var2);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), class03195.N(this.b[0], this.b[1]), var2, 0.0F, class05946);
         }
      }
   }

   private void i(Consumer<Pair<class03229, class05946<class00780>>> var1) {
      this.y(var1, this.P, this.P, class03195.N(0.8F, 1.0F), this.P, this.P, 0.0F, class00795.NN);
      this.y(var1, this.P, class03195.N(0.7F, 1.0F), this.P, this.P, this.P, 0.0F, class00795.Ny);
      this.L(var1, this.P, this.P, this.P, class03195.N(this.b[0], this.b[1]), this.P, 0.0F, class00795.NL);
   }

   private void u(Consumer<Pair<class03229, class05946<class00780>>> var1) {
      this.L(var1, class03195.N(-1.0F, -0.93333334F));
      this.y(var1, class03195.N(-0.93333334F, -0.7666667F));
      this.N(var1, class03195.N(-0.7666667F, -0.56666666F));
      this.y(var1, class03195.N(-0.56666666F, -0.4F));
      this.L(var1, class03195.N(-0.4F, -0.26666668F));
      this.u(var1, class03195.N(-0.26666668F, -0.05F));
      this.i(var1, class03195.N(-0.05F, 0.05F));
      this.u(var1, class03195.N(0.05F, 0.26666668F));
      this.L(var1, class03195.N(0.26666668F, 0.4F));
      this.y(var1, class03195.N(0.4F, 0.56666666F));
      this.N(var1, class03195.N(0.56666666F, 0.7666667F));
      this.y(var1, class03195.N(0.7666667F, 0.93333334F));
      this.L(var1, class03195.N(0.93333334F, 1.0F));
   }

   private void u(Consumer<Pair<class03229, class05946<class00780>>> var1, class03195 var2) {
      this.N(var1, this.P, this.P, this.l, class03195.N(this.b[0], this.b[2]), var2, 0.0F, class00795.a);
      this.N(var1, class03195.N(this.s[1], this.s[2]), this.P, class03195.N(this.w, this.Y), this.b[6], var2, 0.0F, class00795.M);
      this.N(var1, class03195.N(this.s[3], this.s[4]), this.P, class03195.N(this.w, this.Y), this.b[6], var2, 0.0F, class00795.B);

      for (int ix = 0; ix < this.s.length; ix++) {
         class03195 class03195x = this.s[ix];

         for (int jx = 0; jx < this.T.length; jx++) {
            class03195 class03195x = this.T[jx];
            class05946<class00780> class05946 = this.N(ix, jx, var2);
            class05946<class00780> class05946x = this.y(ix, jx, var2);
            class05946<class00780> class05946xx = this.L(ix, jx, var2);
            class05946<class00780> class05946xxx = this.N(ix, jx);
            class05946<class00780> class05946xxxx = this.N(ix, jx, var2, class05946);
            class05946<class00780> class05946xxxxx = this.u(ix, jx, var2);
            this.N(var1, class03195x, class03195x, this.w, class03195.N(this.b[0], this.b[1]), var2, 0.0F, class05946x);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), class03195.N(this.b[0], this.b[1]), var2, 0.0F, class05946xx);
            this.N(var1, class03195x, class03195x, this.w, class03195.N(this.b[2], this.b[3]), var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), class03195.N(this.b[2], this.b[3]), var2, 0.0F, class05946x);
            this.N(var1, class03195x, class03195x, this.l, class03195.N(this.b[3], this.b[4]), var2, 0.0F, class05946xxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.w, this.Y), this.b[4], var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, this.l, this.b[5], var2, 0.0F, class05946xxxxx);
            this.N(var1, class03195x, class03195x, this.w, this.b[5], var2, 0.0F, class05946xxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[5], var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, this.l, this.b[6], var2, 0.0F, class05946xxx);
            if (ix == 0) {
               this.N(var1, class03195x, class03195x, class03195.N(this.w, this.Y), this.b[6], var2, 0.0F, class05946);
            }
         }
      }
   }

   public String u(double var1) {
      return N(var1, this.s);
   }

   public class03195[] u() {
      return this.b;
   }

   private class05946<class00780> u(int var1, int var2, class03195 var3) {
      class05946<class00780> class05946 = var3.y() >= 0L ? this.N(var1, var2, var3) : this.N(var1, var2);
      return this.N(var1, var2, var3, class05946);
   }

   private void y(Consumer<Pair<class03229, class05946<class00780>>> var1, class03195 var2) {
      for (int ix = 0; ix < this.s.length; ix++) {
         class03195 class03195x = this.s[ix];

         for (int jx = 0; jx < this.T.length; jx++) {
            class03195 class03195x = this.T[jx];
            class05946<class00780> class05946 = this.N(ix, jx, var2);
            class05946<class00780> class05946x = this.y(ix, jx, var2);
            class05946<class00780> class05946xx = this.L(ix, jx, var2);
            class05946<class00780> class05946xxx = this.i(ix, jx, var2);
            class05946<class00780> class05946xxxx = this.B(ix, jx, var2);
            class05946<class00780> class05946xxxxx = this.N(ix, jx, var2, class05946);
            class05946<class00780> class05946xxxxxx = this.M(ix, jx, var2);
            class05946<class00780> class05946xxxxxxx = this.R(ix, jx, var2);
            this.N(var1, class03195x, class03195x, this.l, class03195.N(this.b[0], this.b[1]), var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, this.w, this.b[0], var2, 0.0F, class05946xxxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[0], var2, 0.0F, class05946xxxxxxx);
            this.N(var1, class03195x, class03195x, this.w, this.b[1], var2, 0.0F, class05946xx);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[1], var2, 0.0F, class05946xxxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.w), class03195.N(this.b[2], this.b[3]), var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[2], var2, 0.0F, class05946xxx);
            this.N(var1, class03195x, class03195x, this.k, this.b[3], var2, 0.0F, class05946x);
            this.N(var1, class03195x, class03195x, this.Y, this.b[3], var2, 0.0F, class05946xxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.Y), this.b[4], var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.w), this.b[5], var2, 0.0F, class05946xxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[5], var2, 0.0F, class05946xxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.Y), this.b[6], var2, 0.0F, class05946);
         }
      }
   }

   private void y(Consumer<Pair<class03229, class05946<class00780>>> var1) {
      class01921 class01921 = new class02061().N(class04227.yy, class03882::N).N(class04227.yW, class03023::N).N(class01042.N(class04206.NF)).y(class04227.yy);
      class03890 class03890xx = new class03890(class01921.y(class03882.i));
      class03890 class03890x = new class03890(class01921.y(class03882.R));
      class03890 class03890xx = new class03890(class01921.y(class03882.B));
      var1.accept(Pair.of(class03216.N(this.P, this.P, this.P, this.P, class03195.N(0.0F), this.P, 0.01F), class00795.y));
      if (class04300.N(class03890x, class03890xx, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, class04573.y) instanceof class04564 class04564x) {
         class05946<class00780> class05946 = class00795.R;

         for (float f : class04564x.i()) {
            var1.accept(Pair.of(class03216.N(this.P, this.P, this.P, class03195.N(f), class03195.N(0.0F), this.P, 0.0F), class05946));
            class05946 = class05946 == class00795.R ? class00795.Y : class00795.R;
         }
      }

      if (class04300.N(class03890xx, class03890x, class03890xx, false) instanceof class04564 class04564) {
         for (float f1 : class04564.i()) {
            var1.accept(Pair.of(class03216.N(this.P, this.P, class03195.N(f1), this.P, class03195.N(0.0F), this.P, 0.0F), class00795.b));
         }
      }
   }

   public class03195[] y() {
      return this.s;
   }

   public String y(double var1) {
      double d0 = class03216.N((float)var1);
      if (d0 < this.n.y()) {
         return "Mushroom fields";
      } else if (d0 < this.t.y()) {
         return "Deep ocean";
      } else if (d0 < this.G.y()) {
         return "Ocean";
      } else if (d0 < this.l.y()) {
         return "Coast";
      } else if (d0 < this.w.y()) {
         return "Near inland";
      } else {
         return d0 < this.k.y() ? "Mid inland" : "Far inland";
      }
   }

   private void y(
      Consumer<Pair<class03229, class05946<class00780>>> var1,
      class03195 var2,
      class03195 var3,
      class03195 var4,
      class03195 var5,
      class03195 var6,
      float var7,
      class05946<class00780> var8
   ) {
      var1.accept(Pair.of(class03216.N(var2, var3, var4, var5, class03195.N(0.2F, 0.9F), var6, var7), var8));
   }

   private class05946<class00780> y(int var1, int var2, class03195 var3) {
      return var1 == 4 ? this.N(var2, var3) : this.N(var1, var2, var3);
   }

   private void N(Consumer<Pair<class03229, class05946<class00780>>> var1, class03195 var2) {
      for (int ix = 0; ix < this.s.length; ix++) {
         class03195 class03195x = this.s[ix];

         for (int jx = 0; jx < this.T.length; jx++) {
            class03195 class03195x = this.T[jx];
            class05946<class00780> class05946 = this.N(ix, jx, var2);
            class05946<class00780> class05946x = this.y(ix, jx, var2);
            class05946<class00780> class05946xx = this.L(ix, jx, var2);
            class05946<class00780> class05946xxx = this.i(ix, jx, var2);
            class05946<class00780> class05946xxxx = this.B(ix, jx, var2);
            class05946<class00780> class05946xxxxx = this.N(ix, jx, var2, class05946xxxx);
            class05946<class00780> class05946xxxxxx = this.R(ix, jx, var2);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.Y), this.b[0], var2, 0.0F, class05946xxxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.w), this.b[1], var2, 0.0F, class05946xx);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[1], var2, 0.0F, class05946xxxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.w), class03195.N(this.b[2], this.b[3]), var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[2], var2, 0.0F, class05946xxx);
            this.N(var1, class03195x, class03195x, this.k, this.b[3], var2, 0.0F, class05946x);
            this.N(var1, class03195x, class03195x, this.Y, this.b[3], var2, 0.0F, class05946xxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.Y), this.b[4], var2, 0.0F, class05946);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.w), this.b[5], var2, 0.0F, class05946xxxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.k, this.Y), this.b[5], var2, 0.0F, class05946xxxx);
            this.N(var1, class03195x, class03195x, class03195.N(this.l, this.Y), this.b[6], var2, 0.0F, class05946);
         }
      }
   }

   private class05946<class00780> N(int var1, int var2, class03195 var3, class05946<class00780> var4) {
      return var1 > 1 && var2 < 4 && var3.y() >= 0L ? class00795.l : var4;
   }

   private static String N(double var0, class03195[] var2) {
      double d0 = class03216.N((float)var0);

      for (int ix = 0; ix < var2.length; ix++) {
         if (d0 < var2[ix].y()) {
            return ix + "";
         }
      }

      return "?";
   }

   private class05946<class00780> N(int var1, int var2, class03195 var3) {
      if (var3.y() < 0L) {
         return this.O[var1][var2];
      } else {
         class05946<class00780> class05946 = this.g[var1][var2];
         return class05946 == null ? this.O[var1][var2] : class05946;
      }
   }

   public List<class03229> N() {
      class03195 class03195 = class03195.N(0.0F);
      float f = 0.16F;
      return List.of(
         new class03229(this.P, this.P, class03195.N(this.d, this.P), this.P, class03195, class03195.N(-1.0F, -0.16F), 0L),
         new class03229(this.P, this.P, class03195.N(this.d, this.P), this.P, class03195, class03195.N(0.16F, 1.0F), 0L)
      );
   }

   private class05946<class00780> N(int var1, class03195 var2) {
      if (var1 < 2) {
         return var2.y() < 0L ? class00795.Y : class00795.Q;
      } else {
         return var1 < 3 ? class00795.Y : class00795.O;
      }
   }

   private class05946<class00780> N(int var1, int var2) {
      if (var1 == 0) {
         return class00795.X;
      } else {
         return var1 == 4 ? class00795.R : class00795.c;
      }
   }

   private void N(
      Consumer<Pair<class03229, class05946<class00780>>> var1,
      class03195 var2,
      class03195 var3,
      class03195 var4,
      class03195 var5,
      class03195 var6,
      float var7,
      class05946<class00780> var8
   ) {
      var1.accept(Pair.of(class03216.N(var2, var3, var4, var5, class03195.N(0.0F), var6, var7), var8));
      var1.accept(Pair.of(class03216.N(var2, var3, var4, var5, class03195.N(1.0F), var6, var7), var8));
   }

   protected void N(Consumer<Pair<class03229, class05946<class00780>>> var1) {
      if (class07529.NG) {
         this.y(var1);
      } else {
         this.L(var1);
         this.u(var1);
         this.i(var1);
      }
   }

   public static String N(double var0) {
      if (var0 < class03882.N(0.05F)) {
         return "Valley";
      } else if (var0 < class03882.N(0.26666668F)) {
         return "Low";
      } else if (var0 < class03882.N(0.4F)) {
         return "Mid";
      } else {
         return var0 < class03882.N(0.56666666F) ? "High" : "Peak";
      }
   }

   public static boolean N(class03877 var0, class03877 var1, class03875 var2) {
      return var0.N(var2) < -0.225F && var1.N(var2) > 0.9F;
   }

   public class03195[] R() {
      return new class03195[]{
         class03195.N(-2.0F, class03882.N(0.05F)),
         class03195.N(class03882.N(0.05F), class03882.N(0.26666668F)),
         class03195.N(class03882.N(0.26666668F), class03882.N(0.4F)),
         class03195.N(class03882.N(0.4F), class03882.N(0.56666666F)),
         class03195.N(class03882.N(0.56666666F), 2.0F)
      };
   }

   private class05946<class00780> R(int var1, int var2, class03195 var3) {
      if (var1 <= 2) {
         return var3.y() < 0L ? class00795.K : class00795.q;
      } else {
         return var1 == 3 ? class00795.V : this.N(var2, var3);
      }
   }
}
