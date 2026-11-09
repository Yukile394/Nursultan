package minecraft;

import com.mojang.logging.LogUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Optional;
import org.slf4j.Logger;

@FunctionalInterface
public interface class03450 {
   Logger N = LogUtils.getLogger();
   class03450 y = var0 -> {
      try {
         InetAddress inetaddress = InetAddress.getByName(var0.N());
         return Optional.of(class03437.N(new InetSocketAddress(inetaddress, var0.y())));
      } catch (UnknownHostException unknownhostexception) {
         N.debug("Couldn't resolve server {} address", var0.N(), unknownhostexception);
         return Optional.empty();
      }
   };

   Optional<class03437> resolve(class03420 var1);
}
