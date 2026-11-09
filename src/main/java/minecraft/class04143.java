package minecraft;

class class04143<E> extends class04119<E> {
   class04143(class04140 var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return this.method_46910();
   }

   @Override
   public boolean trigger(class04782 var1, E var2, long var3) {
      class04118 class04118 = (class04118)this.N.N(var1, var2, var3);
      return class04118 == null ? false : class04118.trigger(var1, var2, var3);
   }

   @Override
   public String method_46910() {
      return "OneShot[" + this.N.N() + "]";
   }
}
