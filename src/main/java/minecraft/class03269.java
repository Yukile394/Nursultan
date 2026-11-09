package minecraft;

public class class03269 {
   public float N;
   public float y;
   public float L;
   private float u = 1.0F;

   public float L() {
      return this.L * this.u;
   }

   public float L(float var1) {
      return (this.L - this.y * (1.0F - var1)) * this.u;
   }

   public class03269() {
      super();
   }

   public boolean u() {
      return this.y > 1.0E-5F;
   }

   public float y() {
      return this.y;
   }

   public float y(float var1) {
      return Math.min(class04995.B(var1, this.N, this.y), 1.0F);
   }

   public void N(float var1) {
      this.y = var1;
   }

   public void N() {
      this.N = 0.0F;
      this.y = 0.0F;
      this.L = 0.0F;
   }

   public void N(float var1, float var2, float var3) {
      this.N = this.y;
      this.y = this.y + (var1 - this.y) * var2;
      this.L = this.L + this.y;
      this.u = var3;
   }
}
