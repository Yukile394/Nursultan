package minecraft;

abstract class class04596 extends class07473 {
   public abstract boolean M();

   class04596(class04626 var1) {
      super();
      this.N = var1;
   }

   public abstract boolean Z();

   @Override
   public boolean y() {
      return this.Z() && !this.N.P_();
   }

   @Override
   public boolean N() {
      return this.M() && !this.N.P_();
   }
}
