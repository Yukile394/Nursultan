package minecraft;

class class04603 extends class07989 {
   class04603(class04626 var1, class04626 var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   public boolean y() {
      return this.N.P_() && super.y();
   }

   @Override
   protected void N(class07079 var1, class07438 var2) {
      if (var1 instanceof class04626 && this.i.method_6057(var2)) {
         var1.y(var2);
      }
   }
}
