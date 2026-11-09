package minecraft;

class class03758 extends class05699<class03758> {
   private final class00392 y;
   private final class00392 L;
   private final class05482 u;

   class03758(class03790 var1, class00392 var2, class00392 var3, class05482 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      class00580 class00580 = var1.B();
      var1.y((class01590)class03790.y(this.N).i_3, this.y, this.method_73380(), this.method_73382(), -1);
      this.u.N(class00937.field_62009, this.method_73380(), this.method_73382() + 12, 9, class00580);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", class05220.N(this.y, this.L));
   }
}
