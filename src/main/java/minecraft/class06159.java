package minecraft;

import java.util.List;

class class06159 extends class06937 {
   class06159(class06146 var1, class06695 var2, int var3, int var4, int var5, class05880 var6) {
      super(var2, var3, var4, var5);
      this.y = var1;
      this.N = var6;
   }

   private List<class06584> z() {
      return List.of(this.y.i.i());
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      var2.N(var1, var2.c());
      this.y.n.N(var1, this.z());
      if (!this.y.i.N(1).R()) {
         this.y.N(this.y.L.y());
      }

      this.N.N_53((var1x, var2x) -> {
         long i = var1x.N();
         if (this.y.u != i) {
            var1x.method_8396(null, var2x, class04909.Oc, class04911.field_15245, 1.0F, 1.0F);
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
