package minecraft;

class class04617 extends class07952<class08036> {
   class04617(class04626 var1) {
      super(var1, class08036.class, 10, true, false, var1::N);
   }

   private boolean U() {
      class04626 class04626 = (class04626)this.i;
      return class04626.P_() && !class04626.NJ();
   }

   @Override
   public boolean y() {
      if (this.U() && this.i.T() != null) {
         return super.y();
      } else {
         this.M = null;
         return false;
      }
   }

   @Override
   public boolean N() {
      return this.U() && super.N();
   }
}
