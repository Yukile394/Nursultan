package minecraft;

import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Map;
import java.util.OptionalLong;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05021 {
   private static final Logger N = LogUtils.getLogger();

   private class05021() {
      super();
   }

   private static HashCode N(HashFunction var0, int var1, class05007 var2, InputStream var3, Path var4) throws IOException {
      HashCode hashcode;
      try (OutputStream outputstream = Files.newOutputStream(var4, StandardOpenOption.CREATE)) {
         Hasher hasher = var0.newHasher();
         byte[] abyte = new byte[8196];
         long j = 0L;

         int i;
         while ((i = var3.read(abyte)) >= 0) {
            j += i;
            var2.N(j);
            if (j > var1) {
               throw new IOException("Filesize was bigger than maximum allowed (got >= " + j + ", limit was " + var1 + ")");
            }

            if (Thread.interrupted()) {
               N.error("INTERRUPTED");
               throw new IOException("Download interrupted");
            }

            outputstream.write(abyte, 0, i);
            hasher.putBytes(abyte, 0, i);
         }

         hashcode = hasher.hash();
      }

      return hashcode;
   }

   public static int N() {
      try {
         int i;
         try (ServerSocket serversocket = new ServerSocket(0)) {
            i = serversocket.getLocalPort();
         }

         return i;
      } catch (IOException ioexception) {
         return 25564;
      }
   }

   public static boolean N(int var0) {
      if (var0 >= 0 && var0 <= 65535) {
         try {
            boolean flag;
            try (ServerSocket serversocket = new ServerSocket(var0)) {
               flag = serversocket.getLocalPort() == var0;
            }

            return flag;
         } catch (IOException ioexception) {
            return false;
         }
      } else {
         return false;
      }
   }

   private static Path N(Path var0, HashCode var1) {
      return var0.resolve(var1.toString());
   }

   private static void N(Path var0) {
      try {
         Files.setLastModifiedTime(var0, FileTime.from(Instant.now()));
      } catch (IOException ioexception) {
         N.warn("Failed to update modification time of {}", var0, ioexception);
      }
   }

   private static HashCode N(Path var0, HashFunction var1) throws IOException {
      Hasher hasher = var1.newHasher();

      try (
         OutputStream outputstream = Funnels.asOutputStream(hasher);
         InputStream inputstream = Files.newInputStream(var0);
      ) {
         inputstream.transferTo(outputstream);
      }

      return hasher.hash();
   }

   private static boolean N(Path var0, HashFunction var1, HashCode var2) throws IOException {
      if (Files.exists(var0)) {
         HashCode hashcode = N(var0, var1);
         if (hashcode.equals(var2)) {
            return true;
         }

         N.warn("Mismatched hash of file {}, expected {} but found {}", new Object[]{var0, var2, hashcode});
      }

      return false;
   }

   public static Path N(Path var0, URL var1, Map<String, String> var2, HashFunction var3, @Nullable HashCode var4, int var5, Proxy var6, class05007 var7) {
      HttpURLConnection httpurlconnection = null;
      InputStream inputstream = null;
      var7.N();
      Path path;
      if (var4 != null) {
         path = N(var0, var4);

         try {
            if (N(path, var3, var4)) {
               N.info("Returning cached file since actual hash matches requested");
               var7.N(true);
               N(path);
               return path;
            }
         } catch (IOException ioexception1) {
            N.warn("Failed to check cached file {}", path, ioexception1);
         }

         try {
            N.warn("Existing file {} not found or had mismatched hash", path);
            Files.deleteIfExists(path);
         } catch (IOException ioexception) {
            var7.N(false);
            throw new UncheckedIOException("Failed to remove existing file " + path, ioexception);
         }
      } else {
         path = null;
      }

      Path path1;
      try {
         httpurlconnection = (HttpURLConnection)var1.openConnection(var6);
         httpurlconnection.setInstanceFollowRedirects(true);
         var2.forEach(httpurlconnection::setRequestProperty);
         inputstream = httpurlconnection.getInputStream();
         long i = httpurlconnection.getContentLengthLong();
         OptionalLong optionallong = i != -1L ? OptionalLong.of(i) : OptionalLong.empty();
         class06290.L(var0);
         var7.N(optionallong);
         if (optionallong.isPresent() && optionallong.getAsLong() > var5) {
            throw new IOException("Filesize is bigger than maximum allowed (file is " + optionallong + ", limit is " + var5 + ")");
         }

         if (path == null) {
            Path path3 = Files.createTempFile(var0, "download", ".tmp");

            try {
               HashCode hashcode1 = N(var3, var5, var7, inputstream, path3);
               Path path2 = N(var0, hashcode1);
               if (!N(path2, var3, hashcode1)) {
                  Files.move(path3, path2, StandardCopyOption.REPLACE_EXISTING);
               } else {
                  N(path2);
               }

               var7.N(true);
               return path2;
            } finally {
               Files.deleteIfExists(path3);
            }
         }

         HashCode hashcode = N(var3, var5, var7, inputstream, path);
         if (!hashcode.equals(var4)) {
            throw new IOException("Hash of downloaded file (" + hashcode + ") did not match requested (" + var4 + ")");
         }

         var7.N(true);
         path1 = path;
      } catch (Throwable throwable) {
         if (httpurlconnection != null) {
            InputStream inputstream1 = httpurlconnection.getErrorStream();
            if (inputstream1 != null) {
               try {
                  N.error("HTTP response error: {}", IOUtils.toString(inputstream1, StandardCharsets.UTF_8));
               } catch (Exception exception) {
                  N.error("Failed to read response from server");
               }
            }
         }

         var7.N(false);
         throw new IllegalStateException("Failed to download file " + var1, throwable);
      } finally {
         IOUtils.closeQuietly(inputstream);
      }

      return path1;
   }
}
