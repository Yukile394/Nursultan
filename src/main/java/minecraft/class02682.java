package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import net.caffeinemc.mods.lithium.mixin.ai.pathing.PathfindingContextAccessor;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02682 implements PathfindingContextAccessor {
   private final class07322 N;
   @Nullable
   private final class02703 y;
   private final class07209 L;
   private final class07218 u = new class07218();

   public class02682(class07322 var1, class07079 var2) {
      super();
      this.N = var1;
      if (this.N(var2, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_1308]");
         return ((class07079)var0[0]).method_73183();
      }) instanceof class04782 class04782) {
         this.y = class04782.method_57133();
      } else {
         this.y = null;
      }

      this.L = this.y(var2, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_1308]");
         return ((class07079)var0[0]).method_24515();
      });
   }

   public class07209 y() {
      return this.L;
   }

   private class07209 y(class07079 var1, Operation var2) {
      return var1 == null ? null : (class07209)var2.call(new Object[]{var1});
   }

   private void N(int var1, int var2, int var3, CallbackInfoReturnable var4, class07209 var5) {
      class04425 class04425 = LandPathNodeTypesRegistry.getPathNodeType(this.N(var5), this.N(), var5, true);
      if (class04425 != null) {
         var4.setReturnValue(class04425);
      }
   }

   public class04425 N(int var1, int var2, int var3) {
      class07218 class07218 = this.u.N(var1, var2, var3);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable, class07218);
      if (callbackinforeturnable.isCancelled()) {
         return (class04425)callbackinforeturnable.getReturnValue();
      } else {
         return this.y == null ? class07955.y(this.N, class07218) : this.y.N(this.N, class07218);
      }
   }

   public class07322 N() {
      return this.N;
   }

   public class00500 N(class07209 var1) {
      return this.N.method_8320(var1);
   }

   private class07299 N(class07079 var1, Operation var2) {
      return var1 == null ? null : (class07299)var2.call(new Object[]{var1});
   }
}
