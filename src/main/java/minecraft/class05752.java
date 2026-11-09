package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class05752 extends class05765<class07438> {
   public static final int N = 100;
   private long y;

   public class05752() {
      super(ImmutableMap.of(class05378.y, class05367.field_18456, class05378.K, class05367.field_18458));
   }

   @Override
   protected void u(class04782 var1, class07438 var2, long var3) {
      if (var3 > this.y) {
         class01289<?> class01289 = var2.method_18868();
         if (class01289.N(class05378.G)) {
            Set<class06289> set = class01289.L(class05378.G).get();
            Optional<List<class07438>> optional;
            if (class01289.N(class05378.M)) {
               optional = class01289.L(class05378.M);
            } else {
               optional = Optional.empty();
            }

            class05758.N(var1, var2, null, null, set, optional);
         }

         var2.method_18403(var2.method_18868().L(class05378.y).get().y());
      }
   }

   @Override
   protected void y(class04782 var1, class07438 var2, long var3) {
      if (var2.method_6113()) {
         var2.method_18400();
         this.y = var3 + 40L;
      }
   }

   @Override
   protected boolean N(class04782 var1, class07438 var2, long var3) {
      Optional<class06289> optional = var2.method_18868().L(class05378.y);
      if (optional.isEmpty()) {
         return false;
      } else {
         class07209 class07209 = optional.get().y();
         return var2.method_18868().L(class05359.i)
            && var2.method_23318() > class07209.method_10264() + 0.4
            && class07209.method_19769(var2.method_73189(), 1.14);
      }
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   @Override
   protected boolean N(class04782 var1, class07438 var2) {
      if (var2.method_5765()) {
         return false;
      } else {
         class01289<?> class01289 = var2.method_18868();
         class06289 class06289 = class01289.L(class05378.y).get();
         if (var1.method_27983() != class06289.N()) {
            return false;
         } else {
            Optional<Long> optional = class01289.L(class05378.K);
            if (optional.isPresent()) {
               long i = var1.N() - optional.get();
               if (i > 0L && i < 100L) {
                  return false;
               }
            }

            class00500 class00500 = var1.method_8320(class06289.y());
            return class06289.y().method_19769(var2.method_73189(), 2.0) && class00500.N(class01210.F) && !class00500.L(class07789.L);
         }
      }
   }
}
