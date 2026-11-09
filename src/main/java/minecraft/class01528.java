package minecraft;

import java.util.function.Predicate;

public class class01528 {
   public class01528() {
      super();
   }

   public static <T extends class07079> class04119<T> N(int var0) {
      return N(var0x -> true, var0);
   }

   private static boolean N(class07079 var0) {
      return var0.method_24520(var0::y);
   }

   public static <T extends class07079> class04119<T> N(Predicate<T> var0, int var1) {
      return class04137.N_42(
         var2 -> var2.group(var2.N(class05378.P), var2.y(class05378.s), var2.L(class05378.T), var2.y(class05378.B))
            .apply(var2, (var3, var4, var5, var6) -> (var7, var8, var9) -> {
               class07438 class07438 = var2.y(var4);
               if (var0.test(var8) && !N(var8) && var8.L(class07438) && var2.<class04051>y(var6).N(class07438)) {
                  var3.N(new class05751(class07438, true));
                  var8.method_6104(class07050.field_5808);
                  var8.method_6121(var7, class07438);
                  var5.N(true, var1);
                  return true;
               } else {
                  return false;
               }
            })
      );
   }
}
