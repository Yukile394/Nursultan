package minecraft;

public class class07815 implements class05975 {
   private int N;

   public class07815() {
      super();
   }

   @Override
   public void N(class04782 var1, boolean var2) {
      if (var2) {
         if (var1.method_64395().N(class07305.h)) {
            class06069 class06069 = var1.field_9229;
            this.N--;
            if (this.N <= 0) {
               this.N = this.N + (60 + class06069.y(60)) * 20;
               if (var1.method_8594() >= 5 || !var1.method_8597().i()) {
                  for (class04770 class04770 : var1.method_18456()) {
                     if (!class04770.method_7325()) {
                        class07209 class07209x = class04770.method_24515();
                        if (!var1.method_8597().i() || class07209x.method_10264() >= var1.method_8615() && var1.N_17(class07209x)) {
                           class07052 class07052 = var1.method_8404(class07209x);
                           if (class07052.N(class06069.z() * 3.0F)) {
                              int i = class04995.N(class04770.method_14248().N(class01235.Z.y(class01235.m)), 1, Integer.MAX_VALUE);
                              short short1 = 24000;
                              if (class06069.y(i) >= 72000) {
                                 class07209 class07209x = class07209x.method_10086(20 + class06069.y(15))
                                    .method_10089(-10 + class06069.y(21))
                                    .method_10077(-10 + class06069.y(21));
                                 class00500 class00500 = var1.method_8320(class07209x);
                                 class04688 class04688 = var1.method_8316(class07209x);
                                 if (class00803.N(var1, class07209x, class00500, class04688, class07078.ND)) {
                                    class07446 class07446 = null;
                                    int j = 1 + class06069.y(class07052.N().N() + 1);

                                    for (int k = 0; k < j; k++) {
                                       class07155 class07155 = class07078.ND.N(var1, class06113.field_16459);
                                       if (class07155 != null) {
                                          class07155.method_5725(class07209x, 0.0F, 0.0F);
                                          class07446 = class07155.N(var1, class07052, class06113.field_16459, class07446);
                                          var1.y(class07155);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
