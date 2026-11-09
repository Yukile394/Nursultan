package minecraft;

import Nursultan.class11647;
import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class class08729 implements class07135 {
   private final class01997 N;

   public class08729(class01996 var1) {
      super();
      this.N = var1.method_45973(class02024.field_39368, "equipment");
   }

   private static class08732 y(String var0) {
      return class08732.N()
         .N(class01894.y(var0))
         .N(class08719.field_54129, class08706.N(class01894.y(var0), false))
         .N(class08719.field_63622, class08706.N(class01894.y(var0), false))
         .N();
   }

   private static void N(BiConsumer<class05946<class11647>, class08732> var0) {
      var0.accept(
         class08699.y,
         class08732.N()
            .N(class01894.y("leather"), true)
            .N(class01894.y("leather_overlay"), false)
            .N(class08719.field_54129, class08706.N(class01894.y("leather"), true), class08706.N(class01894.y("leather_overlay"), false))
            .N()
      );
      var0.accept(class08699.u, N("chainmail"));
      var0.accept(class08699.L, y("copper"));
      var0.accept(class08699.i, y("iron"));
      var0.accept(class08699.R, y("gold"));
      var0.accept(class08699.M, y("diamond"));
      var0.accept(class08699.B, class08732.N().y(class01894.y("turtle_scute"), false).N());
      var0.accept(class08699.Z, y("netherite"));
      var0.accept(
         class08699.z,
         class08732.N()
            .N(class08719.field_54128, class08706.y(class01894.y("armadillo_scute"), false))
            .N(class08719.field_54128, class08706.y(class01894.y("armadillo_scute_overlay"), true))
            .N()
      );
      var0.accept(class08699.U, class08732.N().N(class08719.field_54127, new class08706(class01894.y("elytra"), Optional.empty(), true)).N());
      class08706 class08706 = new class08706(class01894.y("saddle"));
      var0.accept(
         class08699.E,
         class08732.N()
            .N(class08719.field_56123, class08706)
            .N(class08719.field_56124, class08706)
            .N(class08719.field_56125, class08706)
            .N(class08719.field_64249, class08706)
            .N(class08719.field_56126, class08706)
            .N(class08719.field_56127, class08706)
            .N(class08719.field_56128, class08706)
            .N(class08719.field_56130, class08706)
            .N(class08719.field_56129, class08706)
            .N(class08719.field_63621, class08706)
            .N()
      );

      for (Entry entry : class08699.P.entrySet()) {
         class06563 class06563x = (class06563)entry.getKey();
         class05946<class11647> class05946 = (class05946<class11647>)entry.getValue();
         var0.accept(class05946, class08732.N().N(class08719.field_59984, class08706.y(class01894.y(class06563x.method_15434() + "_harness"), false)).N());
      }

      for (Entry entry1 : class08699.W.entrySet()) {
         class06563 class06563 = (class06563)entry1.getKey();
         class05946 class05946 = (class05946)entry1.getValue();
         var0.accept(class05946, class08732.N().N(class08719.field_54130, new class08706(class01894.y(class06563.method_15434()))).N());
      }

      var0.accept(class08699.m, class08732.N().N(class08719.field_54130, new class08706(class01894.y("trader_llama"))).N());
   }

   private static class08732 N(String var0) {
      return class08732.N().N(class01894.y(var0)).N();
   }

   @Override
   public String method_10321() {
      return "Equipment Asset Definitions";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      HashMap hashmap = new HashMap();
      N((var1x, var2x) -> {
         if (hashmap.putIfAbsent(var1x, var2x) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + var1x);
         }
      });
      return class07135.N(var1, class08732.N, this.N::N, hashmap);
   }
}
