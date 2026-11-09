package minecraft;

public class class06320 extends class01311 {
   private class05362 M;

   private void L() {
      ((class01683)((class04453)this.field_22787.T_4).y_0).N(new class07375((class04453)this.field_22787.T_4, class07363.field_12986));
   }

   public class06320(String var1, boolean var2) {
      super(var1, var2);
   }

   public void y() {
      String s = this.y.method_1882();
      if (!this.u && !s.isEmpty()) {
         this.i = class01322.field_62017;
         this.field_22787.N(new class01311(s, false));
      } else {
         this.i = class01322.field_62016;
         this.field_22787.N(null);
      }
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.M = class05362.method_46430(class00392.L("multiplayer.stopSleeping"), var1 -> this.L())
         .N(this.field_22789 / 2 - 100, this.field_22790 - 40, 200, 20)
         .N();
      this.method_37063(this.M);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.i()) {
         this.L();
      }

      if (!this.field_22787.b().N(this.field_22787.q())) {
         return true;
      } else if (var1.u()) {
         this.N(this.y.method_1882(), true);
         this.y.method_1852("");
         ((class01056)this.field_22787.i_6).i().u();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      if (!this.field_22787.b().N(this.field_22787.q())) {
         this.M.method_25394(var1, var2, var3, var4);
      } else {
         super.method_25394(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_25419() {
      this.L();
   }

   @Override
   public boolean method_25400(class06626 var1) {
      return !this.field_22787.b().N(this.field_22787.q()) ? true : super.method_25400(var1);
   }
}
