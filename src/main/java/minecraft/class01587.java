package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import java.util.Map;
import java.util.Set;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.model.color.interop.BlockColorsExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl.ColorMapperHolder;
import net.fabricmc.fabric.impl.registry.sync.trackers.IdListTracker;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class01587 implements BlockColorsExtension, ColorMapperHolder {
   private static final int L = -1;
   public static final int N = -14647248;
   public static final int y = -9321636;
   private final class00742<class04750> u;
   private final Map<class00891, Set<class08092<?>>> i;
   private final Reference2ReferenceMap R = new Reference2ReferenceOpenHashMap();
   private final ReferenceSet M = new ReferenceOpenHashSet();

   public class01587() {
      super();
      this.u = new class00742<>(32);
      this.i = Maps.newHashMap();
      this.N(null);
   }

   public class04750 get(class00891 var1) {
      return this.u.N(class04206.i.N(var1));
   }

   private void N(class04750 var1, class00891[] var2, CallbackInfo var3) {
      for (class00891 class00891 : var2) {
         if (this.R.put(class00891, var1) != null) {
            this.M.add(class00891);
            SodiumClientMod.logger()
               .info("Block {} had its color provider replaced with {} and will not use per-vertex coloring", class04206.i.y(class00891), var1.toString());
         }
      }
   }

   private void N(CallbackInfo var1) {
      IdListTracker.register(class04206.i, "BlockColors.providers", this.u);
   }

   public static class01587 N() {
      class01587 class01587 = new class01587();
      class01587.N(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null
            ? class06229.N(var1, var0x.L(class06761.y) == class08059.field_12609 ? var2.method_10074() : var2)
            : class07287.N(),
         class00869.zk,
         class00869.zw
      );
      class01587.N(class06761.y, class00869.zk, class00869.zw);
      class01587.N(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null ? class06229.N(var1, var2) : class07287.N(),
         class00869.Z,
         class00869.yY,
         class00869.yk,
         class00869.MF,
         class00869.yO
      );
      class01587.N((var0x, var1, var2, var3) -> {
         if (var3 != 0) {
            return var1 != null && var2 != null ? class06229.N(var1, var2) : class07287.N();
         } else {
            return -1;
         }
      }, class00869.vh, class00869.vr);
      class01587.N((var0x, var1, var2, var3) -> -10380959, class00869.Ne);
      class01587.N((var0x, var1, var2, var3) -> -8345771, class00869.NH);
      class01587.N(
         (var0x, var1, var2, var3) -> var1 != null && var2 != null ? class06229.y(var1, var2) : -12012264,
         class00869.NV,
         class00869.Nc,
         class00869.NX,
         class00869.Np,
         class00869.Rc,
         class00869.NA
      );
      class01587.N((var0x, var1, var2, var3) -> var1 != null && var2 != null ? class06229.L(var1, var2) : -10732494, class00869.nN);
      class01587.N((var0x, var1, var2, var3) -> var1 != null && var2 != null ? class06229.u(var1, var2) : -1, class00869.K, class00869.PN, class00869.Mz);
      class01587.N((var0x, var1, var2, var3) -> class06884.y(var0x.L(class06884.R)), class00869.Lf);
      class01587.N(class06884.R, class00869.Lf);
      class01587.N((var0x, var1, var2, var3) -> var1 != null && var2 != null ? class06229.N(var1, var2) : -1, class00869.it);
      class01587.N((var0x, var1, var2, var3) -> -2046180, class00869.RV, class00869.RK);
      class01587.N((var0x, var1, var2, var3) -> {
         int ix = var0x.L(class07728.L);
         return class02566.N(ix * 32, 255 - ix * 8, ix * 4);
      }, class00869.RH, class00869.Re);
      class01587.N(class07728.L, class00869.RH, class00869.Re);
      class01587.N((var0x, var1, var2, var3) -> var1 != null && var2 != null ? -14647248 : -9321636, class00869.RS);
      N(new CallbackInfoReturnable("", false, class01587));
      return class01587;
   }

   private static void N(CallbackInfoReturnable var0) {
      ColorProviderRegistryImpl.BLOCK.initialize((class01587)var0.getReturnValue());
   }

   public int N(class00500 var1, @Nullable class07295 var2, @Nullable class07209 var3, int var4) {
      class04750 class04750 = this.u.N(class04206.i.N(var1.i()));
      return class04750 == null ? -1 : class04750.getColor(var1, var2, var3, var4);
   }

   public void N(class04750 var1, class00891... var2) {
      this.N(var1, var2, null);

      for (class00891 class00891 : var2) {
         this.u.N(var1, class04206.i.N(class00891));
      }
   }

   public Set<class08092<?>> N(class00891 var1) {
      return this.i.getOrDefault(var1, ImmutableSet.of());
   }

   private void N(class08092<?> var1, class00891... var2) {
      this.N(ImmutableSet.of(var1), var2);
   }

   private void N(Set<class08092<?>> var1, class00891... var2) {
      for (class00891 class00891 : var2) {
         this.i.put(class00891, var1);
      }
   }

   public int N(class00500 var1, class07299 var2, class07209 var3) {
      class04750 class04750 = this.u.N(class04206.i.N(var1.i()));
      if (class04750 != null) {
         return class04750.getColor(var1, null, null, 0);
      } else {
         class04689 class04689 = var1.N((class07290)var2, var3);
         return class04689 != null ? class04689.NU : -1;
      }
   }

   public Reference2ReferenceMap sodium$getProviders() {
      return Reference2ReferenceMaps.unmodifiable(this.R);
   }

   public ReferenceSet sodium$getOverridenVanillaBlocks() {
      return ReferenceSets.unmodifiable(this.M);
   }
}
