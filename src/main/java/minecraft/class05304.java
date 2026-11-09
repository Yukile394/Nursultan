package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen;
import com.viaversion.viafabricplus.settings.impl.BedrockSettings;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.fiw.proxyserver.Config;
import ru.fiw.proxyserver.GuiProxy;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.ProxyServer;
import ru.fiw.proxyserver.mixin.ScreenAccessor;

public class class05304 extends class05096 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 100;
   private static final int u = 74;
   private final class03686 i = new class03686(this, 33, 60);
   private final class04584 R = new class04584();
   private final class05096 M;
   protected class05691 N;
   private class04563 B;
   private class05362 Z;
   private class05362 z;
   private class05362 U;
   private class04568 E;
   private class08311 W;
   @Nullable
   private class08293 m;
   private class05362 P;

   public class04563 L() {
      return this.B;
   }

   private void L(boolean var1) {
      if (var1) {
         class04568 class04568 = this.B.y(this.E.y);
         if (class04568 != null) {
            class04568.N(this.E);
            this.B.y();
         } else {
            this.B.N(this.E, false);
            this.B.y();
         }

         this.N.method_25313(null);
         this.N.N(this.B);
      }

      this.field_22787.N(this);
   }

   public class05304(class05096 var1) {
      super(class00392.L("multiplayer.title"));
      this.M = var1;
   }

   private void u(boolean var1) {
      if (var1) {
         class04568 class04568x = this.B.N(this.E.y);
         if (class04568x == null) {
            this.B.N(this.E, true);
            this.B.y();
            class04568 class04568x = this.E;
            this.N(this, class04568x, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_500, net.minecraft.class_642]");
               ((class05304)var0[0]).N((class04568)var0[1]);
               return (Void)null;
            });
         } else {
            this.N(this, class04568x, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_500, net.minecraft.class_642]");
               ((class05304)var0[0]).N((class04568)var0[1]);
               return (Void)null;
            });
         }
      } else {
         this.field_22787.N(this);
      }
   }

   private void u() {
      this.field_22787.N(new class05304(this.M));
   }

   private void y(CallbackInfo var1) {
      int ix = GeneralSettings.INSTANCE.multiplayerScreenButtonOrientation.getIndex();
      if (ix != 0) {
         if (this.P == null) {
            this.P = class05362.method_46430(class00392.N("ViaFabricPlus"), var1x -> ProtocolSelectionScreen.INSTANCE.open(this)).y(98, 20).N();
            this.method_37063(this.P);
         }

         GeneralSettings.setOrientation(this.P::y, ix, this.field_22789, this.field_22790);
      }
   }

   public class04584 y() {
      return this.R;
   }

   private void y(boolean var1) {
      class05681 class05681 = this.N.method_25334();
      if (var1 && class05681 instanceof class05692) {
         class04568 class04568 = ((class05692)class05681).L();
         class04568.N = this.E.N;
         class04568.y = this.E.y;
         class04568.y(this.E);
         this.B.y();
         this.N.N(this.B);
      }

      this.field_22787.N(this);
   }

   private class03420 N(String var1, Operation var2, class04568 var3) {
      IServerData iserverdata = var3;
      ProtocolVersion protocolversion;
      if (iserverdata.viaFabricPlus$passedDirectConnectScreen()) {
         protocolversion = ProtocolTranslator.getTargetVersion();
      } else {
         protocolversion = iserverdata.viaFabricPlus$forcedVersion();
      }

      return (class03420)var2.call(new Object[]{BedrockSettings.replaceDefaultPort(var1, protocolversion)});
   }

   public void N(CallbackInfo var1) {
      String s = class06202.Nq().Ny().L();
      if (!s.equals(Config.lastPlayerName)) {
         Config.lastPlayerName = s;
         if (Config.accounts.containsKey(s)) {
            ProxyServer.proxy = (Proxy)Config.accounts.get(s);
         } else if (Config.accounts.containsKey("")) {
            ProxyServer.proxy = (Proxy)Config.accounts.get("");
         }
      }

      ProxyServer.proxyMenuButton = class05362.method_46430(
            class00392.y("Proxy: " + ProxyServer.getLastUsedProxyIp()), var1x -> class06202.Nq().N(new GuiProxy(this))
         )
         .N(this.field_22789 - 125, 5, 120, 20)
         .N();
      ScreenAccessor screenaccessor = this;
      screenaccessor.getDrawables().add(ProxyServer.proxyMenuButton);
      screenaccessor.getSelectables().add(ProxyServer.proxyMenuButton);
      screenaccessor.getChildren().add(ProxyServer.proxyMenuButton);
   }

   private void N(boolean var1) {
      class05681 class05681 = this.N.method_25334();
      if (var1 && class05681 instanceof class05692) {
         this.B.N(((class05692)class05681).L());
         this.B.y();
         this.N.method_25313(null);
         this.N.N(this.B);
      }

      this.field_22787.N(this);
   }

   private void N(class05304 var1, class04568 var2, Operation var3) {
      var2.viaFabricPlus$passDirectConnectScreen(true);
      var3.call(new Object[]{var1, var2});
   }

   public void N(class04568 var1) {
      class06202 class06202 = this.field_22787;
      String s = var1.y;
      Operation operation = var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.lang.String]");
         return class03420.N((String)var0[0]);
      };
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var1);
      class03420 class03420 = this.N(s, operation, localrefimpl);
      var1 = (class04568)localrefimpl.dispose();
      class05763.N(this, class06202, class03420, var1, false, null);
   }

   protected void N() {
      this.z.field_22763 = false;
      this.Z.field_22763 = false;
      this.U.field_22763 = false;
      class05681 class05681 = this.N.method_25334();
      if (class05681 != null && !(class05681 instanceof class05714)) {
         this.z.field_22763 = true;
         if (class05681 instanceof class05692) {
            this.Z.field_22763 = true;
            this.U.field_22763 = true;
         }
      }
   }

   private class03420 N(String var1, Operation var2, LocalRef var3) {
      return this.N(var1, var2, (class04568)var3.get());
   }

   @Override
   public void method_25426() {
      this.i.N(this.field_22785, this.field_22793);
      this.B = new class04563(this.field_22787);
      this.B.N();
      this.W = new class08311();

      try {
         this.m = new class08293(this.W);
         this.m.start();
      } catch (Exception exception) {
         y.warn("Unable to start LAN server detection: {}", exception.getMessage());
      }

      this.N = this.i.L(new class05691(this, this.field_22787, this.field_22789, this.i.u(), this.i.L(), 36));
      this.N.N(this.B);
      class01885 class01885xx = this.i.y(class01885.u().N(4));
      class01885xx.L().y();
      class01885 class01885x = class01885xx.N(class01885.i().N(4));
      class01885 class01885xx = class01885xx.N(class01885.i().N(4));
      this.z = class01885x.N(class05362.method_46430(class00392.L("selectServer.select"), var1x -> {
         class05681 class05681 = this.N.method_25334();
         if (class05681 != null) {
            class05681.N();
         }
      }).N(100).N());
      class01885x.N(class05362.method_46430(class00392.L("selectServer.direct"), var1x -> {
         this.E = new class04568(class08392.N("selectServer.defaultName"), "", class04585.field_45611);
         this.field_22787.N(new class05339(this, this::u, this.E));
      }).N(100).N());
      class01885x.N(class05362.method_46430(class00392.L("selectServer.add"), var1x -> {
         this.E = new class04568("", "", class04585.field_45611);
         this.field_22787.N(new class06326(this, class00392.L("manageServer.add.title"), this::L, this.E));
      }).N(100).N());
      this.Z = class01885xx.N(class05362.method_46430(class00392.L("selectServer.edit"), var1x -> {
         class05681 class05681 = this.N.method_25334();
         if (class05681 instanceof class05692) {
            class04568 class04568 = ((class05692)class05681).L();
            this.E = new class04568(class04568.N, class04568.y, class04585.field_45611);
            this.E.y(class04568);
            this.field_22787.N(new class06326(this, class00392.L("manageServer.edit.title"), this::y, this.E));
         }
      }).N(74).N());
      this.U = class01885xx.N(class05362.method_46430(class00392.L("selectServer.delete"), var1x -> {
         class05681 class05681 = this.N.method_25334();
         if (class05681 instanceof class05692) {
            String s = ((class05692)class05681).L().N;
            if (s != null) {
               class05216 class05216xx = class00392.L("selectServer.deleteQuestion");
               class05216 class05216x = class00392.N("selectServer.deleteWarning", s);
               class05216 class05216xx = class00392.L("selectServer.deleteButton");
               class00392 class00392 = class05220.i;
               this.field_22787.N(new class05733(this::N, class05216xx, class05216x, class05216xx, class00392));
            }
         }
      }).N(74).N());
      class01885xx.N(class05362.method_46430(class00392.L("selectServer.refresh"), var1x -> this.u()).N(74).N());
      class01885xx.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N(74).N());
      this.i.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
      this.N();
      this.N(null);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (super.method_25404(var1)) {
         return true;
      } else if (var1.v() == 294) {
         this.u();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_48640() {
      this.i.N();
      if (this.N != null) {
         this.N.method_57712(this.field_22789, this.i);
      }

      this.y(null);
   }

   @Override
   public void method_25393() {
      super.method_25393();
      List<class00068> list = this.W.N();
      if (list != null) {
         this.N.N(list);
      }

      this.R.N();
   }

   @Override
   public void method_25432() {
      if (this.m != null) {
         this.m.interrupt();
         this.m = null;
      }

      this.R.y();
      this.N.y();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.M);
   }
}
