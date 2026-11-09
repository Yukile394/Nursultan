package minecraft;

import java.util.function.BiConsumer;

public class class06965 extends class06968<class06244> {
   public class06965() {
      super(class00429.U);
   }

   private void y(class04782 var1, class07209 var2) {
      N(var1, class01296.N(var2), (var2x, var3) -> {
         class07209 class07209 = var2x.U();
         if (var3) {
            this.N(var1, new class07321(class07209), new class00437(class07209, this.N.N(class06244.field_17274)));
         } else {
            this.N(var1, new class07321(class07209), new class00437(class07209, this.N.N()));
         }
      });
   }

   @Override
   protected void y(class04770 var1, class07321 var2) {
      class04782 class04782 = var1.method_51469();
      class04782.method_19494().N(var0 -> true, var2, class05372.field_18489).forEach(var3x -> {
         class01296 class01296 = class01296.N(var3x.M());
         N(class04782, class01296, (var2xx, var3xx) -> {
            class07209 class07209 = var2xx.U();
            var1.field_13987.method_14364(new class00437(class07209, this.N.N(var3xx ? class06244.field_17274 : null)));
         });
      });
   }

   private static void N(class04782 var0, class01296 var1, BiConsumer<class01296, Boolean> var2) {
      for (int i = -1; i <= 1; i++) {
         for (int j = -1; j <= 1; j++) {
            for (int k = -1; k <= 1; k++) {
               class01296 class01296 = var1.method_34592(j, k, i);
               if (var0.method_19500(class01296.U())) {
                  var2.accept(class01296, true);
               } else {
                  var2.accept(class01296, false);
               }
            }
         }
      }
   }

   public void N(class04782 var1, class07209 var2) {
      this.y(var1, var2);
   }

   public void N(class04782 var1, class05377 var2) {
      this.y(var1, var2.M());
   }
}
