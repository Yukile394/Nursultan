package minecraft;

import Nursultan.class10490;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class class05114 implements AutoCloseable {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 5;
   private static final String L = "/upload";
   private final File u;
   private final long i;
   private final int R;
   private final class04987 M;
   private final String B;
   private final String Z;
   private final String z;
   private final String U;
   private final class05113 E;
   private final HttpClient W;

   public class05114(File var1, long var2, int var4, class04987 var5, class04771 var6, String var7, String var8, class05113 var9) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var4;
      this.M = var5;
      this.B = var6.N();
      this.Z = var6.L();
      this.z = var7;
      this.U = var8;
      this.E = var9;
      this.W = HttpClient.newBuilder().executor(class07536.z()).connectTimeout(Duration.ofSeconds(15L)).build();
   }

   @Override
   public void close() {
      this.W.close();
   }

   private long y(HttpResponse<?> var1) {
      return var1.headers().firstValueAsLong("Retry-After").orElse(0L);
   }

   private String y() {
      return "sid=" + this.B + ";token=" + this.M.y() + ";user=" + this.Z + ";version=" + this.z + ";worldVersion=" + this.U;
   }

   private class04712 N(HttpResponse<String> var1) {
      int ix = var1.statusCode();
      if (ix == 401) {
         N.debug("Realms server returned 401: {}", var1.headers().firstValue("WWW-Authenticate"));
      }

      String s = null;
      String s1 = (String)var1.body();
      if (s1 != null && !s1.isBlank()) {
         try {
            JsonElement jsonelement = class08314.N(s1).getAsJsonObject().get("errorMsg");
            if (jsonelement != null) {
               s = jsonelement.getAsString();
            }
         } catch (Exception exception) {
            N.warn("Failed to parse response {}", s1, exception);
         }
      }

      return new class04712(ix, s);
   }

   private CompletableFuture<class04712> N(int var1, long var2) {
      BodyPublisher bodypublisher = N(() -> {
         try {
            return new class10490(new FileInputStream(this.u), this.E);
         } catch (IOException ioexception) {
            N.warn("Failed to open file {}", this.u, ioexception);
            return null;
         }
      }, var2);
      HttpRequest httprequest = HttpRequest.newBuilder(this.M.L().resolve("/upload/" + this.i + "/" + this.R))
         .timeout(Duration.ofMinutes(10L))
         .setHeader("Cookie", this.y())
         .setHeader("Content-Type", "application/octet-stream")
         .POST(bodypublisher)
         .build();
      return this.W.sendAsync(httprequest, BodyHandlers.ofString(StandardCharsets.UTF_8)).thenCompose(var4x -> {
         long ix = this.y((HttpResponse<?>)var4x);
         if (this.N(ix, var1)) {
            this.E.N();

            try {
               Thread.sleep(Duration.ofSeconds(ix));
            } catch (InterruptedException interruptedexception) {
            }

            return this.N(var1 + 1, var2);
         } else {
            return CompletableFuture.completedFuture(this.N((HttpResponse<String>)var4x));
         }
      });
   }

   private static BodyPublisher N(Supplier<InputStream> var0, long var1) {
      return BodyPublishers.fromPublisher(BodyPublishers.ofInputStream(var0), var1);
   }

   public CompletableFuture<class04712> N() {
      long ix = this.u.length();
      this.E.N(ix);
      return this.N(0, ix);
   }

   private boolean N(long var1, int var3) {
      return var1 > 0L && var3 + 1 < 5;
   }
}
