package minecraft;

class class05198 implements class05197 {
   private final float y;
   private int L;
   private class00405 u;
   private boolean i;
   private float R;
   private int M;
   private class00405 B;
   private int Z;
   private int z;

   private boolean L() {
      return this.L != -1;
   }

   public class05198(class05228 var1, float var2) {
      super();
      this.N = var1;
      this.L = -1;
      this.u = class00405.N;
      this.M = -1;
      this.B = class00405.N;
      this.y = Math.max(var2, 1.0F);
   }

   @Override
   public boolean accept(int var1, class00405 var2, int var3) {
      int ix = var1 + this.z;
      switch (var3) {
         case 10:
            return this.N(ix, var2);
         case 32:
            this.M = ix;
            this.B = var2;
         default:
            float f = this.N.N.getWidth(var3, var2);
            this.R += f;
            if (!this.i || !(this.R > this.y)) {
               this.i |= f != 0.0F;
               this.Z = ix + Character.charCount(var3);
               return true;
            } else {
               return this.M != -1 ? this.N(this.M, this.B) : this.N(ix, var2);
            }
      }
   }

   public class00405 y() {
      return this.u;
   }

   public void N(int var1) {
      this.z += var1;
   }

   public int N() {
      return this.L() ? this.L : this.Z;
   }

   private boolean N(int var1, class00405 var2) {
      this.L = var1;
      this.u = var2;
      return false;
   }
}
