package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.SignatureState;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class class08555 {
   static final Logger N = LogUtils.getLogger();
   private final class03930 L;
   final class08377 y;
   private final LoadingCache<class08550, CompletableFuture<Optional<class01631>>> u;
   private final class08580 i;
   private final class08580 R;
   private final class08580 M;

   public class08555(Path var1, class03930 var2, class08377 var3, Executor var4) {
      super();
      this.L = var2;
      this.y = var3;
      this.i = new class08580(this, var1, Type.SKIN);
      this.R = new class08580(this, var1, Type.CAPE);
      this.M = new class08580(this, var1, Type.ELYTRA);
      this.u = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build(new class08572(this, var2, var4));
   }

   public CompletableFuture<Optional<class01631>> N(GameProfile var1) {
      if (class07529.NE) {
         class01631 class01631 = class00189.N(var1);
         return CompletableFuture.completedFuture(Optional.of(class01631));
      } else {
         Property property = this.L.L().getPackedTextures(var1);
         return (CompletableFuture<Optional<class01631>>)this.u.getUnchecked(new class08550(var1.id(), property));
      }
   }

   public Supplier<class01631> N(GameProfile var1, boolean var2) {
      CompletableFuture completablefuture = N(this, var1);
      class01631 class01631 = class00189.N(var1);
      if (class07529.NE) {
         return () -> class01631;
      } else {
         Optional optional = (Optional)completablefuture.getNow(null);
         return optional != null ? () -> var0 : () -> completablefuture.getNow(Optional.empty()).filter(var1xx -> !var2 || var1xx.i()).orElse(class01631);
      }
   }

   private static CompletableFuture N(class08555 var0, GameProfile var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20) && !var1.properties().containsKey("textures")
         ? CompletableFuture.<GameProfile>supplyAsync(() -> {
            ProfileResult profileresult = class06202.Nq().n().L().fetchProfile(var1.id(), true);
            return profileresult == null ? var1 : profileresult.profile();
         }, class07536.B()).thenCompose(var0::N)
         : var0.N(var1);
   }

   CompletableFuture<class01631> N(UUID var1, MinecraftProfileTextures var2) {
      MinecraftProfileTexture minecraftprofiletexture = var2.skin();
      CompletableFuture<class06955> completablefuture;
      class04208 class04208;
      if (minecraftprofiletexture != null) {
         completablefuture = this.i.N(minecraftprofiletexture);
         class04208 = class04208.N(minecraftprofiletexture.getMetadata("model"));
      } else {
         class01631 class01631 = class00189.N(var1);
         completablefuture = CompletableFuture.completedFuture(class01631.N());
         class04208 = class01631.u();
      }

      MinecraftProfileTexture minecraftprofiletexture2 = var2.cape();
      CompletableFuture completablefuture1 = minecraftprofiletexture2 != null ? this.R.N(minecraftprofiletexture2) : CompletableFuture.completedFuture(null);
      MinecraftProfileTexture minecraftprofiletexture1 = var2.elytra();
      CompletableFuture completablefuture2 = minecraftprofiletexture1 != null ? this.M.N(minecraftprofiletexture1) : CompletableFuture.completedFuture(null);
      return CompletableFuture.allOf(completablefuture, completablefuture1, completablefuture2)
         .thenApply(
            var5x -> new class01631(
               completablefuture.join(),
               (class06955)completablefuture1.join(),
               (class06955)completablefuture2.join(),
               class04208,
               var2.signatureState() == SignatureState.SIGNED
            )
         );
   }
}
