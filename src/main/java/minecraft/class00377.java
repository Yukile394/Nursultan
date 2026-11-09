package minecraft;

class class00377 implements class00373 {
   private float y;
   private float L;
   private long u;

   class00377(float var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(long var1, float var3) {
      this.u = var1;
      float f = class04995.L(var3 - this.y + 0.5F, 1.0F) - 0.5F;
      this.L += f * 0.1F;
      this.L = this.L * this.N;
      this.y = class04995.L(this.y + this.L, 1.0F);
   }

   @Override
   public boolean N(long var1) {
      return this.u != var1;
   }

   @Override
   public float N() {
      return this.y;
   }
}
