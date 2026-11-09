package minecraft;

class class01335 extends class07655 {
   class01335(class01377 var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected boolean y(class04425 var1) {
      return var1 != class04425.field_14 && var1 != class04425.field_3 && var1 != class04425.field_9 ? super.y(var1) : true;
   }

   @Override
   protected class07068 N(int var1) {
      this.s = new class07955();
      return new class07068(this.s, var1);
   }

   @Override
   public boolean N(class07209 var1) {
      return this.L.method_8320(var1).N(class00869.V) || super.N(var1);
   }
}
