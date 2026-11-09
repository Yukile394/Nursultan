package minecraft;

public class class04397 {
   private static final int N = 60;

   public class04397() {
      super();
   }

   public static class04142<class07475> N(int var0, float var1) {
      return class04137.N_42(
         var3 -> var3.group(var3.L(class05378.s), var3.L(class05378.m), var3.N(class05378.P))
            .apply(
               var3,
               (var3x, var4, var5) -> (var5x, var6, var7) -> {
                  if (!var5x.method_8316(var6.method_24515()).N(class01231.N)) {
                     return false;
                  } else if (var7 < var0x.longValue()) {
                     var0x.setValue(var7 + 60L);
                     return true;
                  } else {
                     class07209 class07209xx = var6.method_24515();
                     class07218 class07218 = new class07218();
                     class06092 class06092 = class06092.N(var6);

                     for (class07209 class07209x : class07209.method_25996(class07209xx, var0, var0, var0)) {
                        if (class07209x.method_10263() != class07209xx.method_10263() || class07209x.method_10260() != class07209xx.method_10260()) {
                           class00500 class00500x = var5x.method_8320(class07209x);
                           class00500 class00500x = var5x.method_8320(class07218.N(class07209x, class07211.field_11033));
                           if (!class00500x.N(class00869.K)
                              && var5x.method_8316(class07209x).W()
                              && class00500x.y(var5x, class07209x, class06092).method_1110()
                              && class00500x.L(var5x, class07218, class07211.field_11036)) {
                              class07209 class07209xx = class07209x.method_10062();
                              var5.N(new class05744(class07209xx));
                              var4.N(new class05352(new class05744(class07209xx), var1, 1));
                              break;
                           }
                        }
                     }

                     var0x.setValue(var7 + 60L);
                     return true;
                  }
               }
            )
      );
   }
}
