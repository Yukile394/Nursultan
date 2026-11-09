package minecraft;

import org.joml.Vector3f;

public class class04366 {
   public class04366() {
      super();
   }

   public static Vector3f y(float var0, float var1, float var2) {
      return new Vector3f(var0 * (float) (Math.PI / 180.0), var1 * (float) (Math.PI / 180.0), var2 * (float) (Math.PI / 180.0));
   }

   public static Vector3f N(float var0, float var1, float var2) {
      return new Vector3f(var0, -var1, var2);
   }

   public static Vector3f N(double var0, double var2, double var4) {
      return new Vector3f((float)(var0 - 1.0), (float)(var2 - 1.0), (float)(var4 - 1.0));
   }
}
