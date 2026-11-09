package minecraft;

public class class05548 {
   public class05548() {
      super();
   }

   public static class04142<class07475> N(int var0, float var1) {
      return class04137.N_42(
         var3 -> var3.group(var3.L(class05378.s), var3.L(class05378.m), var3.N(class05378.P)).apply(var3, (var3x, var4, var5) -> (var5x, var6, var7) -> {
            if (var5x.method_8316(var6.method_24515()).N(class01231.N)) {
               return false;
            } else if (var7 < var0x.longValue()) {
               var0x.setValue(var7 + 20L + 2L);
               return true;
            } else {
               class07209 class07209xxx = null;
               class07209 class07209x = null;
               class07209 class07209xx = var6.method_24515();

               for (class07209 class07209xxx : class07209.method_25996(class07209xx, var0, var0, var0)) {
                  if (class07209xxx.method_10263() != class07209xx.method_10263() || class07209xxx.method_10260() != class07209xx.method_10260()) {
                     class00500 class00500 = var6.method_73183().method_8320(class07209xxx.method_10084());
                     if (var6.method_73183().method_8320(class07209xxx).N(class00869.K)) {
                        if (class00500.P()) {
                           class07209xxx = class07209xxx.method_10062();
                           break;
                        }

                        if (class07209x == null && !class07209xxx.method_19769(var6.method_73189(), 1.5)) {
                           class07209x = class07209xxx.method_10062();
                        }
                     }
                  }
               }

               if (class07209xxx == null) {
                  class07209xxx = class07209x;
               }

               if (class07209xxx != null) {
                  var5.N(new class05744(class07209xxx));
                  var4.N(new class05352(new class05744(class07209xxx), var1, 0));
               }

               var0x.setValue(var7 + 40L);
               return true;
            }
         })
      );
   }
}
