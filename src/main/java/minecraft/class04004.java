package minecraft;

import com.google.common.collect.ImmutableMap;

public class class04004<E extends class04003> extends class05765<E> {
   private static final double N = 6.0;
   private static final double y = 20.0;

   protected void y(class04782 var1, E var2, long var3) {
      if (var2.method_41328(class01312.field_38098)) {
         var2.method_18380(class01312.field_18076);
      }

      var2.method_18868().y(class05378.NH);
      var2.method_18868().L(class05378.Q).filter(var2::L).ifPresent(var1x -> {
         if (var2.method_43259(var1x, 6.0, 20.0)) {
            var2.i(var1x);
         }

         if (!var2.method_18868().N(class05378.NV)) {
            class03984.N(var2, var1x.method_24515());
         }
      });
   }

   public class04004(int var1) {
      super(
         ImmutableMap.of(
            class05378.NH,
            class05367.field_18456,
            class05378.s,
            class05367.field_18457,
            class05378.m,
            class05367.field_18457,
            class05378.P,
            class05367.field_18458,
            class05378.Q,
            class05367.field_18458,
            class05378.NV,
            class05367.field_18458,
            class05378.NF,
            class05367.field_18458
         ),
         var1
      );
   }

   protected void u(class04782 var1, E var2, long var3) {
      var2.method_5783(class04909.IP, 5.0F, 1.0F);
   }

   protected boolean N(class04782 var1, E var2, long var3) {
      return true;
   }
}
