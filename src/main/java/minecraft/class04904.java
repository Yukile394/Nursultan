package minecraft;

class class04904 extends class04892 {
   class04904() {
      super();
   }

   @Override
   public void N(class06069 var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         float f = var1.z();
         if (f < 0.2F) {
            this.N = class00869.Rs.W();
         } else if (f < 0.5F) {
            this.N = class00869.RP.W();
         } else if (f < 0.55F) {
            this.N = class00869.Rt.W();
         } else {
            this.N = class00869.Rm.W();
         }
      } else {
         this.N = class00869.mr.W();
      }
   }
}
