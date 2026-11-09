package minecraft;

import com.google.common.collect.ImmutableMap;

public class class05939 extends class05765<class08041> {
   private static final int y = 1200;
   final float N;

   protected void L(class04782 var1, class08041 var2, long var3) {
      var2.method_18868().L(class05378.u).ifPresent(var1x -> {
         class07209 class07209 = var1x.y();
         class04782 class04782 = var1.method_8503().N(var1x.N());
         if (class04782 != null) {
            class05368 class05368 = class04782.method_19494();
            if (class05368.N(class07209, var0x -> true)) {
               class05368.y(class07209);
            }

            var1.method_74535().y(class07209);
         }
      });
      var2.method_18868().y(class05378.u);
   }

   public class05939(float var1) {
      super(ImmutableMap.of(class05378.u, class05367.field_18456), 1200);
      this.N = var1;
   }

   protected void y(class04782 var1, class08041 var2, long var3) {
      class06293.N(var2, var2.method_18868().L(class05378.u).get().y(), this.N, 1);
   }

   protected boolean N(class04782 var1, class08041 var2) {
      return var2.method_18868().R().map(var0 -> var0 == class05359.y || var0 == class05359.L || var0 == class05359.u).orElse(true);
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      return var2.method_18868().N(class05378.u);
   }
}
