package minecraft;

import Nursultan.class09452;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class class01222 {
   private static final String B = "AES";
   private static final int Z = 128;
   private static final String z = "RSA";
   private static final int U = 1024;
   private static final String E = "ISO_8859_1";
   private static final String W = "SHA-1";
   public static final String N = "SHA256withRSA";
   public static final int y = 256;
   private static final String m = "-----BEGIN RSA PRIVATE KEY-----";
   private static final String P = "-----END RSA PRIVATE KEY-----";
   public static final String L = "-----BEGIN RSA PUBLIC KEY-----";
   private static final String s = "-----END RSA PUBLIC KEY-----";
   public static final String u = "\n";
   public static final Encoder i = Base64.getMimeEncoder(76, "\n".getBytes(StandardCharsets.UTF_8));
   public static final Codec<PublicKey> R = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(y(var0));
      } catch (class05449 class05449) {
         return DataResult.error(class05449::getMessage);
      }
   }, class01222::N);
   public static final Codec<PrivateKey> M = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(N(var0));
      } catch (class05449 class05449) {
         return DataResult.error(class05449::getMessage);
      }
   }, class01222::N);

   public class01222() {
      super();
   }

   public static byte[] y(Key var0, byte[] var1) throws class05449 {
      return N(2, var0, var1);
   }

   public static KeyPair y() throws class05449 {
      try {
         KeyPairGenerator keypairgenerator = KeyPairGenerator.getInstance("RSA");
         keypairgenerator.initialize(1024);
         return keypairgenerator.generateKeyPair();
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }

   public static PublicKey y(String var0) throws class05449 {
      return N(var0, "-----BEGIN RSA PUBLIC KEY-----", "-----END RSA PUBLIC KEY-----", class01222::N);
   }

   private static PrivateKey y(byte[] var0) throws class05449 {
      try {
         PKCS8EncodedKeySpec pkcs8encodedkeyspec = new PKCS8EncodedKeySpec(var0);
         return KeyFactory.getInstance("RSA").generatePrivate(pkcs8encodedkeyspec);
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }

   private static byte[] N(int var0, Key var1, byte[] var2) throws class05449 {
      try {
         return N(var0, var1.getAlgorithm(), var1).doFinal(var2);
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }

   public static byte[] N(Key var0, byte[] var1) throws class05449 {
      return N(1, var0, var1);
   }

   public static byte[] N(String var0, PublicKey var1, SecretKey var2) throws class05449 {
      try {
         return N(var0.getBytes("ISO_8859_1"), var2.getEncoded(), var1.getEncoded());
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }

   public static SecretKey N() throws class05449 {
      try {
         KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
         keygenerator.init(128);
         return keygenerator.generateKey();
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }

   public static Cipher N(int var0, Key var1) throws class05449 {
      try {
         Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
         cipher.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
         return cipher;
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }

   private static Cipher N(int var0, String var1, Key var2) throws Exception {
      Cipher cipher = Cipher.getInstance(var1);
      cipher.init(var0, var2);
      return cipher;
   }

   public static String N(PublicKey var0) {
      if (!"RSA".equals(var0.getAlgorithm())) {
         throw new IllegalArgumentException("Public key must be RSA");
      } else {
         return "-----BEGIN RSA PUBLIC KEY-----\n" + i.encodeToString(var0.getEncoded()) + "\n-----END RSA PUBLIC KEY-----\n";
      }
   }

   public static PrivateKey N(String var0) throws class05449 {
      return N(var0, "-----BEGIN RSA PRIVATE KEY-----", "-----END RSA PRIVATE KEY-----", class01222::y);
   }

   private static <T extends Key> T N(String var0, String var1, String var2, class09452<T> var3) throws class05449 {
      int ix = var0.indexOf(var1);
      if (ix != -1) {
         ix += var1.length();
         int j = var0.indexOf(var2, ix);
         var0 = var0.substring(ix, j + 1);
      }

      try {
         return (T)var3.apply(Base64.getMimeDecoder().decode(var0));
      } catch (IllegalArgumentException illegalargumentexception) {
         throw new class05449(illegalargumentexception);
      }
   }

   private static byte[] N(byte[]... var0) throws Exception {
      MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");

      for (byte[] abyte : var0) {
         messagedigest.update(abyte);
      }

      return messagedigest.digest();
   }

   public static String N(PrivateKey var0) {
      if (!"RSA".equals(var0.getAlgorithm())) {
         throw new IllegalArgumentException("Private key must be RSA");
      } else {
         return "-----BEGIN RSA PRIVATE KEY-----\n" + i.encodeToString(var0.getEncoded()) + "\n-----END RSA PRIVATE KEY-----\n";
      }
   }

   public static PublicKey N(byte[] var0) throws class05449 {
      try {
         X509EncodedKeySpec x509encodedkeyspec = new X509EncodedKeySpec(var0);
         return KeyFactory.getInstance("RSA").generatePublic(x509encodedkeyspec);
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }

   public static SecretKey N(PrivateKey var0, byte[] var1) throws class05449 {
      byte[] abyte = y(var0, var1);

      try {
         return new SecretKeySpec(abyte, "AES");
      } catch (Exception exception) {
         throw new class05449(exception);
      }
   }
}
