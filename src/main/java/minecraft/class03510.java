package minecraft;

import org.joml.Matrix3x2f;

public class class03510 {
   public static final class03510 N = new class03510(class06176.N);
   public static final class03510 y = new class03510(class06176.y);
   public static final class03510 L = new class03510(class06176.L);
   private static final int u = 123;
   private static final int i = 69;
   private static final float R = (float) (-Math.PI / 9);
   private final class00392 M;

   public class03510(class00392 var1) {
      super();
      this.M = var1;
   }

   public void N(class01054 var1, int var2, class01590 var3, float var4) {
      int ix = var3.N(this.M);
      class00580 class00580 = var1.B();
      float f = (1.8F - class04995.L(class04995.m((float)(class07536.L() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F)) * 100.0F / (ix + 32);
      Matrix3x2f matrix3x2f = new Matrix3x2f(class00580.N().N()).translate(var2 / 2.0F + 123.0F, 69.0F).rotate((float) (-Math.PI / 9)).scale(f);
      class00577 class00577 = class00580.N().y(var4).N(matrix3x2f);
      class00580.N(class00937.field_62009, -ix / 2, -8, class00577, this.M);
   }
}
