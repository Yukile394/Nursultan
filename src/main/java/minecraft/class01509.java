package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CommonBlockSearchesCheckAndCache;

public class class01509 extends class05355<class07438> {
   private static final Predicate N = class01509::N;

   public Optional L(class04782 var1, class07438 var2) {
      return CommonBlockSearchesCheckAndCache.blockPosFindClosestMatch(var1, var2, 8, 4, N, true);
   }

   public class01509() {
      super();
   }

   private static Optional<class07209> u(class04782 var0, class07438 var1) {
      return class07209.method_25997(var1.method_24515(), 8, 4, var1x -> N(var0, var1x));
   }

   private static boolean N(class00500 var0) {
      boolean flag = var0.N(class01210.Nl);
      return flag && var0.N(class00869.sR) ? class05847.U(var0) : flag;
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(
         class05378.B,
         class05378.M,
         class05378.c,
         class05378.Nl,
         class05378.NI,
         class05378.Nt,
         new class05378[]{class05378.NG, class05378.Nw, class05378.Nd, class05378.NO, class05378.Ng, class05378.No}
      );
   }

   private static boolean N(class04782 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      boolean flag = class00500.N(class01210.Nl);
      return flag && class00500.N(class00869.sR) ? class05847.U(class00500) : flag;
   }

   @Override
   protected void N(class04782 var1, class07438 var2) {
      class01289<?> class01289 = var2.method_18868();
      class01289.N(class05378.No, this.L(var1, var2));
      Optional optional = Optional.empty();
      Optional optional1 = Optional.empty();
      Optional optional2 = Optional.empty();
      Optional optional3 = Optional.empty();
      Optional optional4 = Optional.empty();
      Optional optional5 = Optional.empty();
      Optional optional6 = Optional.empty();
      int i = 0;
      ArrayList arraylist = Lists.newArrayList();
      ArrayList arraylist1 = Lists.newArrayList();

      for (class07438 var16 : class01289.L(class05378.B).orElse(class04051.N()).y(var0 -> true)) {
         if (var16 instanceof class06018 class06018) {
            if (class06018.method_6109() && optional2.isEmpty()) {
               optional2 = Optional.of(class06018);
            } else if (class06018.m()) {
               i++;
               if (optional1.isEmpty() && class06018.n()) {
                  optional1 = Optional.of(class06018);
               }
            }
         } else if (var16 instanceof class01266 class01266) {
            arraylist.add(class01266);
         } else if (var16 instanceof class01489 class01489) {
            if (class01489.method_6109() && optional3.isEmpty()) {
               optional3 = Optional.of(class01489);
            } else if (class01489.l()) {
               arraylist.add(class01489);
            }
         } else if (var16 instanceof class08036 class08036) {
            if (optional5.isEmpty() && !class01514.N(class08036) && var2.method_18395(var16)) {
               optional5 = Optional.of(class08036);
            }

            if (optional6.isEmpty() && !class08036.method_7325() && class01514.y(class08036)) {
               optional6 = Optional.of(class08036);
            }
         } else if (!optional.isEmpty() || !(var16 instanceof class08023) && !(var16 instanceof class00680)) {
            if (optional4.isEmpty() && class01514.N(var16.method_5864())) {
               optional4 = Optional.of(var16);
            }
         } else {
            optional = Optional.of((class07079)var16);
         }
      }

      for (class07438 class07438x : class01289.L(class05378.M).orElse(ImmutableList.of())) {
         if (class07438x instanceof class01238 class01238 && class01238.l()) {
            arraylist1.add(class01238);
         }
      }

      class01289.N(class05378.c, optional);
      class01289.N(class05378.Nt, optional1);
      class01289.N(class05378.NG, optional2);
      class01289.N(class05378.NQ, optional4);
      class01289.N(class05378.Nl, optional5);
      class01289.N(class05378.NI, optional6);
      class01289.N(class05378.Nd, arraylist1);
      class01289.N(class05378.Nw, arraylist);
      class01289.N(class05378.NO, arraylist.size());
      class01289.N(class05378.Ng, i);
   }
}
