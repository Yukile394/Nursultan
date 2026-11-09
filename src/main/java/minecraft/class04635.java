package minecraft;

class class04635 extends class04596 {
   @Override
   public void L() {
      class04620 class04620 = this.y.NO();
      if (class04620 != null) {
         class04620.N(this.y);
      }
   }

   @Override
   public boolean M() {
      if (this.y.C != null && this.y.d() && this.y.C.method_19769(this.y.method_73189(), 2.0)) {
         class04620 class04620 = this.y.NO();
         if (class04620 != null) {
            if (!class04620.u()) {
               return true;
            }

            this.y.C = null;
         }
      }

      return false;
   }

   class04635(class04626 var1) {
      super(var1);
      this.y = var1;
   }

   @Override
   public boolean Z() {
      return false;
   }
}
