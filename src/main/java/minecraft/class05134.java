package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.jspecify.annotations.Nullable;

public abstract class class05134<T extends class05134<T>> {
   public HttpURLConnection N;
   private boolean L;
   protected String y;
   private static final int u = 60000;
   private static final int i = 5000;
   private static final String R = "Is-Prerelease";
   private static final String M = "Cookie";

   public static class05134<?> L(String var0, String var1) {
      return new class05137(var0, var1, 5000, 60000);
   }

   public String L(String var1) {
      return N(this.N, var1);
   }

   public String L() {
      try {
         this.u();
         String s;
         if (this.y() >= 400) {
            s = this.N(this.N.getErrorStream());
         } else {
            s = this.N(this.N.getInputStream());
         }

         this.R();
         return s;
      } catch (IOException ioexception) {
         throw new class05121(ioexception.getMessage(), ioexception);
      }
   }

   public class05134(String var1, int var2, int var3) {
      super();

      try {
         this.y = var1;
         Proxy proxy = class05133.N();
         if (proxy != null) {
            this.N = (HttpURLConnection)new URL(var1).openConnection(proxy);
         } else {
            this.N = (HttpURLConnection)new URL(var1).openConnection();
         }

         this.N.setConnectTimeout(var2);
         this.N.setReadTimeout(var3);
      } catch (MalformedURLException malformedurlexception) {
         throw new class05121(malformedurlexception.getMessage(), malformedurlexception);
      } catch (IOException ioexception) {
         throw new class05121(ioexception.getMessage(), ioexception);
      }
   }

   protected abstract T i();

   protected T u() {
      if (this.L) {
         return (T)this;
      } else {
         class05134 class05134 = this.i();
         this.L = true;
         return (T)class05134;
      }
   }

   public static class05134<?> y(String var0) {
      return new class05095(var0, 5000, 60000);
   }

   public static class05134<?> y(String var0, String var1) {
      return new class05118(var0, var1, 5000, 60000);
   }

   public static class05134<?> y(String var0, String var1, int var2, int var3) {
      return new class05137(var0, var1, var2, var3);
   }

   public int y() {
      try {
         this.u();
         return this.N.getResponseCode();
      } catch (Exception exception) {
         throw new class05121(exception.getMessage(), exception);
      }
   }

   public static void N(HttpURLConnection var0, String var1, String var2) {
      String s = var0.getRequestProperty("Cookie");
      if (s == null) {
         var0.setRequestProperty("Cookie", var1 + "=" + var2);
      } else {
         var0.setRequestProperty("Cookie", s + ";" + var1 + "=" + var2);
      }
   }

   public static class05134<?> N(String var0, String var1, int var2, int var3) {
      return new class05118(var0, var1, var2, var3);
   }

   public void N(String var1, String var2) {
      N(this.N, var1, var2);
   }

   public static String N(HttpURLConnection var0, String var1) {
      try {
         return var0.getHeaderField(var1);
      } catch (Exception exception) {
         return "";
      }
   }

   public static int N(HttpURLConnection var0) {
      String s = var0.getHeaderField("Retry-After");

      try {
         return Integer.valueOf(s);
      } catch (Exception exception) {
         return 5;
      }
   }

   private String N(@Nullable InputStream var1) throws IOException {
      if (var1 == null) {
         return "";
      } else {
         InputStreamReader inputstreamreader = new InputStreamReader(var1, StandardCharsets.UTF_8);
         StringBuilder stringbuilder = new StringBuilder();

         for (int ix = inputstreamreader.read(); ix != -1; ix = inputstreamreader.read()) {
            stringbuilder.append((char)ix);
         }

         return stringbuilder.toString();
      }
   }

   public int N() {
      return N(this.N);
   }

   public static class05134<?> N(String var0, int var1, int var2) {
      return new class05126(var0, var1, var2);
   }

   public static class05134<?> N(String var0) {
      return new class05126(var0, 5000, 60000);
   }

   public void N(boolean var1) {
      this.N.addRequestProperty("Is-Prerelease", String.valueOf(var1));
   }

   private void R() {
      byte[] abyte = new byte[1024];

      try {
         InputStream inputstream = this.N.getInputStream();

         while (inputstream.read(abyte) > 0) {
         }

         inputstream.close();
         return;
      } catch (Exception exception) {
         try {
            InputStream inputstream1 = this.N.getErrorStream();
            if (inputstream1 != null) {
               while (inputstream1.read(abyte) > 0) {
               }

               inputstream1.close();
               return;
            }
         } catch (IOException ioexception) {
            return;
         }
      } finally {
         if (this.N != null) {
            this.N.disconnect();
         }
      }
   }
}
