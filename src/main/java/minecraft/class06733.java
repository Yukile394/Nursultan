package minecraft;

public class class06733 {
   public class06733() {
      super();
   }

   public static <S extends class08827> void N(S var0, class01421 var1) {
      if (!(var0.NX <= 0.0F)) {
         class08174 class08174 = var0.i().method_58694(class02484.X);
         float f = class08174 != null ? class08174.M() : 0.0F;
         float f1 = 0.125F;
         float f2 = var0.NX;
         float f3 = class08173.w(N(f2, 0.05F, 0.2F));
         float f4 = class08173.d(N(f2, 0.4F, 1.0F));
         var1.N(class02058.N.N(70.0F * (f3 - f4)), 0.0F, -0.125F, 0.125F);
         var1.N(0.0F, f * (f3 - f4), 0.0F);
      }
   }

   private static float N(float var0) {
      return 0.4F * (class08173.G(N(var0, 1.0F, 3.0F)) - class08173.n(N(var0, 3.0F, 10.0F)));
   }

   public static void N(float var0, class01421 var1, float var2, class07070 var3, class06584 var4) {
      class08174 class08174 = var4.method_58694(class02484.X);
      if (class08174 != null) {
         class06718 class06718 = class06718.N(class08174, var2);
         int i = var3 == class07070.field_6183 ? 1 : -1;
         var1.N(
            (double)(i * (class06718.N() * 0.15F + class06718.u() * -0.05F + class06718.i() * -0.1F + class06718.Z() * 0.005F)),
            (double)(class06718.N() * -0.075F + class06718.L() * 0.075F + class06718.z() * 0.01F),
            class06718.y() * 0.05 + class06718.u() * -0.05 + class06718.Z() * 0.005F
         );
         var1.N(
            class02058.y.N(-65.0F * class08173.O(class06718.N()) - 35.0F * class06718.R() + 100.0F * class06718.M() + -0.5F * class06718.z()), 0.0F, 0.1F, 0.0F
         );
         var1.N(class02058.L.N(i * (-90.0F * N(class06718.N(), 0.5F, 0.55F) + 90.0F * class06718.i() + 2.0F * class06718.Z())), i * 0.15F, 0.0F, 0.0F);
         var1.N(0.0F, -N(var0), 0.0F);
      }
   }

   public static void N(float var0, class01421 var1, int var2, class07070 var3) {
      float f = class08173.n(N(var0, 0.0F, 0.05F));
      float f1 = class08173.t(N(var0, 0.05F, 0.2F));
      float f2 = class08173.d(N(var0, 0.4F, 1.0F));
      var1.N(var2 * 0.1F * (f - f1), -0.075F * (f - f2), 0.65F * (f - f1));
      var1.N(class02058.y.N(-70.0F * (f - f2)));
      var1.N(0.0, 0.0, -0.25 * (f2 - f1));
   }

   static float N(float var0, float var1, float var2) {
      return class04995.N(class04995.R(var0, var1, var2), 0.0F, 1.0F);
   }

   public static <T extends class08467> void N(class01686 var0, class01686 var1, boolean var2, class06584 var3, T var4) {
      int i = var2 ? 1 : -1;
      var0.R = -0.1F * i + var1.R;
      var0.i = (float) (-Math.PI / 2) + var1.i + 0.8F;
      if (var4.g || var4.L > 0.0F) {
         var0.i -= 0.9599311F;
      }

      var0.R = (float) (Math.PI / 180.0) * Math.clamp((180.0F / (float)Math.PI) * var0.R, -60.0F, 60.0F);
      var0.i = (float) (Math.PI / 180.0) * Math.clamp((180.0F / (float)Math.PI) * var0.i, -120.0F, 30.0F);
      if (!(var4.R <= 0.0F) && (!var4.o || var4.B == (var2 ? class07050.field_5808 : class07050.field_5810))) {
         class08174 class08174 = var3.method_58694(class02484.X);
         if (class08174 != null) {
            class06718 class06718 = class06718.N(class08174, var4.R);
            var0.R = var0.R + -i * class06718.z() * (float) (Math.PI / 180.0) * class06718.B() * 1.0F;
            var0.M = var0.M + -i * class06718.Z() * (float) (Math.PI / 180.0) * class06718.B() * 0.5F;
            var0.i = var0.i
               + (float) (Math.PI / 180.0)
                  * (
                     -40.0F * class06718.y()
                        + 30.0F * class06718.L()
                        + -20.0F * class06718.u()
                        + 20.0F * class06718.R()
                        + 10.0F * class06718.M()
                        + 0.6F * class06718.Z() * class06718.B()
                  );
         }
      }
   }

   public static <S extends class08827> void N(S var0, class01421 var1, float var2, class07070 var3, class06584 var4) {
      class08174 class08174 = var4.method_58694(class02484.X);
      if (class08174 != null && var2 != 0.0F) {
         float f = class08173.w(N(var0.NX, 0.05F, 0.2F));
         float f1 = class08173.d(N(var0.NX, 0.4F, 1.0F));
         class06718 class06718 = class06718.N(class08174, var2);
         int i = var3 == class07070.field_6183 ? 1 : -1;
         float f2 = 1.0F - class08173.t(1.0F - class06718.N());
         float f3 = 0.125F;
         float f4 = N(var0.Ni);
         var1.N(0.0, -f4 * 0.4, (double)(-class08174.M() * (f2 - class06718.M()) + f4));
         var1.N(class02058.N.N(70.0F * (class06718.N() - class06718.M()) - 40.0F * (f - f1)), 0.0F, -0.03125F, 0.125F);
         var1.N(class02058.u.N(i * 90 * (class06718.N() - class06718.i() + 3.0F * f1 + f)), 0.0F, 0.0F, 0.125F);
      }
   }

   public static <T extends class08467> void N(class01188<T> var0, T var1) {
      float f = var1.NX;
      class07070 class07070 = var1.M;
      var0.z.R = var0.z.R - var0.Z.R;
      var0.U.R = var0.U.R - var0.Z.R;
      var0.U.i = var0.U.i - var0.Z.R;
      float f1 = class08173.n(N(f, 0.0F, 0.05F));
      float f2 = class08173.w(N(f, 0.05F, 0.2F));
      float f3 = class08173.d(N(f, 0.4F, 1.0F));
      var0.N(class07070).i += (90.0F * f1 - 120.0F * f2 + 30.0F * f3) * (float) (Math.PI / 180.0);
   }
}
