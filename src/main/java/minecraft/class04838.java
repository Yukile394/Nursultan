package minecraft;

public record class04838(float x, float y, float z, float xRot, float yRot, float zRot, float xScale, float yScale, float zScale) {
   public static final class04838 N = N(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);

   public class04838 L(float var1, float var2, float var3) {
      return new class04838(this.x + var1, this.y + var2, this.z + var3, this.xRot, this.yRot, this.zRot, this.xScale, this.yScale, this.zScale);
   }

   public float L() {
      return this.z;
   }

   public float M() {
      return this.xScale;
   }

   public class04838(float x, float y, float z, float xRot, float yRot, float zRot, float xScale, float yScale, float zScale) {
      super();
      this.x = x;
      this.y = y;
      this.z = z;
      this.xRot = xRot;
      this.yRot = yRot;
      this.zRot = zRot;
      this.xScale = xScale;
      this.yScale = yScale;
      this.zScale = zScale;
   }

   public float B() {
      return this.yScale;
   }

   public float Z() {
      return this.zScale;
   }

   public float i() {
      return this.yRot;
   }

   public float u() {
      return this.xRot;
   }

   public class04838 u(float var1, float var2, float var3) {
      return new class04838(
         this.x * var1, this.y * var2, this.z * var3, this.xRot, this.yRot, this.zRot, this.xScale * var1, this.yScale * var2, this.zScale * var3
      );
   }

   public static class04838 y(float var0, float var1, float var2) {
      return N(0.0F, 0.0F, 0.0F, var0, var1, var2);
   }

   public class04838 y(float var1) {
      return var1 == 1.0F ? this : this.u(var1, var1, var1);
   }

   public class04838 N(float var1) {
      return new class04838(this.x, this.y, this.z, this.xRot, this.yRot, this.zRot, var1, var1, var1);
   }

   public static class04838 N(float var0, float var1, float var2, float var3, float var4, float var5) {
      return new class04838(var0, var1, var2, var3, var4, var5, 1.0F, 1.0F, 1.0F);
   }

   public static class04838 N(float var0, float var1, float var2) {
      return N(var0, var1, var2, 0.0F, 0.0F, 0.0F);
   }

   public float N() {
      return this.x;
   }

   public float R() {
      return this.zRot;
   }
}
