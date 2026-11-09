package minecraft;

class class05749 extends class05762 {
   final class01627 N;
   private final int L;

   public class05749(class05732 var1, class01627 var2, int var3) {
      super();
      this.y = var1;
      this.N = var2;
      this.L = var3;
   }

   private void N(class01054 var1, int var2, int var3, class06584 var4) {
      this.N(var1, var2 + 1, var3 + 1);
      if (!var4.R()) {
         var1.y(var4, var2 + 2, var3 + 2);
      }
   }

   private void N(class01054 var1, int var2, int var3) {
      var1.N(class08394.Na, class05737.N, var2, var3, 18, 18);
   }

   private class06584 N(class00500 var1) {
      class06581 class06581 = var1.i().B();
      if (class06581 == class06570.N) {
         if (var1.N(class00869.K)) {
            class06581 = class06570.jE;
         } else if (var1.N(class00869.V)) {
            class06581 = class06570.jW;
         }
      }

      return new class06584(class06581);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.y.method_25313((class05762)this);
      return super.method_25402(var1, var2);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      class00500 class00500 = this.N.y();
      class06584 class06584 = this.N(class00500);
      this.N(var1, this.method_73380(), this.method_73382(), class06584);
      int i = this.method_73385() - 4;
      var1.y(this.y.L.field_22793, class06584.d(), this.method_73380() + 18 + 5, i, -1);
      class05216 class05216;
      if (this.L == 0) {
         class05216 = class00392.N("createWorld.customize.flat.layer.top", this.N.N());
      } else if (this.L == this.y.L.L.i().size() - 1) {
         class05216 = class00392.N("createWorld.customize.flat.layer.bottom", this.N.N());
      } else {
         class05216 = class00392.N("createWorld.customize.flat.layer", this.N.N());
      }

      var1.y(this.y.L.field_22793, class05216, this.method_73389() - this.y.L.field_22793.N(class05216), i, -1);
   }

   @Override
   public class00392 method_37006() {
      class06584 class06584 = this.N(this.N.y());
      return (class00392)(!class06584.R()
         ? class05220.N(class00392.N("narrator.select", class06584.d()), class05732.y, class00392.y(String.valueOf(this.N.N())))
         : class05220.N);
   }
}
