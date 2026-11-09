package minecraft;

class class04629 extends class04596 {
   private final int L;
   private long u;

   @Override
   public void L() {
      if (this.y.f != null && this.y.method_73183().method_8477(this.y.f) && !this.N(this.y.f)) {
         this.y.l();
      }

      this.u = this.y.method_73183().N();
   }

   @Override
   public boolean M() {
      return this.y.method_73183().N() > this.u + this.L;
   }

   class04629(class04626 var1) {
      super(var1);
      this.y = var1;
      this.L = class04995.N(class04626.g(this.y), 20, 40);
      this.u = -1L;
   }

   @Override
   public boolean Z() {
      return false;
   }

   private boolean N(class07209 var1) {
      return class04626.N(this.y.method_73183().method_8320(var1));
   }
}
