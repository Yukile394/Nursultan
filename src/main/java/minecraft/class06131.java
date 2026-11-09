package minecraft;

class class06131<T extends class04680> {
   private static final long R = 600L;
   private final T M;
   final int N;
   final int y;
   private long B;
   private long Z;
   class04650 L;
   private long z;
   private float U;
   protected boolean u;

   public boolean L() {
      return this.u;
   }

   class06131(T var1, int var2, int var3, int var4) {
      super();
      this.i = var1;
      this.M = (T)var2;
      this.N = var3;
      this.y = var4;
      this.y();
   }

   public void u() {
      long ix = class07536.L();
      if (this.B == -1L) {
         this.B = ix;
         this.L = class04650.field_2210;
      }

      if (this.L == class04650.field_2210 && ix - this.B <= 600L) {
         this.Z = ix;
      }

      this.z = ix - this.Z;
      this.N(ix);
      this.M.N(this.i, this.z);
      class04650 class04650 = this.M.i();
      if (class04650 != this.L) {
         this.B = ix - (int)((1.0F - this.U) * 600.0F);
         this.L = class04650;
      }

      boolean flag = this.u;
      this.u = this.L == class04650.field_2209 && ix - this.B > 600L;
      if (this.u && !flag) {
         this.M.y();
      }
   }

   public void y() {
      this.B = -1L;
      this.Z = -1L;
      this.L = class04650.field_2209;
      this.z = 0L;
      this.U = 0.0F;
      this.u = false;
   }

   public void N(class01054 var1, int var2) {
      if (!this.u) {
         var1.i().pushMatrix();
         var1.i().translate(this.M.N(var2, this.U), this.M.N(this.N));
         this.M.N(var1, (class01590)this.i.N.i_3, this.z);
         var1.i().popMatrix();
      }
   }

   private void N(long var1) {
      float f = class04995.N((float)(var1 - this.B) / 600.0F, 0.0F, 1.0F);
      f *= f;
      if (this.L == class04650.field_2209) {
         this.U = 1.0F - f;
      } else {
         this.U = f;
      }
   }

   public T N() {
      return this.M;
   }
}
