package minecraft;

import com.google.common.collect.ImmutableMap;

public class class04012 extends class05765<class04003> {
   private static final int N = 25;
   private static final int y = 20;

   protected void L(class04782 var1, class04003 var2, long var3) {
      if (!var2.method_18868().N(class05378.NX) && !var2.method_18868().N(class05378.Np)) {
         var2.method_18868().N(class05378.Np, class06244.field_17274, class03984.y - 25);
         var2.method_5783(class04909.Im, 3.0F, 1.0F);
      }
   }

   public class04012() {
      super(
         ImmutableMap.of(
            class05378.NK,
            class05367.field_18456,
            class05378.s,
            class05367.field_18457,
            class05378.Np,
            class05367.field_18458,
            class05378.NX,
            class05367.field_18458
         ),
         class03984.y
      );
   }

   protected void u(class04782 var1, class04003 var2, long var3) {
      if (var2.method_41328(class01312.field_38097)) {
         var2.method_18380(class01312.field_18076);
      }

      var2.method_18868().L(class05378.NK).ifPresent(var2::N);
      var2.method_18868().y(class05378.NK);
   }

   protected boolean y(class04782 var1, class04003 var2, long var3) {
      return true;
   }

   protected void N(class04782 var1, class04003 var2, long var3) {
      class01289<class04003> class01289 = var2.method_18868();
      class01289.N(class05378.NX, class06244.field_17274, 25L);
      class01289.y(class05378.m);
      class07438 class07438 = var2.method_18868().L(class05378.NK).get();
      class06293.N(var2, class07438);
      var2.method_18380(class01312.field_38097);
      var2.N(class07438, 20, false);
   }
}
