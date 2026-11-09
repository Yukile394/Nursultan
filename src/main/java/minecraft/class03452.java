package minecraft;

import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Hashtable;
import java.util.Optional;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@FunctionalInterface
public interface class03452 {
   Logger N = LogUtils.getLogger();
   class03452 y = var0 -> Optional.empty();

   private static void N(DirContext var0, class03420 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThan(LegacyProtocolVersion.r1_3_1tor1_3_2)) {
         var2.setReturnValue(Optional.empty());
      }
   }

   static class03452 N() {
      InitialDirContext initialdircontext;
      try {
         String s = "com.sun.jndi.dns.DnsContextFactory";
         Class.forName("com.sun.jndi.dns.DnsContextFactory");
         Hashtable hashtable = new Hashtable();
         hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         hashtable.put("java.naming.provider.url", "dns:");
         hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
         initialdircontext = new InitialDirContext(hashtable);
      } catch (Throwable throwable) {
         N.error("Failed to initialize SRV redirect resolved, some servers might not work", throwable);
         return y;
      }

      return var1x -> {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         N(initialdircontext, var1x, callbackinforeturnable);
         if (callbackinforeturnable.isCancelled()) {
            return (Optional)callbackinforeturnable.getReturnValue();
         } else {
            if (var1x.y() == 25565) {
               try {
                  Attribute attribute = initialdircontext.getAttributes("_minecraft._tcp." + var1x.N(), new String[]{"SRV"}).get("srv");
                  if (attribute != null) {
                     String[] astring = attribute.get().toString().split(" ", 4);
                     return Optional.of(new class03420(astring[3], class03420.L(astring[2])));
                  }
               } catch (Throwable throwablex) {
               }
            }

            return Optional.empty();
         }
      };
   }

   Optional<class03420> lookupRedirect(class03420 var1);
}
