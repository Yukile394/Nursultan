package minecraft;

record class06718(
   float raiseProgress,
   float raiseProgressStart,
   float raiseProgressMiddle,
   float raiseProgressEnd,
   float swayProgress,
   float lowerProgress,
   float raiseBackProgress,
   float swayIntensity,
   float swayScaleSlow,
   float swayScaleFast
) {
   public float L() {
      return this.raiseProgressMiddle;
   }

   public float M() {
      return this.raiseBackProgress;
   }

   class06718(
      float raiseProgress,
      float raiseProgressStart,
      float raiseProgressMiddle,
      float raiseProgressEnd,
      float swayProgress,
      float lowerProgress,
      float raiseBackProgress,
      float swayIntensity,
      float swayScaleSlow,
      float swayScaleFast
   ) {
      super();
      this.raiseProgress = raiseProgress;
      this.raiseProgressStart = raiseProgressStart;
      this.raiseProgressMiddle = raiseProgressMiddle;
      this.raiseProgressEnd = raiseProgressEnd;
      this.swayProgress = swayProgress;
      this.lowerProgress = lowerProgress;
      this.raiseBackProgress = raiseBackProgress;
      this.swayIntensity = swayIntensity;
      this.swayScaleSlow = swayScaleSlow;
      this.swayScaleFast = swayScaleFast;
   }

   public float B() {
      return this.swayIntensity;
   }

   public float Z() {
      return this.swayScaleSlow;
   }

   public float i() {
      return this.swayProgress;
   }

   public float z() {
      return this.swayScaleFast;
   }

   public float u() {
      return this.raiseProgressEnd;
   }

   public float y() {
      return this.raiseProgressStart;
   }

   public static class06718 N(class08174 var0, float var1) {
      int i = var0.L();
      int j = var0.u().map(class08169::N).orElse(0) + i - 20;
      int k = var0.i().map(class08169::N).orElse(0) + i;
      int l = k - 40;
      int i1 = var0.R().map(class08169::N).orElse(0) + i;
      float f = class06733.N(var1, 0.0F, i);
      float f1 = class06733.N(f, 0.0F, 0.5F);
      float f2 = class06733.N(f, 0.5F, 0.8F);
      float f3 = class06733.N(f, 0.8F, 1.0F);
      float f4 = class06733.N(var1, j, l);
      float f5 = class08173.l(class08173.Y(class06733.N(var1 - 20.0F, l, k)));
      float f6 = class06733.N(var1, i1 - 5, i1);
      float f7 = 2.0F * class08173.k(f4) - 2.0F * class08173.Q(f6);
      float f8 = class04995.m(var1 * 19.0F * (float) (Math.PI / 180.0)) * f7;
      float f9 = class04995.m(var1 * 30.0F * (float) (Math.PI / 180.0)) * f7;
      return new class06718(f, f1, f2, f3, f4, f5, f6, f7, f8, f9);
   }

   public float N() {
      return this.raiseProgress;
   }

   public float R() {
      return this.lowerProgress;
   }
}
