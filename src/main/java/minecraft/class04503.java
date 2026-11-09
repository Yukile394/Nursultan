package minecraft;

import com.google.common.collect.ImmutableMap;

public class class04503 extends class05765<class04508> {
   private static final int N = 256;
   private static final int y = 5;
   private static final int L = 4;
   private static final float u = 0.7F;
   private static final int i = Math.round(15.0F);
   private static final int R = Math.round(4.0F);
   private static final int Z = Math.round(10.0F);

   protected void L(class04782 var1, class04508 var2, long var3) {
      if (var2.method_18376() == class01312.field_47247) {
         var2.method_18380(class01312.field_18076);
      }

      var2.method_18868().N(class05378.yz, class06244.field_17274, Z);
      var2.method_18868().y(class05378.yM);
   }

   public class04503() {
      super(
         ImmutableMap.of(
            class05378.s,
            class05367.field_18456,
            class05378.yz,
            class05367.field_18457,
            class05378.yB,
            class05367.field_18457,
            class05378.yZ,
            class05367.field_18457,
            class05378.yM,
            class05367.field_18456,
            class05378.m,
            class05367.field_18457,
            class05378.yE,
            class05367.field_18457
         ),
         i + 1 + R
      );
   }

   protected void u(class04782 var1, class04508 var2, long var3) {
      class01289<class04508> class01289 = var2.method_18868();
      class07438 class07438 = class01289.L(class05378.s).orElse(null);
      if (class07438 != null) {
         var2.method_5702(class07664.field_9851, class07438.method_73189());
         if (!class01289.L(class05378.yB).isPresent() && !class01289.L(class05378.yZ).isPresent()) {
            class01289.N(class05378.yZ, class06244.field_17274, R);
            double d0 = class07438.method_23317() - var2.method_23317();
            double d1 = class07438.method_23323(class07438.method_5765() ? 0.8 : 0.3) - var2.v();
            double d2 = class07438.method_23321() - var2.method_23321();
            class08005.N(new class02289(var2, var1), var1, class06584.E, d0, d1, d2, 0.7F, 5 - var1.y().N() * 4);
            var2.method_5783(class04909.LS, 1.5F, 1.0F);
         }
      }
   }

   protected void y(class04782 var1, class04508 var2, long var3) {
      var2.method_18868().L(class05378.s).ifPresent(var1x -> var2.method_18380(class01312.field_47247));
      var2.method_18868().N(class05378.yB, class06244.field_17274, i);
      var2.method_5783(class04909.LA, 1.0F, 1.0F);
   }

   protected boolean N(class04782 var1, class04508 var2) {
      return var2.method_18376() != class01312.field_18076 ? false : var2.method_18868().L(class05378.s).map(var1x -> N(var2, var1x)).map(var1x -> {
         if (!var1x) {
            var2.method_18868().y(class05378.yM);
         }

         return (Boolean)var1x;
      }).orElse(false);
   }

   protected boolean N(class04782 var1, class04508 var2, long var3) {
      return var2.method_18868().N(class05378.s) && var2.method_18868().N(class05378.yM);
   }

   private static boolean N(class04508 var0, class07438 var1) {
      return var0.method_73189().M(var1.method_73189()) < 256.0;
   }
}
