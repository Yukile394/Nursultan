package minecraft;

import java.util.Map;

class class01985 extends class05765<class01964> {
   protected void y(class04782 var1, class01964 var2, long var3) {
      boolean flag = this.N(var3);
      var2.N(class01972.field_42665).N(flag);
      var2.method_18868().y(class05378.yu);
      var2.method_18868().N(class05378.yi, true);
   }

   class01985(int var1) {
      super(
         Map.of(
            class05378.NN,
            class05367.field_18457,
            class05378.m,
            class05367.field_18457,
            class05378.yu,
            class05367.field_18456,
            class05378.NF,
            class05367.field_18456
         ),
         var1,
         var1
      );
   }

   protected void u(class04782 var1, class01964 var2, long var3) {
      var2.N(class01972.field_42671);
   }

   protected boolean N(class04782 var1, class01964 var2, long var3) {
      return var2.method_18868().L(class05378.yu).isPresent();
   }

   protected boolean N(class04782 var1, class01964 var2) {
      return true;
   }
}
