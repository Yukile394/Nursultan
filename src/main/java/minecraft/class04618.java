package minecraft;

class class04618 extends class00125 {
   class04618(class04590 var1, class06584 var2) {
      super(class04611.N(var1.N), 1, 1, 18, 18, var2.d(), var2, false, true);
      this.N = var1;
   }

   @Override
   protected void N(class01054 var1, int var2, int var3) {
      super.N(var1, this.N.method_73380() + 18, this.N.method_73382() + 18);
   }

   @Override
   protected void method_48579(class01054 var1, int var2, int var3, float var4) {
      var1.N(class08394.Na, class04610.N, this.N.method_73380(), this.N.method_73382(), 18, 18);
      super.method_48579(var1, var2, var3, var4);
   }
}
