package minecraft;

class class06269 extends class06937 {
   class06269(class06231 var1, class06695 var2, int var3, int var4, int var5, class05880 var6) {
      super(var2, var3, var4, var5);
      this.y = var1;
      this.N = var6;
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      this.y.T.get(0).N(1);
      this.y.T.get(1).N(1);
      var2.B().L(var2, var1);
      this.N.N_53((var1x, var2x) -> {
         long i = var1x.N();
         if (this.y.u != i) {
            var1x.method_8396(null, var2x, class04909.OH, class04911.field_15245, 1.0F, 1.0F);
            this.y.u = i;
         }
      });
      super.N(var1, var2);
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }
}
