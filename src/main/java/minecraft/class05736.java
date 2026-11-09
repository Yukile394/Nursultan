package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.ai.WeightedListIterable;
import net.caffeinemc.mods.lithium.common.ai.brain.RunningPolicyNoStream;

public class class05736<E extends class07438> implements class04142<E> {
   private final Map<class05378<?>, class05367> N;
   private final Set<class05378<?>> y;
   private final class05753 L;
   private final class05769 u;
   private final class02150<class04142<? super E>> i = new class02150<>();
   private class05748 R = class05748.field_18337;

   public class05736(
      Map<class05378<?>, class05367> var1, Set<class05378<?>> var2, class05753 var3, class05769 var4, List<Pair<? extends class04142<? super E>, Integer>> var5
   ) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      var5.forEach(var1x -> this.i.N((class04142)var1x.getFirst(), (Integer)var1x.getSecond()));
   }

   @Override
   public String toString() {
      Set set = this.i.y().filter(var0 -> var0.method_18921() == class05748.field_18338).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + set;
   }

   private boolean N(E var1) {
      for (Entry entry : this.N.entrySet()) {
         class05378<?> class05378 = (class05378<?>)entry.getKey();
         class05367 class05367 = (class05367)entry.getValue();
         if (!var1.method_18868().N_22(class05378, class05367)) {
            return false;
         }
      }

      return true;
   }

   public final void N(class05769 var1, Stream var2, class04782 var3, class07438 var4, long var5, Operation var7) {
      if (var1 instanceof RunningPolicyNoStream) {
         ((RunningPolicyNoStream)var1).lithium$apply(this.i, var3, var4, var5);
      } else {
         var7.call(new Object[]{var1, var2, var3, var4, var5});
      }
   }

   @Override
   public String method_46910() {
      return this.getClass().getSimpleName();
   }

   @Override
   public final void method_18925(class04782 var1, class07438 var2, long var3) {
      this.R = class05748.field_18337;

      for (class04142 var6 : WeightedListIterable.cast(this.i)) {
         if (var6.method_18921() == class05748.field_18338) {
            var6.method_18925(var1, var2, var3);
         }
      }

      class01289<?> class01289 = var2.method_18868();

      for (class05378<?> class05378 : this.y) {
         class01289.y(class05378);
      }
   }

   @Override
   public final void method_18923(class04782 var1, class07438 var2, long var3) {
      boolean flag = false;

      for (class04142 class04142 : WeightedListIterable.cast(this.i)) {
         if (class04142.method_18921() == class05748.field_18338) {
            class04142.method_18923(var1, var2, var3);
            flag |= class04142.method_18921() == class05748.field_18338;
         }
      }

      if (!flag) {
         this.method_18925(var1, var2, var3);
      }
   }

   @Override
   public class05748 method_18921() {
      return this.R;
   }

   @Override
   public final boolean method_18922(class04782 var1, E var2, long var3) {
      if (this.N((E)var2)) {
         this.R = class05748.field_18338;
         this.L.N(this.i);
         class05769 class05769 = this.u;
         Stream stream = this.i.y();
         class05769 class05769x = class05769;
         this.N(
            class05769x,
            stream,
            var1,
            var2,
            var3,
            var0 -> {
               WrapOperationRuntime.checkArgumentCount(
                  var0, 5, "[net.minecraft.class_4103$class_4216, java.util.stream.Stream, net.minecraft.class_3218, net.minecraft.class_1309, long]"
               );
               ((class05769)var0[0]).N((Stream<class04142<? super E>>)var0[1], (class04782)var0[2], (E)var0[3], (Long)var0[4]);
               return (Void)null;
            }
         );
         return true;
      } else {
         return false;
      }
   }
}
