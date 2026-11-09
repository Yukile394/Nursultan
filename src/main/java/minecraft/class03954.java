package minecraft;

import com.mojang.logging.LogUtils;
import java.security.PrivateKey;
import java.security.Signature;
import org.slf4j.Logger;

public interface class03954 {
   Logger N = LogUtils.getLogger();

   byte[] sign(class03959 var1);

   default byte[] N(byte[] var1) {
      return this.sign(var1x -> var1x.update(var1));
   }

   static class03954 N(PrivateKey var0, String var1) {
      return var2 -> {
         try {
            Signature signature = Signature.getInstance(var1);
            signature.initSign(var0);
            var2.update(signature::update);
            return signature.sign();
         } catch (Exception exception) {
            throw new IllegalStateException("Failed to sign message", exception);
         }
      };
   }
}
