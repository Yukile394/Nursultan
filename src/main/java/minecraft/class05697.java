package minecraft;

public class class05697 extends class05681 {
   private static final int L = 32;
   private static final class00392 u = class00392.L("lanServer.title");
   private static final class00392 i = class00392.L("selectServer.hiddenAddress");
   private final class05304 R;
   protected final class06202 N;
   protected final class00068 y;

   protected class05697(class05304 var1, class00068 var2) {
      super();
      this.R = var1;
      this.y = var2;
      this.N = class06202.Nq();
   }

   public class00392 y() {
      return class00392.i().y(u).y(class05220.l).i(this.y.N());
   }

   @Override
   public void N() {
      this.R.N(new class04568(this.y.N(), this.y.y(), class04585.field_45609));
   }

   @Override
   boolean N(class05681 var1) {
      return var1 instanceof class05697 && ((class05697)var1).y == this.y;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         this.N();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (var2) {
         this.N();
      }

      return super.method_25402(var1, var2);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.y((class01590)this.N.i_3, u, this.method_73380() + 32 + 3, this.method_73382() + 1, -1);
      var1.y((class01590)this.N.i_3, this.y.N(), this.method_73380() + 32 + 3, this.method_73382() + 12, -8355712);
      if (((class05630)this.N.i_7).E) {
         var1.y((class01590)this.N.i_3, i, this.method_73380() + 32 + 3, this.method_73382() + 12 + 11, -8355712);
      } else {
         var1.y((class01590)this.N.i_3, this.y.y(), this.method_73380() + 32 + 3, this.method_73382() + 12 + 11, -8355712);
      }
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", this.y());
   }
}
