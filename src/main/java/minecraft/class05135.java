package minecraft;

import java.util.Objects;

class class05135 extends class05728 {
   private final class04981 N;
   private final class04282 y = new class04282();

   public class05135(class05685 var1, class04981 var2) {
      super(var1);
      this.N = var2;
      if (!var2.U) {
         this.y.N(class04141.N(class00392.L("mco.snapshot.parent.tooltip")));
      }
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.N(this.N, var1, this.method_73389(), this.method_73382(), var2, var3);
      class04601.N(var1, this.method_73380(), this.method_73382(), 32, this.N.B);
      this.N(var1, this.method_73382(), this.method_73380(), this.method_73387(), -8355712, this.N);
      this.N(var1, this.method_73382(), this.method_73380(), this.method_73387(), this.N);
      this.N(var1, this.method_73382(), this.method_73380(), this.N);
      this.y.N(var1, var2, var3, var4, this.method_25370(), new class03255(this.method_73380(), this.method_73382(), this.method_73387(), this.method_73384()));
   }

   @Override
   public class00392 method_37006() {
      return class00392.y(Objects.requireNonNullElse(this.N.u, "unknown server"));
   }
}
