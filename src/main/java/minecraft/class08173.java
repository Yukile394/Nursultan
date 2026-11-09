package minecraft;

public class class08173 {
   public static float w(float var0) {
      return var0 * var0;
   }

   public static float L(float var0) {
      return class04995.U(var0);
   }

   public static float M(float var0) {
      return class04995.z(class04995.z(var0)) * var0;
   }

   public static float P(float var0) {
      float f = 7.5625F;
      float f1 = 2.75F;
      if (var0 < 0.36363637F) {
         return 7.5625F * class04995.z(var0);
      } else if (var0 < 0.72727275F) {
         return 7.5625F * class04995.z(var0 - 0.54545456F) + 0.75F;
      } else {
         return var0 < 0.9090909090909091 ? 7.5625F * class04995.z(var0 - 0.8181818F) + 0.9375F : 7.5625F * class04995.z(var0 - 0.95454544F) + 0.984375F;
      }
   }

   public static float T(float var0) {
      return var0 == 1.0F ? 1.0F : 1.0F - (float)Math.pow(2.0, -10.0 * var0);
   }

   public static float Q(float var0) {
      return (float)(-Math.sqrt(1.0F - var0 * var0)) + 1.0F;
   }

   public class08173() {
      super();
   }

   public static float B(float var0) {
      return 1.0F - class04995.P(var0 * (float) (Math.PI / 2));
   }

   public static float Z(float var0) {
      return var0 < 0.5F ? (1.0F - P(1.0F - 2.0F * var0)) / 2.0F : (1.0F + P(2.0F * var0 - 1.0F)) / 2.0F;
   }

   public static float i(float var0) {
      return var0 == 0.0F ? 0.0F : (float)Math.pow(2.0, 10.0 * var0 - 10.0);
   }

   public static float b(float var0) {
      return 1.0F - class04995.z(1.0F - var0);
   }

   public static float s(float var0) {
      float f = (float) (Math.PI * 2.0 / 3.0);
      if (var0 == 0.0F) {
         return 0.0F;
      } else {
         return var0 == 1.0F ? 1.0F : (float)(Math.pow(2.0, -10.0 * var0) * Math.sin((var0 * 10.0 - 0.75) * (float) (Math.PI * 2.0 / 3.0)) + 1.0);
      }
   }

   public static float n(float var0) {
      return -(class04995.P((float) Math.PI * var0) - 1.0F) / 2.0F;
   }

   public static float l(float var0) {
      return 1.0F - class04995.U(1.0F - var0);
   }

   public static float d(float var0) {
      if (var0 < 0.5F) {
         return var0 == 0.0F ? 0.0F : (float)(Math.pow(2.0, 20.0 * var0 - 10.0) / 2.0);
      } else {
         return var0 == 1.0F ? 1.0F : (float)((2.0 - Math.pow(2.0, -20.0 * var0 + 10.0)) / 2.0);
      }
   }

   public static float m(float var0) {
      return var0 < 0.5 ? 16.0F * var0 * var0 * var0 * var0 * var0 : (float)(1.0 - Math.pow(-2.0 * var0 + 2.0, 5.0) / 2.0);
   }

   public static float k(float var0) {
      return (float)Math.sqrt(1.0F - class04995.z(var0 - 1.0F));
   }

   public static float t(float var0) {
      float f = 1.70158F;
      float f1 = 2.70158F;
      return 1.0F + 2.70158F * class04995.U(var0 - 1.0F) + 1.70158F * class04995.z(var0 - 1.0F);
   }

   public static float v(float var0) {
      return class04995.m(var0 * (float) (Math.PI / 2));
   }

   public static float j(float var0) {
      return 1.0F - (float)Math.pow(1.0 - var0, 5.0);
   }

   public static float U(float var0) {
      return var0 < 0.5F ? 4.0F * class04995.U(var0) : (float)(1.0 - Math.pow(-2.0 * var0 + 2.0, 3.0) / 2.0);
   }

   public static float z(float var0) {
      return var0 < 0.5F
         ? (float)((1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var0, 2.0))) / 2.0)
         : (float)((Math.sqrt(1.0 - Math.pow(-2.0 * var0 + 2.0, 2.0)) + 1.0) / 2.0);
   }

   public static float u(float var0) {
      if (var0 == 0.0F) {
         return 0.0F;
      } else if (var0 == 1.0F) {
         return 1.0F;
      } else {
         float f = (float) (Math.PI * 2.0 / 3.0);
         return (float)(-Math.pow(2.0, 10.0 * var0 - 10.0) * Math.sin((var0 * 10.0 - 10.75) * (float) (Math.PI * 2.0 / 3.0)));
      }
   }

   public static float y(float var0) {
      return 1.0F - P(1.0F - var0);
   }

   public static float E(float var0) {
      return var0 < 0.5F ? 2.0F * class04995.z(var0) : (float)(1.0 - Math.pow(-2.0 * var0 + 2.0, 2.0) / 2.0);
   }

   public static float N(float var0) {
      float f = 1.70158F;
      float f1 = 2.70158F;
      return class04995.z(var0) * (2.70158F * var0 - 1.70158F);
   }

   public static float W(float var0) {
      return var0 < 0.5F ? 8.0F * class04995.z(class04995.z(var0)) : (float)(1.0 - Math.pow(-2.0 * var0 + 2.0, 4.0) / 2.0);
   }

   public static float R(float var0) {
      return class04995.z(class04995.z(var0));
   }

   public static float O(float var0) {
      float f = 1.70158F;
      float f1 = 2.5949094F;
      if (var0 < 0.5F) {
         return 4.0F * var0 * var0 * (7.189819F * var0 - 2.5949094F) / 2.0F;
      } else {
         float f2 = 2.0F * var0 - 2.0F;
         return (f2 * f2 * (3.5949094F * f2 + 2.5949094F) + 2.0F) / 2.0F;
      }
   }

   public static float G(float var0) {
      return 1.0F - class04995.z(class04995.z(1.0F - var0));
   }

   public static float Y(float var0) {
      float f = (float) Math.PI * 4.0F / 9.0F;
      if (var0 == 0.0F) {
         return 0.0F;
      } else if (var0 == 1.0F) {
         return 1.0F;
      } else {
         double d0 = Math.sin((20.0 * var0 - 11.125) * (float) Math.PI * 4.0F / 9.0F);
         return var0 < 0.5F ? (float)(-(Math.pow(2.0, 20.0 * var0 - 10.0) * d0) / 2.0) : (float)(Math.pow(2.0, -20.0 * var0 + 10.0) * d0 / 2.0 + 1.0);
      }
   }
}
