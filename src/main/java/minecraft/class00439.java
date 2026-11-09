package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import org.slf4j.Logger;

public class class00439 {
   private static final String N = "MINECRAFT_MANAGEMENT_TLS_KEYSTORE_PASSWORD";
   private static final String y = "management.tls.keystore.password";
   private static final Logger L = LogUtils.getLogger();

   public class00439() {
      super();
   }

   private static SslContext N(File var0, String var1) throws Exception {
      KeyStore keystore = KeyStore.getInstance("PKCS12");

      try (FileInputStream fileinputstream = new FileInputStream(var0)) {
         keystore.load(fileinputstream, var1.toCharArray());
      }

      KeyManagerFactory keymanagerfactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      keymanagerfactory.init(keystore, var1.toCharArray());
      TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      trustmanagerfactory.init(keystore);
      return SslContextBuilder.forServer(keymanagerfactory).trustManager(trustmanagerfactory).build();
   }

   public static void N() {
      L.info("To use TLS for the management server, please follow these steps:");
      L.info("1. Set the server property 'management-server-tls-enabled' to 'true' to enable TLS");
      L.info("2. Create a keystore file of type PKCS12 containing your server certificate and private key");
      L.info("3. Set the server property 'management-server-tls-keystore' to the path of your keystore file");
      L.info(
         "4. Set the keystore password via the environment variable 'MINECRAFT_MANAGEMENT_TLS_KEYSTORE_PASSWORD', or system property 'management.tls.keystore.password', or server property 'management-server-tls-keystore-password'"
      );
      L.info("5. Restart the server to apply the changes.");
   }

   public static SslContext N(String var0, String var1) throws Exception {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException("TLS is enabled but keystore is not configured");
      } else {
         File file1 = new File(var0);
         if (file1.exists() && file1.isFile()) {
            String s = N(var1);
            return N(file1, s);
         } else {
            throw new IllegalArgumentException("Supplied keystore is not a file or does not exist: '" + var0 + "'");
         }
      }
   }

   private static String N(String var0) {
      String s = System.getenv().get("MINECRAFT_MANAGEMENT_TLS_KEYSTORE_PASSWORD");
      if (s != null) {
         return s;
      } else {
         String s1 = System.getProperty("management.tls.keystore.password", null);
         return s1 != null ? s1 : var0;
      }
   }
}
