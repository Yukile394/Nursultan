package minecraft;

class class06116 extends class05801 {
   class06116(class06087 var1, int var2, int var3, int var4, int var5, class00392 var6, double var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.N = var1;
      this.method_25346();
   }

   @Override
   protected void method_25344() {
      this.N.N = class04995.N(class04995.y(this.field_22753, 0.0, 20.0));
   }

   @Override
   protected void method_25346() {
      this.method_25355(class00392.N("jigsaw_block.levels", this.N.N));
   }
}
