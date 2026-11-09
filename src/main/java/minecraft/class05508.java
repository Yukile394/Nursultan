package minecraft;

import it.unimi.dsi.fastutil.longs.LongArraySet;

class class05508 implements class05532 {
   class05508(class05520 var1, class05494 var2, class05531 var3, int var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public void y(class05513 var1, class05520 var2) {
      if (this.u.u) {
         this.u.u();
         new LongArraySet(this.u.y.method_17984()).forEach(var1x -> this.u.y.method_17988(class07321.N(var1x), class07321.y(var1x), false));
         class05492.N.N();
         var1.R().v();
      } else {
         this.y(var1);
      }
   }

   private void y(class05513 var1) {
      var1.R().v();
      if (this.N.Z()) {
         this.u.L.forEach(var1x -> var1x.y(var0));
         new LongArraySet(this.u.y.method_17984()).forEach(var1x -> this.u.y.method_17988(class07321.N(var1x), class07321.y(var1x), false));
         this.u.N(this.L + 1);
      }
   }

   @Override
   public void N(class05513 var1, class05513 var2, class05520 var3) {
   }

   @Override
   public void N(class05513 var1) {
   }

   @Override
   public void N(class05513 var1, class05520 var2) {
      this.y(var1);
   }
}
