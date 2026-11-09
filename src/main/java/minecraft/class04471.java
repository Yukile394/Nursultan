package minecraft;

import com.google.common.base.Strings;
import com.google.gson.JsonElement;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.InsecurePublicKeyException.MissingException;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse.KeyPair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.PublicKey;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04471 implements class02051 {
   private static final Logger y = LogUtils.getLogger();
   private static final Duration L = Duration.ofHours(1L);
   private static final Path u = Path.of("profilekeys");
   private final UserApiService i;
   private final Path R;
   private CompletableFuture<Optional<class04450>> M = CompletableFuture.completedFuture(Optional.empty());
   private Instant B = Instant.EPOCH;

   private Optional<class04450> L() {
      if (Files.notExists(this.R)) {
         return Optional.empty();
      } else {
         try {
            Optional<class04450> optional;
            try (BufferedReader bufferedreader = Files.newBufferedReader(this.R)) {
               optional = class04450.N.parse(JsonOps.INSTANCE, class08326.N(bufferedreader)).result();
            }

            return optional;
         } catch (Exception exception) {
            y.error("Failed to read profile key pair file {}", this.R, exception);
            return Optional.empty();
         }
      }
   }

   public class04471(UserApiService var1, UUID var2, Path var3) {
      super();
      this.i = var1;
      this.R = var3.resolve(u).resolve(var2 + ".json");
   }

   @Override
   public boolean y() {
      return this.M.isDone() && Instant.now().isAfter(this.B) ? this.M.join().<Boolean>map(class04450::N).orElse(true) : false;
   }

   private static class04454 N(KeyPairResponse var0) throws class05449 {
      KeyPair keypair = var0.keyPair();
      if (keypair != null && !Strings.isNullOrEmpty(keypair.publicKey()) && var0.publicKeySignature() != null && var0.publicKeySignature().array().length != 0) {
         class04454 class04454;
         try {
            Instant instant = Instant.parse(var0.expiresAt());
            PublicKey publickey = class01222.y(keypair.publicKey());
            ByteBuffer bytebuffer = var0.publicKeySignature();
            class04454 = new class04454(instant, publickey, bytebuffer.array());
         } catch (IllegalArgumentException | DateTimeException datetimeexception) {
            throw new class05449(datetimeexception);
         }

         class04454 class04454x = class04454;
         N(var0, new CallbackInfoReturnable("", false, class04454x));
         return class04454;
      } else {
         throw new class05449(new MissingException("Missing public key"));
      }
   }

   private static void N(KeyPairResponse var0, CallbackInfoReturnable var1) {
      ((IProfilePublicKey_Data)var1.getReturnValue())
         .viafabricplus$setLegacyPublicKeySignature(((IProfilePublicKey_Data)var0).viafabricplus$getLegacyPublicKeySignature());
   }

   @Override
   public CompletableFuture<Optional<class04450>> N() {
      this.B = Instant.now().plus(L);
      this.M = this.M.thenCompose(this::N);
      return this.M;
   }

   private CompletableFuture<Optional<class04450>> N(Optional<class04450> var1) {
      return CompletableFuture.supplyAsync(() -> {
         if (var1.isPresent() && !((class04450)var1.get()).N()) {
            if (!class07529.ND) {
               this.N(null);
            }

            return var1;
         } else {
            try {
               class04450 class04450 = this.N(this.i);
               this.N(class04450);
               return Optional.ofNullable(class04450);
            } catch (class05449 | MinecraftClientException | IOException ioexception) {
               y.error("Failed to retrieve profile key pair", ioexception);
               this.N(null);
               return var1;
            }
         }
      }, class07536.z());
   }

   private void N(@Nullable class04450 var1) {
      try {
         Files.deleteIfExists(this.R);
      } catch (IOException ioexception) {
         y.error("Failed to delete profile key pair file {}", this.R, ioexception);
      }

      if (var1 != null) {
         if (class07529.ND) {
            class04450.N.encodeStart(JsonOps.INSTANCE, var1).ifSuccess(var1x -> {
               try {
                  Files.createDirectories(this.R.getParent());
                  Files.writeString(this.R, var1x.toString());
               } catch (Exception exception) {
                  y.error("Failed to write profile key pair file {}", this.R, exception);
               }
            });
         }
      }
   }

   @Nullable
   private class04450 N(UserApiService var1) throws class05449, IOException {
      KeyPairResponse keypairresponse = var1.getKeyPair();
      if (keypairresponse != null) {
         class04454 class04454 = N(keypairresponse);
         return new class04450(
            class01222.N(keypairresponse.keyPair().privateKey()), new class04470(class04454), Instant.parse(keypairresponse.refreshedAfter())
         );
      } else {
         return null;
      }
   }
}
