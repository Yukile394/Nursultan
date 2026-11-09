package minecraft;

import java.security.SecureRandom;

public record class00456(String secretKey) {
   private static final String y = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

   public class00456(String secretKey) {
      this.secretKey = secretKey;
   }

   public String y() {
      return this.secretKey;
   }

   public static String N() {
      SecureRandom securerandom = new SecureRandom();
      StringBuilder stringbuilder = new StringBuilder(40);

      for (int i = 0; i < 40; i++) {
         stringbuilder.append(
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
               .charAt(securerandom.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".length()))
         );
      }

      return stringbuilder.toString();
   }

   public static boolean N(String var0) {
      return var0.isEmpty() ? false : var0.matches("^[a-zA-Z0-9]{40}$");
   }
}
