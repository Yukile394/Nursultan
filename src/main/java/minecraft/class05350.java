package minecraft;

class class05350 extends class05699<class05350> {
   final class03529<class00780> N;
   final class00392 y;

   public class05350(class03529<class00780> var1, class03529 var2) {
      super();
      this.L = var1;
      this.N = var2;
      class01894 class01894 = var2.B().N();
      String s = class01894.B("biome");
      if (class07018.y().N(s)) {
         this.y = class00392.L(s);
      } else {
         this.y = class00392.y(class01894.toString());
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.L.method_25313(this);
      return super.method_25402(var1, var2);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.y(this.L.N.field_22793, this.y, this.method_73380() + 5, this.method_73382() + 2, -1);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", this.y);
   }
}
