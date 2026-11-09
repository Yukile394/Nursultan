package minecraft;

public class class02113 {
   private final int N;
   private final int y;
   private final float L;
   private final float u;

   public int L(int var1) {
      return var1 & this.N;
   }

   public class02113(int var1) {
      super();
      if (var1 < 2) {
         throw new IllegalArgumentException("Precision cannot be less than 2 bits");
      } else if (var1 > 30) {
         throw new IllegalArgumentException("Precision cannot be greater than 30 bits");
      } else {
         int i = 1 << var1;
         this.N = i - 1;
         this.y = var1;
         this.L = i / 360.0F;
         this.u = 360.0F / i;
      }
   }

   public int y(float var1) {
      return this.L(this.N(var1));
   }

   public float y(int var1) {
      float f = this.N(this.L(var1));
      return f >= 180.0F ? f - 360.0F : f;
   }

   public int N() {
      return this.N;
   }

   public boolean N(int var1, int var2) {
      int i = this.N() >> 1;
      return (var1 & i) == (var2 & i);
   }

   public int N(class07211 var1) {
      return var1.z().y() ? 0 : var1.u() << this.y - 2;
   }

   public float N(int var1) {
      return var1 * this.u;
   }

   public int N(float var1) {
      return Math.round(var1 * this.L);
   }
}
