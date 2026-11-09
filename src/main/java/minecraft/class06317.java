package minecraft;

import java.util.Optional;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.util.POIRegistryEntries;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;

public class class06317 {
   public class06317() {
      super();
   }

   private static Optional N(class05368 var0, Predicate var1, Predicate var2, class07209 var3, int var4, class05372 var5) {
      return var0.u(new SinglePointOfInterestTypeFilter(POIRegistryEntries.HOME_ENTRY), var2, var3, var4, var5);
   }

   private static Optional N(class05368 var0, Predicate var1, Predicate var2, class05372 var3, class07209 var4, int var5, class06069 var6) {
      return var0.N(new SinglePointOfInterestTypeFilter(POIRegistryEntries.HOME_ENTRY), var2, var3, var4, var5, var6);
   }

   public static class04119<class07438> N(int var0, float var1, int var2) {
      return class04137.N_42(
         var3 -> var3.group(
               var3.L(class05378.m),
               var3.N(class05378.y),
               var3.N(class05378.O),
               var3.N(class05378.n),
               var3.N(class05378.P),
               var3.N(class05378.j),
               var3.N(class05378.b)
            )
            .apply(
               var3,
               (var4, var5, var6, var7, var8, var9, var10) -> (var11, var12, var13) -> {
                  N(var11.method_19494(), var0xxxx -> var0xxxx.N(class03927.m), var0xxxx -> true, var12.method_24515(), var2 + 1, class05372.field_18489)
                     .filter(var2xxxx -> var2xxxx.method_19769(var12.method_73189(), var2))
                     .or(
                        () -> N(
                           var11.method_19494(),
                           var0xxxxx -> var0xxxxx.N(class03927.m),
                           var0xxxxx -> true,
                           class05372.field_18489,
                           var12.method_24515(),
                           var0,
                           var12.method_59922()
                        )
                     )
                     .or(() -> var3.<class06289>N(var5).map(class06289::y))
                     .ifPresent(var10xx -> {
                        var7.y();
                        var8.y();
                        var9.y();
                        var10.y();
                        var6.N(class06289.N(var11.method_27983(), var10xx));
                        if (!var10xx.method_19769(var12.method_73189(), var2)) {
                           var4.N(new class05352(var10xx, var1, var2));
                        }
                     });
                  return true;
               }
            )
      );
   }
}
