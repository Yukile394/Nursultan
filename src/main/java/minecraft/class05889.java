package minecraft;

public class class05889 extends class05431<class07497> {
   private static final class01894 N = class01894.y("container/anvil/text_field");
   private static final class01894 y = class01894.y("container/anvil/text_field_disabled");
   private static final class01894 L = class01894.y("container/anvil/error");
   private static final class01894 u = class01894.y("textures/gui/container/anvil.png");
   private static final class00392 n = class00392.L("container.repair.expensive");
   private class04927 t;
   private final class08036 G;

   public class05889(class07497 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3, u);
      this.G = var2.z;
      this.z = 60;
   }

   @Override
   protected void i(class01054 var1, int var2, int var3) {
      if ((this.m.L(0).R() || this.m.L(1).R()) && !this.m.L(this.m.m()).R()) {
         var1.N(class08394.Na, L, var2 + 99, var3 + 45, 28, 21);
      }
   }

   @Override
   protected void u(class01054 var1, int var2, int var3) {
      super.u(var1, var2, var3);
      int i = this.m.W();
      if (i > 0) {
         int j = -8323296;
         Object object;
         if (i >= 40 && !((class04453)this.field_22787.T_4).method_56992()) {
            object = n;
            j = -40864;
         } else if (!this.m.L(2).R()) {
            object = null;
         } else {
            object = class00392.N("container.repair.cost", i);
            if (!this.m.L(2).N(this.G)) {
               j = -40864;
            }
         }

         if (object != null) {
            int k = this.B - 8 - this.field_22793.N((class05936)object) - 2;
            byte b0 = 69;
            var1.N(k - 2, 67, this.B - 8, 79, 1325400064);
            var1.y(this.field_22793, (class00392)object, k, 69, j);
         }
      }
   }

   @Override
   protected void u() {
      super.u();
      ((class04453)this.field_22787.T_4).L_5 = ((class04453)this.field_22787.T_4).field_6012;
   }

   @Override
   public void N(class07482 var1, int var2, class06584 var3) {
      if (var2 == 0) {
         this.t.method_1852(var3.R() ? "" : var3.d().getString());
         this.t.method_1888(!var3.R());
         this.method_25395(this.t);
      }
   }

   private void N(String var1) {
      class06937 class06937 = this.m.L(0);
      if (class06937.R()) {
         String s = var1;
         if (!class06937.i().L(class02484.B) && var1.equals(class06937.i().d().getString())) {
            s = "";
         }

         if (this.m.N(s)) {
            ((class01683)((class04453)this.field_22787.T_4).y_0).N(new class07338(s));
         }
      }
   }

   @Override
   protected void N() {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      this.t = new class04927(this.field_22793, i + 62, j + 24, 103, 12, class00392.L("container.repair"));
      this.t.method_1856(false);
      this.t.method_1868(-1);
      this.t.method_1860(-1);
      this.t.method_75351(false);
      this.t.method_1858(false);
      this.t.method_1880(50);
      this.t.method_1863(this::N);
      this.t.method_1852("");
      this.method_37063(this.t);
      this.t.method_1888(this.m.L(0).R());
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      super.N(var1, var2, var3, var4);
      var1.N(class08394.Na, this.m.L(0).R() ? N : y, this.T + 59, this.b + 20, 110, 16);
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.t);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.i()) {
         ((class04453)this.field_22787.T_4).method_7346();
         return true;
      } else {
         return !this.t.method_25404(var1) && !this.t.method_20315() ? super.method_25404(var1) : true;
      }
   }

   @Override
   public void method_25410(int var1, int var2) {
      String s = this.t.method_1882();
      this.method_25423(var1, var2);
      this.t.method_1852(s);
   }
}
