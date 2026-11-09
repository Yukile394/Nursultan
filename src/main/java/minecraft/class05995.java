package minecraft;

import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05995 extends class01475 {
   private final class00402 M;
   private class06366<class00384> B;
   private class06366<Boolean> Z;
   private class06366<Boolean> z;
   private class00384 U = class00384.field_11924;
   private boolean E;
   private boolean W;

   @Override
   protected void L() {
      this.B = this.method_37063(class06366.<class00384>N(var0 -> {
         return switch (var0) {
            case field_11922 -> class00392.L("advMode.mode.sequence");
            case field_11923 -> class00392.L("advMode.mode.auto");
            case field_11924 -> class00392.L("advMode.mode.redstone");
         };
      }, this.U).N(class00384.values()).N().N(this.field_22789 / 2 - 50 - 100 - 4, 165, 100, 20, class00392.L("advMode.mode"), (var1, var2) -> this.U = var2));
      this.Z = this.method_37063(
         class06366.N(class00392.L("advMode.mode.conditional"), class00392.L("advMode.mode.unconditional"), this.E)
            .N()
            .N(this.field_22789 / 2 - 50, 165, 100, 20, class00392.L("advMode.type"), (var1, var2) -> this.E = var2)
      );
      this.z = this.method_37063(
         class06366.N(class00392.L("advMode.mode.autoexec.bat"), class00392.L("advMode.mode.redstoneTriggered"), this.W)
            .N()
            .N(this.field_22789 / 2 + 50 + 4, 165, 100, 20, class00392.L("advMode.triggering"), (var1, var2) -> this.W = var2)
      );
   }

   public class05995(class00402 var1) {
      super();
      this.M = var1;
   }

   @Override
   protected void i() {
      this.field_22787.NE().N(new class07358(this.M.d(), this.N.method_1882(), this.U, this.M.N().M(), this.E, this.W));
   }

   private void y(boolean var1) {
      this.L.field_22763 = var1;
      this.i.field_22763 = var1;
      this.B.field_22763 = var1;
      this.Z.field_22763 = var1;
      this.z.field_22763 = var1;
   }

   @Override
   int y() {
      return 135;
   }

   private void N(CallbackInfo var1) {
      if (DebugSettings.INSTANCE.hideModernCommandBlockScreenFeatures.isEnabled()) {
         this.B.field_22764 = false;
         this.Z.field_22764 = false;
         this.z.field_22764 = false;
         this.R();
      }
   }

   @Override
   class07327 N() {
      return this.M.N();
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.y(false);
      this.N(null);
   }

   @Override
   public void method_25410(int var1, int var2) {
      super.method_25410(var1, var2);
      this.y(true);
   }

   public void R() {
      class07327 class07327 = this.M.N();
      this.N.method_1852(class07327.u());
      boolean flag = class07327.M();
      this.U = this.M.Z();
      this.E = this.M.z();
      this.W = this.M.u();
      this.i.N(Boolean.valueOf(flag));
      this.B.N(this.U);
      this.Z.N(Boolean.valueOf(this.E));
      this.z.N(Boolean.valueOf(this.W));
      this.N(flag);
      this.y(true);
   }
}
