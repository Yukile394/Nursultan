package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.function.Function;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.particle.ParticleRendererRegistryImpl;
import net.fabricmc.fabric.mixin.client.particle.ParticleEngineAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class04410 implements ParticleEngineAccessor {
   public static List<class06166> L = List.of(class06166.N, class06166.y, class06166.L);
   protected class03448 N;
   private final Map<class06166, class00962<?>> u = Maps.newIdentityHashMap();
   private final Queue<class03646> i = Queues.newArrayDeque();
   private final Queue<class04406> R = Queues.newArrayDeque();
   private final Object2IntOpenHashMap<class06064> M = new Object2IntOpenHashMap();
   public final class00951 y;
   private final class06069 B = class06069.u();

   public void L() {
      this.u.clear();
      this.R.clear();
      this.i.clear();
      this.M.clear();
   }

   public class04410(class03448 var1, class00951 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public String y() {
      return String.valueOf(this.u.values().stream().mapToInt(class00962::L).sum());
   }

   @Nullable
   private <T extends class07126> class04406 y(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      class04417<?> class04417 = (class04417<?>)this.y.N().get(class04206.z.N(var1.method_10295()));
      return class04417 == null ? null : ((class04417<class07126>)class04417).method_3090(var1, this.N, var2, var4, var6, var8, var10, var12, this.B);
   }

   private static void N(CallbackInfo var0) {
      L = new ArrayList<>(L);
   }

   public void N(class07049 var1, class07126 var2) {
      this.i.add(new class03646(this.N, var1, var2));
   }

   public void N(class07049 var1, class07126 var2, int var3) {
      this.i.add(new class03646(this.N, var1, var2, var3));
   }

   public void N(@Nullable class03448 var1) {
      this.N = var1;
      this.L();
      this.i.clear();
   }

   public void N(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfoReturnable var14) {
      if (SodiumExtraClientMod.options().particleSettings.particles) {
         class01894 class01894 = class04206.z.y(var1.method_10295());
         if (!SodiumExtraClientMod.options().particleSettings.otherMap.computeIfAbsent(class01894, var0 -> true)) {
            var14.setReturnValue(null);
         }
      } else {
         var14.setReturnValue(null);
      }
   }

   private void N(class06166 var1, CallbackInfoReturnable var2) {
      Function<class04410, class00962<?>> function = ParticleRendererRegistryImpl.INSTANCE.getFactory(var1);
      if (function != null) {
         var2.setReturnValue(function.apply(this));
      }
   }

   protected void N(class06064 var1, int var2) {
      this.M.addTo(var1, var2);
   }

   private class00962<?> N(class06166 var1) {
      if (var1 == class06166.y) {
         return new class00961(this);
      } else if (var1 == class06166.L) {
         return new class06627(this);
      } else if (var1 == class06166.u) {
         return new class00967(this);
      } else {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.N(var1, callbackinforeturnable);
         return (class00962<?>)(callbackinforeturnable.isCancelled() ? (class00962)callbackinforeturnable.getReturnValue() : new class00954(this, var1));
      }
   }

   public void N() {
      this.u.forEach((var0, var1x) -> {
         class08700.N().N(var0.N());
         var1x.y();
         class08700.N().L();
      });
      if (!this.i.isEmpty()) {
         ArrayList arraylist = Lists.newArrayList();

         for (class03646 class03646 : this.i) {
            class03646.method_3070();
            if (!class03646.method_3086()) {
               arraylist.add(class03646);
            }
         }

         this.i.removeAll(arraylist);
      }

      class04406 class04406;
      if (!this.R.isEmpty()) {
         while ((class04406 = this.R.poll()) != null) {
            this.u.computeIfAbsent(class04406.method_74274(), this::N).N(class04406);
         }
      }
   }

   public void N(class04406 var1) {
      Optional<class06064> optional = var1.method_34019();
      if (optional.isPresent()) {
         if (this.N(optional.get())) {
            this.R.add(var1);
            this.N(optional.get(), 1);
         }
      } else {
         this.R.add(var1);
      }
   }

   public void N(class00987 var1, class01383 var2, class05363 var3, float var4) {
      for (class06166 class06166 : L) {
         class00962<?> class00962 = this.u.get(class06166);
         if (class00962 != null && !class00962.N()) {
            var1.N(class00962.N(var2, var3, var4));
         }
      }
   }

   @Nullable
   public class04406 N(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var4, var6, var8, var10, var12, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class04406)callbackinforeturnable.getReturnValue();
      } else {
         class04406 class04406 = this.y(var1, var2, var4, var6, var8, var10, var12);
         if (class04406 != null) {
            this.N(class04406);
            return class04406;
         } else {
            return null;
         }
      }
   }

   private boolean N(class06064 var1) {
      return this.M.getInt(var1) < var1.N();
   }
}
