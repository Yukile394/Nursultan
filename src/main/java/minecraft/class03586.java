package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;
import net.fabricmc.fabric.impl.biome.NetherBiomeData;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class class03586 implements class03581 {
   class03586() {
      super();
   }

   @Override
   public <T> class03221<T> N(Function<class05946<class00780>, T> var1) {
      class03221 class03221x;
      class03221 class03221x = class03221x = new class03221(
         List.of(
            Pair.of(class03216.N(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), var1.apply(class00795.Nu)),
            Pair.of(class03216.N(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), var1.apply(class00795.NM)),
            Pair.of(class03216.N(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), var1.apply(class00795.NR)),
            Pair.of(class03216.N(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), var1.apply(class00795.Ni)),
            Pair.of(class03216.N(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), var1.apply(class00795.NB))
         )
      );
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class03221x);
      this.N(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class03221)callbackinforeturnable.getReturnValue() : class03221x;
   }

   public void N(Function var1, CallbackInfoReturnable var2) {
      var2.setReturnValue(NetherBiomeData.withModdedBiomeEntries((class03221)var2.getReturnValue(), var1));
   }
}
