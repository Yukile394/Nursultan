package minecraft;

public class class06280 extends class05699<class06280> {
   final String N;
   private final class00392 L;

   public class06280(class06324 var1, String var2, class08430 var3) {
      super();
      this.y = var1;
      this.N = var2;
      this.L = var3.N();
   }

   private void N() {
      this.y.method_25313(this);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         this.N();
         this.y.N.N();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.N();
      if (var2) {
         this.y.N.N();
      }

      return super.method_25402(var1, var2);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.N(class06279.N(this.y.N), this.L, class06324.N(this.y) / 2, this.method_73385() - 4, -1);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", this.L);
   }
}
