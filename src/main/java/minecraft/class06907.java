package minecraft;

class class06907 extends class06937 {
   class06907(class06951 var1, class06695 var2, int var3, int var4, int var5, class05880 var6) {
      super(var2, var3, var4, var5);
      this.y = var1;
      this.N = var6;
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      this.y.L.N(1);
      this.y.u.N(1);
      if (!this.y.L.R() || !this.y.u.R()) {
         this.y.N.N(-1);
      }

      this.N.N_53((var1x, var2x) -> {
         long i = var1x.N();
         if (this.y.i != i) {
            var1x.method_8396(null, var2x, class04909.Oe, class04911.field_15245, 1.0F, 1.0F);
            this.y.i = i;
         }
      });
      super.N(var1, var2);
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }
}
