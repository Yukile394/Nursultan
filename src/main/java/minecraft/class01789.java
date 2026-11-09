package minecraft;

import com.google.common.hash.HashCode;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class class01789 implements AutoCloseable {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 20;
   private final Path L;
   private final class04220<class03844> u;
   private final class08214 i = new class08214(class07536.z(), "download-queue");

   public class01789(Path var1) throws IOException {
      super();
      this.L = var1;
      class06290.L(var1);
      this.u = class04220.N(class03844.N, var1.resolve("log.json"));
      class03828.N(var1, 20);
   }

   @Override
   public void close() throws IOException {
      this.i.close();
      this.u.close();
   }

   private class03814 y(class01797 var1, Map<UUID, class03848> var2) {
      class03814 class03814 = new class03814();
      var2.forEach(
         (var3x, var4) -> {
            Path path = this.L.resolve(var3x.toString());
            Path path1 = null;

            try {
               path1 = class05021.N(path, var4.N(), var1.L(), var1.N(), var4.y(), var1.y(), var1.u(), var1.i());
               class03814.N().put(var3x, path1);
            } catch (Exception exception1) {
               N.error("Failed to download {}", var4.N(), exception1);
               class03814.y().add(var3x);
            }

            try {
               this.u
                  .N(
                     new class03844(
                        var3x,
                        var4.N().toString(),
                        Instant.now(),
                        Optional.ofNullable(var4.y()).map(HashCode::toString),
                        path1 != null ? this.N(path1) : Either.left("download_failed")
                     )
                  );
            } catch (Exception exception) {
               N.error("Failed to log download of {}", var4.N(), exception);
            }
         }
      );
      return class03814;
   }

   private Either<String, class03812> N(Path var1) {
      try {
         long ix = Files.size(var1);
         Path path = this.L.relativize(var1);
         return Either.right(new class03812(path.toString(), ix));
      } catch (IOException ioexception) {
         N.error("Failed to get file size of {}", var1, ioexception);
         return Either.left("no_access");
      }
   }

   public CompletableFuture<class03814> N(class01797 var1, Map<UUID, class03848> var2) {
      return CompletableFuture.supplyAsync(() -> this.y(var1, var2), this.i::N);
   }
}
