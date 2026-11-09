package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import net.caffeinemc.mods.lithium.common.util.collections.LongJumpChoiceList;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02152<E extends class07079> extends class05765<E> {
   protected static final int N = 20;
   private static final int W = 40;
   protected static final int y = 8;
   private static final int m = 200;
   private static final List<Integer> P = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final class02135 s;
   protected final int L;
   protected final int u;
   protected final float i;
   protected List<class02146> R = Lists.newArrayList();
   protected Optional<class06889> Z = Optional.empty();
   @Nullable
   protected class06889 z;
   protected int U;
   protected long E;
   private final Function<E, class04891> T;
   private final BiPredicate<E, class07209> b;

   protected void L(class04782 var1, E var2, long var3) {
      if (this.z != null) {
         if (var3 - this.E >= 40L) {
            var2.method_36456(var2.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
            var2.method_35054(true);
            double d0 = this.z.M();
            double d1 = d0 + var2.method_37416();
            var2.method_18799(this.z.L(d1 / d0));
            var2.method_18868().N(class05378.C, true);
            var1.method_43129(null, var2, this.T.apply((E)var2), class04911.field_15254, 1.0F, 1.0F);
         }
      } else {
         this.U--;
         this.u(var1, (E)var2, var3);
      }
   }

   public class02152(class02135 var1, int var2, int var3, float var4, Function<E, class04891> var5) {
      this(var1, var2, var3, var4, var5, class02152::N);
   }

   public class02152(class02135 var1, int var2, int var3, float var4, Function<E, class04891> var5, BiPredicate<E, class07209> var6) {
      super(ImmutableMap.of(class05378.P, class05367.field_18458, class05378.f, class05367.field_18457, class05378.C, class05367.field_18457), 200);
      this.s = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.T = var5;
      this.b = var6;
   }

   protected void u(class04782 var1, E var2, long var3) {
      while (!this.R.isEmpty()) {
         Optional<class02146> optional = this.N(var1);
         if (!optional.isEmpty()) {
            class07209 class07209 = optional.get().N();
            if (this.N(var1, (E)var2, class07209)) {
               class06889 class06889x = class06889.y(class07209);
               class06889 class06889x = this.N(var2, class06889x);
               if (class06889x != null) {
                  var2.method_18868().N(class05378.P, new class05744(class07209));
                  class00143 class00143 = var2.f().N(class07209, 0, 8);
                  if (class00143 == null || !class00143.z()) {
                     this.z = class06889x;
                     this.E = var3;
                     return;
                  }
               }
            }
         }
      }
   }

   protected void y(class04782 var1, E var2, long var3) {
      this.z = null;
      this.U = 20;
      this.Z = Optional.of(var2.method_73189());
      class07209 class07209 = var2.method_24515();
      int ix = class07209.method_10263();
      int j = class07209.method_10264();
      int k = class07209.method_10260();
      int l = ix - this.u;
      int i1 = j - this.L;
      int j1 = k - this.u;
      int k1 = ix + this.u;
      int l1 = j + this.L;
      int i2 = k + this.u;
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo, class07209);
      if (!callbackinfo.isCancelled()) {
         this.R = class07209.method_17962(l, i1, j1, k1, l1, i2)
            .filter(var1x -> !var1x.equals(class07209))
            .map(var1x -> new class02146(var1x.method_10062(), class04995.L(class07209.method_10262(var1x))))
            .collect(Collectors.toCollection(Lists::newArrayList));
      }
   }

   private void N(Optional var1, Consumer var2) {
      if (!(this.R instanceof LongJumpChoiceList)) {
         var1.ifPresent(var2);
      }
   }

   private void N(class04782 var1, class07079 var2, long var3, CallbackInfo var5, class07209 var6) {
      if (this.u < 128 && this.L < 128) {
         this.R = LongJumpChoiceList.forCenter(var6, (byte)this.u, (byte)this.L);
         var5.cancel();
      }
   }

   private Optional N(class06069 var1, List var2, ToIntFunction var3, Operation var4) {
      return var2 instanceof LongJumpChoiceList
         ? Optional.ofNullable(((LongJumpChoiceList)var2).removeRandomWeightedByDistanceSq(var1))
         : (Optional)var4.call(new Object[]{var1, var2, var3});
   }

   protected Optional<class02146> N(class04782 var1) {
      class06069 class06069 = var1.field_9229;
      List list1 = this.R;
      ToIntFunction tointfunction = class02146::y;
      List<class02146> list = list1;
      class06069 class06069x = class06069;
      Optional optional = this.N(class06069x, list, tointfunction, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_5819, java.util.List, java.util.function.ToIntFunction]");
         return class04531.N((class06069)var0[0], (List)var0[1], (ToIntFunction)var0[2]);
      });
      Consumer consumer = this.R::remove;
      this.N(optional, consumer);
      return optional;
   }

   protected boolean N(class04782 var1, class07079 var2, long var3) {
      boolean flag = this.Z.isPresent()
         && this.Z.get().equals(var2.method_73189())
         && this.U > 0
         && !var2.method_5799()
         && (this.z != null || !this.R.isEmpty());
      if (!flag && var2.method_18868().L(class05378.C).isEmpty()) {
         var2.method_18868().N(class05378.f, this.s.N(var1.field_9229) / 2);
         var2.method_18868().y(class05378.P);
      }

      return flag;
   }

   protected boolean N(class04782 var1, class07079 var2) {
      boolean flag = var2.method_24828() && !var2.method_5799() && !var2.method_5771() && !var1.method_8320(var2.method_24515()).N(class00869.TM);
      if (!flag) {
         var2.method_18868().N(class05378.f, this.s.N(var1.field_9229) / 2);
      }

      return flag;
   }

   public static <E extends class07079> boolean N(E var0, class07209 var1) {
      class07299 class07299 = var0.method_73183();
      class07209 class07209 = var1.method_10074();
      return class07299.method_8320(class07209).t() && var0.N(class07955.N(var0, var1)) == 0.0F;
   }

   @Nullable
   protected class06889 N(class07079 var1, class06889 var2) {
      ArrayList arraylist = Lists.newArrayList(P);
      Collections.shuffle(arraylist);
      float f = (float)(var1.method_45325(class05298.T) * this.i);

      for (int ix : arraylist) {
         Optional<class06889> optional = class04494.N(var1, var2, f, ix, true);
         if (optional.isPresent()) {
            return optional.get();
         }
      }

      return null;
   }

   private boolean N(class04782 var1, E var2, class07209 var3) {
      class07209 class07209 = var2.method_24515();
      int ix = class07209.method_10263();
      int j = class07209.method_10260();
      return ix == var3.method_10263() && j == var3.method_10260() ? false : this.b.test((E)var2, var3);
   }
}
