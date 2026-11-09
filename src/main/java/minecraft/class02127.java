package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.time.Clock;
import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class02127 implements AutoCloseable {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = ".json";
   private static final int L = 7;
   private final class04242 u;
   @Nullable
   private CompletableFuture<Optional<class04226>> i;

   private class02127(class04242 var1) {
      super();
      this.u = var1;
   }

   @Override
   public void close() {
      if (this.i != null) {
         this.i.thenAccept(var0 -> var0.ifPresent(class04226::close));
      }
   }

   public CompletableFuture<Optional<class04236>> N() {
      if (this.i == null) {
         this.i = CompletableFuture.supplyAsync(() -> {
            try {
               class04209 class04209 = this.u.N(LocalDate.now(Clock.systemDefaultZone()));
               FileChannel filechannel = class04209.i();
               return Optional.of(new class04226(filechannel, class07536.B()));
            } catch (IOException ioexception) {
               N.error("Failed to open channel for telemetry event log", ioexception);
               return Optional.empty();
            }
         }, class07536.B());
      }

      return this.i.thenApply(var0 -> var0.map(class04226::N));
   }

   public static CompletableFuture<Optional<class02127>> N(Path var0) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            class04242 class04242 = class04242.N(var0, ".json");
            class04242.N().N(LocalDate.now(Clock.systemDefaultZone()), 7).N();
            return Optional.of(new class02127(class04242));
         } catch (Exception exception) {
            N.error("Failed to create telemetry log manager", exception);
            return Optional.empty();
         }
      }, class07536.B());
   }
}
