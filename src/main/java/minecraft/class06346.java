package minecraft;

public class class06346 extends class06078<class08455> {
   public static final class02415 N = class02415.N(2.35F);
   private static final float[] y = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] L = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] u = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] i = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
   private static final float[] R = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
   private static final float[] M = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
   private static final String B = "eye";
   private static final String Z = "tail0";
   private static final String z = "tail1";
   private static final String U = "tail2";
   private final class01686 E;
   private final class01686 W;
   private final class01686[] m = new class01686[12];
   private final class01686[] P;

   private static float L(int var0, float var1, float var2) {
      return 16.0F + R[var0] * N(var0, var1, var2);
   }

   public class06346(class01686 var1) {
      super(var1);
      this.E = var1.y("head");

      for (int ix = 0; ix < this.m.length; ix++) {
         this.m[ix] = this.E.y(N(ix));
      }

      this.W = this.E.y("eye");
      this.P = new class01686[3];
      this.P[0] = this.E.y("tail0");
      this.P[1] = this.P[0].y("tail1");
      this.P[2] = this.P[1].y("tail2");
   }

   private static float u(int var0, float var1, float var2) {
      return M[var0] * N(var0, var1, var2);
   }

   private static float y(int var0, float var1, float var2) {
      return i[var0] * N(var0, var1, var2);
   }

   public static class04806 y() {
      return N().N(N);
   }

   private static float N(int var0, float var1, float var2) {
      return 1.0F + class04995.P(var1 * 1.5F + var0) * 0.01F - var2;
   }

   private static String N(int var0) {
      return "spike" + var0;
   }

   private void N(float var1, float var2) {
      for (int ix = 0; ix < 12; ix++) {
         this.m[ix].y = y(ix, var1, var2);
         this.m[ix].L = L(ix, var1, var2);
         this.m[ix].u = u(ix, var1, var2);
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N()
         .N(
            "head",
            class04822.L()
               .N(0, 0)
               .N(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F)
               .N(0, 28)
               .N(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F)
               .N(0, 28)
               .N(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true)
               .N(16, 40)
               .N(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F)
               .N(16, 40)
               .N(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F),
            class04838.N
         );
      class04822 class04822 = class04822.L().N(0, 0).N(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);

      for (int ix = 0; ix < 12; ix++) {
         float f = y(ix, 0.0F, 0.0F);
         float f1 = L(ix, 0.0F, 0.0F);
         float f2 = u(ix, 0.0F, 0.0F);
         float f3 = (float) Math.PI * y[ix];
         float f4 = (float) Math.PI * L[ix];
         float f5 = (float) Math.PI * u[ix];
         class04839xx.N(N(ix), class04822, class04838.N(f, f1, f2, f3, f4, f5));
      }

      class04839xx.N("eye", class04822.L().N(8, 0).N(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F), class04838.N(0.0F, 0.0F, -8.25F));
      class04839 class04839x = class04839xx.N("tail0", class04822.L().N(40, 0).N(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F), class04838.N);
      class04839 class04839xx = class04839x.N("tail1", class04822.L().N(0, 54).N(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F), class04838.N(-1.5F, 0.5F, 14.0F));
      class04839xx.N(
         "tail2",
         class04822.L().N(41, 32).N(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F).N(25, 19).N(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F),
         class04838.N(0.5F, 0.5F, 6.0F)
      );
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class08455 var1) {
      super.method_2819(var1);
      this.E.R = var1.D * (float) (Math.PI / 180.0);
      this.E.i = var1.h * (float) (Math.PI / 180.0);
      float f = (1.0F - var1.N) * 0.55F;
      this.N(var1.P, f);
      if (var1.i != null && var1.u != null) {
         double d0 = var1.i.B - var1.L.B;
         if (d0 > 0.0) {
            this.W.L = 0.0F;
         } else {
            this.W.L = 1.0F;
         }

         class06889 class06889x = var1.u;
         class06889x = new class06889(class06889x.M, 0.0, class06889x.Z);
         class06889 class06889x = new class06889(var1.L.M - var1.i.M, 0.0, var1.L.Z - var1.i.Z).u().y((float) (Math.PI / 2));
         double d1 = class06889x.y(class06889x);
         this.W.y = class04995.N((float)Math.abs(d1)) * 2.0F * (float)Math.signum(d1);
      }

      this.W.U = true;
      float f1 = var1.y;
      this.P[0].R = class04995.m(f1) * (float) Math.PI * 0.05F;
      this.P[1].R = class04995.m(f1) * (float) Math.PI * 0.1F;
      this.P[2].R = class04995.m(f1) * (float) Math.PI * 0.15F;
   }
}
