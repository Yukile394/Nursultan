package minecraft;

import Nursultan.class11392;
import Nursultan.class11938;
import com.google.common.cache.CacheLoader;
import com.mojang.authlib.SignatureState;
import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import com.mojang.authlib.properties.Property;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class class08572 extends CacheLoader<class08550, CompletableFuture<Optional<class01631>>> {
   class08572(class08555 var1, class03930 var2, Executor var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   private static void N(class08550 var0, MinecraftProfileTextures var1, CallbackInfoReturnable var2) {
      Property property = var0.y();
      if (property != null) {
         ((CompletionStage)var2.getReturnValue()).thenAccept(var1x -> class11938.L().L(new class11392(property)));
      }
   }

   public CompletableFuture<Optional<class01631>> load(class08550 var1) {
      return CompletableFuture.<MinecraftProfileTextures>supplyAsync(() -> {
         Property property = var1.y();
         if (property == null) {
            return MinecraftProfileTextures.EMPTY;
         } else {
            MinecraftProfileTextures minecraftprofiletextures = var1x.L().unpackTextures(property);
            if (minecraftprofiletextures.signatureState() == SignatureState.INVALID) {
               class08555.N.warn("Profile contained invalid signature for textures property (profile id: {})", var1.N());
            }

            return minecraftprofiletextures;
         }
      }, class07536.B().N("unpackSkinTextures")).thenComposeAsync(var2 -> {
         CompletableFuture<class01631> completablefuture;
         CompletableFuture completablefuture1 = completablefuture = this.L.N(var1.N(), var2);
         N(var1, var2, new CallbackInfoReturnable("", false, completablefuture));
         return completablefuture1;
      }, this.y).handle((var1x, var2) -> {
         if (var2 != null) {
            class08555.N.warn("Failed to load texture for profile {}", var1.N(), var2);
         }

         return Optional.ofNullable(var1x);
      });
   }
}
