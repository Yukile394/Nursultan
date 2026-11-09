package minecraft;

public class class05690 extends class05699<class05690> {
   private static final class01894 y = class01894.y("textures/gui/container/stats_icons.png");
   private final class04086 L;
   private final class00392 u;

   public class05690(class03556<class04086> var1, class03556 var2) {
      super();
      this.N = var1;
      this.L = (class04086)var2.N();
      this.u = var2.i().map(var0 -> class00392.L(var0.N().B("flat_world_preset"))).orElse(class05720.L);
   }

   private void N(class01054 var1, int var2, int var3, class06581 var4) {
      this.N(var1, var2 + 1, var3 + 1);
      var1.y(new class06584(var4), var2 + 2, var3 + 2);
   }

   void N() {
      this.N.method_25313(this);
      this.N.N.i = this.L.y();
      this.N.N.u.method_1852(class05720.N(this.N.N.i));
      this.N.N.u.method_1870(false);
   }

   private void N(class01054 var1, int var2, int var3) {
      var1.N(class08394.Na, class05720.N, var2, var3, 18, 18);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.N();
      return super.method_25402(var1, var2);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.N(var1, this.method_73380(), this.method_73382(), this.L.N().N());
      var1.y(this.N.N.field_22793, this.u, this.method_73380() + 18 + 5, this.method_73382() + 6, -1);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", this.u);
   }
}
