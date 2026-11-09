package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00246 {
   private static final Logger y = LogUtils.getLogger();
   public static final int N = 20;
   private final class05111 L = class05111.N();
   private final Path u;
   private final class00072 i;
   private final class04771 R;
   private final long M;
   private final class00276 B;
   private volatile boolean Z;
   @Nullable
   private volatile CompletableFuture<?> z;

   private class04987 L() throws class05097, InterruptedException {
      for (int ix = 0; ix < 20; ix++) {
         try {
            class04987 class04987 = this.L.B(this.M);
            if (this.Z) {
               throw new class08730();
            }

            if (class04987 != null) {
               if (!class04987.N()) {
                  throw new class00248();
               }

               return class04987;
            }
         } catch (class05098 class05098) {
            Thread.sleep(class05098.L * 1000L);
         }
      }

      throw new class00248();
   }

   public class00246(Path var1, class00072 var2, class04771 var3, long var4, class00276 var6) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
      this.M = var4;
      this.B = var6;
   }

   public void y() {
      this.Z = true;
      CompletableFuture<?> completablefuture = this.z;
      if (completablefuture != null) {
         completablefuture.cancel(true);
      }
   }

   public CompletableFuture<?> N() {
      return CompletableFuture.runAsync(() -> {
         File file1 = null;

         try {
            class04987 class04987 = this.L();
            file1 = class00280.N(this.u, () -> this.Z);
            this.B.y();

            try (class05114 class05114 = new class05114(file1, this.M, this.i.N, class04987, this.R, class07529.y().comp_4025(), this.i.y.i, this.B.N())) {
               CompletableFuture<class04712> completablefuture = class05114.N();
               this.z = completablefuture;
               if (!this.Z) {
                  class04712 class04712;
                  try {
                     class04712 = completablefuture.join();
                  } catch (CompletionException completionexception) {
                     throw completionexception.getCause();
                  }

                  String s = class04712.N();
                  if (s != null) {
                     throw new class08715(s);
                  }

                  class04609.y(this.M);
                  this.L.N(this.M, this.i.N, this.i.y, this.i.L);
                  return;
               }

               completablefuture.cancel(true);
            }
         } catch (class05097 class05097) {
            throw new class08715(class05097.N.y());
         } catch (CancellationException | InterruptedException interruptedexception) {
            throw new class08730();
         } catch (class08688 class08688) {
            throw class08688;
         } catch (Throwable throwable1) {
            if (throwable1 instanceof Error error) {
               throw error;
            }

            throw new class08715(throwable1.getMessage());
         } finally {
            if (file1 != null) {
               y.debug("Deleting file {}", file1.getAbsolutePath());
               file1.delete();
            }
         }
      }, class07536.B());
   }
}
