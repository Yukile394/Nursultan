package minecraft;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.mojang.util.UndashedUuid;
import com.viaversion.viafabricplus.features.networking.resource_pack_header.ResourcePackHeaderDiff;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class class00222 implements class03813 {
   private static final int R = 262144000;
   private static final HashFunction M = Hashing.sha1();

   class00222(class00232 var1, class04771 var2, class01789 var3, Proxy var4, Executor var5) {
      super();
      this.i = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
   }

   private class04551 y() {
      return ResourcePackHeaderDiff.get(ProtocolTranslator.getTargetVersion());
   }

   private void N(CallbackInfoReturnable var1) {
      LinkedHashMap linkedhashmap = new LinkedHashMap((Map)var1.getReturnValue());
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_3)) {
         linkedhashmap.remove("X-Minecraft-Version-ID");
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            linkedhashmap.remove("X-Minecraft-Pack-Format");
            linkedhashmap.remove("User-Agent");
         }
      }

      var1.setReturnValue(linkedhashmap);
   }

   private String N(Object var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7) && var1 instanceof class08735
         ? String.valueOf(((class08735)var1).y())
         : String.valueOf(var1);
   }

   @Override
   public void N(Map<UUID, class03848> var1, Consumer<class03814> var2) {
      this.y.N(new class01797(M, 262144000, this.N(), this.L, this.i.N(var1.size())), var1).thenAcceptAsync(var2, this.u);
   }

   private Map<String, String> N() {
      class04551 class04551 = this.y();
      String s = this.N.L();
      String s1 = UndashedUuid.toString(this.N.y());
      String s2 = class04551.comp_4025();
      String s3 = class04551.comp_4024();
      class08735 class08735 = class04551.method_70592(class01603.field_14188);
      Map map;
      Map map1 = map = Map.of(
         "X-Minecraft-Username",
         s,
         "X-Minecraft-UUID",
         s1,
         "X-Minecraft-Version",
         s2,
         "X-Minecraft-Version-ID",
         s3,
         "X-Minecraft-Pack-Format",
         this.N(class08735),
         "User-Agent",
         "Minecraft Java/" + class04551.comp_4025()
      );
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, map);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (Map)callbackinforeturnable.getReturnValue() : map1;
   }
}
