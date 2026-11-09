package minecraft;

import Nursultan.class10285;
import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.biome.TheEndBiomeData;
import net.fabricmc.fabric.impl.biome.TheEndBiomeData.Overrides;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07663 extends class00765 {
   public static MapCodec<class07663> y = RecordCodecBuilder.mapCodec(
      var0x -> var0x.group(class03519.L(class04227.NA)).apply(var0x, var0x.stable(class07663::N))
   );
   private final class03556<class00780> L;
   private final class03556<class00780> u;
   private final class03556<class00780> i;
   private final class03556<class00780> R;
   private final class03556<class00780> M;
   private Supplier B;
   private boolean Z = false;
   private boolean z = false;

   private class07663(
      class03556<class00780> var1, class03556<class00780> var2, class03556<class00780> var3, class03556<class00780> var4, class03556<class00780> var5
   ) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
      this.N(var1, var2, var3, var4, var5, null);
   }

   private static void y(class02055 var0, CallbackInfoReturnable var1) {
      TheEndBiomeData.biomeRegistry.remove();
   }

   @Override
   protected Stream<class03556<class00780>> y() {
      return Stream.of(this.L, this.u, this.i, this.R, this.M);
   }

   private void N(class03556 var1, class03556 var2, class03556 var3, class03556 var4, class03556 var5, CallbackInfo var6) {
      class02055<class00780> class02055 = (class02055<class00780>)TheEndBiomeData.biomeRegistry.get();
      if (class02055 == null) {
         throw new IllegalStateException("Biome registry not set by Mixin");
      } else {
         this.B = Suppliers.memoize(() -> TheEndBiomeData.createOverrides(class02055));
      }
   }

   @Override
   protected Set N(Set var1) {
      if (!this.z) {
         this.z = true;
         this.Z = !((Overrides)this.B.get()).customBiomes.isEmpty();
      }

      if (this.Z) {
         LinkedHashSet linkedhashset = new LinkedHashSet(var1);
         linkedhashset.addAll(((Overrides)this.B.get()).customBiomes);
         return Collections.unmodifiableSet(linkedhashset);
      } else {
         return var1;
      }
   }

   private void N(int var1, int var2, int var3, class03222 var4, CallbackInfoReturnable var5) {
      var5.setReturnValue(((Overrides)this.B.get()).pick(var1, var2, var3, var4, (class03556)var5.getReturnValue()));
   }

   public static class07663 N(class02055<class00780> var0) {
      N(var0, null);
      class07663 class07663 = new class07663(var0.y(class00795.NZ), var0.y(class00795.Nz), var0.y(class00795.NU), var0.y(class00795.NE), var0.y(class00795.NW));
      y(var0, null);
      return class07663;
   }

   @Override
   protected MapCodec<? extends class00765> N() {
      return y;
   }

   private static void N(CallbackInfo var0) {
      y = RecordCodecBuilder.mapCodec(var0x -> var0x.group(class03519.L(class04227.NA)).apply(var0x, var0x.stable(class07663::N)));
   }

   private static void N(class02055 var0, CallbackInfoReturnable var1) {
      TheEndBiomeData.biomeRegistry.set(var0);
   }

   @Override
   public class03556<class00780> method_38109(int var1, int var2, int var3, class03222 var4) {
      int ix = class01146.L(var1);
      int j = class01146.L(var2);
      int k = class01146.L(var3);
      int l = class01296.N(ix);
      int i1 = class01296.N(k);
      if ((long)l * l + (long)i1 * i1 <= 4096L) {
         class03556<class00780> class03556;
         class03556 class03556x = class03556 = this.L;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class03556);
         this.N(var1, var2, var3, var4, callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? (class03556)callbackinforeturnable.getReturnValue() : class03556x;
      } else {
         int j1 = (class01296.N(ix) * 2 + 1) * 8;
         int k1 = (class01296.N(k) * 2 + 1) * 8;
         double d0 = var4.i().N(new class10285(j1, j, k1));
         if (d0 > 0.25) {
            class03556<class00780> class03556;
            class03556 class03556x = class03556 = this.u;
            CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, class03556);
            this.N(var1, var2, var3, var4, callbackinforeturnable1);
            return callbackinforeturnable1.isCancelled() ? (class03556)callbackinforeturnable1.getReturnValue() : class03556x;
         } else if (d0 >= -0.0625) {
            class03556<class00780> class03556;
            class03556 class03556x = class03556 = this.i;
            CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true, class03556);
            this.N(var1, var2, var3, var4, callbackinforeturnable2);
            return callbackinforeturnable2.isCancelled() ? (class03556)callbackinforeturnable2.getReturnValue() : class03556x;
         } else if (d0 < -0.21875) {
            class03556<class00780> class03556;
            class03556 class03556x = class03556 = this.R;
            CallbackInfoReturnable callbackinforeturnable3 = new CallbackInfoReturnable("", true, class03556);
            this.N(var1, var2, var3, var4, callbackinforeturnable3);
            return callbackinforeturnable3.isCancelled() ? (class03556)callbackinforeturnable3.getReturnValue() : class03556x;
         } else {
            class03556<class00780> class03556;
            class03556 class03556x = class03556 = this.M;
            CallbackInfoReturnable callbackinforeturnable4 = new CallbackInfoReturnable("", true, class03556);
            this.N(var1, var2, var3, var4, callbackinforeturnable4);
            return callbackinforeturnable4.isCancelled() ? (class03556)callbackinforeturnable4.getReturnValue() : class03556x;
         }
      }
   }
}
