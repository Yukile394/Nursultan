package minecraft;

class class06257 implements class05247 {
   class06257(class06248 var1) {
      super();
      this.N = var1;
   }

   @Override
   public float y() {
      return 0.5F;
   }

   @Override
   public float N() {
      return 0.5F;
   }

   @Override
   public float getAdvance() {
      return this.N.y() / 2 + 1;
   }
}
