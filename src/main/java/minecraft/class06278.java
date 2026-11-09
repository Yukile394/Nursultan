package minecraft;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class class06278 {
   private static final int N = 20;
   private static final int y = 8;
   private static final float L = 0.6F;
   private static final float u = 0.6F;
   private static final int i = 5;
   private static final int R = 10;

   public class06278() {
      super();
   }

   private static Map<class07438, Integer> y(List<class07438> var0) {
      HashMap hashmap = Maps.newHashMap();
      var0.stream().filter(class06278::y).forEach(var1x -> hashmap.compute(N(var1x), (var0xx, var1xx) -> var1xx == null ? 1 : var1xx + 1));
      return hashmap;
   }

   private static boolean y(class07438 var0) {
      return var0.method_18868().L(class05378.b).isPresent();
   }

   public static class04142<class07475> N() {
      return class04137.N_42(
         var0 -> var0.group(var0.y(class05378.Z), var0.L(class05378.m), var0.N(class05378.P), var0.N(class05378.b))
            .apply(var0, (var1, var2, var3, var4) -> (var5, var6, var7) -> {
               if (var5.method_8409().y(10) != 0) {
                  return false;
               } else {
                  List list = var0.y(var1);
                  if (!list.stream().filter(var1xx -> N((class07438)var6, var1xx)).findAny().isPresent()) {
                     Optional<class07438> optional = N(list);
                     if (optional.isPresent()) {
                        N(var4, var3, var2, optional.get());
                        return true;
                     } else {
                        list.stream().findAny().ifPresent(var3xx -> N(var4, var3, var2, var3xx));
                        return true;
                     }
                  } else {
                     for (int var11 = 0; var11 < 10; var11++) {
                        class06889 class06889 = class05456.N(var6, 20, 8);
                        if (class06889 != null && var5.method_19500(class07209.method_49638(class06889))) {
                           var2.N(new class05352(class06889, 0.6F, 0));
                           break;
                        }
                     }

                     return true;
                  }
               }
            })
      );
   }

   private static class07438 N(class07438 var0) {
      return var0.method_18868().L(class05378.b).get();
   }

   private static Optional<class07438> N(List<class07438> var0) {
      return y(var0)
         .entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter(var0x -> var0x.getValue() > 0 && var0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static boolean N(class07438 var0, class07438 var1) {
      return var1.method_18868().L(class05378.b).filter(var1x -> var1x == var0).isPresent();
   }

   private static void N(class04139<?, class07438> var0, class04139<?, class05779> var1, class04139<?, class05352> var2, class07438 var3) {
      var0.N(var3);
      var1.N(new class05751(var3, true));
      var2.N(new class05352(new class05751(var3, false), 0.6F, 1));
   }
}
