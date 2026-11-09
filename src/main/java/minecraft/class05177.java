package minecraft;

class class05177 implements class05143 {
   class05177() {
      super();
   }

   @Override
   public boolean N(class06433 var1) {
      return var1.L[class07211.field_11043.L()] && !var1.y[class07211.field_11043.L()].u;
   }

   @Override
   public class06476 N(class07211 var1, class06433 var2, class06069 var3) {
      class06433 class06433 = var2;
      if (!var2.L[class07211.field_11043.L()] || var2.y[class07211.field_11043.L()].u) {
         class06433 = var2.y[class07211.field_11035.L()];
      }

      class06433.u = true;
      class06433.y[class07211.field_11043.L()].u = true;
      return new class06444(var1, class06433);
   }
}
