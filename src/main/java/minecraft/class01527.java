package minecraft;

import com.google.common.collect.ImmutableMap;

public class class01527<E extends class07079 & class04854, T extends class07438> extends class05765<E> {
   private static final int N = 1200;
   private int y;
   private class01503 L = class01503.field_22295;

   protected void L(class04782 var1, E var2, long var3) {
      if (var2.method_6115()) {
         var2.method_6021();
      }

      if (var2.method_24518(class06570.dw)) {
         ((class04854)var2).N(false);
         var2.method_6030().N(class02484.x, class02820.N);
      }
   }

   public class01527() {
      super(ImmutableMap.of(class05378.P, class05367.field_18458, class05378.s, class05367.field_18456), 1200);
   }

   private void y(class07079 var1, class07438 var2) {
      var1.method_18868().N(class05378.P, new class05751(var2, true));
   }

   private static class07438 y(class07438 var0) {
      return var0.method_18868().L(class05378.s).get();
   }

   protected void y(class04782 var1, E var2, long var3) {
      class07438 class07438 = y(var2);
      this.y(var2, class07438);
      this.N((E)var2, class07438);
   }

   protected boolean N(class04782 var1, E var2, long var3) {
      return var2.method_18868().N(class05378.s) && this.N(var1, (E)var2);
   }

   protected boolean N(class04782 var1, E var2) {
      class07438 class07438 = y(var2);
      return var2.method_24518(class06570.dw) && class06293.y(var2, class07438) && class06293.N(var2, class07438, 0);
   }

   private void N(E var1, class07438 var2) {
      if (this.L == class01503.field_22295) {
         var1.method_6019(class08038.N(var1, class06570.dw));
         this.L = class01503.field_22296;
         ((class04854)var1).N(true);
      } else if (this.L == class01503.field_22296) {
         if (!var1.method_6115()) {
            this.L = class01503.field_22295;
         }

         int i = var1.method_6048();
         class06584 class06584 = var1.method_6030();
         if (i >= class06593.y(class06584, var1)) {
            var1.method_6075();
            this.L = class01503.field_22297;
            this.y = 20 + var1.method_59922().y(20);
            ((class04854)var1).N(false);
         }
      } else if (this.L == class01503.field_22297) {
         this.y--;
         if (this.y == 0) {
            this.L = class01503.field_22298;
         }
      } else if (this.L == class01503.field_22298) {
         ((class07172)var1).N(var2, 1.0F);
         this.L = class01503.field_22295;
      }
   }
}
