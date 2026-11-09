package minecraft;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class06607 {
   private final float[] N;

   public float L(int var1) {
      return this.N[3 * var1 + this.u(1)];
   }

   public class06607(int var1) {
      super();
      this.N = new float[3 * var1];
   }

   private int u(int var1) {
      return 2;
   }

   public float y(int var1) {
      return this.N[3 * var1 + 1];
   }

   public void N(int var1, float var2, float var3, float var4) {
      this.N[3 * var1 + 0] = var2;
      this.N[3 * var1 + 1] = var3;
      this.N[3 * var1 + 2] = var4;
   }

   public int N() {
      return this.N.length / 3;
   }

   public Vector3f N(int var1, Vector3f var2) {
      return var2.set(this.N[3 * var1 + 0], this.N[3 * var1 + 1], this.N[3 * var1 + 2]);
   }

   public float N(int var1) {
      return this.N[3 * var1 + 0];
   }

   public void N(int var1, Vector3fc var2) {
      this.N(var1, var2.x(), var2.y(), var2.z());
   }
}
