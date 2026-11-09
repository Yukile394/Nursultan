package minecraft;

import Nursultan.class09472;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public abstract class class01475 extends class05096 {
   private static final class00392 M = class00392.L("advMode.setCommand");
   private static final class00392 B = class00392.L("advMode.command");
   private static final class00392 Z = class00392.L("advMode.previousOutput");
   protected class04927 N;
   protected class04927 y;
   protected class05362 L;
   protected class05362 u;
   protected class06366<Boolean> i;
   public class05910 R;

   protected void L() {
   }

   public class01475() {
      super(class05153.N);
   }

   protected abstract void i();

   protected void u() {
      this.i();
      class07327 class07327 = this.N();
      if (!class07327.M()) {
         class07327.y(null);
      }

      this.field_22787.N(null);
   }

   abstract int y();

   protected void N(boolean var1) {
      this.y.method_1852(var1 ? this.N().L().getString() : "-");
   }

   private void N(String var1) {
      class05910 class05910 = this.R;
      this.N(class05910);
   }

   abstract class07327 N();

   private void N(class05910 var1) {
      if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13)) {
         var1.u();
      }
   }

   @Override
   public void method_25426() {
      boolean flag = this.N().M();
      this.N = new class09472(this, this.field_22793, this.field_22789 / 2 - 150, 50, 300, 20, class00392.L("advMode.command"));
      this.N.method_1880(32500);
      this.N.method_1863(this::N);
      this.method_25429(this.N);
      this.y = new class04927(this.field_22793, this.field_22789 / 2 - 150, this.y(), 276, 20, class00392.L("advMode.previousOutput"));
      this.y.method_1880(32500);
      this.y.method_1888(false);
      this.y.method_1852("-");
      this.method_25429(this.y);
      this.i = this.method_37063(
         class06366.N(class00392.y("O"), class00392.y("X"), flag)
            .N()
            .N(this.field_22789 / 2 + 150 - 20, this.y(), 20, 20, class00392.L("advMode.trackOutput"), (var1x, var2x) -> {
               this.N().N(var2x);
               this.N(var2x);
            })
      );
      this.L();
      this.L = this.method_37063(
         class05362.method_46430(class05220.u, var1x -> this.u()).N(this.field_22789 / 2 - 4 - 150, this.field_22790 / 4 + 120 + 12, 150, 20).N()
      );
      this.u = this.method_37063(
         class05362.method_46430(class05220.i, var1x -> this.method_25419()).N(this.field_22789 / 2 + 4, this.field_22790 / 4 + 120 + 12, 150, 20).N()
      );
      this.R = new class05910(this.field_22787, this, this.N, this.field_22793, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.R.N(true);
      class05910 class05910 = this.R;
      this.N(class05910);
      this.N(flag);
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.N);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.R.N(var1)) {
         return true;
      } else if (super.method_25404(var1)) {
         return true;
      } else if (var1.u()) {
         this.u();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_25393() {
      if (!this.N().N()) {
         this.method_25419();
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, M, this.field_22789 / 2, 20, -1);
      var1.y(this.field_22793, B, this.field_22789 / 2 - 150 + 1, 40, -6250336);
      this.N.method_25394(var1, var2, var3, var4);
      int ix = 75;
      if (!this.y.method_1882().isEmpty()) {
         ix += 5 * 9 + 1 + this.y() - 135;
         var1.y(this.field_22793, Z, this.field_22789 / 2 - 150 + 1, ix + 4, -6250336);
         this.y.method_25394(var1, var2, var3, var4);
      }

      this.R.N(var1, var2, var3);
   }

   @Override
   public void method_25410(int var1, int var2) {
      String s = this.N.method_1882();
      this.method_25423(var1, var2);
      this.N.method_1852(s);
      class05910 class05910 = this.R;
      this.N(class05910);
   }

   @Override
   protected class00392 method_53870() {
      return this.R.N() ? this.R.y() : super.method_53870();
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      return this.R.N(var7) ? true : super.method_25401(var1, var3, var5, var7);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      return this.R.N(var1) ? true : super.method_25402(var1, var2);
   }
}
