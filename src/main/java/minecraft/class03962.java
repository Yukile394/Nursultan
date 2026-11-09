package minecraft;

import com.mojang.authlib.yggdrasil.ServicesKeyInfo;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.logging.LogUtils;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collection;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public interface class03962 {
   class03962 N = (var0, var1) -> true;
   Logger y = LogUtils.getLogger();

   boolean validate(class03959 var1, byte[] var2);

   private static boolean N(class03959 var0, byte[] var1, Signature var2) throws SignatureException {
      var0.update(var2::update);
      return var2.verify(var1);
   }

   static class03962 N(PublicKey var0, String var1) {
      return (var2, var3) -> {
         try {
            Signature signature = Signature.getInstance(var1);
            signature.initVerify(var0);
            return N(var2, var3, signature);
         } catch (Exception exception) {
            y.error("Failed to verify signature", exception);
            return false;
         }
      };
   }

   @Nullable
   static class03962 N(ServicesKeySet var0, ServicesKeyType var1) {
      Collection<ServicesKeyInfo> collection = var0.keys(var1);
      return collection.isEmpty() ? null : (var1x, var2x) -> collection.stream().anyMatch(var2xx -> {
         Signature signature = var2xx.signature();

         try {
            return N(var1x, var2x, signature);
         } catch (SignatureException signatureexception) {
            y.error("Failed to verify Services signature", signatureexception);
            return false;
         }
      });
   }

   default boolean N(byte[] var1, byte[] var2) {
      return this.validate(var1x -> var1x.update(var1), var2);
   }
}
