package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.authlib.minecraft.UserApiService;
import java.io.File;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class03323 implements AutoCloseable {
   private static final AtomicInteger N = new AtomicInteger(1);
   private static final Executor y = Executors.newSingleThreadExecutor(var0 -> {
      Thread thread = new Thread(var0);
      thread.setName("Telemetry-Sender-#" + N.getAndIncrement());
      return thread;
   });
   private final class06202 L;
   private final UserApiService u;
   private final class02108 i;
   private final Path R;
   private final CompletableFuture<Optional<class02127>> M;
   private final Supplier<class02097> B = Suppliers.memoize(this::L);

   private class02097 L() {
      if (!this.L.NC()) {
         return class02097.N;
      } else {
         TelemetrySession telemetrysession = this.u.newTelemetrySession(y);
         if (!telemetrysession.isEnabled()) {
            return class02097.N;
         } else {
            CompletableFuture completablefuture = this.M
               .thenCompose(
                  var0 -> var0.<CompletionStage<Optional<class04236>>>map(class02127::N).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty()))
               );
            return (var3, var4) -> {
               if (!var3.u() || class06202.Nq().yz()) {
                  class02104 class02104 = class02108.N();
                  class02104.N(this.i);
                  class02104.N(class02117.W, Instant.now());
                  class02104.N(class02117.E, var3.u());
                  var4.accept(class02104);
                  class04199 class04199 = new class04199(var3, class02104.N());
                  completablefuture.thenAccept(var2xx -> {
                     if (!var2xx.isEmpty()) {
                        ((class04236)var2xx.get()).log(class04199);
                        if (!class07529.ND || !class07529.NF) {
                           class04199.N(telemetrysession).send();
                        }
                     }
                  });
               }
            };
         }
      }
   }

   public class03323(class06202 var1, UserApiService var2, class04771 var3) {
      super();
      this.L = var1;
      this.u = var2;
      class02104 class02104 = class02108.N();
      var3.R().ifPresent(var1x -> class02104.N(class02117.N, var1x));
      var3.i().ifPresent(var1x -> class02104.N(class02117.y, var1x));
      class02104.N(class02117.L, UUID.randomUUID());
      class02104.N(class02117.u, class07529.y().comp_4024());
      class02104.N(class02117.i, class07536.m().N());
      class02104.N(class02117.R, System.getProperty("os.name"));
      class02104.N(class02117.M, class06202.Z().N());
      class02104.y(class02117.B, class06202.p());
      this.i = class02104.N();
      this.R = ((File)var1.l_1).toPath().resolve("logs/telemetry");
      this.M = class02127.N(this.R);
   }

   @Override
   public void close() {
      this.M.thenAccept(var0 -> var0.ifPresent(class02127::close));
   }

   public Path y() {
      return this.R;
   }

   public class02090 N(boolean var1, @Nullable Duration var2, @Nullable String var3) {
      return new class02090(this.L(), var1, var2, var3);
   }

   public class02097 N() {
      return this.B.get();
   }
}
