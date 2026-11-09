package minecraft;

public record class00578(float L, float u, float i, float R, float M, class00405 B) implements class00620 {
   public static final float N = 9.0F;
   public static final float y = 7.0F;

   public float L() {
      return this.i;
   }

   @Override
   public float P() {
      return this.L;
   }

   @Override
   public float T() {
      return this.L + this.i;
   }

   public class00578(float L, float u, float i, float R, float M, class00405 B) {
      super();
      this.L = L;
      this.u = u;
      this.i = i;
      this.R = R;
      this.M = M;
      this.B = B;
   }

   public float i() {
      return this.M;
   }

   @Override
   public float b() {
      return this.s() + this.M;
   }

   @Override
   public float s() {
      return this.u + 7.0F - this.R;
   }

   @Override
   public class00405 z() {
      return this.B;
   }

   public float u() {
      return this.R;
   }

   public float y() {
      return this.u;
   }

   public float N() {
      return this.L;
   }
}
