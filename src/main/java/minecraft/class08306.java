package minecraft;

import Nursultan.class09109;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class class08306 implements class07135 {
   private final class01997 N;

   public class08306(class01996 var1) {
      super();
      this.N = var1.method_45973(class02024.field_39368, "waypoint_style");
   }

   private static void N(BiConsumer<class05946<class09109>, class08301> var0) {
      var0.accept(
         class00058.y,
         new class08301(128, 332, List.of(class01894.y("default_0"), class01894.y("default_1"), class01894.y("default_2"), class01894.y("default_3")))
      );
      var0.accept(
         class00058.L,
         new class08301(
            64,
            332,
            List.of(class01894.y("bowtie"), class01894.y("default_0"), class01894.y("default_1"), class01894.y("default_2"), class01894.y("default_3"))
         )
      );
   }

   @Override
   public String method_10321() {
      return "Waypoint Style Definitions";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      HashMap hashmap = new HashMap();
      N((var1x, var2x) -> {
         if (hashmap.putIfAbsent(var1x, var2x) != null) {
            throw new IllegalStateException("Tried to register waypoint style twice for id: " + var1x);
         }
      });
      return class07135.N(var1, class08301.u, this.N::N, hashmap);
   }
}
