package minecraft;

import Nursultan.class09765;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class02593 implements AutoCloseable {
   protected static final Logger i = LogUtils.getLogger();
   private static final AtomicInteger N = new AtomicInteger(1);
   private static final ThreadFactory y = var0 -> {
      Thread thread = new Thread(var0);
      thread.setName("Chat-Filter-Worker-" + N.getAndIncrement());
      return thread;
   };
   private final URL L;
   private final class02571 u;
   final class02588 R;
   final ExecutorService M;

   protected class02593(URL var1, class02571 var2, class02588 var3, ExecutorService var4) {
      super();
      this.R = var3;
      this.M = var4;
      this.L = var1;
      this.u = var2;
   }

   @Override
   public void close() {
      this.M.shutdownNow();
   }

   private JsonObject y(JsonObject var1, URL var2) throws IOException {
      HttpURLConnection httpurlconnection = this.N(var1, var2);

      JsonObject jsonobject;
      try (InputStream inputstream = httpurlconnection.getInputStream()) {
         if (httpurlconnection.getResponseCode() == 204) {
            return new JsonObject();
         }

         try {
            jsonobject = class08314.N(new InputStreamReader(inputstream, StandardCharsets.UTF_8)).getAsJsonObject();
         } finally {
            this.N(inputstream);
         }
      }

      return jsonobject;
   }

   protected abstract void N(HttpURLConnection var1);

   protected HttpURLConnection N(JsonObject var1, URL var2) throws IOException {
      HttpURLConnection httpurlconnection = this.N(var2);
      this.N(httpurlconnection);
      OutputStreamWriter outputstreamwriter = new OutputStreamWriter(httpurlconnection.getOutputStream(), StandardCharsets.UTF_8);

      try {
         JsonWriter jsonwriter = new JsonWriter(outputstreamwriter);

         try {
            Streams.write(var1, jsonwriter);
         } catch (Throwable throwable2) {
            try {
               jsonwriter.close();
            } catch (Throwable throwable1) {
               throwable2.addSuppressed(throwable1);
            }

            throw throwable2;
         }

         jsonwriter.close();
      } catch (Throwable throwable3) {
         try {
            outputstreamwriter.close();
         } catch (Throwable throwable) {
            throwable3.addSuppressed(throwable);
         }

         throw throwable3;
      }

      outputstreamwriter.close();
      int ix = httpurlconnection.getResponseCode();
      if (ix >= 200 && ix < 300) {
         return httpurlconnection;
      } else {
         throw new class09765(ix + " " + httpurlconnection.getResponseMessage());
      }
   }

   protected int N() {
      return 2000;
   }

   protected static ExecutorService N(int var0) {
      return Executors.newFixedThreadPool(var0, y);
   }

   public class05477 N(GameProfile var1) {
      return new class02591(this, var1);
   }

   protected HttpURLConnection N(URL var1) throws IOException {
      HttpURLConnection httpurlconnection = (HttpURLConnection)var1.openConnection();
      httpurlconnection.setConnectTimeout(15000);
      httpurlconnection.setReadTimeout(this.N());
      httpurlconnection.setUseCaches(false);
      httpurlconnection.setDoOutput(true);
      httpurlconnection.setDoInput(true);
      httpurlconnection.setRequestMethod("POST");
      httpurlconnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
      httpurlconnection.setRequestProperty("Accept", "application/json");
      httpurlconnection.setRequestProperty("User-Agent", "Minecraft server" + class07529.y().comp_4025());
      return httpurlconnection;
   }

   protected CompletableFuture<class06068> N(GameProfile var1, String var2, class02588 var3, Executor var4) {
      return var2.isEmpty() ? CompletableFuture.completedFuture(class06068.N) : CompletableFuture.supplyAsync(() -> {
         JsonObject jsonobject = this.u.encode(var1, var2);

         try {
            JsonObject jsonobject1 = this.y(jsonobject, this.L);
            return this.N(var2, var3, jsonobject1);
         } catch (Exception exception) {
            i.warn("Failed to validate message '{}'", var2, exception);
            return class06068.y(var2);
         }
      }, var4);
   }

   @Nullable
   public static class02593 N(class05270 var0) {
      String s = var0.NN;
      if (class05018.B(s)) {
         return null;
      } else {
         return switch (var0.Ny) {
            case 0 -> class05461.N(s);
            case 1 -> class02573.N(s);
            default -> {
               i.warn("Could not create text filter - unsupported text filtering version used");
               yield null;
            }
         };
      }
   }

   protected static String N(@Nullable JsonObject var0, String var1, String var2) {
      return var0 != null ? class05001.N(var0, var1, var2) : var2;
   }

   protected static URL N(URI var0, @Nullable JsonObject var1, String var2, String var3) throws MalformedURLException {
      String s = N(var1, var2, var3);
      return var0.resolve("/" + s).toURL();
   }

   protected abstract class06068 N(String var1, class02588 var2, JsonObject var3);

   protected class03055 N(String var1, JsonArray var2, class02588 var3) {
      if (var2.isEmpty()) {
         return class03055.L;
      } else if (var3.shouldIgnore(var1, var2.size())) {
         return class03055.y;
      } else {
         class03055 class03055 = new class03055(var1.length());

         for (int ix = 0; ix < var2.size(); ix++) {
            class03055.N(var2.get(ix).getAsInt());
         }

         return class03055;
      }
   }

   protected void N(InputStream var1) throws IOException {
      byte[] abyte = new byte[1024];

      while (var1.read(abyte) != -1) {
      }
   }
}
