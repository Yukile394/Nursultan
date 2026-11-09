package minecraft;

import java.util.Map;
import java.util.Optional;

class class01961 extends class05765<class01964> {
   protected void y(class04782 var1, class01964 var2, long var3) {
      if (var2.G() && var2.v()) {
         var2.method_18868().N(class05378.yu, true);
      }

      var2.method_18868().y(class05378.m);
      var2.method_18868().y(class05378.yL);
   }

   class01961() {
      super(Map.of(class05378.m, class05367.field_18456, class05378.NN, class05367.field_18457, class05378.yL, class05367.field_18456), 600);
   }

   protected void u(class04782 var1, class01964 var2, long var3) {
      var2.N(class01972.field_42669);
   }

   protected boolean N(class04782 var1, class01964 var2, long var3) {
      if (!var2.v()) {
         var2.N(class01972.field_42665);
         return false;
      } else {
         Optional optional = var2.method_18868().L(class05378.m).map(class05352::N).map(class05779::y);
         Optional<class07209> optional1 = var2.method_18868().L(class05378.yL);
         return !optional.isEmpty() && !optional1.isEmpty() ? optional1.get().equals(optional.get()) : false;
      }
   }

   protected boolean N(class04782 var1, class01964 var2) {
      return var2.v();
   }
}
