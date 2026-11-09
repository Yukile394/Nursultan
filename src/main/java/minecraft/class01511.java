package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CommonBlockSearchesCheckAndCache;

public class class01511 extends class05355<class06018> {
   private static final Predicate N = class01511::N;

   public class01511() {
      super();
   }

   private Optional<class07209> y(class04782 var1, class06018 var2) {
      return class07209.method_25997(var2.method_24515(), 8, 4, var1x -> var1.method_8320(var1x).N(class01210.yR));
   }

   private Optional N(class01511 var1, class04782 var2, class06018 var3) {
      return CommonBlockSearchesCheckAndCache.blockPosFindClosestMatch(var2, var3, 8, 4, N, true);
   }

   private static boolean N(class00500 var0) {
      return var0.N(class01210.yR);
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.B, class05378.No, class05378.NY, class05378.Nk, class05378.NO, class05378.Ng, new class05378[0]);
   }

   protected void N(class04782 var1, class06018 var2) {
      class01289<class06018> class01289 = var2.method_18868();
      class01289.N(class05378.No, this.N(this, var1, var2));
      Optional optional = Optional.empty();
      int i = 0;
      ArrayList arraylist = Lists.newArrayList();

      for (class07438 class07438 : class01289.L(class05378.B)
         .orElse(class04051.N())
         .y(var0 -> !var0.method_6109() && (var0 instanceof class01489 || var0 instanceof class06018))) {
         if (class07438 instanceof class01489 class01489) {
            i++;
            if (optional.isEmpty()) {
               optional = Optional.of(class01489);
            }
         }

         if (class07438 instanceof class06018 class06018) {
            arraylist.add(class06018);
         }
      }

      class01289.N(class05378.NY, optional);
      class01289.N(class05378.Nk, arraylist);
      class01289.N(class05378.NO, i);
      class01289.N(class05378.Ng, arraylist.size());
   }
}
