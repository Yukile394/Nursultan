package minecraft;

class class04600 extends class04596 {
   private final int L;
   private long u;

   @Override
   public void L() {
      if (this.y.C != null && this.y.method_73183().method_8477(this.y.C) && !this.y.Ng()) {
         this.y.G();
      }

      this.u = this.y.method_73183().N();
   }

   @Override
   public boolean M() {
      return this.y.method_73183().N() > this.u + this.L;
   }

   class04600(class04626 var1) {
      super(var1);
      this.y = var1;
      this.L = class04995.N(class04626.I(this.y), 20, 40);
      this.u = -1L;
   }

   @Override
   public boolean Z() {
      return false;
   }
}
