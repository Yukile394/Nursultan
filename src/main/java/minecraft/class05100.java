package minecraft;

import java.util.Objects;

class class05100 extends class05728 {
   private static final class00392 y = class00392.L("mco.snapshot.start");
   private static final int M = 5;
   private final class04282 B;
   private final class04981 Z;

   public class05100(class05685 var1, class04981 var2) {
      super(var1);
      this.N = var1;
      this.B = new class04282();
      this.Z = var2;
      this.B.N(class04141.N(class00392.L("mco.snapshot.tooltip")));
   }

   private void N() {
      class05685.t(this.N).Nr().N(class00040.N(class04909.OK, 1.0F));
      class05685.G(this.N)
         .N(
            new class03754(this.N, class00392.L("mco.snapshot.createSnapshotPopup.title"))
               .N(class00392.L("mco.snapshot.createSnapshotPopup.text"))
               .N(class00392.L("mco.selectServer.create"), var1 -> class05685.l(this.N).N(new class05132(this.N, this.Z, true)))
               .N(class05220.i, class03723::method_25419)
               .N()
         );
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         this.N();
         return false;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.N();
      return true;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.N(class08394.Na, class05685.y, this.method_73380() - 5, this.method_73385() - 10, 40, 20);
      int i = this.method_73385() - 4;
      var1.y(class05685.v(this.N), y, this.method_73380() + 40 - 2, i - 5, -8388737);
      var1.y(
         class05685.n(this.N),
         class00392.N("mco.snapshot.description", Objects.requireNonNullElse(this.Z.u, "unknown server")),
         this.method_73380() + 40 - 2,
         i + 5,
         -8355712
      );
      this.B.N(var1, var2, var3, var4, this.method_25370(), new class03255(this.method_73380(), this.method_73382(), this.method_73387(), this.method_73384()));
   }

   @Override
   public class00392 method_37006() {
      return class00392.N(
         "gui.narrate.button", class05220.N(y, class00392.N("mco.snapshot.description", Objects.requireNonNullElse(this.Z.u, "unknown server")))
      );
   }
}
