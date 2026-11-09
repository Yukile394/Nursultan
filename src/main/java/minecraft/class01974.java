package minecraft;

import java.util.Map;

class class01974 extends class05765<class01964> {
   protected void y(class04782 var1, class01964 var2, long var3) {
      if (this.N(var3)) {
         var2.method_18868().N(class05378.NF, class06244.field_17274, 9600L);
      } else {
         class01984.N(var2);
      }
   }

   class01974(int var1, int var2) {
      super(
         Map.of(
            class05378.NN,
            class05367.field_18457,
            class05378.m,
            class05367.field_18457,
            class05378.yu,
            class05367.field_18456,
            class05378.NF,
            class05367.field_18457
         ),
         var1,
         var2
      );
   }

   protected void u(class04782 var1, class01964 var2, long var3) {
      var2.N(class01972.field_42670);
   }

   protected boolean N(class04782 var1, class01964 var2, long var3) {
      return var2.method_18868().L(class05378.yu).isPresent() && var2.G() && !var2.NX();
   }

   protected boolean N(class04782 var1, class01964 var2) {
      return var2.v();
   }
}
