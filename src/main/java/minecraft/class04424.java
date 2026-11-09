package minecraft;

public class class04424 {
   public class04424() {
      super();
   }

   public static class04142<class07475> N(int var0, float var1) {
      return class04137.N_42(
         var3 -> var3.group(var3.L(class05378.s), var3.L(class05378.m), var3.N(class05378.P))
            .apply(
               var3,
               (var3x, var4, var5) -> (var5x, var6, var7) -> {
                  if (var5x.method_8316(var6.method_24515()).N(class01231.N)) {
                     return false;
                  } else if (var7 < var0x.longValue()) {
                     var0x.setValue(var7 + 40L);
                     return true;
                  } else {
                     class06092 class06092 = class06092.N(var6);
                     class07209 class07209x = var6.method_24515();
                     class07218 class07218 = new class07218();

                     label45:
                     for (class07209 class07209x : class07209.method_25996(class07209x, var0, var0, var0)) {
                        if ((class07209x.method_10263() != class07209x.method_10263() || class07209x.method_10260() != class07209x.method_10260())
                           && var5x.method_8320(class07209x).y(var5x, class07209x, class06092).method_1110()
                           && !var5x.method_8320(class07218.N(class07209x, class07211.field_11033)).y(var5x, class07209x, class06092).method_1110()) {
                           for (class07211 class07211 : class07221.field_11062) {
                              class07218.N(class07209x, class07211);
                              if (var5x.method_8320(class07218).P() && var5x.method_8320(class07218.N(class07211.field_11033)).N(class00869.K)) {
                                 var5.N(new class05744(class07209x));
                                 var4.N(new class05352(new class05744(class07209x), var1, 0));
                                 break label45;
                              }
                           }
                        }
                     }

                     var0x.setValue(var7 + 40L);
                     return true;
                  }
               }
            )
      );
   }
}
