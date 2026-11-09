package minecraft;

class class00407 extends class01114 {
   class00407(class00379 var1) {
      super();
      this.N = var1;
   }

   @Override
   protected void y(class07299 var1, class07209 var2, class00500 var3) {
      if (var3.i() instanceof class00860 class00860) {
         class00379.N(var1, var2, var3, class00860.v());
      }
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class00500 var3) {
      if (var3.i() instanceof class00860 class00860) {
         class00379.N(var1, var2, var3, class00860.j());
      }
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class00500 var3, int var4, int var5) {
      this.N.N(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean N(class08036 var1) {
      if (!((class07482)var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 instanceof class07490)) {
         return false;
      } else {
         class06695 class06695 = ((class07490)((class07482)var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_3)).E();
         return class06695 == this.N || class06695 instanceof class06710 && ((class06710)class06695).method_5405(this.N);
      }
   }
}
