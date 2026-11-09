package minecraft;

public class class02768 {
   private static final float N = (float) (Math.PI / 12);
   private static final float y = (float) (-Math.PI / 12);
   private float L;
   private float u;
   private float i;
   private float R;
   private float M;
   private float B;
   private final class07438 Z;

   public float L(float var1) {
      return class04995.B(var1, this.B, this.i);
   }

   public class02768(class07438 var1) {
      super();
      this.Z = var1;
   }

   public float y(float var1) {
      return class04995.B(var1, this.M, this.u);
   }

   public void N() {
      this.R = this.L;
      this.M = this.u;
      this.B = this.i;
      float f;
      float f1;
      float f2;
      if (this.Z.method_6128()) {
         float f3 = 1.0F;
         class06889 class06889x = this.Z.method_18798();
         if (class06889x.B < 0.0) {
            class06889 class06889x = class06889x.u();
            f3 = 1.0F - (float)Math.pow(-class06889x.B, 1.5);
         }

         f = class04995.B(f3, (float) (Math.PI / 12), (float) (Math.PI / 9));
         f1 = class04995.B(f3, (float) (-Math.PI / 12), (float) (-Math.PI / 2));
         f2 = 0.0F;
      } else if (this.Z.method_18276()) {
         f = (float) (Math.PI * 2.0 / 9.0);
         f1 = (float) (-Math.PI / 4);
         f2 = 0.08726646F;
      } else {
         f = (float) (Math.PI / 12);
         f1 = (float) (-Math.PI / 12);
         f2 = 0.0F;
      }

      this.L = this.L + (f - this.L) * 0.3F;
      this.u = this.u + (f2 - this.u) * 0.3F;
      this.i = this.i + (f1 - this.i) * 0.3F;
   }

   public float N(float var1) {
      return class04995.B(var1, this.R, this.L);
   }
}
