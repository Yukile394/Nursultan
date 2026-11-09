package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class class08377 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 64;
   private static final int L = 64;
   private static final int u = 32;
   private final Proxy i;
   private final class08627 R;
   private final Executor M;

   public class08377(Proxy var1, class08627 var2, Executor var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
   }

   private static void y(class08280 var0, int var1, int var2, int var3, int var4) {
      for (int ix = var1; ix < var3; ix++) {
         for (int j = var2; j < var4; j++) {
            var0.y(ix, j, class02566.M(var0.N(ix, j)));
         }
      }
   }

   private static void N(class08280 var0, int var1, int var2, int var3, int var4) {
      for (int ix = var1; ix < var3; ix++) {
         for (int j = var2; j < var4; j++) {
            if (class02566.y(var0.N(ix, j)) < 128) {
               return;
            }
         }
      }

      for (int k = var1; k < var3; k++) {
         for (int l = var2; l < var4; l++) {
            var0.y(k, l, var0.N(k, l) & 16777215);
         }
      }
   }

   private CompletableFuture<class06955> N(class06955 var1, class08280 var2) {
      return CompletableFuture.supplyAsync(() -> {
         class08829 class08829 = new class08829(var1.y()::toString, var2);
         this.R.N(var1.y(), class08829);
         return var1;
      }, this.M);
   }

   private static class08280 N(class08280 var0, String var1) {
      int ix = var0.y();
      int j = var0.N();
      if (j == 64 && (ix == 32 || ix == 64)) {
         boolean flag = ix == 32;
         if (flag) {
            class08280 class08280 = new class08280(64, 64, true);
            class08280.N(var0);
            var0.close();
            var0 = class08280;
            class08280.N(0, 32, 64, 32, 0);
            class08280.N(4, 16, 16, 32, 4, 4, true, false);
            class08280.N(8, 16, 16, 32, 4, 4, true, false);
            class08280.N(0, 20, 24, 32, 4, 12, true, false);
            class08280.N(4, 20, 16, 32, 4, 12, true, false);
            class08280.N(8, 20, 8, 32, 4, 12, true, false);
            class08280.N(12, 20, 16, 32, 4, 12, true, false);
            class08280.N(44, 16, -8, 32, 4, 4, true, false);
            class08280.N(48, 16, -8, 32, 4, 4, true, false);
            class08280.N(40, 20, 0, 32, 4, 12, true, false);
            class08280.N(44, 20, -8, 32, 4, 12, true, false);
            class08280.N(48, 20, -16, 32, 4, 12, true, false);
            class08280.N(52, 20, -8, 32, 4, 12, true, false);
         }

         y(var0, 0, 0, 32, 16);
         if (flag) {
            N(var0, 32, 0, 64, 32);
         }

         y(var0, 0, 16, 64, 32);
         y(var0, 16, 48, 48, 64);
         return var0;
      } else {
         var0.close();
         throw new IllegalStateException("Discarding incorrectly sized (" + j + "x" + ix + ") skin texture from " + var1);
      }
   }

   public CompletableFuture<class06955> N(class01894 var1, Path var2, String var3, boolean var4) {
      class06974 class06974 = new class06974(var1, var3);
      return CompletableFuture.<class08280>supplyAsync(() -> {
         class08280 class08280;
         try {
            class08280 = this.N(var2, class06974.L());
         } catch (IOException ioexception) {
            throw new UncheckedIOException(ioexception);
         }

         return var4 ? N(class08280, class06974.L()) : class08280;
      }, class07536.z().N("downloadTexture")).thenCompose(var2x -> this.N((class06955)class06974, var2x));
   }

   private class08280 N(Path var1, String var2) throws IOException {
      if (Files.isRegularFile(var1)) {
         N.debug("Loading HTTP texture from local cache ({})", var1);

         class08280 class08280;
         try (InputStream inputstream = Files.newInputStream(var1)) {
            class08280 = class08280.N(inputstream);
         }

         return class08280;
      } else {
         HttpURLConnection httpurlconnection = null;
         N.debug("Downloading HTTP texture from {} to {}", var2, var1);
         URI uri = URI.create(var2);

         class08280 class08280x;
         try {
            httpurlconnection = (HttpURLConnection)uri.toURL().openConnection(this.i);
            httpurlconnection.setDoInput(true);
            httpurlconnection.setDoOutput(false);
            httpurlconnection.connect();
            int ix = httpurlconnection.getResponseCode();
            if (ix / 100 != 2) {
               throw new IOException("Failed to open " + uri + ", HTTP error code: " + ix);
            }

            byte[] abyte = httpurlconnection.getInputStream().readAllBytes();

            try {
               class06290.L(var1.getParent());
               Files.write(var1, abyte);
            } catch (IOException ioexception) {
               N.warn("Failed to cache texture {} in {}", var2, var1);
            }

            class08280x = class08280.N(abyte);
         } finally {
            if (httpurlconnection != null) {
               httpurlconnection.disconnect();
            }
         }

         return class08280x;
      }
   }
}
