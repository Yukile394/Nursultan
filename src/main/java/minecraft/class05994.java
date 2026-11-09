package minecraft;

import Nursultan.class10552;
import Nursultan.class10553;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class class05994 {
   public class05994() {
      super();
   }

   public static <S extends class00394> class06025<S> N(
      class00404<S> var0,
      Function<class00500, class05992> var1,
      Function<class00500, class07211> var2,
      class08092<class07211> var3,
      class00500 var4,
      class07284 var5,
      class07209 var6,
      BiPredicate<class07284, class07209> var7
   ) {
      class00394 class00394xxx = var0.method_24182(var5, var6);
      if (class00394xxx == null) {
         return class06029::y;
      } else if (var7.test(var5, var6)) {
         return class06029::y;
      } else {
         class05992 class05992x = (class05992)var1.apply(var4);
         boolean flag = class05992x == class05992.field_21783;
         boolean flag1 = class05992x == class05992.field_21784;
         if (flag) {
            return new class10552<>((S)class00394xxx);
         } else {
            class07209 class07209 = var6.method_10093((class07211)var2.apply(var4));
            class00500 class00500 = var5.method_8320(class07209);
            if (class00500.N(var4.i())) {
               class05992 class05992x = (class05992)var1.apply(class00500);
               if (class05992x != class05992.field_21783 && class05992x != class05992x && class00500.L(var3) == var4.L(var3)) {
                  if (var7.test(var5, class07209)) {
                     return class06029::y;
                  }

                  class00394 class00394x = var0.method_24182(var5, class07209);
                  if (class00394x != null) {
                     class00394 class00394xx = flag1 ? class00394xxx : class00394x;
                     class00394 class00394xxx = flag1 ? class00394x : class00394xxx;
                     return new class10553<>((S)class00394xx, (S)class00394xxx);
                  }
               }
            }

            return new class10552<>((S)class00394xxx);
         }
      }
   }
}
