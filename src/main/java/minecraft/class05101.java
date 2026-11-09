package minecraft;

import Nursultan.class10489;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.mojang.logging.LogUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Locale;
import java.util.OptionalLong;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.CheckReturnValue;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05101 {
   private static final Logger N = LogUtils.getLogger();
   private volatile boolean y;
   private volatile boolean L;
   private volatile boolean u;
   private volatile boolean i;
   @Nullable
   private volatile File R;
   private volatile File M;
   @Nullable
   private volatile CompletableFuture<?> B;
   @Nullable
   private Thread Z;
   private static final String[] z = new String[]{
      "CON",
      "COM",
      "PRN",
      "AUX",
      "CLOCK$",
      "NUL",
      "COM1",
      "COM2",
      "COM3",
      "COM4",
      "COM5",
      "COM6",
      "COM7",
      "COM8",
      "COM9",
      "LPT1",
      "LPT2",
      "LPT3",
      "LPT4",
      "LPT5",
      "LPT6",
      "LPT7",
      "LPT8",
      "LPT9"
   };

   private static Builder L(String var0) {
      return HttpRequest.newBuilder(URI.create(var0)).timeout(Duration.ofMinutes(2L));
   }

   public boolean L() {
      return this.u;
   }

   public class05101() {
      super();
   }

   private static HttpClient i() {
      return HttpClient.newBuilder().executor(class07536.z()).connectTimeout(Duration.ofMinutes(2L)).build();
   }

   public boolean u() {
      return this.i;
   }

   public static String y(String var0) {
      var0 = var0.replaceAll("[\\./\"]", "_");

      for (String s : z) {
         if (var0.equalsIgnoreCase(s)) {
            var0 = "_" + var0 + "_";
         }
      }

      return var0;
   }

   public boolean y() {
      return this.L;
   }

   private void N(String var1, @Nullable File var2, class04777 var3) throws IOException {
      Pattern pattern = Pattern.compile(".*-([0-9]+)$");
      int ix = 1;

      for (char c0 : class07529.yM) {
         var1 = var1.replace(c0, '_');
      }

      if (StringUtils.isEmpty(var1)) {
         var1 = "Realm";
      }

      var1 = y(var1);

      try {
         for (class04779 class04779 : var3.y()) {
            String s1 = class04779.N();
            if (s1.toLowerCase(Locale.ROOT).startsWith(var1.toLowerCase(Locale.ROOT))) {
               Matcher matcher = pattern.matcher(s1);
               if (matcher.matches()) {
                  int j = Integer.parseInt(matcher.group(1));
                  if (j > ix) {
                     ix = j;
                  }
               } else {
                  ix++;
               }
            }
         }
      } catch (Exception exception1) {
         N.error("Error getting level list", exception1);
         this.u = true;
         return;
      }

      String s;
      if (var3.N(var1) && ix <= 1) {
         s = var1;
      } else {
         s = var1 + (ix == 1 ? "" : "-" + ix);
         if (!var3.N(s)) {
            boolean flag = false;

            while (!flag) {
               ix++;
               s = var1 + (ix == 1 ? "" : "-" + ix);
               if (var3.N(s)) {
                  flag = true;
               }
            }
         }
      }

      TarArchiveInputStream tararchiveinputstream = null;
      File file1 = new File(((File)class06202.Nq().l_1).getAbsolutePath(), "saves");

      try {
         file1.mkdir();
         tararchiveinputstream = new TarArchiveInputStream(new GzipCompressorInputStream(new BufferedInputStream(new FileInputStream(var2))));

         for (TarArchiveEntry tararchiveentry = tararchiveinputstream.getNextTarEntry();
            tararchiveentry != null;
            tararchiveentry = tararchiveinputstream.getNextTarEntry()
         ) {
            File file2 = new File(file1, tararchiveentry.getName().replace("world", s));
            if (tararchiveentry.isDirectory()) {
               file2.mkdirs();
            } else {
               file2.createNewFile();

               try (FileOutputStream fileoutputstream = new FileOutputStream(file2)) {
                  IOUtils.copy(tararchiveinputstream, fileoutputstream);
               }
            }
         }
      } catch (Exception exception) {
         N.error("Error extracting world", exception);
         this.u = true;
      } finally {
         if (tararchiveinputstream != null) {
            tararchiveinputstream.close();
         }

         if (var2 != null) {
            var2.delete();
         }

         try (class04785 class04785 = var3.u(s)) {
            class04785.y(s);
         } catch (class03142 | class03103 | IOException ioexception) {
            N.error("Failed to modify unpacked realms level {}", s, ioexception);
         } catch (class04151 class04151) {
            N.warn("Failed to download file", class04151);
         }

         this.M = new File(file1, s + File.separator + "resources.zip");
      }
   }

   private void N(String var1, File var2, class04777 var3, class04741 var4) {
      if (var4.N >= var4.y && !this.y && !this.u) {
         try {
            this.i = true;
            this.N(var1, var2, var3);
         } catch (IOException ioexception) {
            N.error("Error extracting archive", ioexception);
            this.u = true;
         }
      }
   }

   private void N(class04741 var1, File var2, class04945 var3) {
      if (var1.N >= var1.y && !this.y) {
         try {
            String s = Hashing.sha1().hashBytes(Files.toByteArray(var2)).toString();
            if (s.equals(var3.L())) {
               FileUtils.copyFile(var2, this.M);
               this.L = true;
            } else {
               N.error("Resourcepack had wrong hash (expected {}, found {}). Deleting it.", var3.L(), s);
               FileUtils.deleteQuietly(var2);
               this.u = true;
            }
         } catch (IOException ioexception) {
            N.error("Error copying resourcepack file: {}", ioexception.getMessage());
            this.u = true;
         }
      }
   }

   @CheckReturnValue
   public static OptionalLong N(String var0) {
      try {
         OptionalLong optionallong;
         try (HttpClient httpclient = i()) {
            HttpResponse<Void> httpresponse = httpclient.send(L(var0).HEAD().build(), BodyHandlers.discarding());
            optionallong = httpresponse.headers().firstValueAsLong("Content-Length");
         }

         return optionallong;
      } catch (Exception exception) {
         N.error("Unable to get content length for download");
         return OptionalLong.empty();
      }
   }

   public void N() {
      if (this.R != null) {
         this.R.delete();
         this.R = null;
      }

      this.y = true;
      CompletableFuture<?> completablefuture = this.B;
      if (completablefuture != null) {
         completablefuture.cancel(true);
      }
   }

   @Nullable
   private <T> T N(CompletableFuture<T> var1) throws Throwable {
      this.B = var1;
      if (this.y) {
         var1.cancel(true);
         return null;
      } else {
         try {
            try {
               return (T)var1.join();
            } catch (CompletionException completionexception) {
               throw completionexception.getCause();
            }
         } catch (CancellationException cancellationexception) {
            return null;
         }
      }
   }

   private void N(class04741 var1, HttpClient var2, String var3, File var4) throws IOException {
      HttpRequest httprequest = L(var3).GET().build();

      HttpResponse<InputStream> httpresponse;
      try {
         httpresponse = this.N(var2.sendAsync(httprequest, BodyHandlers.ofInputStream()));
      } catch (Error error) {
         throw error;
      } catch (Throwable throwable) {
         N.error("Failed to download {}", var3, throwable);
         this.u = true;
         return;
      }

      if (httpresponse != null && !this.y) {
         if (httpresponse.statusCode() != 200) {
            this.u = true;
         } else {
            var1.y = httpresponse.headers().firstValueAsLong("Content-Length").orElse(0L);

            try (
               InputStream inputstream = httpresponse.body();
               FileOutputStream fileoutputstream = new FileOutputStream(var4);
            ) {
               inputstream.transferTo(new class10489(fileoutputstream, var1));
            }
         }
      }
   }

   public void N(class04945 var1, String var2, class04741 var3, class04777 var4) {
      if (this.Z == null) {
         this.Z = new Thread(() -> {
            try (HttpClient httpclient = i()) {
               try {
                  this.R = File.createTempFile("backup", ".tar.gz");
                  this.N(var3, httpclient, var1.N(), this.R);
                  this.N(var2.trim(), this.R, var4, var3);
               } catch (Exception exception1) {
                  N.error("Caught exception while downloading world", exception1);
                  this.u = true;
               } finally {
                  this.B = null;
                  if (this.R != null) {
                     this.R.delete();
                  }

                  this.R = null;
               }

               if (this.u) {
                  return;
               }

               String s = var1.y();
               if (!s.isEmpty() && !var1.L().isEmpty()) {
                  try {
                     this.R = File.createTempFile("resources", ".tar.gz");
                     this.N(var3, httpclient, s, this.R);
                     this.N(var3, this.R, var1);
                  } catch (Exception exception) {
                     N.error("Caught exception while downloading resource pack", exception);
                     this.u = true;
                  } finally {
                     this.B = null;
                     if (this.R != null) {
                        this.R.delete();
                     }

                     this.R = null;
                  }
               }

               this.L = true;
            }
         });
         this.Z.setUncaughtExceptionHandler(new class05103(N));
         this.Z.start();
      }
   }
}
