package minecraft;

public class class05730 implements class05975 {
   private static final int N = 1200;
   private int y;

   public class05730() {
      super();
   }

   private void y(class04782 var1, class07209 var2) {
      byte b0 = 16;
      if (var1.N(class07617.class, new class00734(var2).L(16.0, 8.0, 16.0)).isEmpty()) {
         this.N(var2, var1, true);
      }
   }

   private void N(class07209 var1, class04782 var2, boolean var3) {
      class07617 class07617 = class07078.l.N(var2, class06113.field_16459);
      if (class07617 != null) {
         class07617.N(var2, var2.method_8404(var1), class06113.field_16459, null);
         if (var3) {
            class07617.NW();
         }

         class07617.method_5725(var1, 0.0F, 0.0F);
         var2.y(class07617);
      }
   }

   @Override
   public void N(class04782 var1, boolean var2) {
      this.y--;
      if (this.y <= 0) {
         this.y = 1200;
         class04770 class04770 = var1.method_18779();
         if (class04770 != null) {
            class06069 class06069 = var1.field_9229;
            int i = (8 + class06069.y(24)) * (class06069.Z() ? -1 : 1);
            int j = (8 + class06069.y(24)) * (class06069.Z() ? -1 : 1);
            class07209 class07209 = class04770.method_24515().method_10069(i, 0, j);
            byte b0 = 10;
            if (var1.N(class07209.method_10263() - 10, class07209.method_10260() - 10, class07209.method_10263() + 10, class07209.method_10260() + 10)) {
               if (class07448.N(class07078.l, var1, class07209)) {
                  if (var1.method_19497(class07209, 2)) {
                     this.N(var1, class07209);
                  } else if (var1.method_27056().N(class07209, class04398.m).y()) {
                     this.y(var1, class07209);
                  }
               }
            }
         }
      }
   }

   private void N(class04782 var1, class07209 var2) {
      byte b0 = 48;
      if (var1.method_19494().u(var0 -> var0.N(class03927.m), var2, 48, class05372.field_18488) > 4L
         && var1.N(class07617.class, new class00734(var2).L(48.0, 8.0, 48.0)).size() < 5) {
         this.N(var2, var1, false);
      }
   }
}
