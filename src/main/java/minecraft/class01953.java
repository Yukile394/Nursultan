package minecraft;

import java.util.Map;

class class01953 extends class05765<class01964> {
   protected void y(class04782 var1, class01964 var2, long var3) {
      boolean flag = this.N(var3);
      var2.N(class01972.field_42665);
      if (flag) {
         var2.t().ifPresent(var1x -> {
            var2.method_18868().N(class05378.yL, var1x);
            var2.method_18868().N(class05378.m, new class05352(var1x, 1.25F, 0));
         });
      }
   }

   class01953(int var1, int var2) {
      super(Map.of(class05378.m, class05367.field_18457, class05378.yL, class05367.field_18457, class05378.NF, class05367.field_18457), var1, var2);
   }

   protected void u(class04782 var1, class01964 var2, long var3) {
      var2.N(class01972.field_42668);
   }

   protected boolean N(class04782 var1, class01964 var2, long var3) {
      return var2.v();
   }

   protected boolean N(class04782 var1, class01964 var2) {
      return !var2.method_6109() && var2.v();
   }
}
