package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import net.caffeinemc.mods.lithium.common.entity.EquipmentInfo;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber.CountChangeSubscriber;
import net.caffeinemc.mods.lithium.common.world.in_world_tracking.MaybeInLevelObject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08599 implements EquipmentInfo, CountChangeSubscriber, MaybeInLevelObject {
   public static final Codec<class08599> N = Codec.unboundedMap(class07085.field_45739, class06584.y).xmap(var0 -> {
      EnumMap enummap = new EnumMap<>(class07085.class);
      enummap.putAll(var0);
      return new class08599(enummap);
   }, var0 -> {
      EnumMap enummap = new EnumMap<>(var0.R);
      enummap.values().removeIf(class06584::R);
      return enummap;
   });
   private final EnumMap<class07085, class06584> R;
   boolean y = false;
   class06584 L = null;
   boolean u = true;
   boolean i = false;

   private void L() {
      this.y = false;
      this.L = null;
      this.u = true;

      for (class06584 class06584 : this.R.values()) {
         if (!class06584.R()) {
            class06584.lithium$unsubscribeWithData(this, 0);
         }
      }
   }

   private class06584 L(class07085 var1, class06584 var2) {
      return Objects.requireNonNullElse(this.R.put(var1, var2), class06584.E);
   }

   private void L(class06584 var1) {
      if (this.L != null && this.L != var1) {
         this.y = N(this.L);
         this.L = null;
      }
   }

   private class08599(EnumMap<class07085, class06584> var1) {
      super();
      this.R = var1;
   }

   public class08599() {
      this(new EnumMap<>(class07085.class));
   }

   private void u() {
      this.y = false;
      this.L = null;
      this.u = true;

      for (class06584 class06584 : this.R.values()) {
         if (!class06584.R()) {
            if (!this.y) {
               this.y = N(class06584);
            }

            if (!class06584.R()) {
               class06584.lithium$subscribe(this, 0);
            }
         }
      }
   }

   private void y(class08599 var1, CallbackInfo var2) {
      if (this.i) {
         this.u();
      }
   }

   private void y(class06584 var1) {
      this.L = var1;
   }

   public void lithium$forceUnsubscribe(class06584 var1, int var2) {
      throw new UnsupportedOperationException();
   }

   public void y() {
      this.R.replaceAll((var0, var1) -> class06584.E);
      this.N(null);
   }

   private void N(CallbackInfo var1) {
      if (this.i) {
         this.L();
      }
   }

   private void N(class08599 var1, CallbackInfo var2) {
      if (this.i) {
         this.L();
      }
   }

   private class06584 N(class07085 var1, class06584 var2, Operation var3) {
      class06584 class06584 = (class06584)var3.call(new Object[]{var1, var2});
      if (this.i) {
         this.N(class06584, var2);
      }

      return class06584;
   }

   private static boolean N(class06584 var0) {
      if (!var0.R()) {
         class02710 class02710 = var0.method_58694(class02484.P);
         if (class02710 != null && !class02710.u()) {
            Iterator<class03556<class07304>> iterator = class02710.N().iterator();

            while (iterator.hasNext()) {
               if (!iterator.next().N().N(class02523.s).isEmpty()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void lithium$notify(class06584 var1, int var2) {
      this.u = true;
      if (!this.y) {
         this.L(var1);
         this.y(var1);
      }
   }

   private void N(class06584 var1, class06584 var2) {
      if (!this.y) {
         if (this.L == var1) {
            this.L = null;
         }

         this.y = N(var2);
      }

      this.u = true;
      if (!var1.R()) {
         var1.lithium$unsubscribeWithData(this, 0);
      }

      if (!var2.R()) {
         var2.lithium$subscribe(this, 0);
      }
   }

   public void lithium$notifyCount(class06584 var1, int var2, int var3) {
      if (var3 == 0) {
         var1.lithium$unsubscribeWithData(this, var2);
      }

      this.N(var1, class06584.E);
   }

   public void N(class07049 var1) {
      for (Entry entry : this.R.entrySet()) {
         class06584 class06584 = (class06584)entry.getValue();
         if (!class06584.R()) {
            class06584.N(var1.method_73183(), var1, (class07085)entry.getKey());
         }
      }
   }

   public void N(class08599 var1) {
      this.N(var1, null);
      this.R.clear();
      this.R.putAll(var1.R);
      this.y(var1, null);
   }

   public void N(class07438 var1) {
      for (class06584 class06584 : this.R.values()) {
         var1.method_7329(class06584, true, false);
      }

      this.y();
   }

   public boolean N() {
      Iterator<class06584> iterator = this.R.values().iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().R()) {
            return false;
         }
      }

      return true;
   }

   public class06584 N(class07085 var1) {
      return this.R.getOrDefault(var1, class06584.E);
   }

   public class06584 N(class07085 var1, class06584 var2) {
      return this.N(var1, var2, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 2, "[net.minecraft.class_1304, net.minecraft.class_1799]");
         return this.L((class07085)var1x[0], (class06584)var1x[1]);
      });
   }

   public void lithium$handleAddedToLevel(class07299 var1) {
      this.i = true;
      this.u();
      super.lithium$handleAddedToLevel(var1);
   }

   public boolean lithium$isInLevel() {
      return this.i;
   }

   public void lithium$handleRemovedFromLevel(class07299 var1) {
      this.i = false;
      this.L();
      super.lithium$handleRemovedFromLevel(var1);
   }

   public void lithium$onEquipmentChangesSent() {
      if (this.i) {
         this.u = false;
      }
   }

   public boolean lithium$shouldTickEnchantments() {
      if (!this.i) {
         return true;
      } else {
         this.L(null);
         return this.y;
      }
   }

   public boolean lithium$hasUnsentEquipmentChanges() {
      return !this.i ? true : this.u;
   }
}
