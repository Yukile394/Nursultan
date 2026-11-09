package minecraft;

import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06326 extends class05096 {
   private static final class00392 N = class00392.L("manageServer.enterName");
   private static final class00392 y = class00392.L("manageServer.enterIp");
   private static final class00392 L = class00392.L("selectServer.defaultName");
   private class05362 u;
   private final BooleanConsumer i;
   private final class04568 R;
   private class04927 M;
   private class04927 B;
   private final class05096 Z;
   private String z;
   private String U;

   public class06326(class05096 var1, class00392 var2, BooleanConsumer var3, class04568 var4) {
      super(var2);
      this.Z = var1;
      this.i = var3;
      this.R = var4;
   }

   private void y() {
      this.u.field_22763 = class03420.y(this.M.method_1882());
   }

   private void N(CallbackInfo var1) {
      int ix = GeneralSettings.INSTANCE.addServerScreenButtonOrientation.getIndex();
      if (ix != 0) {
         IServerData iserverdata = this.R;
         ProtocolVersion protocolversion = iserverdata.viaFabricPlus$forcedVersion();
         if (this.z != null && this.U != null) {
            this.B.method_1852(this.z);
            this.M.method_1852(this.U);
            this.z = null;
            this.U = null;
         }

         class05373 class05373 = class05362.method_46430(
               (class00392)(protocolversion == null ? class00392.L("base.viafabricplus.set_version") : class00392.N(protocolversion.getName())), var2x -> {
                  this.z = this.B.method_1882();
                  this.U = this.M.method_1882();
                  this.field_22787.N(new PerServerVersionScreen(this, iserverdata::viaFabricPlus$forceVersion, iserverdata::viaFabricPlus$forcedVersion));
               }
            )
            .y(98, 20);
         GeneralSettings.setOrientation(class05373::N, ix, this.field_22789, this.field_22790);
         this.method_37063(class05373.N());
      }
   }

   private void N() {
      String s = this.B.method_1882();
      this.R.N = s.isEmpty() ? L.getString() : s;
      this.R.y = this.M.method_1882();
      this.i.accept(true);
   }

   @Override
   public void method_25426() {
      this.B = new class04927(this.field_22793, this.field_22789 / 2 - 100, 66, 200, 20, N);
      this.B.method_1852(this.R.N);
      this.B.method_47404(L);
      this.B.method_1863(var1 -> this.y());
      this.method_25429(this.B);
      this.M = new class04927(this.field_22793, this.field_22789 / 2 - 100, 106, 200, 20, y);
      this.M.method_1880(128);
      this.M.method_1852(this.R.y);
      this.M.method_1863(var1 -> this.y());
      this.method_25429(this.M);
      this.method_37063(
         class06366.<class04575>N(class04575::N, this.R.y())
            .N(class04575.values())
            .N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 72, 200, 20, class00392.L("manageServer.resourcePack"), (var1, var2) -> this.R.N(var2))
      );
      this.u = this.method_37063(
         class05362.method_46430(class05220.u, var1 -> this.N()).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 96 + 18, 200, 20).N()
      );
      this.method_37063(
         class05362.method_46430(class05220.i, var1 -> this.i.accept(false)).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 120 + 18, 200, 20).N()
      );
      this.y();
      this.N(null);
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.B);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);
      var1.y(this.field_22793, N, this.field_22789 / 2 - 100 + 1, 53, -6250336);
      var1.y(this.field_22793, y, this.field_22789 / 2 - 100 + 1, 94, -6250336);
      this.B.method_25394(var1, var2, var3, var4);
      this.M.method_25394(var1, var2, var3, var4);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.Z);
   }

   @Override
   public void method_25410(int var1, int var2) {
      String s = this.M.method_1882();
      String s1 = this.B.method_1882();
      this.method_25423(var1, var2);
      this.M.method_1852(s);
      this.B.method_1852(s1);
   }
}
