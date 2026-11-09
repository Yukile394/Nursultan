package minecraft;

import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.save.impl.SettingsSave;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04568 implements IServerData {
   private static final Logger z = LogUtils.getLogger();
   private static final int U = 1024;
   public String N;
   public String y;
   public class00392 L;
   public class00392 u;
   @Nullable
   public class07837 i;
   public long R;
   public int M;
   public class00392 B;
   public List<class00392> Z;
   private class04575 E;
   @Nullable
   private byte[] W;
   private class04585 m;
   private int P;
   private class04579 s;
   private ProtocolVersion T = null;
   private boolean b;
   private ProtocolVersion j;

   @Nullable
   public byte[] L() {
      return this.W;
   }

   public void M() {
      this.P = 0;
   }

   public class04568(String var1, String var2, class04585 var3) {
      super();
      this.M = class07529.y().comp_4027();
      this.B = class00392.y(class07529.y().comp_4025());
      this.Z = Collections.emptyList();
      this.E = class04575.field_3767;
      this.s = class04579.field_47880;
      this.N = var1;
      this.y = var2;
      this.m = var3;
   }

   public class04579 B() {
      return this.s;
   }

   public boolean i() {
      return this.m == class04585.field_45610;
   }

   public boolean u() {
      return this.m == class04585.field_45609;
   }

   public void y(String var1) {
      this.P = var1.hashCode();
   }

   @Nullable
   public static byte[] y(@Nullable byte[] var0) {
      if (var0 != null) {
         try {
            class03726 class03726 = class03726.N(var0);
            if (class03726.N() <= 1024 && class03726.y() <= 1024) {
               return var0;
            }
         } catch (IOException ioexception) {
            z.warn("Failed to decode server icon", ioexception);
         }
      }

      return null;
   }

   public void y(class04568 var1) {
      this.N(var1);
      this.N(var1.y());
      this.m = var1.m;
   }

   public class04575 y() {
      return this.E;
   }

   public void viaFabricPlus$setTranslatingVersion(ProtocolVersion var1) {
      this.j = var1;
   }

   public boolean viaFabricPlus$passedDirectConnectScreen() {
      return this.b;
   }

   public void viaFabricPlus$passDirectConnectScreen(boolean var1) {
      this.b = var1;
   }

   public class07001 N() {
      class07001 class07001 = new class07001();
      class07001.N_67("name", this.N);
      class07001.N_67("ip", this.y);
      class07001.y("icon", class06338.d, this.W);
      class07001.N(class04575.field_56800, this.E);
      if (this.P != 0) {
         class07001.N("acceptedCodeOfConduct", this.P);
      }

      this.N(null, class07001);
      return class07001;
   }

   private void N(CallbackInfoReturnable var1, class07001 var2) {
      if (this.T != null) {
         var2.N_67("viafabricplus_forcedversion", this.T.getName());
      }
   }

   private static void N(class07001 var0, CallbackInfoReturnable var1, class04568 var2) {
      if (var0.y("viafabricplus_forcedversion")) {
         ProtocolVersion protocolversion = SettingsSave.protocolVersionByName(var0.y("viafabricplus_forcedversion", null));
         if (protocolversion != null) {
            var2.viaFabricPlus$forceVersion(protocolversion);
         }
      }
   }

   private void N(class04568 var1, CallbackInfo var2) {
      this.viaFabricPlus$forceVersion(var1.viaFabricPlus$forcedVersion());
   }

   public boolean N(String var1) {
      return this.P == var1.hashCode();
   }

   public void N(class04568 var1) {
      this.y = var1.y;
      this.N = var1.N;
      this.W = var1.W;
      this.N(var1, null);
   }

   public void N(@Nullable byte[] var1) {
      this.W = var1;
   }

   public static class04568 N(class07001 var0) {
      class04568 class04568 = new class04568(var0.y("name", ""), var0.y("ip", ""), class04585.field_45611);
      class04568.N(var0.<byte[]>N_15("icon", class06338.d).orElse(null));
      class04568.N(var0.<class04575>N(class04575.field_56800).orElse(class04575.field_3767));
      class04568.P = var0.y("acceptedCodeOfConduct", 0);
      N(var0, null, class04568);
      return class04568;
   }

   public void N(class04575 var1) {
      this.E = var1;
   }

   public void N(class04579 var1) {
      this.s = var1;
   }

   public class04585 R() {
      return this.m;
   }

   public void viaFabricPlus$forceVersion(ProtocolVersion var1) {
      this.T = var1;
   }

   public ProtocolVersion viaFabricPlus$forcedVersion() {
      return this.T;
   }

   public ProtocolVersion viaFabricPlus$translatingVersion() {
      return this.j;
   }
}
