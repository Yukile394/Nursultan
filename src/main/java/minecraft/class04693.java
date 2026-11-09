package minecraft;

import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class class04693 extends class05129 {
   private static final class00392 y = class00392.L("multiplayer.applyingPack");
   private static final Logger L = LogUtils.getLogger();
   private static final class00392 u = class00392.L("mco.connect.connecting");
   private final class04981 i;
   private final class05096 R;

   public class04693(class05096 var1, class04981 var2) {
      super();
      this.R = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      class00093 class00093;
      try {
         class00093 = this.R();
      } catch (CancellationException cancellationexception) {
         L.info("User aborted connecting to realms");
         return;
      } catch (class05097 class05097) {
         switch (class05097.N.N()) {
            case 6002:
               N(new class04731(this.R, this.i));
               return;
            case 6006:
               boolean flag1 = class06202.Nq().y(this.i.B);
               N(
                  (class05096)(flag1
                     ? new class05107(this.R, this.i.y, this.i.z())
                     : new class04702(class00392.L("mco.brokenworld.nonowner.title"), class00392.L("mco.brokenworld.nonowner.error"), this.R))
               );
               return;
            default:
               this.N(class05097);
               L.error("Couldn't connect to world", class05097);
               return;
         }
      } catch (TimeoutException timeoutexception) {
         this.N(class00392.L("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception exception) {
         L.error("Couldn't connect to world", exception);
         this.N(exception);
         return;
      }

      if (class00093.N() == null) {
         this.N(class00392.L("mco.errorMessage.connectionFailure"));
      } else {
         boolean flag = class00093.y() != null && class00093.L() != null;
         Object object = flag ? this.N(class00093, N(this.i), this::N) : this.N(class00093);
         N((class05096)object);
      }
   }

   private CompletableFuture<?> N(class00093 var1, UUID var2) {
      try {
         if (var1.y() == null) {
            return CompletableFuture.failedFuture(new IllegalStateException("resourcePackUrl was null"));
         } else if (var1.L() == null) {
            return CompletableFuture.failedFuture(new IllegalStateException("resourcePackHash was null"));
         } else {
            class00232 class00232 = class06202.Nq().yL();
            CompletableFuture<Void> completablefuture = class00232.y(var2);
            class00232.M();
            class00232.N(var2, new URL(var1.y()), var1.L());
            return completablefuture;
         }
      } catch (Exception exception) {
         return CompletableFuture.failedFuture(exception);
      }
   }

   private class03723 N(class00093 var1, UUID var2, Function<class00093, class05096> var3) {
      class05216 class05216 = class00392.L("mco.configure.world.resourcepack.question");
      return class02252.N(this.R, class05216, var4x -> {
         N(new class06307(y));
         this.N(var1, var2).thenRun(() -> N((class05096)var3.apply(var1))).exceptionally(var2xx -> {
            class06202.Nq().yL().Z();
            L.error("Failed to download resource pack from {}", var1, var2xx);
            N(new class04702(class00392.L("mco.download.resourcePack.fail"), this.R));
            return null;
         });
      });
   }

   private static UUID N(class04981 var0) {
      return var0.b != null
         ? UUID.nameUUIDFromBytes(("minigame:" + var0.b).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + Objects.requireNonNullElse(var0.u, "") + ":" + var0.T).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public class00392 N() {
      return u;
   }

   public class04708 N(class00093 var1) {
      return new class00109(this.R, var1, new class04722(this.R, this.i, var1));
   }

   private class00093 R() throws class05097, TimeoutException, CancellationException {
      class05111 class05111 = class05111.N();

      for (int ix = 0; ix < 40; ix++) {
         if (this.y()) {
            throw new CancellationException();
         }

         try {
            return class05111.y(this.i.y);
         } catch (class05098 class05098) {
            N(class05098.L);
         }
      }

      throw new TimeoutException();
   }
}
