package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class05735 extends class05765<class08041> {
   private static final int N = 300;
   private static final double y = 1.73;
   private long L;

   public class05735() {
      super(ImmutableMap.of(class05378.L, class05367.field_18456, class05378.P, class05367.field_18458));
   }

   protected void y(class04782 var1, class08041 var2) {
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      Optional<class06289> optional = var2.method_18868().L(class05378.L);
      if (optional.isEmpty()) {
         return false;
      } else {
         class06289 class06289 = optional.get();
         return class06289.N() == var1.method_27983() && class06289.y().method_19769(var2.method_73189(), 1.73);
      }
   }

   protected boolean N(class04782 var1, class08041 var2) {
      if (var1.N() - this.L < 300L) {
         return false;
      } else if (var1.field_9229.y(2) != 0) {
         return false;
      } else {
         this.L = var1.N();
         class06289 class06289 = var2.method_18868().L(class05378.L).get();
         return class06289.N() == var1.method_27983() && class06289.y().method_19769(var2.method_73189(), 1.73);
      }
   }

   protected void u(class04782 var1, class08041 var2, long var3) {
      class01289<class08041> class01289 = var2.method_18868();
      class01289.N(class05378.V, var3);
      class01289.L(class05378.L).ifPresent(var1x -> class01289.N(class05378.P, new class05744(var1x.y())));
      var2.l();
      this.y(var1, var2);
      if (var2.u(var1)) {
         var2.v();
      }
   }
}
