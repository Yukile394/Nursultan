package minecraft;

import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05339 extends class05096 {
   private static final class00392 N = class00392.L("manageServer.enterIp");
   private class05362 y;
   private final class04568 L;
   private class04927 u;
   private final BooleanConsumer i;
   private final class05096 R;

   public class05339(class05096 var1, BooleanConsumer var2, class04568 var3) {
      super(class00392.L("selectServer.direct"));
      this.R = var1;
      this.L = var3;
      this.i = var2;
   }

   private void y() {
      this.y.field_22763 = class03420.y(this.u.method_1882());
   }

   private void N() {
      this.L.y = this.u.method_1882();
      this.i.accept(true);
   }

   private void N(CallbackInfo var1) {
      int ix = GeneralSettings.INSTANCE.directConnectScreenButtonOrientation.getIndex();
      if (ix != 0) {
         class05373 class05373 = class05362.method_46430(class00392.N("ViaFabricPlus"), var1x -> ProtocolSelectionScreen.INSTANCE.open(this)).y(98, 20);
         GeneralSettings.setOrientation(class05373::N, ix, this.field_22789, this.field_22790);
         this.method_37063(class05373.N());
      }
   }

   @Override
   public void method_25426() {
      this.u = new class04927(this.field_22793, this.field_22789 / 2 - 100, 116, 200, 20, N);
      this.u.method_1880(128);
      this.u.method_1852(((class05630)this.field_22787.i_7).Nl);
      this.u.method_1863(var1 -> this.y());
      this.method_25429(this.u);
      this.y = this.method_37063(
         class05362.method_46430(class00392.L("selectServer.select"), var1 -> this.N())
            .N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 96 + 12, 200, 20)
            .N()
      );
      this.method_37063(
         class05362.method_46430(class05220.i, var1 -> this.i.accept(false)).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 120 + 12, 200, 20).N()
      );
      this.y();
      this.N(null);
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.u);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.y.field_22763 && this.method_25399() == this.u && var1.u()) {
         this.N();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_25432() {
      ((class05630)this.field_22787.i_7).Nl = this.u.method_1882();
      ((class05630)this.field_22787.i_7).Np();
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 20, -1);
      var1.y(this.field_22793, N, this.field_22789 / 2 - 100 + 1, 100, -6250336);
      this.u.method_25394(var1, var2, var3, var4);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.R);
   }

   @Override
   public void method_25410(int var1, int var2) {
      String s = this.u.method_1882();
      this.method_25423(var1, var2);
      this.u.method_1852(s);
   }
}
