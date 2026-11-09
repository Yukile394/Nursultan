package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class05337 extends class05355<class07438> {
   public class05337() {
      super();
   }

   @Override
   protected void N(class04782 var1, class07438 var2) {
      class01289<?> class01289 = var2.method_18868();
      class07072 class07072 = var2.method_6081();
      if (class07072 != null) {
         class01289.N(class05378.d, var2.method_6081());
         class07049 class07049 = class07072.u();
         if (class07049 instanceof class07438) {
            class01289.N(class05378.w, (class07438)class07049);
         }
      } else {
         class01289.y(class05378.d);
      }

      class01289.L(class05378.w).ifPresent(var2x -> {
         if (!var2x.method_5805() || var2x.method_73183() != var1) {
            class01289.y(class05378.w);
         }
      });
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.d, class05378.w);
   }
}
